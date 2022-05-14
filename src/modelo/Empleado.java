
package modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Empleado {
    private String id_empleado;
    private String id_persona;
    private String estado;
    private String area;
    private Double sueldo;
    private String rol;
    private byte[] foto;
    private ResultSet rs;
    private Statement st;
    private Connection cn=SingletonDB.getConnection();
    public Empleado(){}
    public Empleado getEmpleado(String id_empleadoX) {

         try {
            String sql = "SELECT * from empleado "
         + " where id_empleado='"+id_empleadoX+"'";
            
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                setId_persona(rs.getString("id_persona"));
                setId_empleado(id_empleadoX);
                setFoto(rs.getBytes("foto"));
                
            }
        } catch (SQLException e) {
            return null;
        }
        return this;
        }
        public void getEstado(String id_empleadoX){
        try {
            String sql = "select est.nombre as ESTADO from empleado e inner join estado est on est.id_estado=e.id_estado where e.id_empleado='"+id_empleadoX+"'";
            
            Statement st1 = cn.createStatement();
            ResultSet rs1 = st1.executeQuery(sql);
            while (rs1.next()){
                setEstado(rs.getString("ESTADO"));

            }
        } catch (SQLException e) {
            
        }

        }
        public void getRoles(String id_empleadoX) {

         try {
            String sql = "SELECT r.nombre as cargo,"
 + " a.nombre as narea from empleado e inner join "
 + "contrato ct  on ct.id_empleado=e.id_empleado "
 + "inner join rol r on r.id_rol=ct.id_rol inner"
 + " join area a on a.id_area=r.id_area where "
 + "e.id_empleado='"+id_empleadoX+"'";
            
            Statement st1 = cn.createStatement();
            ResultSet rs1 = st1.executeQuery(sql);
            while (rs1.next()){
                setRol(rs1.getString("cargo"));
                setArea(rs1.getString("narea"));

            }
        } catch (SQLException e) {
            
        }
       
    }

    
    public DefaultTableModel llenarTabla(){
    DefaultTableModel miModelo=null;
        try {
            String titulos []={"DNI","NOMBRE","APELLIDO",
"EDAD","GENERO","CORREO","ROL","ESTADO","SUELDO","TELEFONO"};
            String dts[]= new String [10];
            miModelo = new DefaultTableModel(null,titulos);
            String sql = "select est.nombre AS ESTADO, ct.sueldo AS SUELDO, p.nombre as NOMBRE,p.apellido AS APELLIDO,g.nombre as GENERO, TIMESTAMPDIFF(YEAR,p.fecha_nacimiento,CURDATE()) AS EDAD, p.correo_electronico as CORREO, r.nombre as ROL, dt.numero AS DNI, t.numero AS TELEFONO from persona p inner join empleado e on e.id_persona=p.id_persona inner join contrato ct on ct.id_empleado=e.id_empleado inner join rol r on r.id_rol=ct.id_rol inner join genero g on g.id_genero=p.id_genero inner join documento dt on dt.id_documento=p.id_documento inner join telefono t on t.id_persona=p.id_persona inner join estado est on est.id_estado=e.id_estado";
            PreparedStatement psts =cn.prepareStatement(sql);
            ResultSet rss= psts.executeQuery();
            while(rss.next()){
                dts[0]=rss.getString(String.valueOf("DNI"));
                dts[1]=rss.getString(String.valueOf("NOMBRE"));
                dts[2]=rss.getString(String.valueOf("APELLIDO"));
                dts[3]=rss.getString(String.valueOf("EDAD"));
                dts[4]=rss.getString(String.valueOf("GENERO"));
                dts[5]=rss.getString(String.valueOf("CORREO"));
                dts[6]=rss.getString(String.valueOf("ROL"));
                dts[7]=rss.getString(String.valueOf("ESTADO"));
                dts[8]=rss.getString(String.valueOf("SUELDO"));
                dts[9]=rss.getString(String.valueOf("TELEFONO"));
                miModelo.addRow(dts);

            }

        } catch (Exception e) {JOptionPane.showMessageDialog(null, 
                "ERROR EN TABLAS Y SQL" );}
        return miModelo;
    }
    public String[] datos;
    public byte[] img;
    public void SelectRowJTB(String dni){
        datos= new String[6];
        String sql= "select p.nombre as NOMBRES ,p.apellido as APELLIDOS, TIMESTAMPDIFF(YEAR,p.fecha_nacimiento,CURDATE()) AS EDAD,tl.numero NUMERO,p.correo_electronico CORREO, e.foto FOTO, est.nombre ESTADO from documento d inner join persona p on p.id_documento=d.id_documento inner join empleado e on e.id_persona=p.id_persona inner join estado est on est.id_estado= e.id_estado inner join telefono tl on tl.id_persona=p.id_persona where d.numero='"+dni+"'";
            
        try {
            PreparedStatement psts;
            psts = cn.prepareStatement(sql);
            ResultSet rss= psts.executeQuery();
            while(rss.next()){
            datos[0]=rss.getString(String.valueOf("NOMBRES"));
            datos[1]=rss.getString(String.valueOf("APELLIDOS"));
            datos[2]=rss.getString(String.valueOf("EDAD"));
            datos[3]=rss.getString(String.valueOf("CORREO"));
            datos[4]=rss.getString(String.valueOf("ESTADO"));
            datos[5]=rss.getString(String.valueOf("NUMERO"));
            img=rss.getBytes("FOTO");


            }
        } catch (SQLException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    } 
    public String getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(String id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getId_persona() {
        return id_persona;
    }

    public void setId_persona(String id_persona) {
        this.id_persona = id_persona;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
     public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
 
    public void Modificar_Image() throws SQLException{
        
        String sql = "UPDATE empleado SET foto =? where id_empleado = ?";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setBytes(1, getFoto());
        pst.setString(2, getId_empleado());
        pst.executeUpdate();
        pst.close();
        
   
    }
   
    
}
        
   