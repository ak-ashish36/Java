import java.sql.*;
// You must have to include mysqlconnector.jar file in your project library
public class CreateConnection {
    public static void main(String[] args) throws Exception{
        String url ="jdbc:mysql://localhost:3306/java";         //   /java is the name of database
        String username="root";
        String pass="";

        //Register Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Get Connection
        Connection con =DriverManager.getConnection(url,username,pass);

        //Create Statement
        Statement stmt=con.createStatement();

        //Execute Query
        String query="SELECT * FROM `java`.`student`";
        ResultSet rs=stmt.executeQuery(query);

        //Getting Query Results
//        rs.next();
//        String name=rs.getString("name");             //type either column number or column index
//        System.out.println(name);

        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString("major"));
        }

        // Close Connection
        stmt.close();
        con.close();
    }

}
