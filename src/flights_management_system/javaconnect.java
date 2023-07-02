package flights_management_system;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class javaconnect {
    Connection conn;
    public static Connection ConnectDb(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/abts","root","");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;       
        }        
    }
    
}
