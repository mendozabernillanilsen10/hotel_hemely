
package modelo;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class validaciones {
    private boolean escrito;
    private boolean index;
    private ResultSet rs;
    private Statement st;
    private Connection cn=SingletonDB.getConnection();
    public  validaciones(){}
    public boolean ValidarVacio(JTextField txt){
        escrito=false;
        if(txt.getText().trim().isEmpty()||
        !"obligatorio*".equals(txt.getText())){
        escrito=true;
        }
        return escrito;
    }
    public boolean ValidarIndex(JComboBox cbox){
        index=false;
        if(!"Seleccione".equals(cbox.getSelectedItem().toString())){
        escrito=true;
        }
        return index;
    }
    public void PlaceHolderEntered(JTextField txt){

        if(txt.getText().equals("obligatorio*")){
        txt.setText("");
        txt.setForeground(Color.black);
        txt.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18));
       }
    }
    public void PlaceHolderExited(JTextField txt){
        if(txt.getText().trim().equals("")){
        txt.setForeground(Color.decode("#EE3739"));
        txt.setText("obligatorio*");
        txt.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15));
        }
    }
    public void limitarText(JTextField txt, int total,java.awt.event.KeyEvent evt ){
        if(txt.getText().length() >= total)
        {
         evt.consume();
        }    
    }
    public boolean validarRegistro(JComboBox a,JComboBox b,JComboBox c,JComboBox d,JComboBox e,JComboBox f
        ,JTextField a1,JTextField a2,JTextField a3,JTextField a4,JTextField a5,JTextField a6,JTextField a7){
            boolean valido=true;
if("Seleccione".equals(a.getSelectedItem().toString())||
   "Seleccione".equals(b.getSelectedItem().toString())||
   "Seleccione".equals(c.getSelectedItem().toString())||
   "Seleccione".equals(d.getSelectedItem().toString())||
   "Seleccione".equals(e.getSelectedItem().toString())||
   "Seleccione".equals(f.getSelectedItem().toString())||
   "obligatorio*".equals(a1.getText())||
   "obligatorio*".equals(a2.getText())||
   "obligatorio*".equals(a3.getText())||
   "obligatorio*".equals(a4.getText())||
   "obligatorio*".equals(a5.getText())||
   "obligatorio*".equals(a6.getText())) {
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        String email=a7.getText().trim();
        Matcher mather = pattern.matcher(email);
        if (mather.find() == false){valido= false; }
    }

         return valido;
    

}
    public void LlenadBox(JComboBox aux,String tipo){
        switch (tipo) {
            case "area":
                            try {
            String sql = "SELECT * from area ";
            
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                aux.addItem(rs.getString("nombre"));
                
            }
        } catch (SQLException e) {}
                break;
            case "distrito":
                            try {
            String sql = "SELECT * from distrito ";
            
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                aux.addItem(rs.getString("nombre"));
                
            }
        } catch (SQLException e) {}
                break;
            case "genero":
                            try {
            String sql = "SELECT * from genero ";
            
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                aux.addItem(rs.getString("nombre"));
                
            }
        } catch (SQLException e) {}
                break;
            case "operadora":
                            try {
            String sql = "SELECT * from operador ";
            
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                aux.addItem(rs.getString("nombre"));
                
            }
        } catch (SQLException e) {}
                break;
            case "pais":
                            try {
            String sql = "SELECT * from pais ";
            
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                aux.addItem(rs.getString("nombre"));
                
            }
        } catch (SQLException e) {}
                break;
            case "provincia":
                            try {
            String sql = "SELECT * from provinicia ";
            
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                aux.addItem(rs.getString("nombre"));
                
            }
        } catch (SQLException e) {}
                break;
            case "rol":
                            try {
            String sql = "SELECT * from rol ";
            
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                aux.addItem(rs.getString("nombre"));
                
            }
        } catch (SQLException e) {}
                break;
            case "tipo_documento":
                            try {
            String sql = "SELECT * from tipo_documento ";
            
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                aux.addItem(rs.getString("nombre"));
                
            }
        } catch (SQLException e) {}
                break;
            case "horario":
                            try {
            String sql = "SELECT * from horario ";
            
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                aux.addItem(rs.getString("nombre"));
                
            }
        } catch (SQLException e) {}
                break;
            default:
               
        }
 
    }
     public void DependenciasBoxDis(JComboBox aux,String nombre){
                            try {
            String sql = "select d.nombre  from distrito d inner join provinicia p on p.id_provincia=d.id_provincia where p.nombre='"+nombre+"'";
            aux.removeAllItems();
            aux.addItem("Seleccione");
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                aux.addItem(rs.getString("d.nombre"));
                
            }
        } catch (SQLException e) { System.out.println(e);}
    }
 
    
    public void DependenciasBoxPro(JComboBox aux,String nombreX){
                            try {
            String sql = "select p.nombre  from provinicia p inner join pais s on s.id_pais=p.id_pais where s.nombre='"+ nombreX+"'";
            aux.removeAllItems();
            aux.addItem("Seleccione");
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                aux.addItem(rs.getString("p.nombre"));
            }
        } catch (SQLException e) {System.out.println(e);}
    }
    public String idTablas(String nombre,String nombre_tabla){
        String aux="";
        switch (nombre_tabla) {
            case "tipo_documento":
                    try {
            String sql = "select *from tipo_documento where nombre='"+ nombre+"'";

            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                aux=(rs.getString("id_tipo_documento"));
            }
        } catch (SQLException e) {System.out.println(e);}
                break;


            case "distrito":
                                    try {
            String sql = "select *from distrito where nombre='"+ nombre+"'";

            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                aux=(rs.getString("id_distrito"));
            }
        } catch (SQLException e) {System.out.println(e);}
            break;



            case "provincia":
                                    try {
            String sql = "select *from provinicia where nombre='"+ nombre+"'";

            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                aux=(rs.getString("id_provincia"));
            }
        } catch (SQLException e) {System.out.println(e);}
            break;

            case "pais":
                                    try {
            String sql = "select *from pais where nombre='"+ nombre+"'";

            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                aux=(rs.getString("id_pais"));
            }
        } catch (SQLException e) {System.out.println(e);}
            break;

            case "operador":
                                    try {
            String sql = "select *from operador where nombre='"+ nombre+"'";

            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                aux=(rs.getString("id_operador"));
            }
        } catch (SQLException e) {System.out.println(e);}
            break;

            case "genero":
                                    try {
            String sql = "select *from genero where nombre='"+ nombre+"'";

            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                aux=(rs.getString("id_genero"));
            }
        } catch (SQLException e) {System.out.println(e);}
            break;

            case "area":
                                    try {
            String sql = "select *from area where nombre='"+ nombre+"'";

            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                aux=(rs.getString("id_area"));
            }
        } catch (SQLException e) {System.out.println(e);}
            break;

            case "rol":
                                    try {
            String sql = "select *from rol where nombre='"+ nombre+"'";

            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                aux=(rs.getString("id_rol"));
            }
        } catch (SQLException e) {System.out.println(e);}
            break;
            case "estado":
                                    try {
            String sql = "select *from estado where nombre='"+ nombre+"'";

            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                aux=(rs.getString("id_estado"));
            }
        } catch (SQLException e) {System.out.println(e);}
            break;
            case "horario":
                                    try {
            String sql = "select *from horario where nombre='"+ nombre+"'";

            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                aux=(rs.getString("id_horario"));
            }
        } catch (SQLException e) {System.out.println(e);}
            break;


            default:
             
        }
        return aux;
    }
    public void nombreTablas(String id_tabla,String nombre_tabla){


    }
    
}
