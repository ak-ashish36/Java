import java.sql.*;
public class CRUD {
    public static void main(String[] args){
        try {
            String url = "jdbc:mysql://localhost:3306/java";
            String username = "root";
            String pass = "";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, pass);
            Statement stmt = con.createStatement();

            //Create Table
//            String query = "CREATE TABLE student (\n" +
//                    "student_id INT AUTO_INCREMENT,\n" +
//                    "name VARCHAR(20)  NOT NULL,\n" +
//                    "major VARCHAR(20) DEFAULT 'undecided',\n" +
//                    "PRIMARY KEY(student_id)\n" +
//                    ");";
//            stmt.executeUpdate(query);
//            System.out.println("sudent table created successfully");

            //Inserting in Table
//            String query="INSERT INTO student VALUES(1,'Ashish','ComputerScience');";
//            String name="Carl johnson";
//            String query="INSERT INTO student VALUES(2,'"+name+"','ComputerScience');";
//            int count=stmt.executeUpdate(query);
//            System.out.println(count+":Rows Effected");

            // Using PreparedStatement
//            String query2="INSERT INTO student VALUES(?,?,?)";
//            PreparedStatement stmt=con.prepareStatement(query2);
//            stmt.setInt(1,4);
//            stmt.setString(2,"Elena");
//            stmt.setString(3,"ENTC");
//            int count=stmt.executeUpdate();
//            System.out.println(count+":Rows Effected");





            //Fetching data
//        String query="SELECT * FROM `java`.`student`";
//        ResultSet rs=stmt.executeQuery(query);
//            while(rs.next()){
//                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
//            }


            // Close Connection
            stmt.close();
            con.close();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
