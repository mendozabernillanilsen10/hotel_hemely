
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Habitaciones {
    private ResultSet rs;
    private PreparedStatement pst;
    private Connection cn=SingletonDB.getConnection();
    public Habitaciones(){}
}
