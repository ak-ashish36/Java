import java.sql.*;
class DataAccessObject{
    Statement stmt;
    DataAccessObject(){
        try {
            String url = "jdbc:mysql://localhost:3306/java";
            String username = "root";
            String pass = "";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, pass);
            stmt = con.createStatement();
            System.out.println("Connected to Database Successfully!!!");
        }catch (Exception e){
            System.out.println(e);
            System.out.println("Not Connected to database");
        }
    }
    public void getstudent() throws Exception{
        String query="SELECT * FROM `java`.`student`";
        ResultSet rs=stmt.executeQuery(query);
           while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
           }
    }
    public void getstudent(int id) throws Exception{
        String query="SELECT * FROM `java`.`student` WHERE student_id="+id;
        ResultSet rs=stmt.executeQuery(query);
        rs.next();
        System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
    }
    public void insertStudent(int id,String Name,String Major) throws Exception{
        int student_id=id;
        String name=Name;
        String major=Major;
        String query="INSERT INTO student VALUES('"+student_id+"','"+name+"','"+major+"');";
        int count=stmt.executeUpdate(query);
        System.out.println(count+" Rows Effected");
    }
}
public class DAO_DataAccessObject {
    public static void main(String[] args) throws Exception{
            DataAccessObject d= new DataAccessObject();
//            d.insertStudent(1,"Rohan","Mechanical");
            d.getstudent(1);
    }
}
