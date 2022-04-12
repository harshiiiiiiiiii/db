import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Practice {

 
    public static void main(String[] args) {
        
        try{
        	Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver is loaded");
            Connection con = DriverManager.getConnection("jdbc:mysql:///moviedata","root","pass");
            System.out.println("Connection created");

            Statement stmt = con.createStatement();
            // creating movies table
            String create_table = "CREATE TABLE Movies " +
                   "(Name VARCHAR(255) not NULL, " +
                   " Actor VARCHAR(255), " + 
                   " Actress VARCHAR(255), " + 
                   " YOR INTEGER, " + 
                   " Director VARCHAR(255) )"; 
            stmt.executeUpdate(create_table);
            

             
            
            
            System.out.println("Table is created");
            
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
