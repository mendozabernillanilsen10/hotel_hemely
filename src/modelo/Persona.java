
package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Persona {
    private Statement st;
    private ResultSet rs;
    private Connection cn=SingletonDB.getConnection();

    private String id_persona;
    private String nombres;
    private String apellidos;
    private String edad;
    private String numeroDocumento;
    private String tipoDocumento;
    private String correo_electronico;
    private String genero;
    private String direccion;
    private String distrito;
    private String provincia;
    private String pais;

    public Persona(){}

    public Persona getPersona(String id_personaX){
     
            try {
            String sql = 
   "SELECT p.nombre, p.apellido ,p.correo_electronico,TIMESTAMPDIFF(YEAR,p.fecha_nacimiento,CURDATE()) AS edad,"
 + "p.correo_electronico,t.numero ,d.numero as NumeroDocumento ,"
 + "tp.nombre as NombreDocumento,g.nombre as genero , "
 + "dr.nombre as direccion , dt.nombre as distrito,"
 + "pv.nombre as provincia , ps.nombre as pais from "
 + "persona p inner join telefono t on p.id_persona=t.id_persona "
 + "inner join documento d on d.id_documento=p.id_documento inner "
 + "join tipo_documento tp on tp.id_tipo_documento=d.id_tipo_documento "
 + "inner join genero g on g.id_genero= p.id_genero inner join direccion "
 + "dr on dr.id_direccion=p.id_direccion inner join distrito dt on dt.id_distrito"
 + "=dr.id_distrito inner join provinicia pv on pv.id_provincia=dt.id_provincia"
 + " inner join pais ps on ps.id_pais = pv.id_pais where p.id_persona='" + id_personaX + "'";
            st = cn.createStatement();
            rs = st.executeQuery(sql);
                
            while (rs.next()){
                
                setId_persona(id_personaX);
                setNombres(rs.getString("p.nombre"));
                setApellidos(rs.getString("p.apellido"));
                setEdad(rs.getString(String.valueOf("edad")));
                setNumeroDocumento(rs.getString("NumeroDocumento"));
                setTipoDocumento(rs.getString("NombreDocumento"));
                setCorreo_electronico(rs.getString("p.correo_electronico"));
                setGenero(rs.getString("genero"));
                setDireccion(rs.getString("direccion")); 
                setDistrito(rs.getString("distrito")); 
                setPais(rs.getString("pais")); 
                setProvincia(rs.getString("provincia")); 
            }
        } catch (SQLException e) {
            return null;
       }

        return this;
    }


    public String getId_persona() {
        return id_persona;
    }

    public void setId_persona(String id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }


    
    
}
