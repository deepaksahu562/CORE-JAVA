package src.edu.jdbc.conn;

import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.ResultSet;  
import java.sql.Statement;
class JdbcExample{    
    public static void main(String args[]){  
        try(// --------------try-with-resources begin-------------//  
            // Creating connection  
            Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/student","root","mysql");  
            // Creating statement  
            Statement stmt=con.createStatement();  
            // Executing Sql query  
            ResultSet rs=stmt.executeQuery("select * from user");  
           )// --------------try-with-resources end--------------//  
        { // ----------------try block begin---------------------//  
            // Iterating ResultSet elements  
            while(rs.next()){    
                System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getString(3));    
            }  
        } // ----------------try block end----------------------//  
        catch(Exception e){ // Exception handler   
            System.out.println(e.getMessage());  
        }    
    }  
} 