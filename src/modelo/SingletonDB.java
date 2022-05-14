
package modelo;

//import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class SingletonDB {

    static Connection con=null;
    public static Connection getConnection(){
 
    if(con==null){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdemelyy","root","");
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "ERROR CON LA CONEXION DE LA BASE DE DATOS" );
        }
    }
    return con;
    }
}