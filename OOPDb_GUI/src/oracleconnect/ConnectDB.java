package oracleconnect;
import java.sql.*;


public class ConnectDB {
    
    public static Connection Connect(){
        
        Connection conn = null;
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "HR", "hr"); // 
            System.out.println("Connection Succesful");
        } catch (Exception e){
            System.out.println(e);
        }
        
        return conn;
        
    }
    
    
    
}
