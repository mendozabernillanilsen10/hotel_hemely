
package modelo;

       
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Rol {
    private Statement st;
    private ResultSet rs;
    private Connection cn=SingletonDB.getConnection();
        private String id_rol;
        private String nombre;
        private String id_area;
        public Rol(){

        }
    //realizar funciones de privilegios por rol
    public String getId_rol() {
        return id_rol;
    }

    public void setId_rol(String id_rol) {
        this.id_rol = id_rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId_area() {
        return id_area;
    }

    public void setId_area(String id_area) {
        this.id_area = id_area;
    }

}
