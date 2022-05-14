
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Usuario {
    private String usuario;
    private String Password;
    private String id_usuario;
    private String id_empleado;  
    private int seguridad;
    private ResultSet rs;
    private PreparedStatement pst;
    private Statement st;
    private String idAuX;
    public Usuario(){

    }

        Connection cn=SingletonDB.getConnection();


        String id_empleadoXy;
        public final void insertarUsuario(String contrasenaX,String usuarioX
        ,String idUsuarioX,String correo,int seguridadX){
        id_empleadoXy=idEmpleado(correo);
            System.out.println("ESCRIBIR EMPLEADO : "+id_empleadoXy);
        if(null==(id_empleadoXy)){
        JOptionPane.showMessageDialog(null, "Su correo no esta registrado en la base de datos","",2);
        }else{
        try{
            
            String sql = "insert into usuario(usuario, contrasena,id_usuario,id_empleado,seguridad)"
             + " values(?,?,?,?,?)";
            pst = cn.prepareStatement(sql);
            pst.setString(1, usuarioX);
            pst.setString(2, contrasenaX);
            pst.setString(3,idUsuarioX );
            pst.setString(4, id_empleadoXy);
            pst.setInt(5, seguridadX);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente "
             + "\n Su nivel de seguridad es de : "+seguridadX);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage(),"",JOptionPane.ERROR_MESSAGE);
            //JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage(),"",JOptionPane.WARNING_MESSAGE);
        }}
    }
        public String codigoRepetido(String aux){
            idAuX=null;
            try {

            String sql ="select * from usuario where id_usuario='"+aux+"'";
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                idAuX=(rs.getString("id_usuario"));
                System.out.println("CODIGO DE USUARIO: "+idAuX);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage(),"",0);
            idAuX=null;
        }  
  

            return idAuX;
        }
        public String idEmpleado(String correo){
            idAuX="";
            try {

            String sql ="select e.id_empleado from persona p inner join empleado e on"
         + " e.id_persona=p.id_persona  where p.correo_electronico='"+correo+"'";
            st = cn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()){
                idAuX=(rs.getString("e.id_empleado"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage(),"",0);
            return "";
        }    

            return idAuX;
            
        }
        private String text;
        boolean existe=false;
        public boolean correoRegistrado(String correo){
            try {
            existe=false;
            
            String sql ="select u.id_usuario from persona p  inner join"
         + " empleado e on e.id_persona=p.id_persona inner join usuario"
         + " u on u.id_empleado =e.id_empleado where p.correo_electronico='"+correo+"'";
            st = cn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()){
                text=(rs.getString("u.id_usuario"));
            }
            if(null!=text||"".equals(text)){existe=true;}
        } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage(),"",0);
        } 

            return existe;
        }
        public Usuario GetUsuario(String usuarioX) {

         try {
            String sql ="SELECT * FROM usuario WHERE usuario = '" + usuarioX + "' ";
            st = cn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()){

                setId_usuario(rs.getString("id_usuario"));
                setId_empleado(rs.getString("id_empleado"));
                setPassword(rs.getString("contrasena"));
                setUsuario(rs.getString("usuario"));
                setSeguridad(rs.getInt("seguridad"));
                
            }
        } catch (SQLException e) {
               JOptionPane.showMessageDialog(null, "Usuario incorrecto","",0);   
            return null;
        }
        return this;
    }
    public void ModificarSeguridad(int i){
        String sql = "UPDATE usuario SET seguridad =? where id_usuario = ?";
        PreparedStatement ps;
        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, i);
            ps.setString(2, getId_usuario());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }

    public int getSeguridad() {
        return seguridad;
    }

    public void setSeguridad(int seguridad) {
        this.seguridad = seguridad;
    }


 
        public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(String id_empleado) {
        this.id_empleado = id_empleado;
    }
}
    /*public final void ExtraerDatos() throws SQLException{
            String sql="select * from usuarios";
            pst =cn.prepareStatement(sql);
            ResultSet rs= pst.executeQuery();
            while(rs.next()){
                setUsuario(rs.getString("usuario"));
                setPassword(rs.getString("contrasena"));
                setId_empleado(rs.getString("id_empleado"));
                setId_usuario(rs.getString("id_usuario"));
                setSeguridad(rs.getByte("seguridad"));

            }
    }*/