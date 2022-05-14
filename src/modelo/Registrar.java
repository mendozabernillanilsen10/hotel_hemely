
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Registrar {
    private Statement st;
    private ResultSet rs;
    private PreparedStatement pst;    
    private Connection cn=SingletonDB.getConnection();


        public final void registrarEmpleado(String id_empleado,String id_persona,byte[] foto,String id_estado){

        try{
            String sql = "insert into empleado(id_empleado, id_persona,foto,id_estado)"
             + " values(?,?,?,?)";
            pst = cn.prepareStatement(sql);
            pst.setString(1, id_empleado);
            pst.setString(2, id_persona);
            pst.setBytes(3,foto );
            pst.setString(4, id_estado);

            pst.executeUpdate();

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,
             "Error de conexión:" + e.getMessage(),"",JOptionPane.ERROR_MESSAGE);
           
        }
    }
        public final void registrarContrato(String id_contrato,double sueldo,String id_rol,
        String id_horario,String fecha_inicio,String fecha_fin,String id_empleado,String id_estado){

        try{
            String sql = "insert into contrato"
         + "(id_contrato, sueldo,id_rol,id_horario,fecha_inicio,fecha_fin,id_empleado,id_estado)"
             + " values(?,?,?,?,?,?,?,?)";
            pst = cn.prepareStatement(sql);
            pst.setString(1, id_contrato);
             pst.setDouble(2, sueldo);
             pst.setString(3,id_rol );
            pst.setString(4, id_horario);
            pst.setString(5, fecha_inicio);
            pst.setString(6, fecha_fin);
            pst.setString(7, id_empleado);
            pst.setString(8, id_estado);
            pst.executeUpdate();

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,
             "Error de conexión:" + e.getMessage(),"",JOptionPane.ERROR_MESSAGE);
        }
    }
        public final void registrarTelefono(String id_telefono,int numero,String id_operador,
        String id_persona){

        try{
            String sql = "insert into telefono(id_telefono, numero,id_operador,id_persona)"
             + " values(?,?,?,?)";
            pst = cn.prepareStatement(sql);
            pst.setString(1, id_telefono);
            pst.setInt(2, numero);
            pst.setString(3,id_operador );
            pst.setString(4, id_persona);

            pst.executeUpdate();

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,
             "Error de conexión:" + e.getMessage(),"",JOptionPane.ERROR_MESSAGE);
        }
    }
        
        public final void registrarPersona(String id_persona,String nombre,String apellido
        ,String fecha_nacimiento,String id_documento,String id_genero,String id_direccion,String correo_electronico){
        try{
            String sql = "insert into persona"
         + "(id_persona, nombre,apellido,id_documento,fecha_nacimiento,id_genero,id_direccion,correo_electronico)"
             + " values(?,?,?,?,?,?,?,?)";
            pst = cn.prepareStatement(sql);
            pst.setString(1,id_persona);
            pst.setString(2,nombre);
            pst.setString(3,apellido);
            pst.setString(4,id_documento);
            pst.setString(5,fecha_nacimiento);
            pst.setString(6,id_genero);
            pst.setString(7,id_direccion);
            pst.setString(8,correo_electronico);
            pst.executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,
             "Error de conexión:" + e.getMessage(),"",JOptionPane.ERROR_MESSAGE);
           
        }
    }
        public final void registrarDocumento(String id_documento,int numero,String id_tipo){
        try{
            String sql = "insert into documento(id_documento, numero,id_tipo_documento)"
             + " values(?,?,?)";
            pst = cn.prepareStatement(sql);
            pst.setString(1,id_documento);
            pst.setInt(2,numero);
            pst.setString(3,id_tipo);
            pst.executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,
             "Error de conexión:" + e.getMessage(),"",JOptionPane.ERROR_MESSAGE);
           
        }
    }
        public final void registrarDireccion(String id_direccion,String nombre,String id_distrito){
        try{
            String sql = "insert into direccion(id_direccion, nombre,id_distrito)"
             + " values(?,?,?)";
            pst = cn.prepareStatement(sql);
            pst.setString(1,id_direccion);
            pst.setString(2,nombre);
            pst.setString(3,id_distrito);
            pst.executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,
             "Error de conexión:" + e.getMessage(),"",JOptionPane.ERROR_MESSAGE);
           
        }
    }
        
}
