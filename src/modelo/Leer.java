
package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Leer {
        private Statement st;
    private ResultSet rs;
    private Connection cn=SingletonDB.getConnection();
}
