///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
// */
//
package flights_management_system;
import static com.sun.glass.ui.Cursor.setVisible;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.Cursor;

//import static com.sun.glass.ui.Cursor.setVisible;
//import javax.swing.JOptionPane;
///**
// *
// * @author shoba
// */
public class Flights_management_system {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//        setVisible(false);
//        login_type lg=new login_type();
//        lg.setVisible(true);
//             
//    }
//    
//}

//public class FlightsManagementSystem {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            login_type lg=new login_type();
            lg.setVisible(true); 
        });
    }
}
