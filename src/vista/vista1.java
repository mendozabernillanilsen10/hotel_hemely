
package vista;


import com.formdev.flatlaf.intellijthemes.FlatCyanLightIJTheme;
import correo.CodigoRandom;
import correo.EmailSender;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import modelo.*;
import necesario.MaterialButton;
public class vista1 extends javax.swing.JFrame {
    
   private Usuario U;
   private Persona P;
   private Empleado E;
   private EmailSender SMS;
   private Encriptador crypt;
   private CodigoRandom  Random;
   private validaciones v;
   private Registrar registro;
   private Leer leer;
   private Actualizar actualizar;
   private Eliminar eliminar;
   public  File newResource ;
   MaterialButton MB;  
    private Image gifP = new ImageIcon(getClass().getResource("/img/HoSPEDAJE EMELY.gif")).getImage();   
    private vista1() {
        
        //this.setUndecorated(true);
        this.initComponents();
        this.setSize(1200,860);
        this.setLocationRelativeTo(null);
        this.U=new Usuario();
        this.P=new Persona();
        this.E=new Empleado();
        this.v=new validaciones();
        this.SMS=new EmailSender();
        this.crypt= new Encriptador();
        this.registro= new Registrar();
        this.leer= new Leer();
        this.eliminar= new Eliminar();
        this.registro= new Registrar();
         Random=CodigoRandom.getCodigoRandom();
        newResource=obtenerFile();
        this.LeerCookies();
        this.spinDate();
        v.LlenadBox(jComboBox_area,"area");
        v.LlenadBox(jComboBox_distrito,"distrito");
        v.LlenadBox(jComboBox_genero,"genero");
        v.LlenadBox(jComboBox_operadora,"operadora");
        v.LlenadBox(jComboBox_pais,"pais");
        v.LlenadBox(jComboBox_provincia,"provincia");
        v.LlenadBox(jComboBox_rol,"rol");
        v.LlenadBox(jComboBox_horario,"horario");
        v.LlenadBox(jComboBox_tipo_documento,"tipo_documento");
        panel_gif.add(img_gif,BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
        private File obtenerFile(){
         try {
        URL url=getClass().getClassLoader().getResource("memoria.txt");
            return new File(url.toURI());  
        } catch (URISyntaxException e) {
                System.out.println(e+"");
                 return null;
        }  
        }

        public JPanel img_gif = new JPanel(){
        @Override
        public void paintComponent(Graphics g){

            g.drawImage(gifP,0,0,getWidth(),getHeight(),null);
        }
    }; 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventana_codigo = new javax.swing.JFrame();
        Dialog_panel1 = new javax.swing.JPanel();
        Panel_code = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        confirmar_codigo = new javax.swing.JButton();
        codigo_cancelar = new javax.swing.JButton();
        jPanel40 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 32767));
        jPanel48 = new javax.swing.JPanel();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 32767));
        jPanel49 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_codigo_confirmacion = new javax.swing.JTextField();
        filler48 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 30), new java.awt.Dimension(0, 30), new java.awt.Dimension(32767, 30));
        jPanel44 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        bt_gmail = new javax.swing.JButton();
        jPanel46 = new javax.swing.JPanel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        jPanel47 = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        jPanel41 = new javax.swing.JPanel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20), new java.awt.Dimension(32767, 20));
        jPanel2 = new javax.swing.JPanel();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        jPanel4 = new javax.swing.JPanel();
        cerrar_2 = new javax.swing.JButton();
        jPanel171 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        rSPanelImage2 = new rojerusan.RSPanelImage();
        jPanel172 = new javax.swing.JPanel();
        jPanel173 = new javax.swing.JPanel();
        cerrar_1 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        panel_principal = new javax.swing.JPanel();
        pl_log_gif = new rojerusan.RSPanelImage();
        rSPanelBorder26 = new RSMaterialComponent.RSPanelBorder();
        pl_login = new javax.swing.JPanel();
        panel_login4 = new javax.swing.JPanel();
        jPanel112 = new javax.swing.JPanel();
        jPanel126 = new javax.swing.JPanel();
        jPanel113 = new javax.swing.JPanel();
        filler15 = new javax.swing.Box.Filler(new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 32767));
        jPanel124 = new javax.swing.JPanel();
        jPanel114 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jPanel117 = new javax.swing.JPanel();
        jPanel115 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanel116 = new javax.swing.JPanel();
        txt_user3 = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        filler16 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        jPanel120 = new javax.swing.JPanel();
        jPanel118 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jPanel119 = new javax.swing.JPanel();
        txt_pass3 = new javax.swing.JPasswordField();
        ver_contra3 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        filler17 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        jPanel123 = new javax.swing.JPanel();
        jPanel121 = new javax.swing.JPanel();
        jCheckBox4 = new javax.swing.JCheckBox();
        jPanel122 = new javax.swing.JPanel();
        bt_iniciar3 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        bt_registro = new javax.swing.JButton();
        jPanel125 = new javax.swing.JPanel();
        filler18 = new javax.swing.Box.Filler(new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 32767));
        rSPanelBorder27 = new RSMaterialComponent.RSPanelBorder();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel50 = new javax.swing.JPanel();
        panel_gif = new javax.swing.JPanel();
        pl_control = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        pl_crud_general = new javax.swing.JPanel();
        rSPanelBorder3 = new RSMaterialComponent.RSPanelBorder();
        jPanel34 = new javax.swing.JPanel();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20), new java.awt.Dimension(32767, 20));
        jPanel51 = new javax.swing.JPanel();
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20), new java.awt.Dimension(32767, 20));
        jPanel6 = new javax.swing.JPanel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        jPanel7 = new javax.swing.JPanel();
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        rSPanelBorder5 = new RSMaterialComponent.RSPanelBorder();
        rSLabelFecha1 = new rojeru_san.RSLabelFecha();
        rSPanelBorder6 = new RSMaterialComponent.RSPanelBorder();
        rSLabelHora1 = new rojeru_san.RSLabelHora();
        rSPanelBorder7 = new RSMaterialComponent.RSPanelBorder();
        jLabel5 = new javax.swing.JLabel();
        rSPanelBorder8 = new RSMaterialComponent.RSPanelBorder();
        bt_seguridad = new javax.swing.JLabel();
        jPanel52 = new javax.swing.JPanel();
        rSPanelBorder9 = new RSMaterialComponent.RSPanelBorder();
        rSPanelBorder14 = new RSMaterialComponent.RSPanelBorder();
        jLabel51 = new javax.swing.JLabel();
        rSPanelBorder15 = new RSMaterialComponent.RSPanelBorder();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        rSPanelBorder25 = new RSMaterialComponent.RSPanelBorder();
        jLabel52 = new javax.swing.JLabel();
        rSPanelBorder10 = new RSMaterialComponent.RSPanelBorder();
        rSPanelBorder11 = new RSMaterialComponent.RSPanelBorder();
        jLabel45 = new javax.swing.JLabel();
        rSPanelBorder12 = new RSMaterialComponent.RSPanelBorder();
        jLabel46 = new javax.swing.JLabel();
        rSPanelBorder13 = new RSMaterialComponent.RSPanelBorder();
        jLabel47 = new javax.swing.JLabel();
        rSPanelBorder4 = new RSMaterialComponent.RSPanelBorder();
        rSPanelBorder1 = new RSMaterialComponent.RSPanelBorder();
        jPanel53 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        filler14 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 50), new java.awt.Dimension(0, 30), new java.awt.Dimension(32767, 50));
        filler49 = new javax.swing.Box.Filler(new java.awt.Dimension(240, 0), new java.awt.Dimension(240, 0), new java.awt.Dimension(240, 32767));
        jPanel82 = new javax.swing.JPanel();
        jPanel84 = new javax.swing.JPanel();
        filler28 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        jPanel85 = new javax.swing.JPanel();
        filler27 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        jPanel87 = new javax.swing.JPanel();
        filler29 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler31 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        jPanel86 = new javax.swing.JPanel();
        jPanel176 = new javax.swing.JPanel();
        jPanel178 = new javax.swing.JPanel();
        rSPanelImage4 = new rojerusan.RSPanelImage();
        jPanel181 = new javax.swing.JPanel();
        rSPanelImage3 = new rojerusan.RSPanelImage();
        jPanel184 = new javax.swing.JPanel();
        rSPanelImage5 = new rojerusan.RSPanelImage();
        rSPanelImage6 = new rojerusan.RSPanelImage();
        jPanel83 = new javax.swing.JPanel();
        filler26 = new javax.swing.Box.Filler(new java.awt.Dimension(240, 0), new java.awt.Dimension(240, 0), new java.awt.Dimension(240, 32767));
        jPanel179 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel217 = new javax.swing.JPanel();
        jPanel218 = new javax.swing.JPanel();
        jPanel220 = new javax.swing.JPanel();
        filler57 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 150), new java.awt.Dimension(40, 140), new java.awt.Dimension(30, 150));
        jPanel221 = new javax.swing.JPanel();
        filler56 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 150), new java.awt.Dimension(40, 140), new java.awt.Dimension(30, 150));
        jPanel222 = new javax.swing.JPanel();
        img_usuario = new rojerusan.RSPanelCircleImage();
        jPanel219 = new javax.swing.JPanel();
        jPanel88 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jPanel196 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        jPanel197 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        edad = new javax.swing.JTextField();
        jPanel198 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        estado = new javax.swing.JTextField();
        jPanel200 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jPanel201 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        jPanel177 = new javax.swing.JPanel();
        filler50 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 50), new java.awt.Dimension(0, 30), new java.awt.Dimension(32767, 50));
        jPanel199 = new javax.swing.JPanel();
        cartas_objetos = new RSMaterialComponent.RSPanelBorder();
        rSPanelBorder17 = new RSMaterialComponent.RSPanelBorder();
        jPanel33 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jPanel54 = new javax.swing.JPanel();
        filler13 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 32767));
        jPanel36 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel167 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jPanel55 = new javax.swing.JPanel();
        jPanel56 = new javax.swing.JPanel();
        filler25 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 32767));
        jPanel57 = new javax.swing.JPanel();
        filler30 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 32767));
        jPanel58 = new javax.swing.JPanel();
        rSButtonShape2 = new RSMaterialComponent.RSButtonShape();
        jPanel39 = new javax.swing.JPanel();
        jPanel59 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel60 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel61 = new javax.swing.JPanel();
        jPanel62 = new javax.swing.JPanel();
        jPanel63 = new javax.swing.JPanel();
        filler32 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 32767));
        jPanel64 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel168 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel65 = new javax.swing.JPanel();
        jPanel66 = new javax.swing.JPanel();
        jPanel67 = new javax.swing.JPanel();
        filler33 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 32767));
        jPanel68 = new javax.swing.JPanel();
        filler34 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 32767));
        jPanel69 = new javax.swing.JPanel();
        rSButtonShape3 = new RSMaterialComponent.RSButtonShape();
        jPanel70 = new javax.swing.JPanel();
        jPanel71 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel72 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel73 = new javax.swing.JPanel();
        jPanel74 = new javax.swing.JPanel();
        jPanel75 = new javax.swing.JPanel();
        filler35 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 32767));
        jPanel76 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel169 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jPanel77 = new javax.swing.JPanel();
        jPanel78 = new javax.swing.JPanel();
        jPanel79 = new javax.swing.JPanel();
        filler36 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 32767));
        jPanel80 = new javax.swing.JPanel();
        filler37 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 32767));
        jPanel81 = new javax.swing.JPanel();
        rSButtonShape4 = new RSMaterialComponent.RSButtonShape();
        jPanel89 = new javax.swing.JPanel();
        jPanel90 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel91 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel92 = new javax.swing.JPanel();
        jPanel93 = new javax.swing.JPanel();
        jPanel94 = new javax.swing.JPanel();
        filler38 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 32767));
        jPanel95 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel170 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jPanel96 = new javax.swing.JPanel();
        jPanel97 = new javax.swing.JPanel();
        jPanel98 = new javax.swing.JPanel();
        filler39 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 32767));
        jPanel99 = new javax.swing.JPanel();
        filler40 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 32767));
        jPanel100 = new javax.swing.JPanel();
        rSButtonShape5 = new RSMaterialComponent.RSButtonShape();
        jPanel101 = new javax.swing.JPanel();
        jPanel102 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel103 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        carta_crear_empleado = new RSMaterialComponent.RSPanelBorder();
        cartas_objetos1 = new RSMaterialComponent.RSPanelBorder();
        jLabel1 = new javax.swing.JLabel();
        cartas_objetos2 = new RSMaterialComponent.RSPanelBorder();
        cartas_objetos3 = new RSMaterialComponent.RSPanelBorder();
        jPanel180 = new javax.swing.JPanel();
        jPanel189 = new javax.swing.JPanel();
        jPanel233 = new javax.swing.JPanel();
        jPanel234 = new javax.swing.JPanel();
        jPanel243 = new javax.swing.JPanel();
        jPanel244 = new javax.swing.JPanel();
        jPanel245 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jPanel246 = new javax.swing.JPanel();
        txt_nombre_empleado = new javax.swing.JTextField();
        jPanel247 = new javax.swing.JPanel();
        jPanel248 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jPanel249 = new javax.swing.JPanel();
        txt_apellidos_empleado = new javax.swing.JTextField();
        jPanel250 = new javax.swing.JPanel();
        jPanel251 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jPanel252 = new javax.swing.JPanel();
        txt_correo_empleado = new javax.swing.JTextField();
        jPanel253 = new javax.swing.JPanel();
        jPanel254 = new javax.swing.JPanel();
        jPanel255 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jPanel256 = new javax.swing.JPanel();
        jComboBox_tipo_documento = new javax.swing.JComboBox<>();
        jPanel257 = new javax.swing.JPanel();
        jPanel258 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jPanel259 = new javax.swing.JPanel();
        txt_dni_empleado = new javax.swing.JTextField();
        jPanel260 = new javax.swing.JPanel();
        jPanel292 = new javax.swing.JPanel();
        jPanel293 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jPanel294 = new javax.swing.JPanel();
        spiner_fecha1 = new javax.swing.JSpinner();
        jPanel284 = new javax.swing.JPanel();
        jPanel285 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        jPanel286 = new javax.swing.JPanel();
        jComboBox_genero = new javax.swing.JComboBox<>();
        jPanel466 = new javax.swing.JPanel();
        jPanel467 = new javax.swing.JPanel();
        jPanel468 = new javax.swing.JPanel();
        jLabel132 = new javax.swing.JLabel();
        jPanel469 = new javax.swing.JPanel();
        jComboBox_area = new javax.swing.JComboBox<>();
        jPanel470 = new javax.swing.JPanel();
        jPanel471 = new javax.swing.JPanel();
        jLabel133 = new javax.swing.JLabel();
        jPanel472 = new javax.swing.JPanel();
        jComboBox_rol = new javax.swing.JComboBox<>();
        jPanel356 = new javax.swing.JPanel();
        jPanel357 = new javax.swing.JPanel();
        jLabel84 = new javax.swing.JLabel();
        jPanel358 = new javax.swing.JPanel();
        jComboBox_horario = new javax.swing.JComboBox<>();
        jPanel263 = new javax.swing.JPanel();
        jPanel264 = new javax.swing.JPanel();
        jPanel266 = new javax.swing.JPanel();
        jPanel296 = new javax.swing.JPanel();
        jPanel297 = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        jPanel298 = new javax.swing.JPanel();
        jComboBox_pais = new javax.swing.JComboBox<>();
        jPanel270 = new javax.swing.JPanel();
        jPanel271 = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        jPanel272 = new javax.swing.JPanel();
        jComboBox_provincia = new javax.swing.JComboBox<>();
        jPanel267 = new javax.swing.JPanel();
        jPanel268 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        jPanel269 = new javax.swing.JPanel();
        jComboBox_distrito = new javax.swing.JComboBox<>();
        jPanel295 = new javax.swing.JPanel();
        jPanel174 = new javax.swing.JPanel();
        jPanel280 = new javax.swing.JPanel();
        jPanel281 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jPanel282 = new javax.swing.JPanel();
        txt_direccion_empleado = new javax.swing.JTextField();
        jPanel283 = new javax.swing.JPanel();
        jPanel287 = new javax.swing.JPanel();
        jPanel299 = new javax.swing.JPanel();
        jPanel300 = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        jPanel301 = new javax.swing.JPanel();
        jComboBox_operadora = new javax.swing.JComboBox<>();
        jPanel265 = new javax.swing.JPanel();
        jPanel290 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jPanel291 = new javax.swing.JPanel();
        txt_numero_empleado = new javax.swing.JTextField();
        jPanel302 = new javax.swing.JPanel();
        jPanel303 = new javax.swing.JPanel();
        jPanel304 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        jPanel305 = new javax.swing.JPanel();
        txt_sueldo_empleado = new javax.swing.JTextField();
        jPanel306 = new javax.swing.JPanel();
        jPanel307 = new javax.swing.JPanel();
        jPanel308 = new javax.swing.JPanel();
        registrar_foto_empleado = new javax.swing.JButton();
        lb_imagen_cargada = new javax.swing.JLabel();
        jPanel175 = new javax.swing.JPanel();
        jPanel309 = new javax.swing.JPanel();
        jPanel310 = new javax.swing.JPanel();
        jLabel101 = new javax.swing.JLabel();
        jPanel311 = new javax.swing.JPanel();
        spiner_fecha_inicio = new javax.swing.JSpinner();
        jPanel353 = new javax.swing.JPanel();
        jPanel354 = new javax.swing.JPanel();
        jLabel102 = new javax.swing.JLabel();
        jPanel355 = new javax.swing.JPanel();
        spiner_fecha_fin = new javax.swing.JSpinner();
        jPanel182 = new javax.swing.JPanel();
        bt_registrar_empleado = new javax.swing.JButton();
        carta_actualizar_empleado = new RSMaterialComponent.RSPanelBorder();
        cartas_objetos4 = new RSMaterialComponent.RSPanelBorder();
        jLabel24 = new javax.swing.JLabel();
        cartas_objetos5 = new RSMaterialComponent.RSPanelBorder();
        cartas_objetos6 = new RSMaterialComponent.RSPanelBorder();
        jPanel185 = new javax.swing.JPanel();
        jPanel190 = new javax.swing.JPanel();
        jPanel235 = new javax.swing.JPanel();
        jPanel236 = new javax.swing.JPanel();
        jPanel289 = new javax.swing.JPanel();
        jPanel312 = new javax.swing.JPanel();
        jPanel313 = new javax.swing.JPanel();
        jLabel90 = new javax.swing.JLabel();
        jPanel314 = new javax.swing.JPanel();
        jTextField26 = new javax.swing.JTextField();
        jPanel192 = new javax.swing.JPanel();
        jPanel193 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel261 = new javax.swing.JPanel();
        jPanel262 = new javax.swing.JPanel();
        jPanel273 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jPanel274 = new javax.swing.JPanel();
        jTextField23 = new javax.swing.JTextField();
        jPanel275 = new javax.swing.JPanel();
        jPanel276 = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        jPanel277 = new javax.swing.JPanel();
        jTextField24 = new javax.swing.JTextField();
        jPanel278 = new javax.swing.JPanel();
        jPanel279 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jPanel288 = new javax.swing.JPanel();
        jTextField25 = new javax.swing.JTextField();
        jPanel315 = new javax.swing.JPanel();
        jPanel316 = new javax.swing.JPanel();
        jPanel317 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        jPanel318 = new javax.swing.JPanel();
        spiner_fecha2 = new javax.swing.JSpinner();
        jPanel319 = new javax.swing.JPanel();
        jPanel320 = new javax.swing.JPanel();
        jLabel92 = new javax.swing.JLabel();
        jPanel321 = new javax.swing.JPanel();
        jComboBox10 = new javax.swing.JComboBox<>();
        jPanel473 = new javax.swing.JPanel();
        jPanel474 = new javax.swing.JPanel();
        jPanel475 = new javax.swing.JPanel();
        jLabel134 = new javax.swing.JLabel();
        jPanel476 = new javax.swing.JPanel();
        jComboBox24 = new javax.swing.JComboBox<>();
        jPanel477 = new javax.swing.JPanel();
        jPanel478 = new javax.swing.JPanel();
        jLabel135 = new javax.swing.JLabel();
        jPanel479 = new javax.swing.JPanel();
        jComboBox25 = new javax.swing.JComboBox<>();
        jPanel322 = new javax.swing.JPanel();
        jPanel323 = new javax.swing.JPanel();
        jPanel324 = new javax.swing.JPanel();
        jPanel325 = new javax.swing.JPanel();
        jPanel326 = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        jPanel327 = new javax.swing.JPanel();
        jComboBox11 = new javax.swing.JComboBox<>();
        jPanel328 = new javax.swing.JPanel();
        jPanel329 = new javax.swing.JPanel();
        jLabel94 = new javax.swing.JLabel();
        jPanel330 = new javax.swing.JPanel();
        jComboBox12 = new javax.swing.JComboBox<>();
        jPanel331 = new javax.swing.JPanel();
        jPanel332 = new javax.swing.JPanel();
        jPanel333 = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        jPanel334 = new javax.swing.JPanel();
        jComboBox13 = new javax.swing.JComboBox<>();
        jPanel186 = new javax.swing.JPanel();
        jPanel335 = new javax.swing.JPanel();
        jPanel336 = new javax.swing.JPanel();
        jLabel96 = new javax.swing.JLabel();
        jPanel337 = new javax.swing.JPanel();
        jTextField28 = new javax.swing.JTextField();
        jPanel338 = new javax.swing.JPanel();
        jPanel339 = new javax.swing.JPanel();
        jPanel340 = new javax.swing.JPanel();
        jPanel341 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        jPanel342 = new javax.swing.JPanel();
        jComboBox14 = new javax.swing.JComboBox<>();
        jPanel343 = new javax.swing.JPanel();
        jPanel344 = new javax.swing.JPanel();
        jLabel98 = new javax.swing.JLabel();
        jPanel345 = new javax.swing.JPanel();
        jTextField30 = new javax.swing.JTextField();
        jPanel346 = new javax.swing.JPanel();
        jPanel347 = new javax.swing.JPanel();
        jPanel348 = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        jPanel349 = new javax.swing.JPanel();
        jTextField31 = new javax.swing.JTextField();
        jPanel350 = new javax.swing.JPanel();
        jPanel351 = new javax.swing.JPanel();
        jLabel100 = new javax.swing.JLabel();
        jPanel352 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel187 = new javax.swing.JPanel();
        jPanel188 = new javax.swing.JPanel();
        jPanel191 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        carta_leer_empleado = new RSMaterialComponent.RSPanelBorder();
        cartas_objetos7 = new RSMaterialComponent.RSPanelBorder();
        jLabel25 = new javax.swing.JLabel();
        cartas_objetos8 = new RSMaterialComponent.RSPanelBorder();
        cartas_objetos9 = new RSMaterialComponent.RSPanelBorder();
        jPanel194 = new javax.swing.JPanel();
        cartas_objetos13 = new RSMaterialComponent.RSPanelBorder();
        jPanel211 = new javax.swing.JPanel();
        jPanel212 = new javax.swing.JPanel();
        jPanel214 = new javax.swing.JPanel();
        bt_limpiar_tabla = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel215 = new javax.swing.JPanel();
        jPanel216 = new javax.swing.JPanel();
        jPanel224 = new javax.swing.JPanel();
        jPanel195 = new javax.swing.JPanel();
        jPanel223 = new javax.swing.JPanel();
        jLabel137 = new javax.swing.JLabel();
        jPanel202 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jTextField55 = new javax.swing.JTextField();
        filler53 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20), new java.awt.Dimension(32767, 60));
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        carta_eliminar_empleado = new RSMaterialComponent.RSPanelBorder();
        cartas_objetos10 = new RSMaterialComponent.RSPanelBorder();
        jLabel26 = new javax.swing.JLabel();
        cartas_objetos11 = new RSMaterialComponent.RSPanelBorder();
        cartas_objetos12 = new RSMaterialComponent.RSPanelBorder();
        jPanel203 = new javax.swing.JPanel();
        jPanel204 = new javax.swing.JPanel();
        jPanel239 = new javax.swing.JPanel();
        jPanel240 = new javax.swing.JPanel();
        jPanel402 = new javax.swing.JPanel();
        jPanel403 = new javax.swing.JPanel();
        jPanel404 = new javax.swing.JPanel();
        jLabel114 = new javax.swing.JLabel();
        jPanel405 = new javax.swing.JPanel();
        jTextField39 = new javax.swing.JTextField();
        jPanel205 = new javax.swing.JPanel();
        jPanel206 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel406 = new javax.swing.JPanel();
        jPanel407 = new javax.swing.JPanel();
        jPanel408 = new javax.swing.JPanel();
        jLabel115 = new javax.swing.JLabel();
        jPanel409 = new javax.swing.JPanel();
        jTextField40 = new javax.swing.JTextField();
        jPanel410 = new javax.swing.JPanel();
        jPanel411 = new javax.swing.JPanel();
        jLabel116 = new javax.swing.JLabel();
        jPanel412 = new javax.swing.JPanel();
        jTextField41 = new javax.swing.JTextField();
        jPanel413 = new javax.swing.JPanel();
        jPanel414 = new javax.swing.JPanel();
        jLabel117 = new javax.swing.JLabel();
        jPanel415 = new javax.swing.JPanel();
        jTextField42 = new javax.swing.JTextField();
        jPanel416 = new javax.swing.JPanel();
        jPanel417 = new javax.swing.JPanel();
        jPanel418 = new javax.swing.JPanel();
        jLabel118 = new javax.swing.JLabel();
        jPanel419 = new javax.swing.JPanel();
        jTextField51 = new javax.swing.JTextField();
        jPanel420 = new javax.swing.JPanel();
        jPanel421 = new javax.swing.JPanel();
        jLabel119 = new javax.swing.JLabel();
        jPanel422 = new javax.swing.JPanel();
        jTextField50 = new javax.swing.JTextField();
        jPanel452 = new javax.swing.JPanel();
        jPanel453 = new javax.swing.JPanel();
        jPanel454 = new javax.swing.JPanel();
        jLabel128 = new javax.swing.JLabel();
        jPanel455 = new javax.swing.JPanel();
        jTextField52 = new javax.swing.JTextField();
        jPanel456 = new javax.swing.JPanel();
        jPanel457 = new javax.swing.JPanel();
        jLabel129 = new javax.swing.JLabel();
        jPanel458 = new javax.swing.JPanel();
        jTextField53 = new javax.swing.JTextField();
        jPanel423 = new javax.swing.JPanel();
        jPanel424 = new javax.swing.JPanel();
        jPanel425 = new javax.swing.JPanel();
        jPanel426 = new javax.swing.JPanel();
        jPanel427 = new javax.swing.JPanel();
        jLabel120 = new javax.swing.JLabel();
        jPanel428 = new javax.swing.JPanel();
        jTextField46 = new javax.swing.JTextField();
        jPanel429 = new javax.swing.JPanel();
        jPanel430 = new javax.swing.JPanel();
        jLabel121 = new javax.swing.JLabel();
        jPanel431 = new javax.swing.JPanel();
        jTextField47 = new javax.swing.JTextField();
        jPanel432 = new javax.swing.JPanel();
        jPanel433 = new javax.swing.JPanel();
        jPanel434 = new javax.swing.JPanel();
        jLabel122 = new javax.swing.JLabel();
        jPanel435 = new javax.swing.JPanel();
        jTextField48 = new javax.swing.JTextField();
        jPanel207 = new javax.swing.JPanel();
        jPanel436 = new javax.swing.JPanel();
        jPanel437 = new javax.swing.JPanel();
        jLabel123 = new javax.swing.JLabel();
        jPanel438 = new javax.swing.JPanel();
        jTextField43 = new javax.swing.JTextField();
        jPanel439 = new javax.swing.JPanel();
        jPanel440 = new javax.swing.JPanel();
        jPanel441 = new javax.swing.JPanel();
        jPanel442 = new javax.swing.JPanel();
        jLabel124 = new javax.swing.JLabel();
        jPanel443 = new javax.swing.JPanel();
        jTextField49 = new javax.swing.JTextField();
        jPanel444 = new javax.swing.JPanel();
        jPanel445 = new javax.swing.JPanel();
        jLabel125 = new javax.swing.JLabel();
        jPanel446 = new javax.swing.JPanel();
        jTextField44 = new javax.swing.JTextField();
        jPanel447 = new javax.swing.JPanel();
        jPanel448 = new javax.swing.JPanel();
        jPanel449 = new javax.swing.JPanel();
        jLabel126 = new javax.swing.JLabel();
        jPanel450 = new javax.swing.JPanel();
        jTextField45 = new javax.swing.JTextField();
        jPanel451 = new javax.swing.JPanel();
        jLabel127 = new javax.swing.JLabel();
        filler51 = new javax.swing.Box.Filler(new java.awt.Dimension(40, 0), new java.awt.Dimension(40, 0), new java.awt.Dimension(20, 32767));
        filler52 = new javax.swing.Box.Filler(new java.awt.Dimension(40, 0), new java.awt.Dimension(40, 0), new java.awt.Dimension(20, 32767));
        jPanel208 = new javax.swing.JPanel();
        jPanel209 = new javax.swing.JPanel();
        jPanel210 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jPanel104 = new javax.swing.JPanel();
        rSPanelBorder2 = new RSMaterialComponent.RSPanelBorder();
        jPanel105 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        filler11 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        jPanel14 = new javax.swing.JPanel();
        filler12 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        jPanel15 = new javax.swing.JPanel();
        lb_titulo = new javax.swing.JLabel();
        filler41 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 50), new java.awt.Dimension(0, 50), new java.awt.Dimension(32767, 50));
        jPanel16 = new javax.swing.JPanel();
        jPanel106 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        lb_nombre_usuario = new javax.swing.JLabel();
        lb_correo_user = new javax.swing.JLabel();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20), new java.awt.Dimension(32767, 20));
        jPanel107 = new javax.swing.JPanel();
        rSFotoCircle1 = new rojerusan.RSFotoCircle();
        filler42 = new javax.swing.Box.Filler(new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 32767));
        filler43 = new javax.swing.Box.Filler(new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 32767));
        jPanel108 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        filler44 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        jPanel21 = new javax.swing.JPanel();
        filler45 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 30), new java.awt.Dimension(0, 30), new java.awt.Dimension(32767, 30));
        pl_botones_roles = new javax.swing.JPanel();
        pl_bt_admin = new javax.swing.JPanel();
        jPanel109 = new javax.swing.JPanel();
        rSButtonShapeIcon12 = new RSMaterialComponent.RSButtonShapeIcon();
        jPanel110 = new javax.swing.JPanel();
        rSButtonShapeIcon13 = new RSMaterialComponent.RSButtonShapeIcon();
        jPanel111 = new javax.swing.JPanel();
        rSButtonShapeIcon14 = new RSMaterialComponent.RSButtonShapeIcon();
        jPanel147 = new javax.swing.JPanel();
        rSButtonShapeIcon15 = new RSMaterialComponent.RSButtonShapeIcon();
        jPanel148 = new javax.swing.JPanel();
        rSButtonShapeIcon16 = new RSMaterialComponent.RSButtonShapeIcon();
        jPanel149 = new javax.swing.JPanel();
        rSButtonShapeIcon17 = new RSMaterialComponent.RSButtonShapeIcon();
        jPanel150 = new javax.swing.JPanel();
        rSButtonShapeIcon18 = new RSMaterialComponent.RSButtonShapeIcon();
        jPanel151 = new javax.swing.JPanel();
        rSButtonShapeIcon19 = new RSMaterialComponent.RSButtonShapeIcon();
        jPanel152 = new javax.swing.JPanel();
        rSButtonShapeIcon20 = new RSMaterialComponent.RSButtonShapeIcon();
        pl_bt_contador = new javax.swing.JPanel();
        jPanel153 = new javax.swing.JPanel();
        rSButtonShapeIcon21 = new RSMaterialComponent.RSButtonShapeIcon();
        jPanel154 = new javax.swing.JPanel();
        rSButtonShapeIcon22 = new RSMaterialComponent.RSButtonShapeIcon();
        jPanel155 = new javax.swing.JPanel();
        rSButtonShapeIcon23 = new RSMaterialComponent.RSButtonShapeIcon();
        jPanel156 = new javax.swing.JPanel();
        rSButtonShapeIcon24 = new RSMaterialComponent.RSButtonShapeIcon();
        jPanel157 = new javax.swing.JPanel();
        rSButtonShapeIcon25 = new RSMaterialComponent.RSButtonShapeIcon();
        jPanel158 = new javax.swing.JPanel();
        rSButtonShapeIcon26 = new RSMaterialComponent.RSButtonShapeIcon();
        jPanel159 = new javax.swing.JPanel();
        rSButtonShapeIcon27 = new RSMaterialComponent.RSButtonShapeIcon();
        jPanel160 = new javax.swing.JPanel();
        rSButtonShapeIcon28 = new RSMaterialComponent.RSButtonShapeIcon();
        jPanel161 = new javax.swing.JPanel();
        rSButtonShapeIcon29 = new RSMaterialComponent.RSButtonShapeIcon();
        pl_bt_recepcionista = new javax.swing.JPanel();
        jPanel162 = new javax.swing.JPanel();
        rSButtonShapeIcon30 = new RSMaterialComponent.RSButtonShapeIcon();
        jPanel163 = new javax.swing.JPanel();
        rSButtonShapeIcon31 = new RSMaterialComponent.RSButtonShapeIcon();
        jPanel164 = new javax.swing.JPanel();
        rSButtonShapeIcon32 = new RSMaterialComponent.RSButtonShapeIcon();
        jPanel165 = new javax.swing.JPanel();
        rSButtonShapeIcon33 = new RSMaterialComponent.RSButtonShapeIcon();
        jPanel166 = new javax.swing.JPanel();
        rSButtonShapeIcon34 = new RSMaterialComponent.RSButtonShapeIcon();
        rSPanelBorder16 = new RSMaterialComponent.RSPanelBorder();
        filler47 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 80), new java.awt.Dimension(0, 80), new java.awt.Dimension(32767, 80));
        filler46 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 60), new java.awt.Dimension(0, 60), new java.awt.Dimension(32767, 60));
        bt_cerrar_sesion = new RSMaterialComponent.RSButtonShape();
        pl_registro_login = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        panel_login5 = new javax.swing.JPanel();
        jPanel127 = new javax.swing.JPanel();
        jPanel128 = new javax.swing.JPanel();
        jPanel129 = new javax.swing.JPanel();
        filler19 = new javax.swing.Box.Filler(new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 32767));
        jPanel130 = new javax.swing.JPanel();
        jPanel131 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jPanel143 = new javax.swing.JPanel();
        jPanel144 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jPanel145 = new javax.swing.JPanel();
        txt_correo_registro = new javax.swing.JTextField();
        jPanel28 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        filler24 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        jPanel140 = new javax.swing.JPanel();
        jPanel142 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jPanel146 = new javax.swing.JPanel();
        txt_usuario_registro = new javax.swing.JTextField();
        jPanel27 = new javax.swing.JPanel();
        filler23 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        jPanel135 = new javax.swing.JPanel();
        jPanel136 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jPanel137 = new javax.swing.JPanel();
        txt_pass_registro = new javax.swing.JPasswordField();
        ver_contra4 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        filler21 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        jPanel132 = new javax.swing.JPanel();
        jPanel133 = new javax.swing.JPanel();
        jPanel213 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        rb_activada = new javax.swing.JRadioButton();
        rb_desactivar = new javax.swing.JRadioButton();
        jPanel138 = new javax.swing.JPanel();
        jPanel139 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        bt_registro_usuario_login = new javax.swing.JButton();
        bt_cambio_iniciarSesion = new javax.swing.JButton();
        jPanel29 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel141 = new javax.swing.JPanel();
        filler22 = new javax.swing.Box.Filler(new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 32767));

        ventana_codigo.setUndecorated(true);

        Dialog_panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 58, 77), 4));
        Dialog_panel1.setLayout(new java.awt.CardLayout());

        Panel_code.setBackground(new java.awt.Color(255, 255, 255));
        Panel_code.setLayout(new java.awt.BorderLayout());

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));

        confirmar_codigo.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        confirmar_codigo.setText("CONFIRMAR");
        confirmar_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmar_codigoActionPerformed(evt);
            }
        });
        jPanel35.add(confirmar_codigo);

        codigo_cancelar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        codigo_cancelar.setText("CANCELAR");
        codigo_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigo_cancelarActionPerformed(evt);
            }
        });
        jPanel35.add(codigo_cancelar);

        Panel_code.add(jPanel35, java.awt.BorderLayout.PAGE_END);

        jPanel40.setOpaque(false);
        jPanel40.setLayout(new java.awt.BorderLayout());

        jPanel42.setOpaque(false);
        jPanel42.setLayout(new java.awt.BorderLayout());

        jPanel43.setOpaque(false);
        jPanel43.setLayout(new java.awt.BorderLayout());

        jPanel45.setBackground(new java.awt.Color(255, 255, 255));
        jPanel45.add(filler5);

        jPanel43.add(jPanel45, java.awt.BorderLayout.WEST);

        jPanel48.setBackground(new java.awt.Color(255, 255, 255));
        jPanel48.add(filler7);

        jPanel43.add(jPanel48, java.awt.BorderLayout.EAST);

        jPanel49.setBackground(new java.awt.Color(255, 255, 255));
        jPanel49.setLayout(new java.awt.BorderLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("INGRESE SU CODIGO ");
        jPanel49.add(jLabel4, java.awt.BorderLayout.NORTH);

        txt_codigo_confirmacion.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        txt_codigo_confirmacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_codigo_confirmacion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        txt_codigo_confirmacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_codigo_confirmacionKeyTyped(evt);
            }
        });
        jPanel49.add(txt_codigo_confirmacion, java.awt.BorderLayout.CENTER);
        jPanel49.add(filler48, java.awt.BorderLayout.PAGE_END);

        jPanel43.add(jPanel49, java.awt.BorderLayout.CENTER);

        jPanel42.add(jPanel43, java.awt.BorderLayout.CENTER);

        jPanel44.setFocusable(false);
        jPanel44.setOpaque(false);
        jPanel44.setPreferredSize(new java.awt.Dimension(353, 35));
        jPanel44.setLayout(new java.awt.BorderLayout());

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Revise su codigo en su cuenta gmail:");
        jPanel44.add(jLabel8, java.awt.BorderLayout.CENTER);

        bt_gmail.setBackground(new java.awt.Color(255, 255, 255));
        bt_gmail.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        bt_gmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/google.png"))); // NOI18N
        bt_gmail.setText("ir");
        bt_gmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_gmailActionPerformed(evt);
            }
        });
        jPanel44.add(bt_gmail, java.awt.BorderLayout.EAST);

        jPanel42.add(jPanel44, java.awt.BorderLayout.SOUTH);

        jPanel40.add(jPanel42, java.awt.BorderLayout.CENTER);

        Panel_code.add(jPanel40, java.awt.BorderLayout.CENTER);

        jPanel46.setBackground(new java.awt.Color(255, 255, 255));
        jPanel46.add(filler2);

        Panel_code.add(jPanel46, java.awt.BorderLayout.LINE_END);

        jPanel47.setBackground(new java.awt.Color(255, 255, 255));
        jPanel47.add(filler1);

        Panel_code.add(jPanel47, java.awt.BorderLayout.LINE_START);

        jPanel41.setBackground(new java.awt.Color(255, 255, 255));
        jPanel41.add(filler4);

        Panel_code.add(jPanel41, java.awt.BorderLayout.PAGE_START);

        Dialog_panel1.add(Panel_code, "panel_codigo");

        jPanel2.setLayout(new java.awt.BorderLayout());

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/img/correct1.gif"))); // NOI18N
        rSPanelImage1.setLayout(new java.awt.BorderLayout());

        jPanel4.setOpaque(false);

        cerrar_2.setBackground(new java.awt.Color(255, 0, 0));
        cerrar_2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        cerrar_2.setForeground(new java.awt.Color(255, 255, 255));
        cerrar_2.setText("Cerrar");
        cerrar_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar_2ActionPerformed(evt);
            }
        });
        jPanel4.add(cerrar_2);

        rSPanelImage1.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel171.setOpaque(false);

        javax.swing.GroupLayout jPanel171Layout = new javax.swing.GroupLayout(jPanel171);
        jPanel171.setLayout(jPanel171Layout);
        jPanel171Layout.setHorizontalGroup(
            jPanel171Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 421, Short.MAX_VALUE)
        );
        jPanel171Layout.setVerticalGroup(
            jPanel171Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 187, Short.MAX_VALUE)
        );

        rSPanelImage1.add(jPanel171, java.awt.BorderLayout.CENTER);

        jPanel2.add(rSPanelImage1, java.awt.BorderLayout.CENTER);

        Dialog_panel1.add(jPanel2, "valido");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        rSPanelImage2.setImagen(new javax.swing.ImageIcon(getClass().getResource("/img/incorrercto.gif"))); // NOI18N
        rSPanelImage2.setLayout(new java.awt.BorderLayout());

        jPanel172.setOpaque(false);

        javax.swing.GroupLayout jPanel172Layout = new javax.swing.GroupLayout(jPanel172);
        jPanel172.setLayout(jPanel172Layout);
        jPanel172Layout.setHorizontalGroup(
            jPanel172Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 421, Short.MAX_VALUE)
        );
        jPanel172Layout.setVerticalGroup(
            jPanel172Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 187, Short.MAX_VALUE)
        );

        rSPanelImage2.add(jPanel172, java.awt.BorderLayout.CENTER);

        jPanel173.setOpaque(false);

        cerrar_1.setBackground(new java.awt.Color(255, 0, 0));
        cerrar_1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        cerrar_1.setForeground(new java.awt.Color(255, 255, 255));
        cerrar_1.setText("Cerrar");
        cerrar_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar_1ActionPerformed(evt);
            }
        });
        jPanel173.add(cerrar_1);

        rSPanelImage2.add(jPanel173, java.awt.BorderLayout.PAGE_END);

        jPanel3.add(rSPanelImage2, java.awt.BorderLayout.CENTER);

        Dialog_panel1.add(jPanel3, "invalido");

        ventana_codigo.getContentPane().add(Dialog_panel1, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_principal.setLayout(new java.awt.CardLayout());

        pl_log_gif.setImagen(new javax.swing.ImageIcon(getClass().getResource("/img/giphy (2).gif"))); // NOI18N
        pl_log_gif.setLayout(new java.awt.CardLayout(150, 160));

        rSPanelBorder26.setBackground(new java.awt.Color(255, 255, 255));
        rSPanelBorder26.setBorderBottom(false);
        rSPanelBorder26.setBorderLeft(false);
        rSPanelBorder26.setBorderRight(false);
        rSPanelBorder26.setBorderTop(false);
        rSPanelBorder26.setRound(80);
        rSPanelBorder26.setLayout(new java.awt.CardLayout());

        pl_login.setBackground(new java.awt.Color(250, 242, 233));
        pl_login.setOpaque(false);
        pl_login.setLayout(new java.awt.GridLayout(1, 0));

        panel_login4.setBackground(new java.awt.Color(250, 242, 233));
        panel_login4.setOpaque(false);
        panel_login4.setLayout(new java.awt.BorderLayout());

        jPanel112.setOpaque(false);
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT);
        flowLayout1.setAlignOnBaseline(true);
        jPanel112.setLayout(flowLayout1);
        panel_login4.add(jPanel112, java.awt.BorderLayout.PAGE_START);

        jPanel126.setOpaque(false);
        jPanel126.setLayout(new java.awt.BorderLayout());

        jPanel113.setOpaque(false);
        jPanel113.add(filler15);

        jPanel126.add(jPanel113, java.awt.BorderLayout.LINE_START);

        jPanel124.setOpaque(false);
        jPanel124.setLayout(new java.awt.GridLayout(6, 1));

        jPanel114.setOpaque(false);

        jLabel31.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel31.setText("INICIAR SESION");
        jPanel114.add(jLabel31);

        jPanel124.add(jPanel114);

        jPanel117.setOpaque(false);
        jPanel117.setLayout(new java.awt.GridLayout(2, 1));

        jPanel115.setOpaque(false);
        jPanel115.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel32.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jLabel32.setText("CORREO ELECTRONICO");
        jPanel115.add(jLabel32);

        jPanel117.add(jPanel115);

        jPanel116.setBackground(new java.awt.Color(240, 236, 235));
        jPanel116.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel116.setLayout(new java.awt.BorderLayout());

        txt_user3.setBackground(new java.awt.Color(240, 236, 235));
        txt_user3.setFont(new java.awt.Font("Comic Sans MS", 0, 21)); // NOI18N
        txt_user3.setBorder(null);
        txt_user3.setOpaque(false);
        txt_user3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_user3txt_userKeyReleased(evt);
            }
        });
        jPanel116.add(txt_user3, java.awt.BorderLayout.CENTER);

        jPanel13.setOpaque(false);
        jPanel13.setLayout(new java.awt.BorderLayout());

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/At sign_26px.png"))); // NOI18N
        jPanel13.add(jLabel33, java.awt.BorderLayout.WEST);
        jPanel13.add(filler16, java.awt.BorderLayout.CENTER);

        jPanel116.add(jPanel13, java.awt.BorderLayout.WEST);

        jPanel117.add(jPanel116);

        jPanel124.add(jPanel117);

        jPanel120.setOpaque(false);
        jPanel120.setLayout(new java.awt.GridLayout(2, 1));

        jPanel118.setOpaque(false);
        jPanel118.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel34.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jLabel34.setText("CONTRASEÑA");
        jPanel118.add(jLabel34);

        jPanel120.add(jPanel118);

        jPanel119.setBackground(new java.awt.Color(240, 236, 235));
        jPanel119.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel119.setLayout(new java.awt.BorderLayout());

        txt_pass3.setBackground(new java.awt.Color(240, 236, 235));
        txt_pass3.setFont(new java.awt.Font("Comic Sans MS", 0, 21)); // NOI18N
        txt_pass3.setBorder(null);
        txt_pass3.setOpaque(false);
        txt_pass3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_pass3txt_passKeyReleased(evt);
            }
        });
        jPanel119.add(txt_pass3, java.awt.BorderLayout.CENTER);

        ver_contra3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ver_contra3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eye_25px.png"))); // NOI18N
        ver_contra3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ver_contra3ver_contraMouseClicked(evt);
            }
        });
        jPanel119.add(ver_contra3, java.awt.BorderLayout.EAST);

        jPanel30.setOpaque(false);
        jPanel30.setLayout(new java.awt.BorderLayout());

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lock_26px.png"))); // NOI18N
        jPanel30.add(jLabel35, java.awt.BorderLayout.WEST);
        jPanel30.add(filler17, java.awt.BorderLayout.CENTER);

        jPanel119.add(jPanel30, java.awt.BorderLayout.WEST);

        jPanel120.add(jPanel119);

        jPanel124.add(jPanel120);

        jPanel123.setOpaque(false);
        jPanel123.setLayout(new java.awt.GridLayout(2, 1));

        jPanel121.setOpaque(false);
        jPanel121.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jCheckBox4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jCheckBox4.setSelected(true);
        jCheckBox4.setText("Recordar ");
        jCheckBox4.setOpaque(false);
        jPanel121.add(jCheckBox4);

        jPanel123.add(jPanel121);

        jPanel122.setOpaque(false);
        jPanel122.setLayout(new java.awt.BorderLayout());

        bt_iniciar3.setBackground(new java.awt.Color(9, 55, 74));
        bt_iniciar3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        bt_iniciar3.setForeground(new java.awt.Color(255, 255, 255));
        bt_iniciar3.setText("INICIAR SESION");
        bt_iniciar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_iniciar3bt_iniciarActionPerformed(evt);
            }
        });
        jPanel122.add(bt_iniciar3, java.awt.BorderLayout.CENTER);

        jPanel123.add(jPanel122);

        jPanel124.add(jPanel123);

        jPanel17.setOpaque(false);

        bt_registro.setBackground(new java.awt.Color(250, 242, 233));
        bt_registro.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        bt_registro.setForeground(new java.awt.Color(9, 55, 74));
        bt_registro.setText("Registrarse");
        bt_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_registrobt_iniciarActionPerformed(evt);
            }
        });
        jPanel17.add(bt_registro);

        jPanel124.add(jPanel17);

        jPanel126.add(jPanel124, java.awt.BorderLayout.CENTER);

        jPanel125.setOpaque(false);

        javax.swing.GroupLayout jPanel125Layout = new javax.swing.GroupLayout(jPanel125);
        jPanel125.setLayout(jPanel125Layout);
        jPanel125Layout.setHorizontalGroup(
            jPanel125Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel125Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel125Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(filler18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel125Layout.setVerticalGroup(
            jPanel125Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 616, Short.MAX_VALUE)
            .addGroup(jPanel125Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel125Layout.createSequentialGroup()
                    .addGap(0, 308, Short.MAX_VALUE)
                    .addComponent(filler18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 308, Short.MAX_VALUE)))
        );

        jPanel126.add(jPanel125, java.awt.BorderLayout.EAST);

        panel_login4.add(jPanel126, java.awt.BorderLayout.CENTER);

        pl_login.add(panel_login4);

        rSPanelBorder27.setBackground(new java.awt.Color(12, 58, 77));
        rSPanelBorder27.setBorderBottom(false);
        rSPanelBorder27.setBorderLeft(false);
        rSPanelBorder27.setBorderRight(false);
        rSPanelBorder27.setBorderTop(false);
        rSPanelBorder27.setRound(80);
        rSPanelBorder27.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(12, 58, 77));
        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel1.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 659, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel50.setOpaque(false);

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 659, Short.MAX_VALUE)
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel50, java.awt.BorderLayout.PAGE_END);

        panel_gif.setOpaque(false);
        panel_gif.setLayout(new java.awt.BorderLayout());
        jPanel5.add(panel_gif, java.awt.BorderLayout.CENTER);

        rSPanelBorder27.add(jPanel5, java.awt.BorderLayout.CENTER);

        pl_login.add(rSPanelBorder27);

        rSPanelBorder26.add(pl_login, "card2");

        pl_log_gif.add(rSPanelBorder26, "card2");

        panel_principal.add(pl_log_gif, "card2");

        pl_control.setLayout(new java.awt.BorderLayout());

        jPanel10.setBackground(new java.awt.Color(226, 236, 235));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel11.setBackground(new java.awt.Color(226, 236, 235));
        jPanel11.setOpaque(false);
        jPanel11.setLayout(new java.awt.CardLayout(30, 30));

        pl_crud_general.setBackground(new java.awt.Color(102, 102, 102));
        pl_crud_general.setToolTipText("");
        pl_crud_general.setOpaque(false);
        pl_crud_general.setLayout(new java.awt.BorderLayout(30, 30));

        rSPanelBorder3.setBackground(new java.awt.Color(255, 255, 255));
        rSPanelBorder3.setBgBorder(new java.awt.Color(255, 255, 255));
        rSPanelBorder3.setBorderBottom(false);
        rSPanelBorder3.setBorderLeft(false);
        rSPanelBorder3.setBorderRight(false);
        rSPanelBorder3.setBorderTop(false);
        rSPanelBorder3.setRound(50);
        rSPanelBorder3.setLayout(new java.awt.BorderLayout());

        jPanel34.setOpaque(false);
        jPanel34.add(filler6);

        rSPanelBorder3.add(jPanel34, java.awt.BorderLayout.PAGE_START);

        jPanel51.setOpaque(false);
        jPanel51.add(filler9);

        rSPanelBorder3.add(jPanel51, java.awt.BorderLayout.PAGE_END);

        jPanel6.setOpaque(false);
        jPanel6.add(filler3);

        rSPanelBorder3.add(jPanel6, java.awt.BorderLayout.LINE_END);

        jPanel7.setOpaque(false);
        jPanel7.add(filler10);

        rSPanelBorder3.add(jPanel7, java.awt.BorderLayout.LINE_START);

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.BorderLayout(20, 0));

        jPanel9.setOpaque(false);
        jPanel9.setRequestFocusEnabled(false);
        jPanel9.setLayout(new java.awt.GridLayout(2, 2, 10, 10));

        rSPanelBorder5.setBackground(new java.awt.Color(226, 236, 235));
        rSPanelBorder5.setBgBorder(new java.awt.Color(226, 236, 235));
        rSPanelBorder5.setBorderBottom(false);
        rSPanelBorder5.setBorderLeft(false);
        rSPanelBorder5.setBorderRight(false);
        rSPanelBorder5.setBorderTop(false);
        rSPanelBorder5.setRound(50);
        rSPanelBorder5.setLayout(new java.awt.BorderLayout());

        rSLabelFecha1.setForeground(new java.awt.Color(60, 86, 84));
        rSLabelFecha1.setFormato("yyyy-MM-dd");
        rSLabelFecha1.setMaximumSize(new java.awt.Dimension(30, 17));
        rSLabelFecha1.setMinimumSize(new java.awt.Dimension(20, 17));
        rSLabelFecha1.setPreferredSize(new java.awt.Dimension(20, 17));
        rSPanelBorder5.add(rSLabelFecha1, java.awt.BorderLayout.CENTER);

        jPanel9.add(rSPanelBorder5);

        rSPanelBorder6.setBackground(new java.awt.Color(226, 236, 235));
        rSPanelBorder6.setBgBorder(new java.awt.Color(226, 236, 235));
        rSPanelBorder6.setBorderBottom(false);
        rSPanelBorder6.setBorderLeft(false);
        rSPanelBorder6.setBorderRight(false);
        rSPanelBorder6.setBorderTop(false);
        rSPanelBorder6.setRound(50);
        rSPanelBorder6.setLayout(new java.awt.BorderLayout());

        rSLabelHora1.setForeground(new java.awt.Color(60, 86, 84));
        rSLabelHora1.setMaximumSize(new java.awt.Dimension(30, 17));
        rSLabelHora1.setMinimumSize(new java.awt.Dimension(20, 17));
        rSLabelHora1.setPreferredSize(new java.awt.Dimension(20, 17));
        rSPanelBorder6.add(rSLabelHora1, java.awt.BorderLayout.CENTER);

        jPanel9.add(rSPanelBorder6);

        rSPanelBorder7.setBackground(new java.awt.Color(200, 156, 50));
        rSPanelBorder7.setBgBorder(new java.awt.Color(226, 236, 235));
        rSPanelBorder7.setBorderBottom(false);
        rSPanelBorder7.setBorderLeft(false);
        rSPanelBorder7.setBorderRight(false);
        rSPanelBorder7.setBorderTop(false);
        rSPanelBorder7.setMinimumSize(new java.awt.Dimension(115, 54));
        rSPanelBorder7.setRound(50);
        rSPanelBorder7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Principal");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel5MouseReleased(evt);
            }
        });
        rSPanelBorder7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 115, 54));

        jPanel9.add(rSPanelBorder7);

        rSPanelBorder8.setBackground(new java.awt.Color(226, 236, 235));
        rSPanelBorder8.setBgBorder(new java.awt.Color(226, 236, 235));
        rSPanelBorder8.setBorderBottom(false);
        rSPanelBorder8.setBorderLeft(false);
        rSPanelBorder8.setBorderRight(false);
        rSPanelBorder8.setBorderTop(false);
        rSPanelBorder8.setRound(50);
        rSPanelBorder8.setLayout(new java.awt.BorderLayout());

        bt_seguridad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bt_seguridad.setForeground(new java.awt.Color(60, 86, 84));
        bt_seguridad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bt_seguridad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shield_on.png"))); // NOI18N
        bt_seguridad.setText(": on");
        bt_seguridad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_seguridadMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_seguridadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_seguridadMouseExited(evt);
            }
        });
        rSPanelBorder8.add(bt_seguridad, java.awt.BorderLayout.CENTER);

        jPanel9.add(rSPanelBorder8);

        jPanel8.add(jPanel9, java.awt.BorderLayout.LINE_END);

        jPanel52.setOpaque(false);
        jPanel52.setLayout(new java.awt.GridLayout(2, 1, 0, 10));

        rSPanelBorder9.setBackground(new java.awt.Color(226, 236, 235));
        rSPanelBorder9.setBgBorder(new java.awt.Color(226, 236, 235));
        rSPanelBorder9.setBorderBottom(false);
        rSPanelBorder9.setBorderLeft(false);
        rSPanelBorder9.setBorderRight(false);
        rSPanelBorder9.setBorderTop(false);
        rSPanelBorder9.setRound(50);
        rSPanelBorder9.setLayout(new java.awt.GridLayout(1, 2, 10, 10));

        rSPanelBorder14.setBackground(new java.awt.Color(226, 236, 235));
        rSPanelBorder14.setBgBorder(new java.awt.Color(226, 236, 235));
        rSPanelBorder14.setBorderBottom(false);
        rSPanelBorder14.setBorderLeft(false);
        rSPanelBorder14.setBorderRight(false);
        rSPanelBorder14.setBorderTop(false);
        rSPanelBorder14.setRound(50);
        rSPanelBorder14.setLayout(new java.awt.BorderLayout());

        jLabel51.setBackground(new java.awt.Color(226, 236, 235));
        jLabel51.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(60, 86, 84));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("ROL");
        rSPanelBorder14.add(jLabel51, java.awt.BorderLayout.CENTER);

        rSPanelBorder9.add(rSPanelBorder14);

        rSPanelBorder15.setBackground(new java.awt.Color(226, 236, 235));
        rSPanelBorder15.setBgBorder(new java.awt.Color(226, 236, 235));
        rSPanelBorder15.setBorderBottom(false);
        rSPanelBorder15.setBorderLeft(false);
        rSPanelBorder15.setBorderRight(false);
        rSPanelBorder15.setBorderTop(false);
        rSPanelBorder15.setRound(50);
        rSPanelBorder15.setLayout(new java.awt.BorderLayout());

        jLabel49.setBackground(new java.awt.Color(226, 236, 235));
        jLabel49.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(60, 86, 84));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("CONTRATOS");
        rSPanelBorder15.add(jLabel49, java.awt.BorderLayout.CENTER);

        rSPanelBorder9.add(rSPanelBorder15);

        jLabel50.setBackground(new java.awt.Color(226, 236, 235));
        jLabel50.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(60, 86, 84));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("AREA");
        rSPanelBorder9.add(jLabel50);

        rSPanelBorder25.setBackground(new java.awt.Color(226, 236, 235));
        rSPanelBorder25.setBgBorder(new java.awt.Color(226, 236, 235));
        rSPanelBorder25.setBorderBottom(false);
        rSPanelBorder25.setBorderLeft(false);
        rSPanelBorder25.setBorderRight(false);
        rSPanelBorder25.setBorderTop(false);
        rSPanelBorder25.setRound(50);
        rSPanelBorder25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel52.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(60, 86, 84));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("PROMOCIONES");
        rSPanelBorder25.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 115, 54));

        rSPanelBorder9.add(rSPanelBorder25);

        jPanel52.add(rSPanelBorder9);

        rSPanelBorder10.setBackground(new java.awt.Color(226, 236, 235));
        rSPanelBorder10.setBgBorder(new java.awt.Color(226, 236, 235));
        rSPanelBorder10.setBorderBottom(false);
        rSPanelBorder10.setBorderLeft(false);
        rSPanelBorder10.setBorderRight(false);
        rSPanelBorder10.setBorderTop(false);
        rSPanelBorder10.setRound(50);
        rSPanelBorder10.setLayout(new java.awt.GridLayout(1, 3, 10, 10));

        rSPanelBorder11.setBackground(new java.awt.Color(60, 86, 84));
        rSPanelBorder11.setBgBorder(new java.awt.Color(60, 86, 84));
        rSPanelBorder11.setBorderBottom(false);
        rSPanelBorder11.setBorderLeft(false);
        rSPanelBorder11.setBorderRight(false);
        rSPanelBorder11.setBorderTop(false);
        rSPanelBorder11.setRound(50);
        rSPanelBorder11.setLayout(new java.awt.BorderLayout());

        jLabel45.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("EMPLEADOS");
        rSPanelBorder11.add(jLabel45, java.awt.BorderLayout.CENTER);

        rSPanelBorder10.add(rSPanelBorder11);

        rSPanelBorder12.setBackground(new java.awt.Color(226, 236, 235));
        rSPanelBorder12.setBgBorder(new java.awt.Color(226, 236, 235));
        rSPanelBorder12.setBorderBottom(false);
        rSPanelBorder12.setBorderLeft(false);
        rSPanelBorder12.setBorderRight(false);
        rSPanelBorder12.setBorderTop(false);
        rSPanelBorder12.setRound(50);
        rSPanelBorder12.setLayout(new java.awt.BorderLayout());

        jLabel46.setBackground(new java.awt.Color(226, 236, 235));
        jLabel46.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(60, 86, 84));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("CLIENTES");
        rSPanelBorder12.add(jLabel46, java.awt.BorderLayout.CENTER);

        rSPanelBorder10.add(rSPanelBorder12);

        rSPanelBorder13.setBackground(new java.awt.Color(226, 236, 235));
        rSPanelBorder13.setBgBorder(new java.awt.Color(226, 236, 235));
        rSPanelBorder13.setBorderBottom(false);
        rSPanelBorder13.setBorderLeft(false);
        rSPanelBorder13.setBorderRight(false);
        rSPanelBorder13.setBorderTop(false);
        rSPanelBorder13.setRound(50);
        rSPanelBorder13.setLayout(new java.awt.BorderLayout());

        jLabel47.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(60, 86, 84));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("HABITACIONES");
        rSPanelBorder13.add(jLabel47, java.awt.BorderLayout.CENTER);

        rSPanelBorder10.add(rSPanelBorder13);

        jPanel52.add(rSPanelBorder10);

        jPanel8.add(jPanel52, java.awt.BorderLayout.CENTER);

        rSPanelBorder3.add(jPanel8, java.awt.BorderLayout.CENTER);

        pl_crud_general.add(rSPanelBorder3, java.awt.BorderLayout.NORTH);

        rSPanelBorder4.setBackground(new java.awt.Color(226, 236, 235));
        rSPanelBorder4.setBgBorder(new java.awt.Color(255, 255, 255));
        rSPanelBorder4.setBorderBottom(false);
        rSPanelBorder4.setBorderLeft(false);
        rSPanelBorder4.setBorderRight(false);
        rSPanelBorder4.setBorderTop(false);
        rSPanelBorder4.setOpaque(false);
        rSPanelBorder4.setRound(50);
        rSPanelBorder4.setLayout(new java.awt.BorderLayout(20, 0));

        rSPanelBorder1.setBackground(new java.awt.Color(60, 86, 84));
        rSPanelBorder1.setBgBorder(new java.awt.Color(60, 86, 84));
        rSPanelBorder1.setBorderBottom(false);
        rSPanelBorder1.setBorderLeft(false);
        rSPanelBorder1.setBorderRight(false);
        rSPanelBorder1.setBorderTop(false);
        rSPanelBorder1.setRound(50);
        rSPanelBorder1.setLayout(new java.awt.BorderLayout());

        jPanel53.setOpaque(false);
        jPanel53.setLayout(new java.awt.BorderLayout());

        jLabel21.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel53.add(jLabel21, java.awt.BorderLayout.CENTER);
        jPanel53.add(filler14, java.awt.BorderLayout.PAGE_START);
        jPanel53.add(filler49, java.awt.BorderLayout.PAGE_END);

        rSPanelBorder1.add(jPanel53, java.awt.BorderLayout.PAGE_START);

        jPanel82.setOpaque(false);
        jPanel82.setLayout(new java.awt.BorderLayout());

        jPanel84.setOpaque(false);
        jPanel84.add(filler28);

        jPanel82.add(jPanel84, java.awt.BorderLayout.WEST);

        jPanel85.setOpaque(false);
        jPanel85.add(filler27);

        jPanel82.add(jPanel85, java.awt.BorderLayout.EAST);

        jPanel87.setOpaque(false);
        jPanel87.setLayout(new java.awt.GridLayout(1, 0));
        jPanel87.add(filler29);
        jPanel87.add(filler31);

        jPanel82.add(jPanel87, java.awt.BorderLayout.PAGE_START);

        jPanel86.setOpaque(false);
        jPanel86.setLayout(new java.awt.CardLayout());

        jPanel176.setOpaque(false);
        jPanel176.setLayout(new java.awt.GridLayout(4, 1, 0, 10));

        jPanel178.setLayout(new java.awt.BorderLayout());

        rSPanelImage4.setImagen(new javax.swing.ImageIcon(getClass().getResource("/img/naranja.gif"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage4Layout = new javax.swing.GroupLayout(rSPanelImage4);
        rSPanelImage4.setLayout(rSPanelImage4Layout);
        rSPanelImage4Layout.setHorizontalGroup(
            rSPanelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        rSPanelImage4Layout.setVerticalGroup(
            rSPanelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 144, Short.MAX_VALUE)
        );

        jPanel178.add(rSPanelImage4, java.awt.BorderLayout.CENTER);

        jPanel176.add(jPanel178);

        jPanel181.setLayout(new java.awt.BorderLayout());

        rSPanelImage3.setImagen(new javax.swing.ImageIcon(getClass().getResource("/img/perro.gif"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage3Layout = new javax.swing.GroupLayout(rSPanelImage3);
        rSPanelImage3.setLayout(rSPanelImage3Layout);
        rSPanelImage3Layout.setHorizontalGroup(
            rSPanelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        rSPanelImage3Layout.setVerticalGroup(
            rSPanelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 144, Short.MAX_VALUE)
        );

        jPanel181.add(rSPanelImage3, java.awt.BorderLayout.CENTER);

        jPanel176.add(jPanel181);

        jPanel184.setLayout(new java.awt.BorderLayout());

        rSPanelImage5.setImagen(new javax.swing.ImageIcon(getClass().getResource("/img/youtube.gif"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage5Layout = new javax.swing.GroupLayout(rSPanelImage5);
        rSPanelImage5.setLayout(rSPanelImage5Layout);
        rSPanelImage5Layout.setHorizontalGroup(
            rSPanelImage5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        rSPanelImage5Layout.setVerticalGroup(
            rSPanelImage5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 144, Short.MAX_VALUE)
        );

        jPanel184.add(rSPanelImage5, java.awt.BorderLayout.CENTER);

        jPanel176.add(jPanel184);

        rSPanelImage6.setImagen(new javax.swing.ImageIcon(getClass().getResource("/img/bomba.gif"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage6Layout = new javax.swing.GroupLayout(rSPanelImage6);
        rSPanelImage6.setLayout(rSPanelImage6Layout);
        rSPanelImage6Layout.setHorizontalGroup(
            rSPanelImage6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        rSPanelImage6Layout.setVerticalGroup(
            rSPanelImage6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 144, Short.MAX_VALUE)
        );

        jPanel176.add(rSPanelImage6);

        jPanel86.add(jPanel176, "card1");

        jPanel83.setBackground(new java.awt.Color(255, 255, 255));
        jPanel83.setOpaque(false);
        jPanel83.setLayout(new java.awt.BorderLayout(0, 10));
        jPanel83.add(filler26, java.awt.BorderLayout.SOUTH);

        jPanel179.setOpaque(false);
        jPanel179.setLayout(new java.awt.BorderLayout());

        jLabel23.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Datos de usuario");
        jPanel179.add(jLabel23, java.awt.BorderLayout.NORTH);

        jPanel83.add(jPanel179, java.awt.BorderLayout.NORTH);

        jPanel217.setOpaque(false);
        jPanel217.setLayout(new java.awt.BorderLayout(0, 20));

        jPanel218.setOpaque(false);
        jPanel218.setLayout(new java.awt.BorderLayout());

        jPanel220.setOpaque(false);
        jPanel220.setLayout(new java.awt.BorderLayout());
        jPanel220.add(filler57, java.awt.BorderLayout.PAGE_START);

        jPanel218.add(jPanel220, java.awt.BorderLayout.LINE_START);

        jPanel221.setOpaque(false);
        jPanel221.setLayout(new java.awt.BorderLayout());
        jPanel221.add(filler56, java.awt.BorderLayout.PAGE_START);

        jPanel218.add(jPanel221, java.awt.BorderLayout.LINE_END);

        jPanel222.setBackground(new java.awt.Color(255, 255, 255));
        jPanel222.setOpaque(false);
        jPanel222.setLayout(new java.awt.BorderLayout());

        img_usuario.setColorBorde(new java.awt.Color(0, 0, 0));
        img_usuario.setImagen(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N

        javax.swing.GroupLayout img_usuarioLayout = new javax.swing.GroupLayout(img_usuario);
        img_usuario.setLayout(img_usuarioLayout);
        img_usuarioLayout.setHorizontalGroup(
            img_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        img_usuarioLayout.setVerticalGroup(
            img_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        jPanel222.add(img_usuario, java.awt.BorderLayout.CENTER);

        jPanel218.add(jPanel222, java.awt.BorderLayout.CENTER);

        jPanel217.add(jPanel218, java.awt.BorderLayout.PAGE_START);

        jPanel219.setOpaque(false);
        jPanel219.setLayout(new java.awt.GridLayout(7, 1, 10, 10));

        jPanel88.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel88.setOpaque(false);
        jPanel88.setLayout(new java.awt.GridLayout(2, 1));

        jLabel48.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Nombres");
        jPanel88.add(jLabel48);

        nombre.setEditable(false);
        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombre.setBorder(null);
        jPanel88.add(nombre);

        jPanel219.add(jPanel88);

        jPanel196.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel196.setOpaque(false);
        jPanel196.setLayout(new java.awt.GridLayout(2, 1));

        jLabel53.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("Apellidos");
        jPanel196.add(jLabel53);

        apellido.setEditable(false);
        apellido.setBackground(new java.awt.Color(255, 255, 255));
        apellido.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        apellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        apellido.setBorder(null);
        jPanel196.add(apellido);

        jPanel219.add(jPanel196);

        jPanel197.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel197.setOpaque(false);
        jPanel197.setLayout(new java.awt.GridLayout(2, 1));

        jLabel54.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("Edad");
        jPanel197.add(jLabel54);

        edad.setEditable(false);
        edad.setBackground(new java.awt.Color(255, 255, 255));
        edad.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        edad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        edad.setBorder(null);
        jPanel197.add(edad);

        jPanel219.add(jPanel197);

        jPanel198.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel198.setOpaque(false);
        jPanel198.setLayout(new java.awt.GridLayout(2, 1));

        jLabel55.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("Correo");
        jPanel198.add(jLabel55);

        estado.setEditable(false);
        estado.setBackground(new java.awt.Color(255, 255, 255));
        estado.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        estado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        estado.setBorder(null);
        jPanel198.add(estado);

        jPanel219.add(jPanel198);

        jPanel200.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel200.setOpaque(false);
        jPanel200.setLayout(new java.awt.GridLayout(2, 1));

        jLabel56.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("Estado Contrato");
        jPanel200.add(jLabel56);

        telefono.setEditable(false);
        telefono.setBackground(new java.awt.Color(255, 255, 255));
        telefono.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        telefono.setBorder(null);
        jPanel200.add(telefono);

        jPanel219.add(jPanel200);

        jPanel201.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel201.setOpaque(false);
        jPanel201.setLayout(new java.awt.GridLayout(2, 1));

        jLabel57.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("Telefono");
        jPanel201.add(jLabel57);

        correo.setEditable(false);
        correo.setBackground(new java.awt.Color(255, 255, 255));
        correo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        correo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        correo.setBorder(null);
        jPanel201.add(correo);

        jPanel219.add(jPanel201);

        jPanel217.add(jPanel219, java.awt.BorderLayout.CENTER);

        jPanel83.add(jPanel217, java.awt.BorderLayout.CENTER);

        jPanel86.add(jPanel83, "card2");

        jPanel82.add(jPanel86, java.awt.BorderLayout.CENTER);

        rSPanelBorder1.add(jPanel82, java.awt.BorderLayout.CENTER);

        jPanel177.setOpaque(false);
        jPanel177.add(filler50);

        rSPanelBorder1.add(jPanel177, java.awt.BorderLayout.PAGE_END);

        rSPanelBorder4.add(rSPanelBorder1, java.awt.BorderLayout.LINE_END);

        jPanel199.setOpaque(false);
        jPanel199.setLayout(new java.awt.CardLayout());

        cartas_objetos.setBackground(new java.awt.Color(255, 255, 255));
        cartas_objetos.setBgBorder(new java.awt.Color(255, 255, 255));
        cartas_objetos.setBorderBottom(false);
        cartas_objetos.setBorderLeft(false);
        cartas_objetos.setBorderRight(false);
        cartas_objetos.setBorderTop(false);
        cartas_objetos.setRound(50);
        cartas_objetos.setLayout(new java.awt.CardLayout());

        rSPanelBorder17.setBackground(new java.awt.Color(255, 255, 255));
        rSPanelBorder17.setBgBorder(new java.awt.Color(255, 255, 255));
        rSPanelBorder17.setBorderBottom(false);
        rSPanelBorder17.setBorderLeft(false);
        rSPanelBorder17.setBorderRight(false);
        rSPanelBorder17.setBorderTop(false);
        rSPanelBorder17.setRound(50);
        rSPanelBorder17.setLayout(new java.awt.GridLayout(4, 1, 20, 20));

        jPanel33.setOpaque(false);
        jPanel33.setLayout(new java.awt.BorderLayout());

        jPanel37.setOpaque(false);
        jPanel37.setLayout(new java.awt.BorderLayout());

        jPanel54.setOpaque(false);
        jPanel54.add(filler13);

        jPanel37.add(jPanel54, java.awt.BorderLayout.LINE_START);

        jPanel36.setOpaque(false);
        jPanel36.setLayout(new java.awt.BorderLayout());

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel36.add(jLabel6, java.awt.BorderLayout.CENTER);

        jPanel37.add(jPanel36, java.awt.BorderLayout.CENTER);

        jPanel167.setOpaque(false);
        jPanel167.setLayout(new java.awt.BorderLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/writing.png"))); // NOI18N
        jPanel167.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel37.add(jPanel167, java.awt.BorderLayout.CENTER);

        jPanel33.add(jPanel37, java.awt.BorderLayout.LINE_START);

        jPanel38.setOpaque(false);
        jPanel38.setLayout(new java.awt.BorderLayout());

        jPanel55.setOpaque(false);
        jPanel55.setLayout(new java.awt.BorderLayout());

        jPanel56.setOpaque(false);
        jPanel56.add(filler25);

        jPanel55.add(jPanel56, java.awt.BorderLayout.LINE_START);

        jPanel57.setOpaque(false);
        jPanel57.add(filler30);

        jPanel55.add(jPanel57, java.awt.BorderLayout.LINE_END);

        jPanel58.setOpaque(false);
        jPanel58.setLayout(new java.awt.GridBagLayout());

        rSButtonShape2.setBackground(new java.awt.Color(200, 156, 50));
        rSButtonShape2.setText("IR");
        rSButtonShape2.setBackgroundHover(new java.awt.Color(60, 86, 84));
        rSButtonShape2.setForma(RSMaterialComponent.RSButtonShape.FORMA.ROUND);
        rSButtonShape2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rSButtonShape2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rSButtonShape2.setMaximumSize(new java.awt.Dimension(100, 35));
        rSButtonShape2.setMinimumSize(new java.awt.Dimension(100, 35));
        rSButtonShape2.setPreferredSize(new java.awt.Dimension(100, 35));
        rSButtonShape2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonShape2ActionPerformed(evt);
            }
        });
        jPanel58.add(rSButtonShape2, new java.awt.GridBagConstraints());

        jPanel55.add(jPanel58, java.awt.BorderLayout.CENTER);

        jPanel38.add(jPanel55, java.awt.BorderLayout.LINE_START);

        jPanel33.add(jPanel38, java.awt.BorderLayout.LINE_END);

        jPanel39.setOpaque(false);
        jPanel39.setLayout(new java.awt.BorderLayout());

        jPanel59.setOpaque(false);
        jPanel59.setLayout(new java.awt.BorderLayout());

        jLabel9.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(60, 86, 84));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("CREATE");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel59.add(jLabel9, java.awt.BorderLayout.CENTER);

        jPanel39.add(jPanel59, java.awt.BorderLayout.CENTER);

        jPanel60.setOpaque(false);
        jPanel60.setLayout(new java.awt.GridLayout(2, 1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(60, 86, 84));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Total cambios");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel60.add(jLabel10);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(60, 86, 84));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("#");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel60.add(jLabel11);

        jPanel39.add(jPanel60, java.awt.BorderLayout.EAST);

        jPanel33.add(jPanel39, java.awt.BorderLayout.CENTER);

        rSPanelBorder17.add(jPanel33);

        jPanel61.setOpaque(false);
        jPanel61.setLayout(new java.awt.BorderLayout());

        jPanel62.setOpaque(false);
        jPanel62.setLayout(new java.awt.BorderLayout());

        jPanel63.setOpaque(false);
        jPanel63.add(filler32);

        jPanel62.add(jPanel63, java.awt.BorderLayout.LINE_START);

        jPanel64.setOpaque(false);
        jPanel64.setLayout(new java.awt.BorderLayout());

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel64.add(jLabel12, java.awt.BorderLayout.CENTER);

        jPanel62.add(jPanel64, java.awt.BorderLayout.CENTER);

        jPanel168.setOpaque(false);
        jPanel168.setLayout(new java.awt.BorderLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/open-book.png"))); // NOI18N
        jPanel168.add(jLabel3, java.awt.BorderLayout.CENTER);

        jPanel62.add(jPanel168, java.awt.BorderLayout.CENTER);

        jPanel61.add(jPanel62, java.awt.BorderLayout.LINE_START);

        jPanel65.setOpaque(false);
        jPanel65.setLayout(new java.awt.BorderLayout());

        jPanel66.setOpaque(false);
        jPanel66.setLayout(new java.awt.BorderLayout());

        jPanel67.setOpaque(false);
        jPanel67.add(filler33);

        jPanel66.add(jPanel67, java.awt.BorderLayout.LINE_START);

        jPanel68.setOpaque(false);
        jPanel68.add(filler34);

        jPanel66.add(jPanel68, java.awt.BorderLayout.LINE_END);

        jPanel69.setOpaque(false);
        jPanel69.setLayout(new java.awt.GridBagLayout());

        rSButtonShape3.setBackground(new java.awt.Color(200, 156, 50));
        rSButtonShape3.setText("IR");
        rSButtonShape3.setBackgroundHover(new java.awt.Color(60, 86, 84));
        rSButtonShape3.setForma(RSMaterialComponent.RSButtonShape.FORMA.ROUND);
        rSButtonShape3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rSButtonShape3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rSButtonShape3.setMaximumSize(new java.awt.Dimension(100, 35));
        rSButtonShape3.setMinimumSize(new java.awt.Dimension(100, 35));
        rSButtonShape3.setPreferredSize(new java.awt.Dimension(100, 35));
        rSButtonShape3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonShape3ActionPerformed(evt);
            }
        });
        jPanel69.add(rSButtonShape3, new java.awt.GridBagConstraints());

        jPanel66.add(jPanel69, java.awt.BorderLayout.CENTER);

        jPanel65.add(jPanel66, java.awt.BorderLayout.LINE_START);

        jPanel61.add(jPanel65, java.awt.BorderLayout.LINE_END);

        jPanel70.setOpaque(false);
        jPanel70.setLayout(new java.awt.BorderLayout());

        jPanel71.setOpaque(false);
        jPanel71.setLayout(new java.awt.BorderLayout());

        jLabel13.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(60, 86, 84));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("READ");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel71.add(jLabel13, java.awt.BorderLayout.CENTER);

        jPanel70.add(jPanel71, java.awt.BorderLayout.CENTER);

        jPanel72.setOpaque(false);
        jPanel72.setLayout(new java.awt.GridLayout(2, 1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(60, 86, 84));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Total cambios");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel72.add(jLabel14);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(60, 86, 84));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("#");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel72.add(jLabel15);

        jPanel70.add(jPanel72, java.awt.BorderLayout.EAST);

        jPanel61.add(jPanel70, java.awt.BorderLayout.CENTER);

        rSPanelBorder17.add(jPanel61);

        jPanel73.setOpaque(false);
        jPanel73.setLayout(new java.awt.BorderLayout());

        jPanel74.setOpaque(false);
        jPanel74.setLayout(new java.awt.BorderLayout());

        jPanel75.setOpaque(false);
        jPanel75.add(filler35);

        jPanel74.add(jPanel75, java.awt.BorderLayout.LINE_START);

        jPanel76.setOpaque(false);
        jPanel76.setLayout(new java.awt.BorderLayout());

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel76.add(jLabel16, java.awt.BorderLayout.CENTER);

        jPanel74.add(jPanel76, java.awt.BorderLayout.CENTER);

        jPanel169.setOpaque(false);
        jPanel169.setLayout(new java.awt.BorderLayout());

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/browser.png"))); // NOI18N
        jPanel169.add(jLabel41, java.awt.BorderLayout.CENTER);

        jPanel74.add(jPanel169, java.awt.BorderLayout.CENTER);

        jPanel73.add(jPanel74, java.awt.BorderLayout.LINE_START);

        jPanel77.setOpaque(false);
        jPanel77.setLayout(new java.awt.BorderLayout());

        jPanel78.setOpaque(false);
        jPanel78.setLayout(new java.awt.BorderLayout());

        jPanel79.setOpaque(false);
        jPanel79.add(filler36);

        jPanel78.add(jPanel79, java.awt.BorderLayout.LINE_START);

        jPanel80.setOpaque(false);
        jPanel80.add(filler37);

        jPanel78.add(jPanel80, java.awt.BorderLayout.LINE_END);

        jPanel81.setOpaque(false);
        jPanel81.setLayout(new java.awt.GridBagLayout());

        rSButtonShape4.setBackground(new java.awt.Color(200, 156, 50));
        rSButtonShape4.setText("IR");
        rSButtonShape4.setBackgroundHover(new java.awt.Color(60, 86, 84));
        rSButtonShape4.setForma(RSMaterialComponent.RSButtonShape.FORMA.ROUND);
        rSButtonShape4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rSButtonShape4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rSButtonShape4.setMaximumSize(new java.awt.Dimension(100, 35));
        rSButtonShape4.setMinimumSize(new java.awt.Dimension(100, 35));
        rSButtonShape4.setPreferredSize(new java.awt.Dimension(100, 35));
        rSButtonShape4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonShape4ActionPerformed(evt);
            }
        });
        jPanel81.add(rSButtonShape4, new java.awt.GridBagConstraints());

        jPanel78.add(jPanel81, java.awt.BorderLayout.CENTER);

        jPanel77.add(jPanel78, java.awt.BorderLayout.LINE_START);

        jPanel73.add(jPanel77, java.awt.BorderLayout.LINE_END);

        jPanel89.setOpaque(false);
        jPanel89.setLayout(new java.awt.BorderLayout());

        jPanel90.setOpaque(false);
        jPanel90.setLayout(new java.awt.BorderLayout());

        jLabel17.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(60, 86, 84));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("UPDATE");
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel90.add(jLabel17, java.awt.BorderLayout.CENTER);

        jPanel89.add(jPanel90, java.awt.BorderLayout.CENTER);

        jPanel91.setOpaque(false);
        jPanel91.setLayout(new java.awt.GridLayout(2, 1));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(60, 86, 84));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Total cambios");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel91.add(jLabel18);

        jLabel19.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(60, 86, 84));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("#");
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel91.add(jLabel19);

        jPanel89.add(jPanel91, java.awt.BorderLayout.EAST);

        jPanel73.add(jPanel89, java.awt.BorderLayout.CENTER);

        rSPanelBorder17.add(jPanel73);

        jPanel92.setOpaque(false);
        jPanel92.setLayout(new java.awt.BorderLayout());

        jPanel93.setOpaque(false);
        jPanel93.setLayout(new java.awt.BorderLayout());

        jPanel94.setOpaque(false);
        jPanel94.add(filler38);

        jPanel93.add(jPanel94, java.awt.BorderLayout.LINE_START);

        jPanel95.setOpaque(false);
        jPanel95.setLayout(new java.awt.BorderLayout());

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel95.add(jLabel20, java.awt.BorderLayout.CENTER);

        jPanel93.add(jPanel95, java.awt.BorderLayout.CENTER);

        jPanel170.setOpaque(false);
        jPanel170.setLayout(new java.awt.BorderLayout());

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        jPanel170.add(jLabel44, java.awt.BorderLayout.CENTER);

        jPanel93.add(jPanel170, java.awt.BorderLayout.CENTER);

        jPanel92.add(jPanel93, java.awt.BorderLayout.LINE_START);

        jPanel96.setOpaque(false);
        jPanel96.setLayout(new java.awt.BorderLayout());

        jPanel97.setOpaque(false);
        jPanel97.setLayout(new java.awt.BorderLayout());

        jPanel98.setOpaque(false);
        jPanel98.add(filler39);

        jPanel97.add(jPanel98, java.awt.BorderLayout.LINE_START);

        jPanel99.setOpaque(false);
        jPanel99.add(filler40);

        jPanel97.add(jPanel99, java.awt.BorderLayout.LINE_END);

        jPanel100.setOpaque(false);
        jPanel100.setLayout(new java.awt.GridBagLayout());

        rSButtonShape5.setBackground(new java.awt.Color(200, 156, 50));
        rSButtonShape5.setText("IR");
        rSButtonShape5.setBackgroundHover(new java.awt.Color(60, 86, 84));
        rSButtonShape5.setForma(RSMaterialComponent.RSButtonShape.FORMA.ROUND);
        rSButtonShape5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rSButtonShape5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rSButtonShape5.setMaximumSize(new java.awt.Dimension(100, 35));
        rSButtonShape5.setMinimumSize(new java.awt.Dimension(100, 35));
        rSButtonShape5.setPreferredSize(new java.awt.Dimension(100, 35));
        rSButtonShape5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonShape5ActionPerformed(evt);
            }
        });
        jPanel100.add(rSButtonShape5, new java.awt.GridBagConstraints());

        jPanel97.add(jPanel100, java.awt.BorderLayout.CENTER);

        jPanel96.add(jPanel97, java.awt.BorderLayout.LINE_START);

        jPanel92.add(jPanel96, java.awt.BorderLayout.LINE_END);

        jPanel101.setOpaque(false);
        jPanel101.setLayout(new java.awt.BorderLayout());

        jPanel102.setOpaque(false);
        jPanel102.setLayout(new java.awt.BorderLayout());

        jLabel22.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(60, 86, 84));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("DELETE");
        jLabel22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel102.add(jLabel22, java.awt.BorderLayout.CENTER);

        jPanel101.add(jPanel102, java.awt.BorderLayout.CENTER);

        jPanel103.setOpaque(false);
        jPanel103.setLayout(new java.awt.GridLayout(2, 1));

        jLabel29.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(60, 86, 84));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Total cambios");
        jLabel29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel103.add(jLabel29);

        jLabel30.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(60, 86, 84));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("#");
        jLabel30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel103.add(jLabel30);

        jPanel101.add(jPanel103, java.awt.BorderLayout.EAST);

        jPanel92.add(jPanel101, java.awt.BorderLayout.CENTER);

        rSPanelBorder17.add(jPanel92);

        cartas_objetos.add(rSPanelBorder17, "card2");

        jPanel199.add(cartas_objetos, "carta_principal");

        carta_crear_empleado.setBackground(new java.awt.Color(226, 236, 235));
        carta_crear_empleado.setBgBorder(new java.awt.Color(255, 255, 255));
        carta_crear_empleado.setBorderBottom(false);
        carta_crear_empleado.setBorderLeft(false);
        carta_crear_empleado.setBorderRight(false);
        carta_crear_empleado.setBorderTop(false);
        carta_crear_empleado.setRound(50);
        carta_crear_empleado.setLayout(new java.awt.BorderLayout(20, 20));

        cartas_objetos1.setBackground(new java.awt.Color(255, 255, 255));
        cartas_objetos1.setBgBorder(new java.awt.Color(255, 255, 255));
        cartas_objetos1.setBorderBottom(false);
        cartas_objetos1.setBorderLeft(false);
        cartas_objetos1.setBorderRight(false);
        cartas_objetos1.setBorderTop(false);
        cartas_objetos1.setRound(50);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/writing.png"))); // NOI18N
        jLabel1.setText("REGISTRAR EMPLEADO");
        cartas_objetos1.add(jLabel1);

        carta_crear_empleado.add(cartas_objetos1, java.awt.BorderLayout.NORTH);

        cartas_objetos2.setBackground(new java.awt.Color(255, 255, 255));
        cartas_objetos2.setBgBorder(new java.awt.Color(255, 255, 255));
        cartas_objetos2.setBorderBottom(false);
        cartas_objetos2.setBorderLeft(false);
        cartas_objetos2.setBorderRight(false);
        cartas_objetos2.setBorderTop(false);
        cartas_objetos2.setRound(50);
        cartas_objetos2.setLayout(new java.awt.BorderLayout());

        cartas_objetos3.setBackground(new java.awt.Color(255, 255, 255));
        cartas_objetos3.setBgBorder(new java.awt.Color(255, 255, 255));
        cartas_objetos3.setBorderBottom(false);
        cartas_objetos3.setBorderLeft(false);
        cartas_objetos3.setBorderRight(false);
        cartas_objetos3.setBorderTop(false);
        cartas_objetos3.setRound(50);
        cartas_objetos3.setLayout(new java.awt.BorderLayout());

        jPanel180.setOpaque(false);
        jPanel180.setLayout(new java.awt.BorderLayout(20, 20));

        jPanel189.setBackground(new java.awt.Color(226, 236, 235));
        jPanel189.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

        jPanel233.setBackground(new java.awt.Color(255, 255, 255));
        jPanel233.setLayout(new java.awt.CardLayout(20, 20));

        jPanel234.setBackground(new java.awt.Color(153, 153, 153));
        jPanel234.setOpaque(false);
        jPanel234.setLayout(new java.awt.GridLayout(5, 1, 0, 10));

        jPanel243.setOpaque(false);
        jPanel243.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        jPanel244.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 236, 235), 3));
        jPanel244.setLayout(new java.awt.GridLayout(2, 1));

        jPanel245.setBackground(new java.awt.Color(255, 255, 255));
        jPanel245.setLayout(new java.awt.BorderLayout());

        jLabel71.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel71.setText("Nombres");
        jPanel245.add(jLabel71, java.awt.BorderLayout.WEST);

        jPanel244.add(jPanel245);

        jPanel246.setLayout(new java.awt.BorderLayout());

        txt_nombre_empleado.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        txt_nombre_empleado.setForeground(new java.awt.Color(238, 55, 57));
        txt_nombre_empleado.setText("obligatorio*");
        txt_nombre_empleado.setBorder(null);
        txt_nombre_empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_nombre_empleadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_nombre_empleadoMouseExited(evt);
            }
        });
        jPanel246.add(txt_nombre_empleado, java.awt.BorderLayout.CENTER);

        jPanel244.add(jPanel246);

        jPanel243.add(jPanel244);

        jPanel247.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 236, 235), 3));
        jPanel247.setLayout(new java.awt.GridLayout(2, 1));

        jPanel248.setBackground(new java.awt.Color(255, 255, 255));
        jPanel248.setLayout(new java.awt.BorderLayout());

        jLabel72.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel72.setText("Apellidos");
        jPanel248.add(jLabel72, java.awt.BorderLayout.WEST);

        jPanel247.add(jPanel248);

        jPanel249.setLayout(new java.awt.BorderLayout());

        txt_apellidos_empleado.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        txt_apellidos_empleado.setForeground(new java.awt.Color(238, 55, 57));
        txt_apellidos_empleado.setText("obligatorio*");
        txt_apellidos_empleado.setBorder(null);
        txt_apellidos_empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_apellidos_empleadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_apellidos_empleadoMouseExited(evt);
            }
        });
        jPanel249.add(txt_apellidos_empleado, java.awt.BorderLayout.CENTER);

        jPanel247.add(jPanel249);

        jPanel243.add(jPanel247);

        jPanel234.add(jPanel243);

        jPanel250.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 236, 235), 3));
        jPanel250.setLayout(new java.awt.GridLayout(2, 1));

        jPanel251.setBackground(new java.awt.Color(255, 255, 255));
        jPanel251.setLayout(new java.awt.BorderLayout());

        jLabel73.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel73.setText("Correo Electronico");
        jPanel251.add(jLabel73, java.awt.BorderLayout.WEST);

        jPanel250.add(jPanel251);

        jPanel252.setLayout(new java.awt.BorderLayout());

        txt_correo_empleado.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        txt_correo_empleado.setForeground(new java.awt.Color(238, 55, 57));
        txt_correo_empleado.setText("obligatorio*");
        txt_correo_empleado.setBorder(null);
        txt_correo_empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_correo_empleadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_correo_empleadoMouseExited(evt);
            }
        });
        jPanel252.add(txt_correo_empleado, java.awt.BorderLayout.CENTER);

        jPanel250.add(jPanel252);

        jPanel234.add(jPanel250);

        jPanel253.setOpaque(false);
        jPanel253.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        jPanel254.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 236, 235), 3));
        jPanel254.setLayout(new java.awt.GridLayout(2, 1));

        jPanel255.setBackground(new java.awt.Color(255, 255, 255));
        jPanel255.setLayout(new java.awt.BorderLayout());

        jLabel74.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel74.setText("Tipo de documento");
        jPanel255.add(jLabel74, java.awt.BorderLayout.WEST);

        jPanel254.add(jPanel255);

        jPanel256.setBackground(new java.awt.Color(255, 255, 255));
        jPanel256.setLayout(new java.awt.BorderLayout());

        jComboBox_tipo_documento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBox_tipo_documento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        jComboBox_tipo_documento.setBorder(null);
        jPanel256.add(jComboBox_tipo_documento, java.awt.BorderLayout.CENTER);

        jPanel254.add(jPanel256);

        jPanel253.add(jPanel254);

        jPanel257.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 236, 235), 3));
        jPanel257.setLayout(new java.awt.GridLayout(2, 1));

        jPanel258.setBackground(new java.awt.Color(255, 255, 255));
        jPanel258.setLayout(new java.awt.BorderLayout());

        jLabel75.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel75.setText("Numero de Documento");
        jPanel258.add(jLabel75, java.awt.BorderLayout.WEST);

        jPanel257.add(jPanel258);

        jPanel259.setLayout(new java.awt.BorderLayout());

        txt_dni_empleado.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        txt_dni_empleado.setForeground(new java.awt.Color(238, 55, 57));
        txt_dni_empleado.setText("obligatorio*");
        txt_dni_empleado.setBorder(null);
        txt_dni_empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_dni_empleadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_dni_empleadoMouseExited(evt);
            }
        });
        txt_dni_empleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_dni_empleadoKeyTyped(evt);
            }
        });
        jPanel259.add(txt_dni_empleado, java.awt.BorderLayout.CENTER);

        jPanel257.add(jPanel259);

        jPanel253.add(jPanel257);

        jPanel234.add(jPanel253);

        jPanel260.setOpaque(false);
        jPanel260.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        jPanel292.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 236, 235), 3));
        jPanel292.setLayout(new java.awt.GridLayout(2, 1));

        jPanel293.setBackground(new java.awt.Color(255, 255, 255));
        jPanel293.setLayout(new java.awt.BorderLayout());

        jLabel85.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel85.setText("Fecha de nacimiento");
        jPanel293.add(jLabel85, java.awt.BorderLayout.WEST);

        jPanel292.add(jPanel293);

        jPanel294.setBackground(new java.awt.Color(255, 255, 255));
        jPanel294.setLayout(new java.awt.BorderLayout());

        spiner_fecha1.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(926369580000L), new java.util.Date(326839980000L), new java.util.Date(1273524780000L), java.util.Calendar.YEAR));
        spiner_fecha1.setBorder(null);
        jPanel294.add(spiner_fecha1, java.awt.BorderLayout.CENTER);

        jPanel292.add(jPanel294);

        jPanel260.add(jPanel292);

        jPanel284.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 236, 235), 3));
        jPanel284.setLayout(new java.awt.GridLayout(2, 1));

        jPanel285.setBackground(new java.awt.Color(255, 255, 255));
        jPanel285.setLayout(new java.awt.BorderLayout());

        jLabel83.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel83.setText("Genero");
        jPanel285.add(jLabel83, java.awt.BorderLayout.WEST);

        jPanel284.add(jPanel285);

        jPanel286.setBackground(new java.awt.Color(255, 255, 255));
        jPanel286.setLayout(new java.awt.BorderLayout());

        jComboBox_genero.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBox_genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        jComboBox_genero.setBorder(null);
        jPanel286.add(jComboBox_genero, java.awt.BorderLayout.CENTER);

        jPanel284.add(jPanel286);

        jPanel260.add(jPanel284);

        jPanel234.add(jPanel260);

        jPanel466.setOpaque(false);
        jPanel466.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        jPanel467.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 236, 235), 3));
        jPanel467.setLayout(new java.awt.GridLayout(2, 1));

        jPanel468.setBackground(new java.awt.Color(255, 255, 255));
        jPanel468.setLayout(new java.awt.BorderLayout());

        jLabel132.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel132.setText("Area");
        jPanel468.add(jLabel132, java.awt.BorderLayout.WEST);

        jPanel467.add(jPanel468);

        jPanel469.setLayout(new java.awt.BorderLayout());

        jComboBox_area.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBox_area.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        jComboBox_area.setBorder(null);
        jPanel469.add(jComboBox_area, java.awt.BorderLayout.CENTER);

        jPanel467.add(jPanel469);

        jPanel466.add(jPanel467);

        jPanel470.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 236, 235), 3));
        jPanel470.setLayout(new java.awt.GridLayout(2, 1));

        jPanel471.setBackground(new java.awt.Color(255, 255, 255));
        jPanel471.setLayout(new java.awt.BorderLayout());

        jLabel133.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel133.setText("Rol");
        jPanel471.add(jLabel133, java.awt.BorderLayout.WEST);

        jPanel470.add(jPanel471);

        jPanel472.setLayout(new java.awt.BorderLayout());

        jComboBox_rol.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBox_rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        jComboBox_rol.setBorder(null);
        jPanel472.add(jComboBox_rol, java.awt.BorderLayout.CENTER);

        jPanel470.add(jPanel472);

        jPanel466.add(jPanel470);

        jPanel356.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 236, 235), 3));
        jPanel356.setLayout(new java.awt.GridLayout(2, 1));

        jPanel357.setBackground(new java.awt.Color(255, 255, 255));
        jPanel357.setLayout(new java.awt.BorderLayout());

        jLabel84.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel84.setText("Horario");
        jPanel357.add(jLabel84, java.awt.BorderLayout.WEST);

        jPanel356.add(jPanel357);

        jPanel358.setBackground(new java.awt.Color(255, 255, 255));
        jPanel358.setLayout(new java.awt.BorderLayout());

        jComboBox_horario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBox_horario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        jComboBox_horario.setBorder(null);
        jPanel358.add(jComboBox_horario, java.awt.BorderLayout.CENTER);

        jPanel356.add(jPanel358);

        jPanel466.add(jPanel356);

        jPanel234.add(jPanel466);

        jPanel233.add(jPanel234, "card2");

        jPanel189.add(jPanel233);

        jPanel263.setBackground(new java.awt.Color(255, 255, 255));
        jPanel263.setLayout(new java.awt.CardLayout(20, 20));

        jPanel264.setBackground(new java.awt.Color(153, 153, 153));
        jPanel264.setOpaque(false);
        jPanel264.setLayout(new java.awt.GridLayout(5, 1, 0, 10));

        jPanel266.setOpaque(false);
        jPanel266.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        jPanel296.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 236, 235), 3));
        jPanel296.setLayout(new java.awt.GridLayout(2, 1));

        jPanel297.setBackground(new java.awt.Color(255, 255, 255));
        jPanel297.setLayout(new java.awt.BorderLayout());

        jLabel86.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel86.setText("Pais");
        jPanel297.add(jLabel86, java.awt.BorderLayout.WEST);

        jPanel296.add(jPanel297);

        jPanel298.setLayout(new java.awt.BorderLayout());

        jComboBox_pais.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBox_pais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        jComboBox_pais.setBorder(null);
        jComboBox_pais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_paisActionPerformed(evt);
            }
        });
        jPanel298.add(jComboBox_pais, java.awt.BorderLayout.CENTER);

        jPanel296.add(jPanel298);

        jPanel266.add(jPanel296);

        jPanel270.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 236, 235), 3));
        jPanel270.setLayout(new java.awt.GridLayout(2, 1));

        jPanel271.setBackground(new java.awt.Color(255, 255, 255));
        jPanel271.setLayout(new java.awt.BorderLayout());

        jLabel79.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel79.setText("Provincia");
        jPanel271.add(jLabel79, java.awt.BorderLayout.WEST);

        jPanel270.add(jPanel271);

        jPanel272.setLayout(new java.awt.BorderLayout());

        jComboBox_provincia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBox_provincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        jComboBox_provincia.setBorder(null);
        jComboBox_provincia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox_provincia.setEnabled(false);
        jComboBox_provincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_provinciaActionPerformed(evt);
            }
        });
        jPanel272.add(jComboBox_provincia, java.awt.BorderLayout.CENTER);

        jPanel270.add(jPanel272);

        jPanel266.add(jPanel270);

        jPanel267.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 236, 235), 3));
        jPanel267.setLayout(new java.awt.GridLayout(2, 1));

        jPanel268.setBackground(new java.awt.Color(255, 255, 255));
        jPanel268.setLayout(new java.awt.BorderLayout());

        jLabel78.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel78.setText("Distrito");
        jPanel268.add(jLabel78, java.awt.BorderLayout.WEST);

        jPanel267.add(jPanel268);

        jPanel269.setLayout(new java.awt.BorderLayout());

        jComboBox_distrito.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBox_distrito.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        jComboBox_distrito.setBorder(null);
        jComboBox_distrito.setEnabled(false);
        jPanel269.add(jComboBox_distrito, java.awt.BorderLayout.CENTER);

        jPanel267.add(jPanel269);

        jPanel266.add(jPanel267);

        jPanel264.add(jPanel266);

        jPanel295.setOpaque(false);
        jPanel295.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        jPanel174.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 236, 235), 3));
        jPanel174.setOpaque(false);
        jPanel174.setLayout(new java.awt.BorderLayout());

        jPanel280.setLayout(new java.awt.GridLayout(2, 1));

        jPanel281.setBackground(new java.awt.Color(255, 255, 255));
        jPanel281.setLayout(new java.awt.BorderLayout());

        jLabel82.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel82.setText("Direccion");
        jPanel281.add(jLabel82, java.awt.BorderLayout.WEST);

        jPanel280.add(jPanel281);

        jPanel282.setLayout(new java.awt.BorderLayout());

        txt_direccion_empleado.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        txt_direccion_empleado.setForeground(new java.awt.Color(238, 55, 57));
        txt_direccion_empleado.setText("obligatorio*");
        txt_direccion_empleado.setBorder(null);
        txt_direccion_empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_direccion_empleadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_direccion_empleadoMouseExited(evt);
            }
        });
        jPanel282.add(txt_direccion_empleado, java.awt.BorderLayout.CENTER);

        jPanel280.add(jPanel282);

        jPanel174.add(jPanel280, java.awt.BorderLayout.CENTER);

        jPanel295.add(jPanel174);

        jPanel264.add(jPanel295);

        jPanel283.setOpaque(false);
        jPanel283.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        jPanel287.setOpaque(false);
        jPanel287.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        jPanel299.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 236, 235), 3));
        jPanel299.setLayout(new java.awt.GridLayout(2, 1));

        jPanel300.setBackground(new java.awt.Color(255, 255, 255));
        jPanel300.setLayout(new java.awt.BorderLayout());

        jLabel87.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel87.setText("Operadora");
        jPanel300.add(jLabel87, java.awt.BorderLayout.WEST);

        jPanel299.add(jPanel300);

        jPanel301.setLayout(new java.awt.BorderLayout());

        jComboBox_operadora.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBox_operadora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        jComboBox_operadora.setBorder(null);
        jPanel301.add(jComboBox_operadora, java.awt.BorderLayout.CENTER);

        jPanel299.add(jPanel301);

        jPanel287.add(jPanel299);

        jPanel265.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 236, 235), 3));
        jPanel265.setLayout(new java.awt.GridLayout(2, 1));

        jPanel290.setBackground(new java.awt.Color(255, 255, 255));
        jPanel290.setLayout(new java.awt.BorderLayout());

        jLabel77.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel77.setText("Numero");
        jPanel290.add(jLabel77, java.awt.BorderLayout.WEST);

        jPanel265.add(jPanel290);

        jPanel291.setLayout(new java.awt.BorderLayout());

        txt_numero_empleado.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        txt_numero_empleado.setForeground(new java.awt.Color(238, 55, 57));
        txt_numero_empleado.setText("obligatorio*");
        txt_numero_empleado.setBorder(null);
        txt_numero_empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_numero_empleadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_numero_empleadoMouseExited(evt);
            }
        });
        txt_numero_empleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_numero_empleadoKeyTyped(evt);
            }
        });
        jPanel291.add(txt_numero_empleado, java.awt.BorderLayout.CENTER);

        jPanel265.add(jPanel291);

        jPanel287.add(jPanel265);

        jPanel283.add(jPanel287);

        jPanel264.add(jPanel283);

        jPanel302.setOpaque(false);
        jPanel302.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        jPanel303.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 236, 235), 3));
        jPanel303.setLayout(new java.awt.GridLayout(2, 1));

        jPanel304.setBackground(new java.awt.Color(255, 255, 255));
        jPanel304.setLayout(new java.awt.BorderLayout());

        jLabel88.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel88.setText("Sueldo");
        jPanel304.add(jLabel88, java.awt.BorderLayout.WEST);

        jPanel303.add(jPanel304);

        jPanel305.setLayout(new java.awt.BorderLayout());

        txt_sueldo_empleado.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        txt_sueldo_empleado.setForeground(new java.awt.Color(238, 55, 57));
        txt_sueldo_empleado.setText("obligatorio*");
        txt_sueldo_empleado.setBorder(null);
        txt_sueldo_empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_sueldo_empleadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_sueldo_empleadoMouseExited(evt);
            }
        });
        jPanel305.add(txt_sueldo_empleado, java.awt.BorderLayout.CENTER);

        jPanel303.add(jPanel305);

        jPanel302.add(jPanel303);

        jPanel306.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 236, 235), 3));
        jPanel306.setLayout(new java.awt.BorderLayout());

        jPanel307.setBackground(new java.awt.Color(255, 255, 255));
        jPanel307.setLayout(new java.awt.BorderLayout());
        jPanel306.add(jPanel307, java.awt.BorderLayout.NORTH);

        jPanel308.setLayout(new java.awt.BorderLayout());

        registrar_foto_empleado.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        registrar_foto_empleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/subir.png"))); // NOI18N
        registrar_foto_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar_foto_empleadoActionPerformed(evt);
            }
        });
        jPanel308.add(registrar_foto_empleado, java.awt.BorderLayout.CENTER);

        jPanel306.add(jPanel308, java.awt.BorderLayout.EAST);

        lb_imagen_cargada.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        lb_imagen_cargada.setText("sin imagen");
        jPanel306.add(lb_imagen_cargada, java.awt.BorderLayout.CENTER);

        jPanel302.add(jPanel306);

        jPanel264.add(jPanel302);

        jPanel175.setOpaque(false);
        jPanel175.setLayout(new java.awt.GridLayout(1, 3, 10, 0));

        jPanel309.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 236, 235), 3));
        jPanel309.setLayout(new java.awt.GridLayout(2, 1));

        jPanel310.setBackground(new java.awt.Color(255, 255, 255));
        jPanel310.setLayout(new java.awt.BorderLayout());

        jLabel101.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel101.setText("Inicio Contrato");
        jPanel310.add(jLabel101, java.awt.BorderLayout.WEST);

        jPanel309.add(jPanel310);

        jPanel311.setBackground(new java.awt.Color(255, 255, 255));
        jPanel311.setLayout(new java.awt.BorderLayout());

        spiner_fecha_inicio.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.YEAR));
        spiner_fecha_inicio.setBorder(null);
        jPanel311.add(spiner_fecha_inicio, java.awt.BorderLayout.CENTER);

        jPanel309.add(jPanel311);

        jPanel175.add(jPanel309);

        jPanel353.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 236, 235), 3));
        jPanel353.setLayout(new java.awt.GridLayout(2, 1));

        jPanel354.setBackground(new java.awt.Color(255, 255, 255));
        jPanel354.setLayout(new java.awt.BorderLayout());

        jLabel102.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel102.setText("Finalizacion");
        jPanel354.add(jLabel102, java.awt.BorderLayout.WEST);

        jPanel353.add(jPanel354);

        jPanel355.setBackground(new java.awt.Color(255, 255, 255));
        jPanel355.setLayout(new java.awt.BorderLayout());

        spiner_fecha_fin.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.YEAR));
        spiner_fecha_fin.setBorder(null);
        jPanel355.add(spiner_fecha_fin, java.awt.BorderLayout.CENTER);

        jPanel353.add(jPanel355);

        jPanel175.add(jPanel353);

        jPanel182.setLayout(new java.awt.BorderLayout());

        bt_registrar_empleado.setBackground(new java.awt.Color(200, 156, 50));
        bt_registrar_empleado.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        bt_registrar_empleado.setForeground(new java.awt.Color(255, 255, 255));
        bt_registrar_empleado.setText("Registrar");
        bt_registrar_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_registrar_empleadoActionPerformed(evt);
            }
        });
        jPanel182.add(bt_registrar_empleado, java.awt.BorderLayout.CENTER);

        jPanel175.add(jPanel182);

        jPanel264.add(jPanel175);

        jPanel263.add(jPanel264, "card2");

        jPanel189.add(jPanel263);

        jPanel180.add(jPanel189, java.awt.BorderLayout.CENTER);

        cartas_objetos3.add(jPanel180, java.awt.BorderLayout.CENTER);

        cartas_objetos2.add(cartas_objetos3, java.awt.BorderLayout.CENTER);

        carta_crear_empleado.add(cartas_objetos2, java.awt.BorderLayout.CENTER);

        jPanel199.add(carta_crear_empleado, "crear_empleado");

        carta_actualizar_empleado.setBackground(new java.awt.Color(226, 236, 235));
        carta_actualizar_empleado.setBgBorder(new java.awt.Color(255, 255, 255));
        carta_actualizar_empleado.setBorderBottom(false);
        carta_actualizar_empleado.setBorderLeft(false);
        carta_actualizar_empleado.setBorderRight(false);
        carta_actualizar_empleado.setBorderTop(false);
        carta_actualizar_empleado.setRound(50);
        carta_actualizar_empleado.setLayout(new java.awt.BorderLayout(20, 20));

        cartas_objetos4.setBackground(new java.awt.Color(255, 255, 255));
        cartas_objetos4.setBgBorder(new java.awt.Color(255, 255, 255));
        cartas_objetos4.setBorderBottom(false);
        cartas_objetos4.setBorderLeft(false);
        cartas_objetos4.setBorderRight(false);
        cartas_objetos4.setBorderTop(false);
        cartas_objetos4.setRound(50);

        jLabel24.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/browser.png"))); // NOI18N
        jLabel24.setText("ACTUALIZAR EMPLEADO");
        cartas_objetos4.add(jLabel24);

        carta_actualizar_empleado.add(cartas_objetos4, java.awt.BorderLayout.NORTH);

        cartas_objetos5.setBackground(new java.awt.Color(255, 255, 255));
        cartas_objetos5.setBgBorder(new java.awt.Color(255, 255, 255));
        cartas_objetos5.setBorderBottom(false);
        cartas_objetos5.setBorderLeft(false);
        cartas_objetos5.setBorderRight(false);
        cartas_objetos5.setBorderTop(false);
        cartas_objetos5.setRound(50);
        cartas_objetos5.setLayout(new java.awt.BorderLayout());

        cartas_objetos6.setBackground(new java.awt.Color(255, 255, 255));
        cartas_objetos6.setBgBorder(new java.awt.Color(255, 255, 255));
        cartas_objetos6.setBorderBottom(false);
        cartas_objetos6.setBorderLeft(false);
        cartas_objetos6.setBorderRight(false);
        cartas_objetos6.setBorderTop(false);
        cartas_objetos6.setRound(50);
        cartas_objetos6.setLayout(new java.awt.BorderLayout());

        jPanel185.setOpaque(false);
        jPanel185.setLayout(new java.awt.BorderLayout(20, 20));

        jPanel190.setBackground(new java.awt.Color(51, 51, 51));
        jPanel190.setOpaque(false);
        jPanel190.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

        jPanel235.setBackground(new java.awt.Color(255, 255, 255));
        jPanel235.setLayout(new java.awt.CardLayout(20, 20));

        jPanel236.setBackground(new java.awt.Color(153, 153, 153));
        jPanel236.setOpaque(false);
        jPanel236.setLayout(new java.awt.GridLayout(5, 1, 0, 10));

        jPanel289.setOpaque(false);
        jPanel289.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        jPanel312.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 111, 73), 3));
        jPanel312.setLayout(new java.awt.GridLayout(2, 1));

        jPanel313.setBackground(new java.awt.Color(255, 255, 255));
        jPanel313.setLayout(new java.awt.BorderLayout());

        jLabel90.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel90.setText("Numero de Documento");
        jPanel313.add(jLabel90, java.awt.BorderLayout.WEST);

        jPanel312.add(jPanel313);

        jPanel314.setLayout(new java.awt.BorderLayout());

        jTextField26.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jTextField26.setForeground(new java.awt.Color(238, 55, 57));
        jTextField26.setText("obligatorio*");
        jTextField26.setBorder(null);
        jTextField26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField26MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField26MouseExited(evt);
            }
        });
        jPanel314.add(jTextField26, java.awt.BorderLayout.CENTER);

        jPanel312.add(jPanel314);

        jPanel289.add(jPanel312);

        jPanel192.setOpaque(false);
        jPanel192.setLayout(new java.awt.GridLayout(2, 1));

        jPanel193.setBackground(new java.awt.Color(255, 255, 255));
        jPanel193.setOpaque(false);

        javax.swing.GroupLayout jPanel193Layout = new javax.swing.GroupLayout(jPanel193);
        jPanel193.setLayout(jPanel193Layout);
        jPanel193Layout.setHorizontalGroup(
            jPanel193Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 224, Short.MAX_VALUE)
        );
        jPanel193Layout.setVerticalGroup(
            jPanel193Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        jPanel192.add(jPanel193);

        jButton6.setBackground(new java.awt.Color(200, 156, 50));
        jButton6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        jButton6.setText("BUSCAR");
        jPanel192.add(jButton6);

        jPanel289.add(jPanel192);

        jPanel236.add(jPanel289);

        jPanel261.setOpaque(false);
        jPanel261.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        jPanel262.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(69, 111, 73), 3, true));
        jPanel262.setLayout(new java.awt.GridLayout(2, 1));

        jPanel273.setBackground(new java.awt.Color(255, 255, 255));
        jPanel273.setLayout(new java.awt.BorderLayout());

        jLabel76.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel76.setText("Nombres");
        jPanel273.add(jLabel76, java.awt.BorderLayout.WEST);

        jPanel262.add(jPanel273);

        jPanel274.setLayout(new java.awt.BorderLayout());

        jTextField23.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jTextField23.setForeground(new java.awt.Color(238, 55, 57));
        jTextField23.setText("obligatorio*");
        jTextField23.setBorder(null);
        jTextField23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField23MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField23MouseExited(evt);
            }
        });
        jPanel274.add(jTextField23, java.awt.BorderLayout.CENTER);

        jPanel262.add(jPanel274);

        jPanel261.add(jPanel262);

        jPanel275.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 111, 73), 3));
        jPanel275.setLayout(new java.awt.GridLayout(2, 1));

        jPanel276.setBackground(new java.awt.Color(255, 255, 255));
        jPanel276.setLayout(new java.awt.BorderLayout());

        jLabel80.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel80.setText("Apellidos");
        jPanel276.add(jLabel80, java.awt.BorderLayout.WEST);

        jPanel275.add(jPanel276);

        jPanel277.setLayout(new java.awt.BorderLayout());

        jTextField24.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jTextField24.setForeground(new java.awt.Color(238, 55, 57));
        jTextField24.setText("obligatorio*");
        jTextField24.setBorder(null);
        jTextField24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField24MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField24MouseExited(evt);
            }
        });
        jPanel277.add(jTextField24, java.awt.BorderLayout.CENTER);

        jPanel275.add(jPanel277);

        jPanel261.add(jPanel275);

        jPanel236.add(jPanel261);

        jPanel278.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 111, 73), 3));
        jPanel278.setLayout(new java.awt.GridLayout(2, 1));

        jPanel279.setBackground(new java.awt.Color(255, 255, 255));
        jPanel279.setLayout(new java.awt.BorderLayout());

        jLabel81.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel81.setText("Correo Electronico");
        jPanel279.add(jLabel81, java.awt.BorderLayout.WEST);

        jPanel278.add(jPanel279);

        jPanel288.setLayout(new java.awt.BorderLayout());

        jTextField25.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jTextField25.setForeground(new java.awt.Color(238, 55, 57));
        jTextField25.setText("obligatorio*");
        jTextField25.setBorder(null);
        jTextField25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField25MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField25MouseExited(evt);
            }
        });
        jPanel288.add(jTextField25, java.awt.BorderLayout.CENTER);

        jPanel278.add(jPanel288);

        jPanel236.add(jPanel278);

        jPanel315.setOpaque(false);
        jPanel315.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        jPanel316.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 111, 73), 3));
        jPanel316.setLayout(new java.awt.GridLayout(2, 1));

        jPanel317.setBackground(new java.awt.Color(255, 255, 255));
        jPanel317.setLayout(new java.awt.BorderLayout());

        jLabel91.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel91.setText("Fecha de nacimiento");
        jPanel317.add(jLabel91, java.awt.BorderLayout.WEST);

        jPanel316.add(jPanel317);

        jPanel318.setBackground(new java.awt.Color(255, 255, 255));
        jPanel318.setLayout(new java.awt.BorderLayout());

        spiner_fecha2.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.YEAR));
        jPanel318.add(spiner_fecha2, java.awt.BorderLayout.CENTER);

        jPanel316.add(jPanel318);

        jPanel315.add(jPanel316);

        jPanel319.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 111, 73), 3));
        jPanel319.setLayout(new java.awt.GridLayout(2, 1));

        jPanel320.setBackground(new java.awt.Color(255, 255, 255));
        jPanel320.setLayout(new java.awt.BorderLayout());

        jLabel92.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel92.setText("Genero");
        jPanel320.add(jLabel92, java.awt.BorderLayout.WEST);

        jPanel319.add(jPanel320);

        jPanel321.setBackground(new java.awt.Color(255, 255, 255));
        jPanel321.setLayout(new java.awt.BorderLayout());

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        jComboBox10.setBorder(null);
        jPanel321.add(jComboBox10, java.awt.BorderLayout.CENTER);

        jPanel319.add(jPanel321);

        jPanel315.add(jPanel319);

        jPanel236.add(jPanel315);

        jPanel473.setOpaque(false);
        jPanel473.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        jPanel474.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 111, 73), 3));
        jPanel474.setLayout(new java.awt.GridLayout(2, 1));

        jPanel475.setBackground(new java.awt.Color(255, 255, 255));
        jPanel475.setLayout(new java.awt.BorderLayout());

        jLabel134.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel134.setText("Area");
        jPanel475.add(jLabel134, java.awt.BorderLayout.WEST);

        jPanel474.add(jPanel475);

        jPanel476.setLayout(new java.awt.BorderLayout());

        jComboBox24.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        jComboBox24.setBorder(null);
        jPanel476.add(jComboBox24, java.awt.BorderLayout.CENTER);

        jPanel474.add(jPanel476);

        jPanel473.add(jPanel474);

        jPanel477.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 111, 73), 3));
        jPanel477.setLayout(new java.awt.GridLayout(2, 1));

        jPanel478.setBackground(new java.awt.Color(255, 255, 255));
        jPanel478.setLayout(new java.awt.BorderLayout());

        jLabel135.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel135.setText("Rol");
        jPanel478.add(jLabel135, java.awt.BorderLayout.WEST);

        jPanel477.add(jPanel478);

        jPanel479.setLayout(new java.awt.BorderLayout());

        jComboBox25.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        jComboBox25.setBorder(null);
        jPanel479.add(jComboBox25, java.awt.BorderLayout.CENTER);

        jPanel477.add(jPanel479);

        jPanel473.add(jPanel477);

        jPanel236.add(jPanel473);

        jPanel235.add(jPanel236, "card2");

        jPanel190.add(jPanel235);

        jPanel322.setBackground(new java.awt.Color(255, 255, 255));
        jPanel322.setLayout(new java.awt.CardLayout(20, 20));

        jPanel323.setBackground(new java.awt.Color(153, 153, 153));
        jPanel323.setOpaque(false);
        jPanel323.setLayout(new java.awt.GridLayout(5, 1, 0, 10));

        jPanel324.setOpaque(false);
        jPanel324.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        jPanel325.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 111, 73), 3));
        jPanel325.setLayout(new java.awt.GridLayout(2, 1));

        jPanel326.setBackground(new java.awt.Color(255, 255, 255));
        jPanel326.setLayout(new java.awt.BorderLayout());

        jLabel93.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel93.setText("Distrito");
        jPanel326.add(jLabel93, java.awt.BorderLayout.WEST);

        jPanel325.add(jPanel326);

        jPanel327.setLayout(new java.awt.BorderLayout());

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        jComboBox11.setBorder(null);
        jPanel327.add(jComboBox11, java.awt.BorderLayout.CENTER);

        jPanel325.add(jPanel327);

        jPanel324.add(jPanel325);

        jPanel328.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 111, 73), 3));
        jPanel328.setLayout(new java.awt.GridLayout(2, 1));

        jPanel329.setBackground(new java.awt.Color(255, 255, 255));
        jPanel329.setLayout(new java.awt.BorderLayout());

        jLabel94.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel94.setText("Provincia");
        jPanel329.add(jLabel94, java.awt.BorderLayout.WEST);

        jPanel328.add(jPanel329);

        jPanel330.setLayout(new java.awt.BorderLayout());

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        jComboBox12.setBorder(null);
        jPanel330.add(jComboBox12, java.awt.BorderLayout.CENTER);

        jPanel328.add(jPanel330);

        jPanel324.add(jPanel328);

        jPanel323.add(jPanel324);

        jPanel331.setOpaque(false);
        jPanel331.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        jPanel332.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 111, 73), 3));
        jPanel332.setLayout(new java.awt.GridLayout(2, 1));

        jPanel333.setBackground(new java.awt.Color(255, 255, 255));
        jPanel333.setLayout(new java.awt.BorderLayout());

        jLabel95.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel95.setText("Pais");
        jPanel333.add(jLabel95, java.awt.BorderLayout.WEST);

        jPanel332.add(jPanel333);

        jPanel334.setLayout(new java.awt.BorderLayout());

        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        jComboBox13.setBorder(null);
        jPanel334.add(jComboBox13, java.awt.BorderLayout.CENTER);

        jPanel332.add(jPanel334);

        jPanel331.add(jPanel332);

        jPanel186.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 111, 73), 3));
        jPanel186.setOpaque(false);
        jPanel186.setLayout(new java.awt.BorderLayout());

        jPanel335.setLayout(new java.awt.GridLayout(2, 1));

        jPanel336.setBackground(new java.awt.Color(255, 255, 255));
        jPanel336.setLayout(new java.awt.BorderLayout());

        jLabel96.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel96.setText("Direccion");
        jPanel336.add(jLabel96, java.awt.BorderLayout.WEST);

        jPanel335.add(jPanel336);

        jPanel337.setLayout(new java.awt.BorderLayout());

        jTextField28.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jTextField28.setForeground(new java.awt.Color(238, 55, 57));
        jTextField28.setText("obligatorio*");
        jTextField28.setBorder(null);
        jTextField28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField28MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField28MouseExited(evt);
            }
        });
        jPanel337.add(jTextField28, java.awt.BorderLayout.CENTER);

        jPanel335.add(jPanel337);

        jPanel186.add(jPanel335, java.awt.BorderLayout.CENTER);

        jPanel331.add(jPanel186);

        jPanel323.add(jPanel331);

        jPanel338.setOpaque(false);
        jPanel338.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        jPanel339.setOpaque(false);
        jPanel339.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        jPanel340.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 111, 73), 3));
        jPanel340.setLayout(new java.awt.GridLayout(2, 1));

        jPanel341.setBackground(new java.awt.Color(255, 255, 255));
        jPanel341.setLayout(new java.awt.BorderLayout());

        jLabel97.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel97.setText("Operadora");
        jPanel341.add(jLabel97, java.awt.BorderLayout.WEST);

        jPanel340.add(jPanel341);

        jPanel342.setLayout(new java.awt.BorderLayout());

        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        jComboBox14.setBorder(null);
        jPanel342.add(jComboBox14, java.awt.BorderLayout.CENTER);

        jPanel340.add(jPanel342);

        jPanel339.add(jPanel340);

        jPanel343.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 111, 73), 3));
        jPanel343.setLayout(new java.awt.GridLayout(2, 1));

        jPanel344.setBackground(new java.awt.Color(255, 255, 255));
        jPanel344.setLayout(new java.awt.BorderLayout());

        jLabel98.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel98.setText("Numero");
        jPanel344.add(jLabel98, java.awt.BorderLayout.WEST);

        jPanel343.add(jPanel344);

        jPanel345.setLayout(new java.awt.BorderLayout());

        jTextField30.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jTextField30.setForeground(new java.awt.Color(238, 55, 57));
        jTextField30.setText("obligatorio*");
        jTextField30.setBorder(null);
        jTextField30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField30MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField30MouseExited(evt);
            }
        });
        jPanel345.add(jTextField30, java.awt.BorderLayout.CENTER);

        jPanel343.add(jPanel345);

        jPanel339.add(jPanel343);

        jPanel338.add(jPanel339);

        jPanel323.add(jPanel338);

        jPanel346.setOpaque(false);
        jPanel346.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        jPanel347.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 111, 73), 3));
        jPanel347.setLayout(new java.awt.GridLayout(2, 1));

        jPanel348.setBackground(new java.awt.Color(255, 255, 255));
        jPanel348.setLayout(new java.awt.BorderLayout());

        jLabel99.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel99.setText("Sueldo");
        jPanel348.add(jLabel99, java.awt.BorderLayout.WEST);

        jPanel347.add(jPanel348);

        jPanel349.setLayout(new java.awt.BorderLayout());

        jTextField31.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jTextField31.setForeground(new java.awt.Color(238, 55, 57));
        jTextField31.setText("obligatorio*");
        jTextField31.setBorder(null);
        jTextField31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField31MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField31MouseExited(evt);
            }
        });
        jPanel349.add(jTextField31, java.awt.BorderLayout.CENTER);

        jPanel347.add(jPanel349);

        jPanel346.add(jPanel347);

        jPanel350.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 111, 73), 3));
        jPanel350.setLayout(new java.awt.GridLayout(2, 1));

        jPanel351.setBackground(new java.awt.Color(255, 255, 255));
        jPanel351.setLayout(new java.awt.BorderLayout());

        jLabel100.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel100.setText("user.png");
        jPanel351.add(jLabel100, java.awt.BorderLayout.WEST);

        jPanel350.add(jPanel351);

        jPanel352.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/subir.png"))); // NOI18N
        jButton3.setText("seleccionar");
        jPanel352.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel350.add(jPanel352);

        jPanel346.add(jPanel350);

        jPanel323.add(jPanel346);

        jPanel187.setOpaque(false);
        jPanel187.setLayout(new java.awt.GridLayout(1, 3, 10, 0));

        jPanel188.setOpaque(false);

        javax.swing.GroupLayout jPanel188Layout = new javax.swing.GroupLayout(jPanel188);
        jPanel188.setLayout(jPanel188Layout);
        jPanel188Layout.setHorizontalGroup(
            jPanel188Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 224, Short.MAX_VALUE)
        );
        jPanel188Layout.setVerticalGroup(
            jPanel188Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );

        jPanel187.add(jPanel188);

        jPanel191.setLayout(new java.awt.BorderLayout());

        jButton4.setBackground(new java.awt.Color(200, 156, 50));
        jButton4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("ACTUALIZAR");
        jPanel191.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel187.add(jPanel191);

        jPanel323.add(jPanel187);

        jPanel322.add(jPanel323, "card2");

        jPanel190.add(jPanel322);

        jPanel185.add(jPanel190, java.awt.BorderLayout.CENTER);

        cartas_objetos6.add(jPanel185, java.awt.BorderLayout.CENTER);

        cartas_objetos5.add(cartas_objetos6, java.awt.BorderLayout.CENTER);

        carta_actualizar_empleado.add(cartas_objetos5, java.awt.BorderLayout.CENTER);

        jPanel199.add(carta_actualizar_empleado, "actualizar_empleado");

        carta_leer_empleado.setBackground(new java.awt.Color(226, 236, 235));
        carta_leer_empleado.setBgBorder(new java.awt.Color(255, 255, 255));
        carta_leer_empleado.setBorderBottom(false);
        carta_leer_empleado.setBorderLeft(false);
        carta_leer_empleado.setBorderRight(false);
        carta_leer_empleado.setBorderTop(false);
        carta_leer_empleado.setRound(50);
        carta_leer_empleado.setLayout(new java.awt.BorderLayout(20, 20));

        cartas_objetos7.setBackground(new java.awt.Color(255, 255, 255));
        cartas_objetos7.setBgBorder(new java.awt.Color(255, 255, 255));
        cartas_objetos7.setBorderBottom(false);
        cartas_objetos7.setBorderLeft(false);
        cartas_objetos7.setBorderRight(false);
        cartas_objetos7.setBorderTop(false);
        cartas_objetos7.setRound(50);

        jLabel25.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/open-book.png"))); // NOI18N
        jLabel25.setText("BUSCAR EMPLEADO");
        cartas_objetos7.add(jLabel25);

        carta_leer_empleado.add(cartas_objetos7, java.awt.BorderLayout.NORTH);

        cartas_objetos8.setBackground(new java.awt.Color(255, 255, 255));
        cartas_objetos8.setBgBorder(new java.awt.Color(255, 255, 255));
        cartas_objetos8.setBorderBottom(false);
        cartas_objetos8.setBorderLeft(false);
        cartas_objetos8.setBorderRight(false);
        cartas_objetos8.setBorderTop(false);
        cartas_objetos8.setRound(50);
        cartas_objetos8.setLayout(new java.awt.BorderLayout());

        cartas_objetos9.setBackground(new java.awt.Color(255, 255, 255));
        cartas_objetos9.setBgBorder(new java.awt.Color(255, 255, 255));
        cartas_objetos9.setBorderBottom(false);
        cartas_objetos9.setBorderLeft(false);
        cartas_objetos9.setBorderRight(false);
        cartas_objetos9.setBorderTop(false);
        cartas_objetos9.setRound(50);
        cartas_objetos9.setLayout(new java.awt.BorderLayout());

        jPanel194.setOpaque(false);
        jPanel194.setLayout(new java.awt.BorderLayout(20, 20));

        cartas_objetos13.setBackground(new java.awt.Color(255, 255, 255));
        cartas_objetos13.setBgBorder(new java.awt.Color(255, 255, 255));
        cartas_objetos13.setBorderBottom(false);
        cartas_objetos13.setBorderLeft(false);
        cartas_objetos13.setBorderRight(false);
        cartas_objetos13.setBorderTop(false);
        cartas_objetos13.setRound(50);
        cartas_objetos13.setLayout(new java.awt.BorderLayout());

        jPanel211.setOpaque(false);
        jPanel211.setLayout(new java.awt.BorderLayout(20, 20));

        jPanel212.setBackground(new java.awt.Color(51, 51, 51));
        jPanel212.setOpaque(false);
        jPanel212.setLayout(new java.awt.BorderLayout());

        jPanel214.setOpaque(false);

        bt_limpiar_tabla.setBackground(new java.awt.Color(238, 55, 57));
        bt_limpiar_tabla.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        bt_limpiar_tabla.setForeground(new java.awt.Color(255, 255, 255));
        bt_limpiar_tabla.setText("Limpiar");
        bt_limpiar_tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_limpiar_tablaActionPerformed(evt);
            }
        });
        jPanel214.add(bt_limpiar_tabla);

        jButton8.setBackground(new java.awt.Color(128, 175, 94));
        jButton8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Listar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel214.add(jButton8);

        jPanel212.add(jPanel214, java.awt.BorderLayout.PAGE_END);

        jPanel215.setOpaque(false);
        jPanel215.setLayout(new java.awt.CardLayout(20, 20));

        jPanel216.setOpaque(false);
        jPanel216.setLayout(new java.awt.BorderLayout());

        jPanel224.setOpaque(false);
        jPanel224.setLayout(new java.awt.BorderLayout());

        jPanel195.setOpaque(false);
        jPanel195.setLayout(new java.awt.BorderLayout());

        jPanel223.setOpaque(false);
        jPanel223.setLayout(new java.awt.GridLayout(1, 3));

        jLabel137.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel137.setText("Numero de Documento: ");
        jPanel223.add(jLabel137);

        jPanel202.setLayout(new java.awt.BorderLayout());

        jButton12.setBackground(new java.awt.Color(128, 175, 94));
        jButton12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        jPanel202.add(jButton12, java.awt.BorderLayout.LINE_END);

        jTextField55.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jTextField55.setForeground(new java.awt.Color(238, 55, 57));
        jTextField55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField55MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField55MouseExited(evt);
            }
        });
        jPanel202.add(jTextField55, java.awt.BorderLayout.CENTER);

        jPanel223.add(jPanel202);

        jPanel195.add(jPanel223, java.awt.BorderLayout.CENTER);
        jPanel195.add(filler53, java.awt.BorderLayout.WEST);

        jPanel224.add(jPanel195, java.awt.BorderLayout.WEST);

        jPanel216.add(jPanel224, java.awt.BorderLayout.PAGE_START);

        jTable1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "NOMBRE", "APELLIDO", "EDAD", "GENERO", "CORREO", "ROL", "ESTADO", "SUELDO", "TELEFONO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel216.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel215.add(jPanel216, "card2");

        jPanel212.add(jPanel215, java.awt.BorderLayout.CENTER);

        jPanel211.add(jPanel212, java.awt.BorderLayout.CENTER);

        cartas_objetos13.add(jPanel211, java.awt.BorderLayout.CENTER);

        jPanel194.add(cartas_objetos13, java.awt.BorderLayout.CENTER);

        cartas_objetos9.add(jPanel194, java.awt.BorderLayout.CENTER);

        cartas_objetos8.add(cartas_objetos9, java.awt.BorderLayout.CENTER);

        carta_leer_empleado.add(cartas_objetos8, java.awt.BorderLayout.CENTER);

        jPanel199.add(carta_leer_empleado, "leer_empleado");

        carta_eliminar_empleado.setBackground(new java.awt.Color(226, 236, 235));
        carta_eliminar_empleado.setBgBorder(new java.awt.Color(255, 255, 255));
        carta_eliminar_empleado.setBorderBottom(false);
        carta_eliminar_empleado.setBorderLeft(false);
        carta_eliminar_empleado.setBorderRight(false);
        carta_eliminar_empleado.setBorderTop(false);
        carta_eliminar_empleado.setRound(50);
        carta_eliminar_empleado.setLayout(new java.awt.BorderLayout(20, 20));

        cartas_objetos10.setBackground(new java.awt.Color(255, 255, 255));
        cartas_objetos10.setBgBorder(new java.awt.Color(255, 255, 255));
        cartas_objetos10.setBorderBottom(false);
        cartas_objetos10.setBorderLeft(false);
        cartas_objetos10.setBorderRight(false);
        cartas_objetos10.setBorderTop(false);
        cartas_objetos10.setRound(50);

        jLabel26.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        jLabel26.setText("ELIMINAR EMPLEADO");
        cartas_objetos10.add(jLabel26);

        carta_eliminar_empleado.add(cartas_objetos10, java.awt.BorderLayout.NORTH);

        cartas_objetos11.setBackground(new java.awt.Color(255, 255, 255));
        cartas_objetos11.setBgBorder(new java.awt.Color(255, 255, 255));
        cartas_objetos11.setBorderBottom(false);
        cartas_objetos11.setBorderLeft(false);
        cartas_objetos11.setBorderRight(false);
        cartas_objetos11.setBorderTop(false);
        cartas_objetos11.setRound(50);
        cartas_objetos11.setLayout(new java.awt.BorderLayout());

        cartas_objetos12.setBackground(new java.awt.Color(255, 255, 255));
        cartas_objetos12.setBgBorder(new java.awt.Color(255, 255, 255));
        cartas_objetos12.setBorderBottom(false);
        cartas_objetos12.setBorderLeft(false);
        cartas_objetos12.setBorderRight(false);
        cartas_objetos12.setBorderTop(false);
        cartas_objetos12.setRound(50);
        cartas_objetos12.setLayout(new java.awt.BorderLayout());

        jPanel203.setOpaque(false);
        jPanel203.setLayout(new java.awt.BorderLayout(20, 20));

        jPanel204.setBackground(new java.awt.Color(51, 51, 51));
        jPanel204.setOpaque(false);
        jPanel204.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

        jPanel239.setBackground(new java.awt.Color(255, 255, 255));
        jPanel239.setLayout(new java.awt.CardLayout(20, 20));

        jPanel240.setBackground(new java.awt.Color(153, 153, 153));
        jPanel240.setOpaque(false);
        jPanel240.setLayout(new java.awt.GridLayout(5, 1, 0, 10));

        jPanel402.setOpaque(false);
        jPanel402.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        jPanel403.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 111, 73), 3));
        jPanel403.setLayout(new java.awt.GridLayout(2, 1));

        jPanel404.setBackground(new java.awt.Color(255, 255, 255));
        jPanel404.setLayout(new java.awt.BorderLayout());

        jLabel114.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel114.setText("Numero de Documento");
        jPanel404.add(jLabel114, java.awt.BorderLayout.WEST);

        jPanel403.add(jPanel404);

        jPanel405.setLayout(new java.awt.BorderLayout());

        jTextField39.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jTextField39.setForeground(new java.awt.Color(238, 55, 57));
        jTextField39.setText("obligatorio*");
        jTextField39.setBorder(null);
        jTextField39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField39MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField39MouseExited(evt);
            }
        });
        jPanel405.add(jTextField39, java.awt.BorderLayout.CENTER);

        jPanel403.add(jPanel405);

        jPanel402.add(jPanel403);

        jPanel205.setOpaque(false);
        jPanel205.setLayout(new java.awt.GridLayout(2, 1));

        jPanel206.setBackground(new java.awt.Color(255, 255, 255));
        jPanel206.setOpaque(false);

        javax.swing.GroupLayout jPanel206Layout = new javax.swing.GroupLayout(jPanel206);
        jPanel206.setLayout(jPanel206Layout);
        jPanel206Layout.setHorizontalGroup(
            jPanel206Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 224, Short.MAX_VALUE)
        );
        jPanel206Layout.setVerticalGroup(
            jPanel206Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        jPanel205.add(jPanel206);

        jButton9.setBackground(new java.awt.Color(200, 156, 50));
        jButton9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        jButton9.setText("BUSCAR");
        jPanel205.add(jButton9);

        jPanel402.add(jPanel205);

        jPanel240.add(jPanel402);

        jPanel406.setOpaque(false);
        jPanel406.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        jPanel407.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(69, 111, 73), 3, true));
        jPanel407.setLayout(new java.awt.GridLayout(2, 1));

        jPanel408.setBackground(new java.awt.Color(255, 255, 255));
        jPanel408.setLayout(new java.awt.BorderLayout());

        jLabel115.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel115.setText("Nombres");
        jPanel408.add(jLabel115, java.awt.BorderLayout.WEST);

        jPanel407.add(jPanel408);

        jPanel409.setLayout(new java.awt.BorderLayout());

        jTextField40.setEditable(false);
        jTextField40.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jTextField40.setBorder(null);
        jTextField40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField40MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField40MouseExited(evt);
            }
        });
        jPanel409.add(jTextField40, java.awt.BorderLayout.CENTER);

        jPanel407.add(jPanel409);

        jPanel406.add(jPanel407);

        jPanel410.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 111, 73), 3));
        jPanel410.setLayout(new java.awt.GridLayout(2, 1));

        jPanel411.setBackground(new java.awt.Color(255, 255, 255));
        jPanel411.setLayout(new java.awt.BorderLayout());

        jLabel116.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel116.setText("Apellidos");
        jPanel411.add(jLabel116, java.awt.BorderLayout.WEST);

        jPanel410.add(jPanel411);

        jPanel412.setLayout(new java.awt.BorderLayout());

        jTextField41.setEditable(false);
        jTextField41.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jTextField41.setBorder(null);
        jTextField41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField41MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField41MouseExited(evt);
            }
        });
        jPanel412.add(jTextField41, java.awt.BorderLayout.CENTER);

        jPanel410.add(jPanel412);

        jPanel406.add(jPanel410);

        jPanel240.add(jPanel406);

        jPanel413.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 111, 73), 3));
        jPanel413.setLayout(new java.awt.GridLayout(2, 1));

        jPanel414.setBackground(new java.awt.Color(255, 255, 255));
        jPanel414.setLayout(new java.awt.BorderLayout());

        jLabel117.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel117.setText("Correo Electronico");
        jPanel414.add(jLabel117, java.awt.BorderLayout.WEST);

        jPanel413.add(jPanel414);

        jPanel415.setLayout(new java.awt.BorderLayout());

        jTextField42.setEditable(false);
        jTextField42.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jTextField42.setBorder(null);
        jTextField42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField42MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField42MouseExited(evt);
            }
        });
        jPanel415.add(jTextField42, java.awt.BorderLayout.CENTER);

        jPanel413.add(jPanel415);

        jPanel240.add(jPanel413);

        jPanel416.setOpaque(false);
        jPanel416.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        jPanel417.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 111, 73), 3));
        jPanel417.setLayout(new java.awt.GridLayout(2, 1));

        jPanel418.setBackground(new java.awt.Color(255, 255, 255));
        jPanel418.setLayout(new java.awt.BorderLayout());

        jLabel118.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel118.setText("Fecha de nacimiento");
        jPanel418.add(jLabel118, java.awt.BorderLayout.WEST);

        jPanel417.add(jPanel418);

        jPanel419.setBackground(new java.awt.Color(255, 255, 255));
        jPanel419.setLayout(new java.awt.BorderLayout());

        jTextField51.setEditable(false);
        jTextField51.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jTextField51.setBorder(null);
        jTextField51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField51MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField51MouseExited(evt);
            }
        });
        jPanel419.add(jTextField51, java.awt.BorderLayout.CENTER);

        jPanel417.add(jPanel419);

        jPanel416.add(jPanel417);

        jPanel420.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 111, 73), 3));
        jPanel420.setLayout(new java.awt.GridLayout(2, 1));

        jPanel421.setBackground(new java.awt.Color(255, 255, 255));
        jPanel421.setLayout(new java.awt.BorderLayout());

        jLabel119.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel119.setText("Genero");
        jPanel421.add(jLabel119, java.awt.BorderLayout.WEST);

        jPanel420.add(jPanel421);

        jPanel422.setBackground(new java.awt.Color(255, 255, 255));
        jPanel422.setLayout(new java.awt.BorderLayout());

        jTextField50.setEditable(false);
        jTextField50.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jTextField50.setBorder(null);
        jTextField50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField50MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField50MouseExited(evt);
            }
        });
        jPanel422.add(jTextField50, java.awt.BorderLayout.CENTER);

        jPanel420.add(jPanel422);

        jPanel416.add(jPanel420);

        jPanel240.add(jPanel416);

        jPanel452.setOpaque(false);
        jPanel452.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        jPanel453.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 111, 73), 3));
        jPanel453.setLayout(new java.awt.GridLayout(2, 1));

        jPanel454.setBackground(new java.awt.Color(255, 255, 255));
        jPanel454.setLayout(new java.awt.BorderLayout());

        jLabel128.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel128.setText("Area");
        jPanel454.add(jLabel128, java.awt.BorderLayout.WEST);

        jPanel453.add(jPanel454);

        jPanel455.setBackground(new java.awt.Color(255, 255, 255));
        jPanel455.setLayout(new java.awt.BorderLayout());

        jTextField52.setEditable(false);
        jTextField52.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jTextField52.setBorder(null);
        jTextField52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField52MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField52MouseExited(evt);
            }
        });
        jPanel455.add(jTextField52, java.awt.BorderLayout.CENTER);

        jPanel453.add(jPanel455);

        jPanel452.add(jPanel453);

        jPanel456.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 111, 73), 3));
        jPanel456.setLayout(new java.awt.GridLayout(2, 1));

        jPanel457.setBackground(new java.awt.Color(255, 255, 255));
        jPanel457.setLayout(new java.awt.BorderLayout());

        jLabel129.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel129.setText("Rol");
        jPanel457.add(jLabel129, java.awt.BorderLayout.WEST);

        jPanel456.add(jPanel457);

        jPanel458.setBackground(new java.awt.Color(255, 255, 255));
        jPanel458.setLayout(new java.awt.BorderLayout());

        jTextField53.setEditable(false);
        jTextField53.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jTextField53.setBorder(null);
        jTextField53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField53MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField53MouseExited(evt);
            }
        });
        jPanel458.add(jTextField53, java.awt.BorderLayout.CENTER);

        jPanel456.add(jPanel458);

        jPanel452.add(jPanel456);

        jPanel240.add(jPanel452);

        jPanel239.add(jPanel240, "card2");

        jPanel204.add(jPanel239);

        jPanel423.setBackground(new java.awt.Color(255, 255, 255));
        jPanel423.setLayout(new java.awt.CardLayout(20, 20));

        jPanel424.setBackground(new java.awt.Color(153, 153, 153));
        jPanel424.setOpaque(false);
        jPanel424.setLayout(new java.awt.GridLayout(5, 1, 0, 10));

        jPanel425.setOpaque(false);
        jPanel425.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        jPanel426.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 111, 73), 3));
        jPanel426.setLayout(new java.awt.GridLayout(2, 1));

        jPanel427.setBackground(new java.awt.Color(255, 255, 255));
        jPanel427.setLayout(new java.awt.BorderLayout());

        jLabel120.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel120.setText("Distrito");
        jPanel427.add(jLabel120, java.awt.BorderLayout.WEST);

        jPanel426.add(jPanel427);

        jPanel428.setLayout(new java.awt.BorderLayout());

        jTextField46.setEditable(false);
        jTextField46.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jTextField46.setBorder(null);
        jTextField46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField46MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField46MouseExited(evt);
            }
        });
        jPanel428.add(jTextField46, java.awt.BorderLayout.CENTER);

        jPanel426.add(jPanel428);

        jPanel425.add(jPanel426);

        jPanel429.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 111, 73), 3));
        jPanel429.setLayout(new java.awt.GridLayout(2, 1));

        jPanel430.setBackground(new java.awt.Color(255, 255, 255));
        jPanel430.setLayout(new java.awt.BorderLayout());

        jLabel121.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel121.setText("Provincia");
        jPanel430.add(jLabel121, java.awt.BorderLayout.WEST);

        jPanel429.add(jPanel430);

        jPanel431.setLayout(new java.awt.BorderLayout());

        jTextField47.setEditable(false);
        jTextField47.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jTextField47.setBorder(null);
        jTextField47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField47MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField47MouseExited(evt);
            }
        });
        jPanel431.add(jTextField47, java.awt.BorderLayout.CENTER);

        jPanel429.add(jPanel431);

        jPanel425.add(jPanel429);

        jPanel424.add(jPanel425);

        jPanel432.setOpaque(false);
        jPanel432.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        jPanel433.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 111, 73), 3));
        jPanel433.setLayout(new java.awt.GridLayout(2, 1));

        jPanel434.setBackground(new java.awt.Color(255, 255, 255));
        jPanel434.setLayout(new java.awt.BorderLayout());

        jLabel122.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel122.setText("Pais");
        jPanel434.add(jLabel122, java.awt.BorderLayout.WEST);

        jPanel433.add(jPanel434);

        jPanel435.setLayout(new java.awt.BorderLayout());

        jTextField48.setEditable(false);
        jTextField48.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jTextField48.setBorder(null);
        jTextField48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField48MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField48MouseExited(evt);
            }
        });
        jPanel435.add(jTextField48, java.awt.BorderLayout.CENTER);

        jPanel433.add(jPanel435);

        jPanel432.add(jPanel433);

        jPanel207.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 111, 73), 3));
        jPanel207.setOpaque(false);
        jPanel207.setLayout(new java.awt.BorderLayout());

        jPanel436.setLayout(new java.awt.GridLayout(2, 1));

        jPanel437.setBackground(new java.awt.Color(255, 255, 255));
        jPanel437.setLayout(new java.awt.BorderLayout());

        jLabel123.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel123.setText("Direccion");
        jPanel437.add(jLabel123, java.awt.BorderLayout.WEST);

        jPanel436.add(jPanel437);

        jPanel438.setLayout(new java.awt.BorderLayout());

        jTextField43.setEditable(false);
        jTextField43.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jTextField43.setBorder(null);
        jTextField43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField43MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField43MouseExited(evt);
            }
        });
        jPanel438.add(jTextField43, java.awt.BorderLayout.CENTER);

        jPanel436.add(jPanel438);

        jPanel207.add(jPanel436, java.awt.BorderLayout.CENTER);

        jPanel432.add(jPanel207);

        jPanel424.add(jPanel432);

        jPanel439.setOpaque(false);
        jPanel439.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        jPanel440.setOpaque(false);
        jPanel440.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        jPanel441.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 111, 73), 3));
        jPanel441.setLayout(new java.awt.GridLayout(2, 1));

        jPanel442.setBackground(new java.awt.Color(255, 255, 255));
        jPanel442.setLayout(new java.awt.BorderLayout());

        jLabel124.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel124.setText("Operadora");
        jPanel442.add(jLabel124, java.awt.BorderLayout.WEST);

        jPanel441.add(jPanel442);

        jPanel443.setLayout(new java.awt.BorderLayout());

        jTextField49.setEditable(false);
        jTextField49.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jTextField49.setBorder(null);
        jTextField49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField49MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField49MouseExited(evt);
            }
        });
        jPanel443.add(jTextField49, java.awt.BorderLayout.CENTER);

        jPanel441.add(jPanel443);

        jPanel440.add(jPanel441);

        jPanel444.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 111, 73), 3));
        jPanel444.setLayout(new java.awt.GridLayout(2, 1));

        jPanel445.setBackground(new java.awt.Color(255, 255, 255));
        jPanel445.setLayout(new java.awt.BorderLayout());

        jLabel125.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel125.setText("Numero");
        jPanel445.add(jLabel125, java.awt.BorderLayout.WEST);

        jPanel444.add(jPanel445);

        jPanel446.setLayout(new java.awt.BorderLayout());

        jTextField44.setEditable(false);
        jTextField44.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jTextField44.setBorder(null);
        jTextField44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField44MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField44MouseExited(evt);
            }
        });
        jPanel446.add(jTextField44, java.awt.BorderLayout.CENTER);

        jPanel444.add(jPanel446);

        jPanel440.add(jPanel444);

        jPanel439.add(jPanel440);

        jPanel424.add(jPanel439);

        jPanel447.setOpaque(false);
        jPanel447.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        jPanel448.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 111, 73), 3));
        jPanel448.setLayout(new java.awt.GridLayout(2, 1));

        jPanel449.setBackground(new java.awt.Color(255, 255, 255));
        jPanel449.setLayout(new java.awt.BorderLayout());

        jLabel126.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel126.setText("Sueldo");
        jPanel449.add(jLabel126, java.awt.BorderLayout.WEST);

        jPanel448.add(jPanel449);

        jPanel450.setLayout(new java.awt.BorderLayout());

        jTextField45.setEditable(false);
        jTextField45.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jTextField45.setBorder(null);
        jTextField45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField45MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField45MouseExited(evt);
            }
        });
        jPanel450.add(jTextField45, java.awt.BorderLayout.CENTER);

        jPanel448.add(jPanel450);

        jPanel447.add(jPanel448);

        jPanel451.setOpaque(false);
        jPanel451.setLayout(new java.awt.BorderLayout());

        jLabel127.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel127.setText("user.png");
        jLabel127.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 111, 73), 3));
        jPanel451.add(jLabel127, java.awt.BorderLayout.CENTER);
        jPanel451.add(filler51, java.awt.BorderLayout.WEST);
        jPanel451.add(filler52, java.awt.BorderLayout.EAST);

        jPanel447.add(jPanel451);

        jPanel424.add(jPanel447);

        jPanel208.setOpaque(false);
        jPanel208.setLayout(new java.awt.GridLayout(1, 3, 10, 0));

        jPanel209.setOpaque(false);

        javax.swing.GroupLayout jPanel209Layout = new javax.swing.GroupLayout(jPanel209);
        jPanel209.setLayout(jPanel209Layout);
        jPanel209Layout.setHorizontalGroup(
            jPanel209Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 224, Short.MAX_VALUE)
        );
        jPanel209Layout.setVerticalGroup(
            jPanel209Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );

        jPanel208.add(jPanel209);

        jPanel210.setLayout(new java.awt.BorderLayout());

        jButton11.setBackground(new java.awt.Color(238, 55, 57));
        jButton11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("ELIMINAR");
        jPanel210.add(jButton11, java.awt.BorderLayout.CENTER);

        jPanel208.add(jPanel210);

        jPanel424.add(jPanel208);

        jPanel423.add(jPanel424, "card2");

        jPanel204.add(jPanel423);

        jPanel203.add(jPanel204, java.awt.BorderLayout.CENTER);

        cartas_objetos12.add(jPanel203, java.awt.BorderLayout.CENTER);

        cartas_objetos11.add(cartas_objetos12, java.awt.BorderLayout.CENTER);

        carta_eliminar_empleado.add(cartas_objetos11, java.awt.BorderLayout.CENTER);

        jPanel199.add(carta_eliminar_empleado, "eliminar_empleado");

        rSPanelBorder4.add(jPanel199, java.awt.BorderLayout.CENTER);

        pl_crud_general.add(rSPanelBorder4, java.awt.BorderLayout.CENTER);

        jPanel11.add(pl_crud_general, "card2");

        jPanel104.setOpaque(false);

        javax.swing.GroupLayout jPanel104Layout = new javax.swing.GroupLayout(jPanel104);
        jPanel104.setLayout(jPanel104Layout);
        jPanel104Layout.setHorizontalGroup(
            jPanel104Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1319, Short.MAX_VALUE)
        );
        jPanel104Layout.setVerticalGroup(
            jPanel104Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 886, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel104, "card3");

        jPanel10.add(jPanel11, java.awt.BorderLayout.CENTER);

        rSPanelBorder2.setBackground(new java.awt.Color(60, 86, 84));
        rSPanelBorder2.setBorderBottom(false);
        rSPanelBorder2.setBorderLeft(false);
        rSPanelBorder2.setBorderRight(false);
        rSPanelBorder2.setBorderTop(false);
        rSPanelBorder2.setMaximumSize(new java.awt.Dimension(191, 9999));
        rSPanelBorder2.setRound(50);
        rSPanelBorder2.setLayout(new java.awt.BorderLayout());

        jPanel105.setOpaque(false);
        jPanel105.setLayout(new java.awt.BorderLayout());

        jPanel12.setOpaque(false);
        jPanel12.add(filler11);

        jPanel105.add(jPanel12, java.awt.BorderLayout.LINE_END);

        jPanel14.setOpaque(false);
        jPanel14.add(filler12);

        jPanel105.add(jPanel14, java.awt.BorderLayout.LINE_START);

        jPanel15.setOpaque(false);

        lb_titulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lb_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lb_titulo.setText("CARGO");
        jPanel15.add(lb_titulo);
        jPanel15.add(filler41);

        jPanel105.add(jPanel15, java.awt.BorderLayout.PAGE_START);

        jPanel16.setOpaque(false);
        jPanel16.setLayout(new java.awt.BorderLayout());

        jPanel106.setOpaque(false);

        jPanel19.setOpaque(false);
        jPanel19.setLayout(new java.awt.BorderLayout());

        lb_nombre_usuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lb_nombre_usuario.setForeground(new java.awt.Color(255, 255, 255));
        lb_nombre_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_nombre_usuario.setText("NOMBRE");
        lb_nombre_usuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel19.add(lb_nombre_usuario, java.awt.BorderLayout.NORTH);

        lb_correo_user.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lb_correo_user.setForeground(new java.awt.Color(255, 255, 255));
        lb_correo_user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_correo_user.setText("Correo_electronico");
        lb_correo_user.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel19.add(lb_correo_user, java.awt.BorderLayout.CENTER);
        jPanel19.add(filler8, java.awt.BorderLayout.PAGE_END);

        jPanel106.add(jPanel19);

        jPanel16.add(jPanel106, java.awt.BorderLayout.PAGE_END);

        jPanel107.setOpaque(false);
        jPanel107.setLayout(new java.awt.BorderLayout());

        rSFotoCircle1.setColorBorde(new java.awt.Color(200, 156, 50));
        rSFotoCircle1.setColorBordePopu(new java.awt.Color(60, 86, 84));
        rSFotoCircle1.setColorButtonOptions(new java.awt.Color(60, 86, 84));
        rSFotoCircle1.setColorButtonOptionsHover(new java.awt.Color(60, 86, 84));
        rSFotoCircle1.setColorButtonsPopu(new java.awt.Color(60, 86, 84));
        rSFotoCircle1.setColorFondo(new java.awt.Color(60, 86, 84));
        rSFotoCircle1.setGrosorBordePopu(1);
        rSFotoCircle1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSFotoCircle1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rSFotoCircle1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rSFotoCircle1MouseExited(evt);
            }
        });
        jPanel107.add(rSFotoCircle1, java.awt.BorderLayout.CENTER);
        jPanel107.add(filler42, java.awt.BorderLayout.LINE_END);
        jPanel107.add(filler43, java.awt.BorderLayout.LINE_START);

        jPanel16.add(jPanel107, java.awt.BorderLayout.CENTER);

        jPanel105.add(jPanel16, java.awt.BorderLayout.CENTER);

        rSPanelBorder2.add(jPanel105, java.awt.BorderLayout.PAGE_START);

        jPanel108.setBackground(new java.awt.Color(66, 92, 90));
        jPanel108.setLayout(new java.awt.BorderLayout());

        jPanel20.setOpaque(false);
        jPanel20.add(filler44);

        jPanel108.add(jPanel20, java.awt.BorderLayout.LINE_START);

        jPanel21.setOpaque(false);
        jPanel21.add(filler45);

        jPanel108.add(jPanel21, java.awt.BorderLayout.PAGE_START);

        pl_botones_roles.setOpaque(false);
        pl_botones_roles.setLayout(new java.awt.CardLayout());

        pl_bt_admin.setOpaque(false);
        pl_bt_admin.setLayout(new javax.swing.BoxLayout(pl_bt_admin, javax.swing.BoxLayout.Y_AXIS));

        jPanel109.setBackground(new java.awt.Color(66, 92, 90));
        jPanel109.setLayout(new java.awt.BorderLayout());

        rSButtonShapeIcon12.setBackground(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon12.setForeground(new java.awt.Color(0, 0, 0));
        rSButtonShapeIcon12.setText("Control de Proveedores");
        rSButtonShapeIcon12.setBackgroundHover(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon12.setBorderPainted(false);
        rSButtonShapeIcon12.setForegroundHover(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon12.setForegroundIcon(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon12.setForegroundIconHover(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon12.setForegroundText(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon12.setForma(RSMaterialComponent.RSButtonShapeIcon.FORMA.ROUND_LEFT);
        jPanel109.add(rSButtonShapeIcon12, java.awt.BorderLayout.CENTER);

        pl_bt_admin.add(jPanel109);

        jPanel110.setBackground(new java.awt.Color(66, 92, 90));
        jPanel110.setLayout(new java.awt.BorderLayout());

        rSButtonShapeIcon13.setBackground(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon13.setForeground(new java.awt.Color(0, 0, 0));
        rSButtonShapeIcon13.setText("Control Ingresos");
        rSButtonShapeIcon13.setBackgroundHover(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon13.setBorderPainted(false);
        rSButtonShapeIcon13.setForegroundHover(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon13.setForegroundIcon(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon13.setForegroundIconHover(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon13.setForegroundText(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon13.setForma(RSMaterialComponent.RSButtonShapeIcon.FORMA.ROUND_LEFT);
        jPanel110.add(rSButtonShapeIcon13, java.awt.BorderLayout.CENTER);

        pl_bt_admin.add(jPanel110);

        jPanel111.setBackground(new java.awt.Color(66, 92, 90));
        jPanel111.setLayout(new java.awt.BorderLayout());

        rSButtonShapeIcon14.setBackground(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon14.setForeground(new java.awt.Color(0, 0, 0));
        rSButtonShapeIcon14.setText("Control Contratos");
        rSButtonShapeIcon14.setBackgroundHover(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon14.setBorderPainted(false);
        rSButtonShapeIcon14.setForegroundHover(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon14.setForegroundIcon(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon14.setForegroundIconHover(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon14.setForegroundText(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon14.setForma(RSMaterialComponent.RSButtonShapeIcon.FORMA.ROUND_LEFT);
        jPanel111.add(rSButtonShapeIcon14, java.awt.BorderLayout.CENTER);

        pl_bt_admin.add(jPanel111);

        jPanel147.setBackground(new java.awt.Color(66, 92, 90));
        jPanel147.setLayout(new java.awt.BorderLayout());

        rSButtonShapeIcon15.setBackground(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon15.setForeground(new java.awt.Color(0, 0, 0));
        rSButtonShapeIcon15.setText("Control Ventas");
        rSButtonShapeIcon15.setBackgroundHover(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon15.setBorderPainted(false);
        rSButtonShapeIcon15.setForegroundHover(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon15.setForegroundIcon(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon15.setForegroundIconHover(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon15.setForegroundText(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon15.setForma(RSMaterialComponent.RSButtonShapeIcon.FORMA.ROUND_LEFT);
        jPanel147.add(rSButtonShapeIcon15, java.awt.BorderLayout.CENTER);

        pl_bt_admin.add(jPanel147);

        jPanel148.setBackground(new java.awt.Color(66, 92, 90));
        jPanel148.setLayout(new java.awt.BorderLayout());

        rSButtonShapeIcon16.setBackground(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon16.setForeground(new java.awt.Color(0, 0, 0));
        rSButtonShapeIcon16.setText("Control Registros");
        rSButtonShapeIcon16.setBackgroundHover(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon16.setBorderPainted(false);
        rSButtonShapeIcon16.setForegroundHover(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon16.setForegroundIcon(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon16.setForegroundIconHover(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon16.setForegroundText(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon16.setForma(RSMaterialComponent.RSButtonShapeIcon.FORMA.ROUND_LEFT);
        jPanel148.add(rSButtonShapeIcon16, java.awt.BorderLayout.CENTER);

        pl_bt_admin.add(jPanel148);

        jPanel149.setBackground(new java.awt.Color(66, 92, 90));
        jPanel149.setLayout(new java.awt.BorderLayout());

        rSButtonShapeIcon17.setBackground(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon17.setForeground(new java.awt.Color(0, 0, 0));
        rSButtonShapeIcon17.setText("Control Empleados");
        rSButtonShapeIcon17.setBackgroundHover(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon17.setBorderPainted(false);
        rSButtonShapeIcon17.setForegroundHover(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon17.setForegroundIcon(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon17.setForegroundIconHover(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon17.setForegroundText(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon17.setForma(RSMaterialComponent.RSButtonShapeIcon.FORMA.ROUND_LEFT);
        jPanel149.add(rSButtonShapeIcon17, java.awt.BorderLayout.CENTER);

        pl_bt_admin.add(jPanel149);

        jPanel150.setBackground(new java.awt.Color(66, 92, 90));
        jPanel150.setLayout(new java.awt.BorderLayout());

        rSButtonShapeIcon18.setBackground(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon18.setForeground(new java.awt.Color(0, 0, 0));
        rSButtonShapeIcon18.setText("Control Habitacion");
        rSButtonShapeIcon18.setBackgroundHover(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon18.setBorderPainted(false);
        rSButtonShapeIcon18.setForegroundHover(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon18.setForegroundIcon(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon18.setForegroundIconHover(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon18.setForegroundText(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon18.setForma(RSMaterialComponent.RSButtonShapeIcon.FORMA.ROUND_LEFT);
        jPanel150.add(rSButtonShapeIcon18, java.awt.BorderLayout.CENTER);

        pl_bt_admin.add(jPanel150);

        jPanel151.setBackground(new java.awt.Color(66, 92, 90));
        jPanel151.setLayout(new java.awt.BorderLayout());

        rSButtonShapeIcon19.setBackground(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon19.setForeground(new java.awt.Color(0, 0, 0));
        rSButtonShapeIcon19.setText("Estadisticas ingresos");
        rSButtonShapeIcon19.setBackgroundHover(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon19.setBorderPainted(false);
        rSButtonShapeIcon19.setForegroundHover(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon19.setForegroundIcon(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon19.setForegroundIconHover(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon19.setForegroundText(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon19.setForma(RSMaterialComponent.RSButtonShapeIcon.FORMA.ROUND_LEFT);
        jPanel151.add(rSButtonShapeIcon19, java.awt.BorderLayout.CENTER);

        pl_bt_admin.add(jPanel151);

        jPanel152.setBackground(new java.awt.Color(66, 92, 90));
        jPanel152.setLayout(new java.awt.BorderLayout());

        rSButtonShapeIcon20.setBackground(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon20.setForeground(new java.awt.Color(0, 0, 0));
        rSButtonShapeIcon20.setText("Control de Recursos");
        rSButtonShapeIcon20.setBackgroundHover(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon20.setBorderPainted(false);
        rSButtonShapeIcon20.setForegroundHover(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon20.setForegroundIcon(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon20.setForegroundIconHover(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon20.setForegroundText(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon20.setForma(RSMaterialComponent.RSButtonShapeIcon.FORMA.ROUND_LEFT);
        jPanel152.add(rSButtonShapeIcon20, java.awt.BorderLayout.CENTER);

        pl_bt_admin.add(jPanel152);

        pl_botones_roles.add(pl_bt_admin, "botones_admin");

        pl_bt_contador.setOpaque(false);
        pl_bt_contador.setLayout(new javax.swing.BoxLayout(pl_bt_contador, javax.swing.BoxLayout.Y_AXIS));

        jPanel153.setBackground(new java.awt.Color(66, 92, 90));
        jPanel153.setLayout(new java.awt.BorderLayout());

        rSButtonShapeIcon21.setBackground(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon21.setForeground(new java.awt.Color(0, 0, 0));
        rSButtonShapeIcon21.setText("Control de Proveedores");
        rSButtonShapeIcon21.setBackgroundHover(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon21.setBorderPainted(false);
        rSButtonShapeIcon21.setForegroundHover(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon21.setForegroundIcon(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon21.setForegroundIconHover(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon21.setForegroundText(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon21.setForma(RSMaterialComponent.RSButtonShapeIcon.FORMA.ROUND_LEFT);
        jPanel153.add(rSButtonShapeIcon21, java.awt.BorderLayout.CENTER);

        pl_bt_contador.add(jPanel153);

        jPanel154.setBackground(new java.awt.Color(66, 92, 90));
        jPanel154.setLayout(new java.awt.BorderLayout());

        rSButtonShapeIcon22.setBackground(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon22.setForeground(new java.awt.Color(0, 0, 0));
        rSButtonShapeIcon22.setText("Control Ingresos");
        rSButtonShapeIcon22.setBackgroundHover(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon22.setBorderPainted(false);
        rSButtonShapeIcon22.setForegroundHover(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon22.setForegroundIcon(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon22.setForegroundIconHover(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon22.setForegroundText(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon22.setForma(RSMaterialComponent.RSButtonShapeIcon.FORMA.ROUND_LEFT);
        jPanel154.add(rSButtonShapeIcon22, java.awt.BorderLayout.CENTER);

        pl_bt_contador.add(jPanel154);

        jPanel155.setBackground(new java.awt.Color(66, 92, 90));
        jPanel155.setLayout(new java.awt.BorderLayout());

        rSButtonShapeIcon23.setBackground(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon23.setForeground(new java.awt.Color(0, 0, 0));
        rSButtonShapeIcon23.setText("Control Contratos");
        rSButtonShapeIcon23.setBackgroundHover(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon23.setBorderPainted(false);
        rSButtonShapeIcon23.setForegroundHover(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon23.setForegroundIcon(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon23.setForegroundIconHover(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon23.setForegroundText(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon23.setForma(RSMaterialComponent.RSButtonShapeIcon.FORMA.ROUND_LEFT);
        jPanel155.add(rSButtonShapeIcon23, java.awt.BorderLayout.CENTER);

        pl_bt_contador.add(jPanel155);

        jPanel156.setBackground(new java.awt.Color(66, 92, 90));
        jPanel156.setLayout(new java.awt.BorderLayout());

        rSButtonShapeIcon24.setBackground(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon24.setForeground(new java.awt.Color(0, 0, 0));
        rSButtonShapeIcon24.setText("Control Ventas");
        rSButtonShapeIcon24.setBackgroundHover(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon24.setBorderPainted(false);
        rSButtonShapeIcon24.setForegroundHover(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon24.setForegroundIcon(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon24.setForegroundIconHover(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon24.setForegroundText(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon24.setForma(RSMaterialComponent.RSButtonShapeIcon.FORMA.ROUND_LEFT);
        jPanel156.add(rSButtonShapeIcon24, java.awt.BorderLayout.CENTER);

        pl_bt_contador.add(jPanel156);

        jPanel157.setBackground(new java.awt.Color(66, 92, 90));
        jPanel157.setLayout(new java.awt.BorderLayout());

        rSButtonShapeIcon25.setBackground(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon25.setForeground(new java.awt.Color(0, 0, 0));
        rSButtonShapeIcon25.setText("Control Registros");
        rSButtonShapeIcon25.setBackgroundHover(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon25.setBorderPainted(false);
        rSButtonShapeIcon25.setForegroundHover(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon25.setForegroundIcon(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon25.setForegroundIconHover(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon25.setForegroundText(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon25.setForma(RSMaterialComponent.RSButtonShapeIcon.FORMA.ROUND_LEFT);
        jPanel157.add(rSButtonShapeIcon25, java.awt.BorderLayout.CENTER);

        pl_bt_contador.add(jPanel157);

        jPanel158.setBackground(new java.awt.Color(66, 92, 90));
        jPanel158.setLayout(new java.awt.BorderLayout());

        rSButtonShapeIcon26.setBackground(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon26.setForeground(new java.awt.Color(0, 0, 0));
        rSButtonShapeIcon26.setText("Control Empleados");
        rSButtonShapeIcon26.setBackgroundHover(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon26.setBorderPainted(false);
        rSButtonShapeIcon26.setForegroundHover(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon26.setForegroundIcon(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon26.setForegroundIconHover(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon26.setForegroundText(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon26.setForma(RSMaterialComponent.RSButtonShapeIcon.FORMA.ROUND_LEFT);
        jPanel158.add(rSButtonShapeIcon26, java.awt.BorderLayout.CENTER);

        pl_bt_contador.add(jPanel158);

        jPanel159.setBackground(new java.awt.Color(66, 92, 90));
        jPanel159.setLayout(new java.awt.BorderLayout());

        rSButtonShapeIcon27.setBackground(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon27.setForeground(new java.awt.Color(0, 0, 0));
        rSButtonShapeIcon27.setText("Control Habitacion");
        rSButtonShapeIcon27.setBackgroundHover(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon27.setBorderPainted(false);
        rSButtonShapeIcon27.setForegroundHover(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon27.setForegroundIcon(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon27.setForegroundIconHover(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon27.setForegroundText(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon27.setForma(RSMaterialComponent.RSButtonShapeIcon.FORMA.ROUND_LEFT);
        jPanel159.add(rSButtonShapeIcon27, java.awt.BorderLayout.CENTER);

        pl_bt_contador.add(jPanel159);

        jPanel160.setBackground(new java.awt.Color(66, 92, 90));
        jPanel160.setLayout(new java.awt.BorderLayout());

        rSButtonShapeIcon28.setBackground(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon28.setForeground(new java.awt.Color(0, 0, 0));
        rSButtonShapeIcon28.setText("Estadisticas ingresos");
        rSButtonShapeIcon28.setBackgroundHover(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon28.setBorderPainted(false);
        rSButtonShapeIcon28.setForegroundHover(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon28.setForegroundIcon(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon28.setForegroundIconHover(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon28.setForegroundText(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon28.setForma(RSMaterialComponent.RSButtonShapeIcon.FORMA.ROUND_LEFT);
        jPanel160.add(rSButtonShapeIcon28, java.awt.BorderLayout.CENTER);

        pl_bt_contador.add(jPanel160);

        jPanel161.setBackground(new java.awt.Color(66, 92, 90));
        jPanel161.setLayout(new java.awt.BorderLayout());

        rSButtonShapeIcon29.setBackground(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon29.setForeground(new java.awt.Color(0, 0, 0));
        rSButtonShapeIcon29.setText("Control de Recursos");
        rSButtonShapeIcon29.setBackgroundHover(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon29.setBorderPainted(false);
        rSButtonShapeIcon29.setForegroundHover(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon29.setForegroundIcon(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon29.setForegroundIconHover(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon29.setForegroundText(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon29.setForma(RSMaterialComponent.RSButtonShapeIcon.FORMA.ROUND_LEFT);
        jPanel161.add(rSButtonShapeIcon29, java.awt.BorderLayout.CENTER);

        pl_bt_contador.add(jPanel161);

        pl_botones_roles.add(pl_bt_contador, "botones_contador");

        pl_bt_recepcionista.setOpaque(false);
        pl_bt_recepcionista.setLayout(new javax.swing.BoxLayout(pl_bt_recepcionista, javax.swing.BoxLayout.Y_AXIS));

        jPanel162.setBackground(new java.awt.Color(66, 92, 90));
        jPanel162.setLayout(new java.awt.BorderLayout());

        rSButtonShapeIcon30.setBackground(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon30.setForeground(new java.awt.Color(0, 0, 0));
        rSButtonShapeIcon30.setText("Registrar Reserva");
        rSButtonShapeIcon30.setBackgroundHover(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon30.setBorderPainted(false);
        rSButtonShapeIcon30.setForegroundHover(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon30.setForegroundIcon(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon30.setForegroundIconHover(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon30.setForegroundText(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon30.setForma(RSMaterialComponent.RSButtonShapeIcon.FORMA.ROUND_LEFT);
        jPanel162.add(rSButtonShapeIcon30, java.awt.BorderLayout.CENTER);

        pl_bt_recepcionista.add(jPanel162);

        jPanel163.setBackground(new java.awt.Color(66, 92, 90));
        jPanel163.setLayout(new java.awt.BorderLayout());

        rSButtonShapeIcon31.setBackground(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon31.setForeground(new java.awt.Color(0, 0, 0));
        rSButtonShapeIcon31.setText("Registrar Cliente");
        rSButtonShapeIcon31.setBackgroundHover(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon31.setBorderPainted(false);
        rSButtonShapeIcon31.setForegroundHover(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon31.setForegroundIcon(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon31.setForegroundIconHover(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon31.setForegroundText(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon31.setForma(RSMaterialComponent.RSButtonShapeIcon.FORMA.ROUND_LEFT);
        jPanel163.add(rSButtonShapeIcon31, java.awt.BorderLayout.CENTER);

        pl_bt_recepcionista.add(jPanel163);

        jPanel164.setBackground(new java.awt.Color(66, 92, 90));
        jPanel164.setLayout(new java.awt.BorderLayout());

        rSButtonShapeIcon32.setBackground(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon32.setForeground(new java.awt.Color(0, 0, 0));
        rSButtonShapeIcon32.setText("Registrar Pago");
        rSButtonShapeIcon32.setBackgroundHover(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon32.setBorderPainted(false);
        rSButtonShapeIcon32.setForegroundHover(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon32.setForegroundIcon(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon32.setForegroundIconHover(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon32.setForegroundText(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon32.setForma(RSMaterialComponent.RSButtonShapeIcon.FORMA.ROUND_LEFT);
        jPanel164.add(rSButtonShapeIcon32, java.awt.BorderLayout.CENTER);

        pl_bt_recepcionista.add(jPanel164);

        jPanel165.setBackground(new java.awt.Color(66, 92, 90));
        jPanel165.setLayout(new java.awt.BorderLayout());

        rSButtonShapeIcon33.setBackground(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon33.setForeground(new java.awt.Color(0, 0, 0));
        rSButtonShapeIcon33.setText("Administracion Habitaciones");
        rSButtonShapeIcon33.setBackgroundHover(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon33.setBorderPainted(false);
        rSButtonShapeIcon33.setForegroundHover(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon33.setForegroundIcon(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon33.setForegroundIconHover(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon33.setForegroundText(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon33.setForma(RSMaterialComponent.RSButtonShapeIcon.FORMA.ROUND_LEFT);
        jPanel165.add(rSButtonShapeIcon33, java.awt.BorderLayout.CENTER);

        pl_bt_recepcionista.add(jPanel165);

        jPanel166.setBackground(new java.awt.Color(66, 92, 90));
        jPanel166.setLayout(new java.awt.BorderLayout());

        rSButtonShapeIcon34.setBackground(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon34.setForeground(new java.awt.Color(0, 0, 0));
        rSButtonShapeIcon34.setText("Registrar Servicio");
        rSButtonShapeIcon34.setBackgroundHover(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon34.setBorderPainted(false);
        rSButtonShapeIcon34.setForegroundHover(new java.awt.Color(66, 92, 90));
        rSButtonShapeIcon34.setForegroundIcon(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon34.setForegroundIconHover(new java.awt.Color(200, 156, 50));
        rSButtonShapeIcon34.setForegroundText(new java.awt.Color(226, 236, 235));
        rSButtonShapeIcon34.setForma(RSMaterialComponent.RSButtonShapeIcon.FORMA.ROUND_LEFT);
        jPanel166.add(rSButtonShapeIcon34, java.awt.BorderLayout.CENTER);

        pl_bt_recepcionista.add(jPanel166);

        pl_botones_roles.add(pl_bt_recepcionista, "botones_recepcionista");

        jPanel108.add(pl_botones_roles, java.awt.BorderLayout.CENTER);

        rSPanelBorder2.add(jPanel108, java.awt.BorderLayout.CENTER);

        rSPanelBorder16.setBackground(new java.awt.Color(66, 92, 90));
        rSPanelBorder16.setBgBorder(new java.awt.Color(66, 92, 90));
        rSPanelBorder16.setBorderBottom(false);
        rSPanelBorder16.setBorderLeft(false);
        rSPanelBorder16.setBorderRight(false);
        rSPanelBorder16.setBorderTop(false);
        rSPanelBorder16.setMinimumSize(new java.awt.Dimension(150, 90));
        rSPanelBorder16.setRound(50);
        rSPanelBorder16.add(filler47);
        rSPanelBorder16.add(filler46);

        bt_cerrar_sesion.setBackground(new java.awt.Color(204, 0, 0));
        bt_cerrar_sesion.setText("CERRAR SESION");
        bt_cerrar_sesion.setBackgroundHover(new java.awt.Color(60, 86, 84));
        bt_cerrar_sesion.setForma(RSMaterialComponent.RSButtonShape.FORMA.ROUND);
        bt_cerrar_sesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bt_cerrar_sesion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_cerrar_sesion.setMaximumSize(new java.awt.Dimension(100, 35));
        bt_cerrar_sesion.setMinimumSize(new java.awt.Dimension(100, 35));
        bt_cerrar_sesion.setPreferredSize(new java.awt.Dimension(130, 35));
        bt_cerrar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cerrar_sesionActionPerformed(evt);
            }
        });
        rSPanelBorder16.add(bt_cerrar_sesion);

        rSPanelBorder2.add(rSPanelBorder16, java.awt.BorderLayout.SOUTH);

        jPanel10.add(rSPanelBorder2, java.awt.BorderLayout.WEST);

        pl_control.add(jPanel10, java.awt.BorderLayout.CENTER);

        panel_principal.add(pl_control, "panel_control");

        pl_registro_login.setLayout(new java.awt.GridLayout(1, 0));

        jPanel18.setBackground(new java.awt.Color(44, 57, 37));
        jPanel18.setLayout(new java.awt.BorderLayout());

        jPanel22.setOpaque(false);
        jPanel22.setLayout(new java.awt.BorderLayout());

        jPanel23.setOpaque(false);
        jPanel23.setLayout(new java.awt.BorderLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/HOSPEDAJE EMELY_free-file.png"))); // NOI18N
        jPanel23.add(jLabel7, java.awt.BorderLayout.CENTER);

        jPanel22.add(jPanel23, java.awt.BorderLayout.CENTER);

        jPanel18.add(jPanel22, java.awt.BorderLayout.CENTER);

        pl_registro_login.add(jPanel18);

        jPanel24.setLayout(new java.awt.BorderLayout());

        panel_login5.setBackground(new java.awt.Color(250, 242, 233));
        panel_login5.setLayout(new java.awt.BorderLayout());

        jPanel127.setOpaque(false);
        java.awt.FlowLayout flowLayout2 = new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT);
        flowLayout2.setAlignOnBaseline(true);
        jPanel127.setLayout(flowLayout2);
        panel_login5.add(jPanel127, java.awt.BorderLayout.PAGE_START);

        jPanel128.setOpaque(false);
        jPanel128.setLayout(new java.awt.BorderLayout());

        jPanel129.setOpaque(false);
        jPanel129.add(filler19);

        jPanel128.add(jPanel129, java.awt.BorderLayout.LINE_START);

        jPanel130.setOpaque(false);
        jPanel130.setLayout(new java.awt.GridLayout(8, 1));

        jPanel131.setOpaque(false);

        jLabel36.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 28)); // NOI18N
        jLabel36.setText("Registrarse");
        jPanel131.add(jLabel36);

        jPanel130.add(jPanel131);

        jPanel143.setOpaque(false);
        jPanel143.setLayout(new java.awt.GridLayout(2, 1));

        jPanel144.setOpaque(false);
        jPanel144.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel42.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jLabel42.setText("CORREO ELECTRONICO");
        jPanel144.add(jLabel42);

        jPanel143.add(jPanel144);

        jPanel145.setBackground(new java.awt.Color(240, 236, 235));
        jPanel145.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel145.setLayout(new java.awt.BorderLayout());

        txt_correo_registro.setBackground(new java.awt.Color(240, 236, 235));
        txt_correo_registro.setFont(new java.awt.Font("Comic Sans MS", 0, 21)); // NOI18N
        txt_correo_registro.setBorder(null);
        txt_correo_registro.setOpaque(false);
        jPanel145.add(txt_correo_registro, java.awt.BorderLayout.CENTER);

        jPanel28.setOpaque(false);
        jPanel28.setLayout(new java.awt.BorderLayout());

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/At sign_26px.png"))); // NOI18N
        jPanel28.add(jLabel43, java.awt.BorderLayout.WEST);
        jPanel28.add(filler24, java.awt.BorderLayout.CENTER);

        jPanel145.add(jPanel28, java.awt.BorderLayout.WEST);

        jPanel143.add(jPanel145);

        jPanel130.add(jPanel143);

        jPanel140.setOpaque(false);
        jPanel140.setLayout(new java.awt.GridLayout(2, 1));

        jPanel142.setOpaque(false);
        jPanel142.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel38.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jLabel38.setText("USUARIO");
        jPanel142.add(jLabel38);

        jPanel140.add(jPanel142);

        jPanel146.setBackground(new java.awt.Color(240, 236, 235));
        jPanel146.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel146.setLayout(new java.awt.BorderLayout());

        txt_usuario_registro.setBackground(new java.awt.Color(240, 236, 235));
        txt_usuario_registro.setFont(new java.awt.Font("Comic Sans MS", 0, 21)); // NOI18N
        txt_usuario_registro.setBorder(null);
        txt_usuario_registro.setOpaque(false);
        jPanel146.add(txt_usuario_registro, java.awt.BorderLayout.CENTER);

        jPanel27.setOpaque(false);
        jPanel27.setLayout(new java.awt.BorderLayout());
        jPanel27.add(filler23, java.awt.BorderLayout.CENTER);

        jPanel146.add(jPanel27, java.awt.BorderLayout.WEST);

        jPanel140.add(jPanel146);

        jPanel130.add(jPanel140);

        jPanel135.setOpaque(false);
        jPanel135.setLayout(new java.awt.GridLayout(2, 1));

        jPanel136.setOpaque(false);
        jPanel136.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel39.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jLabel39.setText("CONTRASEÑA");
        jPanel136.add(jLabel39);

        jPanel135.add(jPanel136);

        jPanel137.setBackground(new java.awt.Color(240, 236, 235));
        jPanel137.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel137.setLayout(new java.awt.BorderLayout());

        txt_pass_registro.setBackground(new java.awt.Color(240, 236, 235));
        txt_pass_registro.setFont(new java.awt.Font("Comic Sans MS", 0, 21)); // NOI18N
        txt_pass_registro.setBorder(null);
        txt_pass_registro.setOpaque(false);
        jPanel137.add(txt_pass_registro, java.awt.BorderLayout.CENTER);

        ver_contra4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ver_contra4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eye_25px.png"))); // NOI18N
        ver_contra4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ver_contra4ver_contraMouseClicked(evt);
            }
        });
        jPanel137.add(ver_contra4, java.awt.BorderLayout.EAST);

        jPanel31.setOpaque(false);
        jPanel31.setLayout(new java.awt.BorderLayout());

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lock_26px.png"))); // NOI18N
        jPanel31.add(jLabel40, java.awt.BorderLayout.WEST);
        jPanel31.add(filler21, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel31, java.awt.BorderLayout.WEST);

        jPanel135.add(jPanel137);

        jPanel130.add(jPanel135);

        jPanel132.setOpaque(false);
        jPanel132.setLayout(new java.awt.GridLayout(2, 1));

        jPanel133.setOpaque(false);
        jPanel133.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jPanel132.add(jPanel133);

        jPanel213.setOpaque(false);
        jPanel213.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel37.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jLabel37.setText("SEGURIDAD:");
        jPanel213.add(jLabel37);

        buttonGroup1.add(rb_activada);
        rb_activada.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        rb_activada.setText("Activada");
        jPanel213.add(rb_activada);

        buttonGroup1.add(rb_desactivar);
        rb_desactivar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        rb_desactivar.setSelected(true);
        rb_desactivar.setText("Desactivada");
        jPanel213.add(rb_desactivar);

        jPanel132.add(jPanel213);

        jPanel130.add(jPanel132);

        jPanel138.setOpaque(false);
        jPanel138.setLayout(new java.awt.GridLayout(2, 1));

        jPanel139.setOpaque(false);
        jPanel139.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jPanel138.add(jPanel139);

        jPanel130.add(jPanel138);

        jPanel26.setOpaque(false);
        jPanel26.setLayout(new java.awt.GridLayout(2, 2, 10, 0));

        bt_registro_usuario_login.setBackground(new java.awt.Color(44, 57, 37));
        bt_registro_usuario_login.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        bt_registro_usuario_login.setForeground(new java.awt.Color(255, 255, 255));
        bt_registro_usuario_login.setText("Registrarme");
        bt_registro_usuario_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_registro_usuario_loginActionPerformed(evt);
            }
        });
        jPanel26.add(bt_registro_usuario_login);

        bt_cambio_iniciarSesion.setBackground(new java.awt.Color(44, 57, 37));
        bt_cambio_iniciarSesion.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        bt_cambio_iniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        bt_cambio_iniciarSesion.setText("Iniciar Sesion");
        bt_cambio_iniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cambio_iniciarSesionActionPerformed(evt);
            }
        });
        jPanel26.add(bt_cambio_iniciarSesion);

        jPanel29.setOpaque(false);

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 344, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        jPanel26.add(jPanel29);

        jPanel32.setOpaque(false);

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 344, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        jPanel26.add(jPanel32);

        jPanel130.add(jPanel26);

        jPanel128.add(jPanel130, java.awt.BorderLayout.CENTER);

        jPanel141.setOpaque(false);

        javax.swing.GroupLayout jPanel141Layout = new javax.swing.GroupLayout(jPanel141);
        jPanel141.setLayout(jPanel141Layout);
        jPanel141Layout.setHorizontalGroup(
            jPanel141Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel141Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel141Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(filler22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel141Layout.setVerticalGroup(
            jPanel141Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 936, Short.MAX_VALUE)
            .addGroup(jPanel141Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel141Layout.createSequentialGroup()
                    .addGap(0, 468, Short.MAX_VALUE)
                    .addComponent(filler22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 468, Short.MAX_VALUE)))
        );

        jPanel128.add(jPanel141, java.awt.BorderLayout.EAST);

        panel_login5.add(jPanel128, java.awt.BorderLayout.CENTER);

        jPanel24.add(panel_login5, java.awt.BorderLayout.CENTER);

        pl_registro_login.add(jPanel24);

        panel_principal.add(pl_registro_login, "card4");

        getContentPane().add(panel_principal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_user3txt_userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_user3txt_userKeyReleased
        if(KeyEvent.VK_ENTER== evt.getKeyCode()){
            loginVerificacion();

        }
    }//GEN-LAST:event_txt_user3txt_userKeyReleased

    private void txt_pass3txt_passKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pass3txt_passKeyReleased
        if(KeyEvent.VK_ENTER== evt.getKeyCode()){
            loginVerificacion();
        }
    }//GEN-LAST:event_txt_pass3txt_passKeyReleased

    private void ver_contra3ver_contraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ver_contra3ver_contraMouseClicked
        if(ver==false){
            ver=true;
            ver_contra3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eye_24px.png")));
            txt_pass3.setEchoChar((char)0);
        }
        else{
            ver=false;
            ver_contra3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eye_25px.png")));
            txt_pass3.setEchoChar('•');}
    }//GEN-LAST:event_ver_contra3ver_contraMouseClicked

    private void bt_iniciar3bt_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_iniciar3bt_iniciarActionPerformed
    loginVerificacion();
    }//GEN-LAST:event_bt_iniciar3bt_iniciarActionPerformed

    private void bt_registrobt_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registrobt_iniciarActionPerformed
        CardLayout card= (CardLayout)this.panel_principal.getLayout();
        card.show(panel_principal,"card4");
    }//GEN-LAST:event_bt_registrobt_iniciarActionPerformed

    private void ver_contra4ver_contraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ver_contra4ver_contraMouseClicked
        if(ver==false){
            ver=true;
            ver_contra4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eye_24px.png")));
            txt_pass_registro.setEchoChar((char)0);
        }
        else{
            ver=false;
            ver_contra4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eye_25px.png")));
            txt_pass_registro.setEchoChar('•');}
    }//GEN-LAST:event_ver_contra4ver_contraMouseClicked
        private int segur=0;
       String idUX;    
    private void bt_registro_usuario_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registro_usuario_loginActionPerformed

 Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        String email=txt_correo_registro.getText().trim();
        Matcher mather = pattern.matcher(email);


        if( txt_correo_registro.getText().isEmpty()&&txt_pass_registro.getText().isEmpty()
            && txt_usuario_registro.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Existen espacio vacios");
        }else{
  
            String usuarioX=txt_usuario_registro.getText().trim();    
            String correoX=txt_correo_registro.getText().trim(); 
            System.out.println("correoX: "+correoX);
            System.out.println("usuarioX: "+usuarioX);
            System.out.println("contrasenaX: "+crypt.ecnode(txt_pass_registro.getText().trim()));
            if (mather.find() == true) {
            if (U.correoRegistrado(correoX)==false){
                      if(rb_activada.isSelected()){segur=1;}else if(rb_desactivar.isSelected()){segur=0;}
                        SMS.setDestinatario(correoX);
                        SMS.enviarCorreo();
                        String code = JOptionPane.showInputDialog(null,"Ingrese su codigo aqui","Revise su correo electronico",3);
                        if(code.equals(SMS.getCodigoC())||code!=null||!"".equals(code)){

                         idUX= Random.codigoIdTablas();
                    U.insertarUsuario(crypt.ecnode(txt_pass_registro.getText().trim()),usuarioX,idUX,correoX,segur);
                    txt_correo_registro.setText("");
                    txt_pass_registro.setText("");
                    txt_usuario_registro.setText("");
                    rb_desactivar.setSelected(true);
                        }else
                             JOptionPane.showMessageDialog(null,"Codigo incorrecto"); 
                
               }else JOptionPane.showMessageDialog(null,"Ya existe un usuario con ese correo"); 
            }
            else {
                JOptionPane.showMessageDialog(null,"El email ingresado es inválido" );

            }}
    }//GEN-LAST:event_bt_registro_usuario_loginActionPerformed

    private void bt_cambio_iniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cambio_iniciarSesionActionPerformed
        CardLayout card= (CardLayout)this.panel_principal.getLayout();
        card.show(panel_principal,"card2");
    }//GEN-LAST:event_bt_cambio_iniciarSesionActionPerformed
    public int intentos=0;
    private void confirmar_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmar_codigoActionPerformed
   if (txt_codigo_confirmacion.getText().equals(SMS.getCodigoC()))
        {
            CardLayout cartas= (CardLayout)this.panel_principal.getLayout();
            cartas.show(this.panel_principal,"panel_control");
            CardLayout card= (CardLayout)this.Dialog_panel1.getLayout();
            card.show(Dialog_panel1,"valido");
            this.setEnabled(true);

        }else{
             intentos++;
             int res=(3-intentos);
             JOptionPane.showMessageDialog(null, "Codigo incorrecto \n"
                 + " Te quedan: "+ res +" intentos.");
            
            if(intentos>3){
            CardLayout card= (CardLayout)this.Dialog_panel1.getLayout();
            card.show(Dialog_panel1,"invalido"); this.setEnabled(true);
           this.setEnabled(true);}
        } 
    }//GEN-LAST:event_confirmar_codigoActionPerformed

    private void txt_codigo_confirmacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigo_confirmacionKeyTyped
           if(txt_codigo_confirmacion.getText().length() >= 6){
            evt.consume();
    }
    }//GEN-LAST:event_txt_codigo_confirmacionKeyTyped

    private void rSFotoCircle1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSFotoCircle1MouseEntered
       rSFotoCircle1.setImagenDefault(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png")));
    }//GEN-LAST:event_rSFotoCircle1MouseEntered

    private void rSFotoCircle1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSFotoCircle1MouseClicked
       JFileChooser j = new JFileChooser();
        FileNameExtensionFilter fil = new FileNameExtensionFilter("JPG, PNG & GIF","jpg","png","gif");
        j.setFileFilter(fil);
        int s = j.showOpenDialog(this);
        if(s == JFileChooser.APPROVE_OPTION){
            String ruta = j.getSelectedFile().getAbsolutePath();
            ruta_imagen=ruta;
        ImageIcon icono1= new ImageIcon(ruta_imagen);

        try {
            rSFotoCircle1.setImagenDefault(icono1);
            File urlImagen= new File(ruta);
            modificar_imagen(urlImagen);
        } catch (Exception e) {
                System.out.println(""+e);
        }
        
        }else{
            JOptionPane.showMessageDialog(null,"No se selecciono ninguna imagen" );
            }
    }//GEN-LAST:event_rSFotoCircle1MouseClicked

    private void rSFotoCircle1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSFotoCircle1MouseExited
       try{
                    byte[] bi = E.getFoto();
                    BufferedImage image = null;
                    InputStream in = new ByteArrayInputStream(bi);
                    image = ImageIO.read(in);
                    
                    ImageIcon icono = new ImageIcon(
                    image.getScaledInstance(rSFotoCircle1.getWidth(), rSFotoCircle1.getHeight(), java.awt.Image.SCALE_DEFAULT));
                    rSFotoCircle1.setImagenDefault(icono);

                }catch(Exception ex){ 
                }
    }//GEN-LAST:event_rSFotoCircle1MouseExited

    private void bt_gmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_gmailActionPerformed
        if (Desktop.isDesktopSupported()) {
 Desktop desktop = Desktop.getDesktop();
 try {
 URI uri;
     try {
         uri = new URI("https://mail.google.com/");
        desktop.browse(uri);
     } catch (URISyntaxException ex) {
         Logger.getLogger(vista1.class.getName()).log(Level.SEVERE, null, ex);
     }
 
 } catch (IOException e) {
 System.err.println("Error: No se pudo abrir el enlace" + e.getMessage() );
 }
 } else {
 System.err.println("Error: No se puede abrir enlaces web.");
 }
    }//GEN-LAST:event_bt_gmailActionPerformed

    private void codigo_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigo_cancelarActionPerformed
        this.setEnabled(true);
        ventana_codigo.setVisible(false);
    }//GEN-LAST:event_codigo_cancelarActionPerformed

    private void bt_cerrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cerrar_sesionActionPerformed

       CardLayout card= (CardLayout)this.panel_principal.getLayout();
        card.show(panel_principal,"card2");
    }//GEN-LAST:event_bt_cerrar_sesionActionPerformed
    
    private void bt_seguridadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_seguridadMouseClicked
          if(U.getSeguridad()==1){
            U.setSeguridad(0);
            U.ModificarSeguridad(0);
            bt_seguridad.setText("off");
            System.out.println("Tu nivel de seguridad es de :"+U.getSeguridad());
            bt_seguridad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shield_off.png")));    
        }else{
            U.setSeguridad(1);
            U.ModificarSeguridad(1);
            bt_seguridad.setText("on");
            System.out.println("Tu nivel de seguridad es de :"+U.getSeguridad());
           bt_seguridad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shield_on.png")));    
}
        
    }//GEN-LAST:event_bt_seguridadMouseClicked

    private void bt_seguridadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_seguridadMouseEntered
       
    }//GEN-LAST:event_bt_seguridadMouseEntered

    private void bt_seguridadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_seguridadMouseExited
       
    }//GEN-LAST:event_bt_seguridadMouseExited

    private void cerrar_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_2ActionPerformed
       ventana_codigo.setVisible(false);
        CardLayout card= (CardLayout)this.Dialog_panel1.getLayout();
       card.show(Dialog_panel1,"panel_codigo");
       txt_codigo_confirmacion.setText("");
        
    }//GEN-LAST:event_cerrar_2ActionPerformed

    private void cerrar_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_1ActionPerformed
       ventana_codigo.setVisible(false);
        CardLayout card= (CardLayout)this.Dialog_panel1.getLayout();
       card.show(Dialog_panel1,"panel_codigo");
        txt_codigo_confirmacion.setText("");
    }//GEN-LAST:event_cerrar_1ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

        CardLayout card= (CardLayout)this.jPanel199.getLayout();
       card.show(jPanel199,"carta_principal");
        rSPanelBorder1.setVisible(true);
        rSPanelBorder7.setBackground(Color.decode("#3C5654"));
        CardLayout card1= (CardLayout)this.jPanel86.getLayout();
       card1.show(jPanel86,"card1");
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        rSPanelBorder7.setBackground(Color.decode("#E2ECEB"));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        rSPanelBorder7.setBackground(Color.decode("#C89C32"));
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        rSPanelBorder7.setBackground(Color.decode("#0C3A4D"));
    }//GEN-LAST:event_jLabel5MousePressed

    private void jLabel5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseReleased
       rSPanelBorder7.setBackground(Color.decode("#3C5654"));
    }//GEN-LAST:event_jLabel5MouseReleased

    private void rSButtonShape2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonShape2ActionPerformed
       CardLayout card= (CardLayout)this.jPanel199.getLayout();
       card.show(jPanel199,"crear_empleado");
        rSPanelBorder1.setVisible(false);
    }//GEN-LAST:event_rSButtonShape2ActionPerformed

    private void txt_nombre_empleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nombre_empleadoMouseEntered
       v.PlaceHolderEntered(txt_nombre_empleado);
    }//GEN-LAST:event_txt_nombre_empleadoMouseEntered

    private void txt_nombre_empleadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nombre_empleadoMouseExited
       v.PlaceHolderExited(txt_nombre_empleado);
    }//GEN-LAST:event_txt_nombre_empleadoMouseExited

    private void txt_apellidos_empleadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_apellidos_empleadoMouseExited
        v.PlaceHolderExited(txt_apellidos_empleado);
    }//GEN-LAST:event_txt_apellidos_empleadoMouseExited

    private void txt_apellidos_empleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_apellidos_empleadoMouseEntered
        v.PlaceHolderEntered(txt_apellidos_empleado);
    }//GEN-LAST:event_txt_apellidos_empleadoMouseEntered

    private void txt_direccion_empleadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_direccion_empleadoMouseExited
         v.PlaceHolderExited(txt_direccion_empleado);
    }//GEN-LAST:event_txt_direccion_empleadoMouseExited

    private void txt_direccion_empleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_direccion_empleadoMouseEntered
         v.PlaceHolderEntered(txt_direccion_empleado);
    }//GEN-LAST:event_txt_direccion_empleadoMouseEntered

    private void txt_numero_empleadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_numero_empleadoMouseExited
         v.PlaceHolderExited(txt_numero_empleado);
    }//GEN-LAST:event_txt_numero_empleadoMouseExited

    private void txt_numero_empleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_numero_empleadoMouseEntered
         v.PlaceHolderEntered(txt_numero_empleado);
    }//GEN-LAST:event_txt_numero_empleadoMouseEntered

    private void txt_sueldo_empleadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_sueldo_empleadoMouseExited
         v.PlaceHolderExited(txt_sueldo_empleado);
    }//GEN-LAST:event_txt_sueldo_empleadoMouseExited

    private void txt_sueldo_empleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_sueldo_empleadoMouseEntered
         v.PlaceHolderEntered(txt_sueldo_empleado);
    }//GEN-LAST:event_txt_sueldo_empleadoMouseEntered

    private void txt_dni_empleadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_dni_empleadoMouseExited
        v.PlaceHolderExited(txt_dni_empleado);
    }//GEN-LAST:event_txt_dni_empleadoMouseExited

    private void txt_dni_empleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_dni_empleadoMouseEntered
         v.PlaceHolderEntered(txt_dni_empleado);
    }//GEN-LAST:event_txt_dni_empleadoMouseEntered

    private void txt_correo_empleadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_correo_empleadoMouseExited
         v.PlaceHolderExited(txt_correo_empleado);
    }//GEN-LAST:event_txt_correo_empleadoMouseExited

    private void txt_correo_empleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_correo_empleadoMouseEntered
         v.PlaceHolderEntered(txt_correo_empleado);
    }//GEN-LAST:event_txt_correo_empleadoMouseEntered

    private void jTextField26MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField26MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField26MouseEntered

    private void jTextField26MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField26MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField26MouseExited

    private void rSButtonShape3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonShape3ActionPerformed
  CardLayout card= (CardLayout)this.jPanel199.getLayout();
       card.show(jPanel199,"leer_empleado");
       rSPanelBorder1.setVisible(true);
     CardLayout card1= (CardLayout)this.jPanel86.getLayout();
       card1.show(jPanel86,"card2");
    }//GEN-LAST:event_rSButtonShape3ActionPerformed

    private void rSButtonShape4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonShape4ActionPerformed
        CardLayout card= (CardLayout)this.jPanel199.getLayout();
       card.show(jPanel199,"actualizar_empleado");
       rSPanelBorder1.setVisible(false);
    }//GEN-LAST:event_rSButtonShape4ActionPerformed

    private void rSButtonShape5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonShape5ActionPerformed
 CardLayout card= (CardLayout)this.jPanel199.getLayout();
       card.show(jPanel199,"eliminar_empleado");
       rSPanelBorder1.setVisible(false);
    }//GEN-LAST:event_rSButtonShape5ActionPerformed

    private void jTextField39MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField39MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField39MouseEntered

    private void jTextField39MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField39MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField39MouseExited

    private void jTextField40MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField40MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField40MouseEntered

    private void jTextField40MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField40MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField40MouseExited

    private void jTextField41MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField41MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField41MouseEntered

    private void jTextField41MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField41MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField41MouseExited

    private void jTextField42MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField42MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField42MouseEntered

    private void jTextField42MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField42MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField42MouseExited

    private void jTextField43MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField43MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField43MouseEntered

    private void jTextField43MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField43MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField43MouseExited

    private void jTextField44MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField44MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField44MouseEntered

    private void jTextField44MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField44MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField44MouseExited

    private void jTextField45MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField45MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField45MouseEntered

    private void jTextField45MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField45MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField45MouseExited

    private void jTextField46MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField46MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField46MouseEntered

    private void jTextField46MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField46MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField46MouseExited

    private void jTextField47MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField47MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField47MouseEntered

    private void jTextField47MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField47MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField47MouseExited

    private void jTextField48MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField48MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField48MouseEntered

    private void jTextField48MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField48MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField48MouseExited

    private void jTextField49MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField49MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField49MouseEntered

    private void jTextField49MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField49MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField49MouseExited

    private void jTextField50MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField50MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField50MouseEntered

    private void jTextField50MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField50MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField50MouseExited

    private void jTextField51MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField51MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField51MouseEntered

    private void jTextField51MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField51MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField51MouseExited

    private void jTextField52MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField52MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField52MouseEntered

    private void jTextField52MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField52MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField52MouseExited

    private void jTextField53MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField53MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField53MouseEntered

    private void jTextField53MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField53MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField53MouseExited

    private void jTextField25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField25MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField25MouseExited

    private void jTextField25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField25MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField25MouseEntered

    private void jTextField24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField24MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField24MouseExited

    private void jTextField24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField24MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField24MouseEntered

    private void jTextField23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField23MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField23MouseExited

    private void jTextField23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField23MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField23MouseEntered

    private void jTextField30MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField30MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField30MouseExited

    private void jTextField30MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField30MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField30MouseEntered

    private void jTextField31MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField31MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField31MouseExited

    private void jTextField31MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField31MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField31MouseEntered

    private void jTextField28MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField28MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField28MouseExited

    private void jTextField28MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField28MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField28MouseEntered

    private void jTextField55MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField55MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField55MouseEntered

    private void jTextField55MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField55MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField55MouseExited

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        DefaultTableModel modelo=(DefaultTableModel) jTable1.getModel();           
        modelo.setRowCount(0); 
        DefaultTableModel miModelo = E.llenarTabla();
        jTable1.setModel(miModelo);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void bt_limpiar_tablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_limpiar_tablaActionPerformed
       //bt_limpiar_tabla
        DefaultTableModel modelo=(DefaultTableModel) jTable1.getModel();           
        modelo.setRowCount(0);
        img_usuario.setImagen(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); 
        nombre.setText("");
        apellido.setText("");
        edad.setText("");
        estado.setText("");
        telefono.setText("");
        correo.setText("");
    }//GEN-LAST:event_bt_limpiar_tablaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        String dni= (String) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        System.out.println("DNI:"+ dni);
        E.SelectRowJTB(dni);
        try {
            byte[] bi = E.img;
                    BufferedImage image = null;
                    InputStream in = new ByteArrayInputStream(bi);
                    image = ImageIO.read(in);
                    ImageIcon icono = new ImageIcon(
                    image.getScaledInstance(img_usuario.getWidth(),
                    img_usuario.getHeight(), java.awt.Image.SCALE_DEFAULT));
                    img_usuario.setImagen(icono);
        } catch (Exception e) {
        }
        nombre.setText(E.datos[0]);
        apellido.setText(E.datos[1]);
        edad.setText(E.datos[2]);
        estado.setText(E.datos[3]);
        telefono.setText(E.datos[4]);
        correo.setText(E.datos[5]);
                    
    }//GEN-LAST:event_jTable1MouseClicked
    private byte[] fotografia;
    private void bt_registrar_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registrar_empleadoActionPerformed
        //generar condicional spiner_fecha_inicio
        if(v.validarRegistro(jComboBox_distrito,jComboBox_tipo_documento,jComboBox_genero,jComboBox_horario,jComboBox_rol,jComboBox_operadora
        ,txt_direccion_empleado,txt_dni_empleado,txt_nombre_empleado,txt_apellidos_empleado,txt_sueldo_empleado,txt_numero_empleado,txt_correo_empleado)==true){
        String idDireccion=Random.codigoIdTablas();
        String idDocumento=Random.codigoIdTablas();
        String idPersona=Random.codigoIdTablas();
        String idEmpleado=Random.codigoIdTablas();
        String idContrato=Random.codigoIdTablas();
        String idTelefono=Random.codigoIdTablas();
        String spinnerValue = new SimpleDateFormat("yyyy-MM-dd").format(spiner_fecha1.getValue());
        String spinnerInicio = new SimpleDateFormat("yyyy-MM-dd").format(spiner_fecha_inicio.getValue());
        String spinnerFin = new SimpleDateFormat("yyyy-MM-dd").format(spiner_fecha_fin.getValue());
        registro.registrarDireccion(idDireccion, txt_direccion_empleado.getText(), v.idTablas(jComboBox_distrito.getSelectedItem().toString(), "distrito"));
        registro.registrarDocumento(idDocumento,  Integer.parseInt(txt_dni_empleado.getText()), v.idTablas(jComboBox_tipo_documento.getSelectedItem().toString(), "tipo_documento"));
        registro.registrarPersona(idPersona,txt_nombre_empleado.getText(),txt_apellidos_empleado.getText(),spinnerValue,idDocumento,v.idTablas(jComboBox_genero.getSelectedItem().toString(), "genero"),idDireccion,txt_correo_empleado.getText());
        if(lb_imagen_cargada.getText().equals("sin imagen")){
        try {
        File urlImagen= new File(getClass().getResource("/img/user.png").getFile());
         fotografia = new byte[(int) urlImagen.length()];
        InputStream input = new FileInputStream(urlImagen);
        input.read(fotografia);  
        registro.registrarEmpleado(idEmpleado,idPersona,fotografia,"ESTTTRUE");} catch (Exception e) {}}
        else{
        registro.registrarEmpleado(idEmpleado,idPersona,fotografia,"ESTTTRUE");}
        String idHorario=v.idTablas(jComboBox_horario.getSelectedItem().toString(),"horario");
        double sueldo=Double.parseDouble(txt_sueldo_empleado.getText());
        String idRol=v.idTablas(jComboBox_rol.getSelectedItem().toString(),"rol");
        registro.registrarContrato(idContrato,sueldo,idRol,idHorario,spinnerInicio,spinnerFin,idEmpleado,"ESTTTRUE");
        registro.registrarTelefono(idTelefono, Integer.parseInt(txt_numero_empleado.getText()), v.idTablas(jComboBox_operadora.getSelectedItem().toString(), "operador"), idPersona);
        JOptionPane.showMessageDialog(null, "Empleado registrado exitosamente ");

        lb_imagen_cargada.setText("sin imagen");}
        else{
        JOptionPane.showMessageDialog(null, "No se pudo registrar Revise los campos",null,2);}
    }//GEN-LAST:event_bt_registrar_empleadoActionPerformed
 
    private void registrar_foto_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar_foto_empleadoActionPerformed
         JFileChooser j = new JFileChooser();
        FileNameExtensionFilter fil = new FileNameExtensionFilter("JPG, PNG & GIF","jpg","png","gif");
        j.setFileFilter(fil);
        int s = j.showOpenDialog(this);
        if(s == JFileChooser.APPROVE_OPTION){
            String ruta = j.getSelectedFile().getAbsolutePath();
            ruta_imagen=ruta;
            lb_imagen_cargada.setText(ruta_imagen);
        try {
            File urlImagen= new File(ruta);
            fotografia = new byte[(int) urlImagen.length()];
            InputStream input = new FileInputStream(urlImagen);
            input.read(fotografia);
        } catch (Exception e) {
                System.out.println(""+e);
        }
        
        }else{
            lb_imagen_cargada.setText("sin imagen");
            JOptionPane.showMessageDialog(null,"No se selecciono ninguna imagen" );
            }
    }//GEN-LAST:event_registrar_foto_empleadoActionPerformed

    private void jComboBox_paisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_paisActionPerformed
     if(jComboBox_pais.getSelectedIndex()!=0){
        jComboBox_provincia.setEnabled(true);
        //v.DependenciasBoxPro(jComboBox_provincia, jComboBox_pais.getSelectedItem().toString());
    }else
        jComboBox_provincia.setEnabled(false);
    }//GEN-LAST:event_jComboBox_paisActionPerformed

    private void jComboBox_provinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_provinciaActionPerformed
    if(jComboBox_provincia.getSelectedIndex()!=0){
        jComboBox_distrito.setEnabled(true);
        v.DependenciasBoxDis(jComboBox_distrito, jComboBox_provincia.getSelectedItem().toString());
    }else
        jComboBox_distrito.setEnabled(false);
    }//GEN-LAST:event_jComboBox_provinciaActionPerformed

    private void txt_dni_empleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dni_empleadoKeyTyped
      v.limitarText(txt_dni_empleado, 8, evt);
    }//GEN-LAST:event_txt_dni_empleadoKeyTyped

    private void txt_numero_empleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_numero_empleadoKeyTyped
      v.limitarText(txt_numero_empleado, 11, evt);
    }//GEN-LAST:event_txt_numero_empleadoKeyTyped
        String ruta_imagen;

    public boolean veri_code=false;
    boolean ver=false;  
    
    
    
    public void loginVerificacion(){
   
        
        Usuario User= new Usuario();
        Empleado Empl=new Empleado();
        Persona pers=new Persona();
        String Pasword="";
        
        
        
        
        
         
        
       if(!txt_user3.getText().trim().isEmpty()&&!txt_pass3.getText().trim().isEmpty()){
        User= U.GetUsuario(txt_user3.getText().trim());
        Pasword=crypt.ecnode(txt_pass3.getText().trim());
        if(Pasword.equals(User.getPassword())){
                    cookiesActivado();
                    System.out.println("idE. user : "+ User.getId_empleado());
                    Empl = E.getEmpleado(User.getId_empleado());
                    E.getRoles(Empl.getId_empleado());
                    E.getEstado(Empl.getId_empleado());
                    pers=P.getPersona(Empl.getId_persona());
                    System.out.println("Codigo persona: "+ Empl.getId_persona());
                    System.out.println("Nombre: "+pers.getNombres());
                    this.llenar_datos();
                    if(1== User.getSeguridad()){
                        this.intentos=0;
                        SMS.setDestinatario(pers.getCorreo_electronico());
                        SMS.enviarCorreo();
                        this.setEnabled(false);
                        ventana_codigo.setVisible(true);
                        ventana_codigo.setSize(520,250);
                        ventana_codigo.setLocationRelativeTo(null);
                    }else{
                    JOptionPane.showMessageDialog(this, "Bienvenido");
                    CardLayout cartas= (CardLayout)this.panel_principal.getLayout();
                    cartas.show(this.panel_principal,"panel_control");
                }
      
        }else
            JOptionPane.showMessageDialog(null, "La contraseña es incorrecta");
    }else 
        JOptionPane.showMessageDialog(null, "Espacios vacios");     
            
    }

    public String Cook_user,Cook_pass;
    public void cookiesActivado(){
        if(jCheckBox4.isSelected()){
        
    try {
        FileWriter w;
        w = new FileWriter(newResource);
        BufferedWriter bw=new BufferedWriter(w);
        PrintWriter wr=new PrintWriter(bw);
        wr.append("1;"+txt_user3.getText()+";"+txt_pass3.getText());
        wr.close();
    } catch (IOException ex) {
        Logger.getLogger(vista1.class.getName()).log(Level.SEVERE, null, ex);
    }
        }else{
        try {
        FileWriter w;
        w = new FileWriter(newResource);
        BufferedWriter bw=new BufferedWriter(w);
            PrintWriter wr=new PrintWriter(bw);
            wr.append("0;;");
            wr.close();
    } catch (IOException ex) {
        Logger.getLogger(vista1.class.getName()).log(Level.SEVERE, null, ex);
    }
        }   
    }
    public  void LeerCookies(){   
        try {
            BufferedReader br = new BufferedReader(new FileReader(newResource)); 
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(";");
            if("1".equals(columnsName[0])){
                txt_user3.setText(columnsName[1]);
                txt_pass3.setText(columnsName[2]);
            }
        } catch (IOException ex) {
            Logger.getLogger(vista1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }           
    public void Roles(int i){

    }
    public boolean ver_b=false;
    public void Roles_botones(int i){

      
    }        
    public void Genero(int i){

    }

        public void llenar_datos(){
        this.lb_nombre_usuario.setText(P.getNombres()+" "+P.getApellidos());  
        this.lb_correo_user.setText(P.getCorreo_electronico());
        System.out.println("Tu nivel de seguridad es de :"+U.getSeguridad());
        this.lb_titulo.setText(E.getRol());
        if(U.getSeguridad()==1){
        
        bt_seguridad.setText("on");
        bt_seguridad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shield_on.png")));
        }else{
        bt_seguridad.setText("off");
        bt_seguridad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shield_off.png")));}
        try{
                    
                    byte[] bi = E.getFoto();
                    BufferedImage image = null;
                    InputStream in = new ByteArrayInputStream(bi);
                    image = ImageIO.read(in);
                    ImageIcon icono = new ImageIcon(
                    image.getScaledInstance(rSFotoCircle1.getWidth(), rSFotoCircle1.getHeight(), java.awt.Image.SCALE_DEFAULT));
                    rSFotoCircle1.setImagenDefault(icono);

                }catch(Exception ex){ 
                }
    }
    public void modificar_imagen(File archivo) throws SQLException{
         try{
            byte[] fotografia = new byte[(int) archivo.length()];
            InputStream input = new FileInputStream(archivo);
            input.read(fotografia);
            E.setFoto(fotografia);
            }catch(Exception ex){
            E.setFoto(null);
        }   
        
        E.Modificar_Image();
}   
   
    public void spinDate(){
    
    Date datenow = Calendar.getInstance().getTime();
    SpinnerDateModel smb = new SpinnerDateModel(datenow, null, null, Calendar.HOUR_OF_DAY);
    Date datenow1 = Calendar.getInstance().getTime();
    SpinnerDateModel smb1 = new SpinnerDateModel(datenow1, null, null, Calendar.HOUR_OF_DAY);
    Date datenow2 = Calendar.getInstance().getTime();
    SpinnerDateModel smb2 = new SpinnerDateModel(datenow2, null, null, Calendar.HOUR_OF_DAY);
    spiner_fecha_inicio.setModel(smb);
    spiner_fecha_fin.setModel(smb1);
    spiner_fecha1.setModel(smb2);
    JSpinner.DateEditor d = new JSpinner.DateEditor(spiner_fecha_inicio, "yyyy-MM-dd");
    d.getTextField().setEditable( true );
    JSpinner.DateEditor d1 = new JSpinner.DateEditor(spiner_fecha_fin, "yyyy-MM-dd");
    d.getTextField().setEditable( true );
    JSpinner.DateEditor d2 = new JSpinner.DateEditor(spiner_fecha1, "yyyy-MM-dd");
    d.getTextField().setEditable( true );
    spiner_fecha_inicio.setEditor(d);
    spiner_fecha_fin.setEditor(d1);
    spiner_fecha1.setEditor(d2);

    }

    public static void main(String args[]) {
         try {
    UIManager.setLookAndFeel( new FlatCyanLightIJTheme() );
} catch( Exception ex ) {
    System.err.println( "Failed to initialize LaF" );
}
       vista1 v = new vista1();
       v.setVisible(true);
       v.setLocationRelativeTo(null);

        while (true) {
			
			v.rSPanelImage1.repaint();
			v.rSPanelImage2.repaint();
			v.rSPanelImage3.repaint();
			v.rSPanelImage4.repaint();
			v.rSPanelImage5.repaint();
			v.rSPanelImage6.repaint();
			v.img_gif.repaint();
			v.pl_log_gif.repaint();
            try {Thread.sleep(50); } catch (InterruptedException ex) {   }
		}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Dialog_panel1;
    private javax.swing.JPanel Panel_code;
    private javax.swing.JTextField apellido;
    private javax.swing.JButton bt_cambio_iniciarSesion;
    private RSMaterialComponent.RSButtonShape bt_cerrar_sesion;
    private javax.swing.JButton bt_gmail;
    private javax.swing.JButton bt_iniciar3;
    private javax.swing.JButton bt_limpiar_tabla;
    private javax.swing.JButton bt_registrar_empleado;
    private javax.swing.JButton bt_registro;
    private javax.swing.JButton bt_registro_usuario_login;
    private javax.swing.JLabel bt_seguridad;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private RSMaterialComponent.RSPanelBorder carta_actualizar_empleado;
    private RSMaterialComponent.RSPanelBorder carta_crear_empleado;
    private RSMaterialComponent.RSPanelBorder carta_eliminar_empleado;
    private RSMaterialComponent.RSPanelBorder carta_leer_empleado;
    private RSMaterialComponent.RSPanelBorder cartas_objetos;
    private RSMaterialComponent.RSPanelBorder cartas_objetos1;
    private RSMaterialComponent.RSPanelBorder cartas_objetos10;
    private RSMaterialComponent.RSPanelBorder cartas_objetos11;
    private RSMaterialComponent.RSPanelBorder cartas_objetos12;
    private RSMaterialComponent.RSPanelBorder cartas_objetos13;
    private RSMaterialComponent.RSPanelBorder cartas_objetos2;
    private RSMaterialComponent.RSPanelBorder cartas_objetos3;
    private RSMaterialComponent.RSPanelBorder cartas_objetos4;
    private RSMaterialComponent.RSPanelBorder cartas_objetos5;
    private RSMaterialComponent.RSPanelBorder cartas_objetos6;
    private RSMaterialComponent.RSPanelBorder cartas_objetos7;
    private RSMaterialComponent.RSPanelBorder cartas_objetos8;
    private RSMaterialComponent.RSPanelBorder cartas_objetos9;
    private javax.swing.JButton cerrar_1;
    private javax.swing.JButton cerrar_2;
    private javax.swing.JButton codigo_cancelar;
    private javax.swing.JButton confirmar_codigo;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField edad;
    private javax.swing.JTextField estado;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler11;
    private javax.swing.Box.Filler filler12;
    private javax.swing.Box.Filler filler13;
    private javax.swing.Box.Filler filler14;
    private javax.swing.Box.Filler filler15;
    private javax.swing.Box.Filler filler16;
    private javax.swing.Box.Filler filler17;
    private javax.swing.Box.Filler filler18;
    private javax.swing.Box.Filler filler19;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler21;
    private javax.swing.Box.Filler filler22;
    private javax.swing.Box.Filler filler23;
    private javax.swing.Box.Filler filler24;
    private javax.swing.Box.Filler filler25;
    private javax.swing.Box.Filler filler26;
    private javax.swing.Box.Filler filler27;
    private javax.swing.Box.Filler filler28;
    private javax.swing.Box.Filler filler29;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler30;
    private javax.swing.Box.Filler filler31;
    private javax.swing.Box.Filler filler32;
    private javax.swing.Box.Filler filler33;
    private javax.swing.Box.Filler filler34;
    private javax.swing.Box.Filler filler35;
    private javax.swing.Box.Filler filler36;
    private javax.swing.Box.Filler filler37;
    private javax.swing.Box.Filler filler38;
    private javax.swing.Box.Filler filler39;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler40;
    private javax.swing.Box.Filler filler41;
    private javax.swing.Box.Filler filler42;
    private javax.swing.Box.Filler filler43;
    private javax.swing.Box.Filler filler44;
    private javax.swing.Box.Filler filler45;
    private javax.swing.Box.Filler filler46;
    private javax.swing.Box.Filler filler47;
    private javax.swing.Box.Filler filler48;
    private javax.swing.Box.Filler filler49;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler50;
    private javax.swing.Box.Filler filler51;
    private javax.swing.Box.Filler filler52;
    private javax.swing.Box.Filler filler53;
    private javax.swing.Box.Filler filler56;
    private javax.swing.Box.Filler filler57;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    private rojerusan.RSPanelCircleImage img_usuario;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox24;
    private javax.swing.JComboBox<String> jComboBox25;
    private javax.swing.JComboBox<String> jComboBox_area;
    private javax.swing.JComboBox<String> jComboBox_distrito;
    private javax.swing.JComboBox<String> jComboBox_genero;
    private javax.swing.JComboBox<String> jComboBox_horario;
    private javax.swing.JComboBox<String> jComboBox_operadora;
    private javax.swing.JComboBox<String> jComboBox_pais;
    private javax.swing.JComboBox<String> jComboBox_provincia;
    private javax.swing.JComboBox<String> jComboBox_rol;
    private javax.swing.JComboBox<String> jComboBox_tipo_documento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel100;
    private javax.swing.JPanel jPanel101;
    private javax.swing.JPanel jPanel102;
    private javax.swing.JPanel jPanel103;
    private javax.swing.JPanel jPanel104;
    private javax.swing.JPanel jPanel105;
    private javax.swing.JPanel jPanel106;
    private javax.swing.JPanel jPanel107;
    private javax.swing.JPanel jPanel108;
    private javax.swing.JPanel jPanel109;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel110;
    private javax.swing.JPanel jPanel111;
    private javax.swing.JPanel jPanel112;
    private javax.swing.JPanel jPanel113;
    private javax.swing.JPanel jPanel114;
    private javax.swing.JPanel jPanel115;
    private javax.swing.JPanel jPanel116;
    private javax.swing.JPanel jPanel117;
    private javax.swing.JPanel jPanel118;
    private javax.swing.JPanel jPanel119;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel120;
    private javax.swing.JPanel jPanel121;
    private javax.swing.JPanel jPanel122;
    private javax.swing.JPanel jPanel123;
    private javax.swing.JPanel jPanel124;
    private javax.swing.JPanel jPanel125;
    private javax.swing.JPanel jPanel126;
    private javax.swing.JPanel jPanel127;
    private javax.swing.JPanel jPanel128;
    private javax.swing.JPanel jPanel129;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel130;
    private javax.swing.JPanel jPanel131;
    private javax.swing.JPanel jPanel132;
    private javax.swing.JPanel jPanel133;
    private javax.swing.JPanel jPanel135;
    private javax.swing.JPanel jPanel136;
    private javax.swing.JPanel jPanel137;
    private javax.swing.JPanel jPanel138;
    private javax.swing.JPanel jPanel139;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel140;
    private javax.swing.JPanel jPanel141;
    private javax.swing.JPanel jPanel142;
    private javax.swing.JPanel jPanel143;
    private javax.swing.JPanel jPanel144;
    private javax.swing.JPanel jPanel145;
    private javax.swing.JPanel jPanel146;
    private javax.swing.JPanel jPanel147;
    private javax.swing.JPanel jPanel148;
    private javax.swing.JPanel jPanel149;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel150;
    private javax.swing.JPanel jPanel151;
    private javax.swing.JPanel jPanel152;
    private javax.swing.JPanel jPanel153;
    private javax.swing.JPanel jPanel154;
    private javax.swing.JPanel jPanel155;
    private javax.swing.JPanel jPanel156;
    private javax.swing.JPanel jPanel157;
    private javax.swing.JPanel jPanel158;
    private javax.swing.JPanel jPanel159;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel160;
    private javax.swing.JPanel jPanel161;
    private javax.swing.JPanel jPanel162;
    private javax.swing.JPanel jPanel163;
    private javax.swing.JPanel jPanel164;
    private javax.swing.JPanel jPanel165;
    private javax.swing.JPanel jPanel166;
    private javax.swing.JPanel jPanel167;
    private javax.swing.JPanel jPanel168;
    private javax.swing.JPanel jPanel169;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel170;
    private javax.swing.JPanel jPanel171;
    private javax.swing.JPanel jPanel172;
    private javax.swing.JPanel jPanel173;
    private javax.swing.JPanel jPanel174;
    private javax.swing.JPanel jPanel175;
    private javax.swing.JPanel jPanel176;
    private javax.swing.JPanel jPanel177;
    private javax.swing.JPanel jPanel178;
    private javax.swing.JPanel jPanel179;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel180;
    private javax.swing.JPanel jPanel181;
    private javax.swing.JPanel jPanel182;
    private javax.swing.JPanel jPanel184;
    private javax.swing.JPanel jPanel185;
    private javax.swing.JPanel jPanel186;
    private javax.swing.JPanel jPanel187;
    private javax.swing.JPanel jPanel188;
    private javax.swing.JPanel jPanel189;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel190;
    private javax.swing.JPanel jPanel191;
    private javax.swing.JPanel jPanel192;
    private javax.swing.JPanel jPanel193;
    private javax.swing.JPanel jPanel194;
    private javax.swing.JPanel jPanel195;
    private javax.swing.JPanel jPanel196;
    private javax.swing.JPanel jPanel197;
    private javax.swing.JPanel jPanel198;
    private javax.swing.JPanel jPanel199;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel200;
    private javax.swing.JPanel jPanel201;
    private javax.swing.JPanel jPanel202;
    private javax.swing.JPanel jPanel203;
    private javax.swing.JPanel jPanel204;
    private javax.swing.JPanel jPanel205;
    private javax.swing.JPanel jPanel206;
    private javax.swing.JPanel jPanel207;
    private javax.swing.JPanel jPanel208;
    private javax.swing.JPanel jPanel209;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel210;
    private javax.swing.JPanel jPanel211;
    private javax.swing.JPanel jPanel212;
    private javax.swing.JPanel jPanel213;
    private javax.swing.JPanel jPanel214;
    private javax.swing.JPanel jPanel215;
    private javax.swing.JPanel jPanel216;
    private javax.swing.JPanel jPanel217;
    private javax.swing.JPanel jPanel218;
    private javax.swing.JPanel jPanel219;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel220;
    private javax.swing.JPanel jPanel221;
    private javax.swing.JPanel jPanel222;
    private javax.swing.JPanel jPanel223;
    private javax.swing.JPanel jPanel224;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel233;
    private javax.swing.JPanel jPanel234;
    private javax.swing.JPanel jPanel235;
    private javax.swing.JPanel jPanel236;
    private javax.swing.JPanel jPanel239;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel240;
    private javax.swing.JPanel jPanel243;
    private javax.swing.JPanel jPanel244;
    private javax.swing.JPanel jPanel245;
    private javax.swing.JPanel jPanel246;
    private javax.swing.JPanel jPanel247;
    private javax.swing.JPanel jPanel248;
    private javax.swing.JPanel jPanel249;
    private javax.swing.JPanel jPanel250;
    private javax.swing.JPanel jPanel251;
    private javax.swing.JPanel jPanel252;
    private javax.swing.JPanel jPanel253;
    private javax.swing.JPanel jPanel254;
    private javax.swing.JPanel jPanel255;
    private javax.swing.JPanel jPanel256;
    private javax.swing.JPanel jPanel257;
    private javax.swing.JPanel jPanel258;
    private javax.swing.JPanel jPanel259;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel260;
    private javax.swing.JPanel jPanel261;
    private javax.swing.JPanel jPanel262;
    private javax.swing.JPanel jPanel263;
    private javax.swing.JPanel jPanel264;
    private javax.swing.JPanel jPanel265;
    private javax.swing.JPanel jPanel266;
    private javax.swing.JPanel jPanel267;
    private javax.swing.JPanel jPanel268;
    private javax.swing.JPanel jPanel269;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel270;
    private javax.swing.JPanel jPanel271;
    private javax.swing.JPanel jPanel272;
    private javax.swing.JPanel jPanel273;
    private javax.swing.JPanel jPanel274;
    private javax.swing.JPanel jPanel275;
    private javax.swing.JPanel jPanel276;
    private javax.swing.JPanel jPanel277;
    private javax.swing.JPanel jPanel278;
    private javax.swing.JPanel jPanel279;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel280;
    private javax.swing.JPanel jPanel281;
    private javax.swing.JPanel jPanel282;
    private javax.swing.JPanel jPanel283;
    private javax.swing.JPanel jPanel284;
    private javax.swing.JPanel jPanel285;
    private javax.swing.JPanel jPanel286;
    private javax.swing.JPanel jPanel287;
    private javax.swing.JPanel jPanel288;
    private javax.swing.JPanel jPanel289;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel290;
    private javax.swing.JPanel jPanel291;
    private javax.swing.JPanel jPanel292;
    private javax.swing.JPanel jPanel293;
    private javax.swing.JPanel jPanel294;
    private javax.swing.JPanel jPanel295;
    private javax.swing.JPanel jPanel296;
    private javax.swing.JPanel jPanel297;
    private javax.swing.JPanel jPanel298;
    private javax.swing.JPanel jPanel299;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel300;
    private javax.swing.JPanel jPanel301;
    private javax.swing.JPanel jPanel302;
    private javax.swing.JPanel jPanel303;
    private javax.swing.JPanel jPanel304;
    private javax.swing.JPanel jPanel305;
    private javax.swing.JPanel jPanel306;
    private javax.swing.JPanel jPanel307;
    private javax.swing.JPanel jPanel308;
    private javax.swing.JPanel jPanel309;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel310;
    private javax.swing.JPanel jPanel311;
    private javax.swing.JPanel jPanel312;
    private javax.swing.JPanel jPanel313;
    private javax.swing.JPanel jPanel314;
    private javax.swing.JPanel jPanel315;
    private javax.swing.JPanel jPanel316;
    private javax.swing.JPanel jPanel317;
    private javax.swing.JPanel jPanel318;
    private javax.swing.JPanel jPanel319;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel320;
    private javax.swing.JPanel jPanel321;
    private javax.swing.JPanel jPanel322;
    private javax.swing.JPanel jPanel323;
    private javax.swing.JPanel jPanel324;
    private javax.swing.JPanel jPanel325;
    private javax.swing.JPanel jPanel326;
    private javax.swing.JPanel jPanel327;
    private javax.swing.JPanel jPanel328;
    private javax.swing.JPanel jPanel329;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel330;
    private javax.swing.JPanel jPanel331;
    private javax.swing.JPanel jPanel332;
    private javax.swing.JPanel jPanel333;
    private javax.swing.JPanel jPanel334;
    private javax.swing.JPanel jPanel335;
    private javax.swing.JPanel jPanel336;
    private javax.swing.JPanel jPanel337;
    private javax.swing.JPanel jPanel338;
    private javax.swing.JPanel jPanel339;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel340;
    private javax.swing.JPanel jPanel341;
    private javax.swing.JPanel jPanel342;
    private javax.swing.JPanel jPanel343;
    private javax.swing.JPanel jPanel344;
    private javax.swing.JPanel jPanel345;
    private javax.swing.JPanel jPanel346;
    private javax.swing.JPanel jPanel347;
    private javax.swing.JPanel jPanel348;
    private javax.swing.JPanel jPanel349;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel350;
    private javax.swing.JPanel jPanel351;
    private javax.swing.JPanel jPanel352;
    private javax.swing.JPanel jPanel353;
    private javax.swing.JPanel jPanel354;
    private javax.swing.JPanel jPanel355;
    private javax.swing.JPanel jPanel356;
    private javax.swing.JPanel jPanel357;
    private javax.swing.JPanel jPanel358;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel402;
    private javax.swing.JPanel jPanel403;
    private javax.swing.JPanel jPanel404;
    private javax.swing.JPanel jPanel405;
    private javax.swing.JPanel jPanel406;
    private javax.swing.JPanel jPanel407;
    private javax.swing.JPanel jPanel408;
    private javax.swing.JPanel jPanel409;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel410;
    private javax.swing.JPanel jPanel411;
    private javax.swing.JPanel jPanel412;
    private javax.swing.JPanel jPanel413;
    private javax.swing.JPanel jPanel414;
    private javax.swing.JPanel jPanel415;
    private javax.swing.JPanel jPanel416;
    private javax.swing.JPanel jPanel417;
    private javax.swing.JPanel jPanel418;
    private javax.swing.JPanel jPanel419;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel420;
    private javax.swing.JPanel jPanel421;
    private javax.swing.JPanel jPanel422;
    private javax.swing.JPanel jPanel423;
    private javax.swing.JPanel jPanel424;
    private javax.swing.JPanel jPanel425;
    private javax.swing.JPanel jPanel426;
    private javax.swing.JPanel jPanel427;
    private javax.swing.JPanel jPanel428;
    private javax.swing.JPanel jPanel429;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel430;
    private javax.swing.JPanel jPanel431;
    private javax.swing.JPanel jPanel432;
    private javax.swing.JPanel jPanel433;
    private javax.swing.JPanel jPanel434;
    private javax.swing.JPanel jPanel435;
    private javax.swing.JPanel jPanel436;
    private javax.swing.JPanel jPanel437;
    private javax.swing.JPanel jPanel438;
    private javax.swing.JPanel jPanel439;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel440;
    private javax.swing.JPanel jPanel441;
    private javax.swing.JPanel jPanel442;
    private javax.swing.JPanel jPanel443;
    private javax.swing.JPanel jPanel444;
    private javax.swing.JPanel jPanel445;
    private javax.swing.JPanel jPanel446;
    private javax.swing.JPanel jPanel447;
    private javax.swing.JPanel jPanel448;
    private javax.swing.JPanel jPanel449;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel450;
    private javax.swing.JPanel jPanel451;
    private javax.swing.JPanel jPanel452;
    private javax.swing.JPanel jPanel453;
    private javax.swing.JPanel jPanel454;
    private javax.swing.JPanel jPanel455;
    private javax.swing.JPanel jPanel456;
    private javax.swing.JPanel jPanel457;
    private javax.swing.JPanel jPanel458;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel466;
    private javax.swing.JPanel jPanel467;
    private javax.swing.JPanel jPanel468;
    private javax.swing.JPanel jPanel469;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel470;
    private javax.swing.JPanel jPanel471;
    private javax.swing.JPanel jPanel472;
    private javax.swing.JPanel jPanel473;
    private javax.swing.JPanel jPanel474;
    private javax.swing.JPanel jPanel475;
    private javax.swing.JPanel jPanel476;
    private javax.swing.JPanel jPanel477;
    private javax.swing.JPanel jPanel478;
    private javax.swing.JPanel jPanel479;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel78;
    private javax.swing.JPanel jPanel79;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel81;
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel83;
    private javax.swing.JPanel jPanel84;
    private javax.swing.JPanel jPanel85;
    private javax.swing.JPanel jPanel86;
    private javax.swing.JPanel jPanel87;
    private javax.swing.JPanel jPanel88;
    private javax.swing.JPanel jPanel89;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel90;
    private javax.swing.JPanel jPanel91;
    private javax.swing.JPanel jPanel92;
    private javax.swing.JPanel jPanel93;
    private javax.swing.JPanel jPanel94;
    private javax.swing.JPanel jPanel95;
    private javax.swing.JPanel jPanel96;
    private javax.swing.JPanel jPanel97;
    private javax.swing.JPanel jPanel98;
    private javax.swing.JPanel jPanel99;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JLabel lb_correo_user;
    private javax.swing.JLabel lb_imagen_cargada;
    private javax.swing.JLabel lb_nombre_usuario;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JTextField nombre;
    private javax.swing.JPanel panel_gif;
    private javax.swing.JPanel panel_login4;
    private javax.swing.JPanel panel_login5;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JPanel pl_botones_roles;
    private javax.swing.JPanel pl_bt_admin;
    private javax.swing.JPanel pl_bt_contador;
    private javax.swing.JPanel pl_bt_recepcionista;
    private javax.swing.JPanel pl_control;
    private javax.swing.JPanel pl_crud_general;
    private rojerusan.RSPanelImage pl_log_gif;
    private javax.swing.JPanel pl_login;
    private javax.swing.JPanel pl_registro_login;
    private RSMaterialComponent.RSButtonShape rSButtonShape2;
    private RSMaterialComponent.RSButtonShape rSButtonShape3;
    private RSMaterialComponent.RSButtonShape rSButtonShape4;
    private RSMaterialComponent.RSButtonShape rSButtonShape5;
    private RSMaterialComponent.RSButtonShapeIcon rSButtonShapeIcon12;
    private RSMaterialComponent.RSButtonShapeIcon rSButtonShapeIcon13;
    private RSMaterialComponent.RSButtonShapeIcon rSButtonShapeIcon14;
    private RSMaterialComponent.RSButtonShapeIcon rSButtonShapeIcon15;
    private RSMaterialComponent.RSButtonShapeIcon rSButtonShapeIcon16;
    private RSMaterialComponent.RSButtonShapeIcon rSButtonShapeIcon17;
    private RSMaterialComponent.RSButtonShapeIcon rSButtonShapeIcon18;
    private RSMaterialComponent.RSButtonShapeIcon rSButtonShapeIcon19;
    private RSMaterialComponent.RSButtonShapeIcon rSButtonShapeIcon20;
    private RSMaterialComponent.RSButtonShapeIcon rSButtonShapeIcon21;
    private RSMaterialComponent.RSButtonShapeIcon rSButtonShapeIcon22;
    private RSMaterialComponent.RSButtonShapeIcon rSButtonShapeIcon23;
    private RSMaterialComponent.RSButtonShapeIcon rSButtonShapeIcon24;
    private RSMaterialComponent.RSButtonShapeIcon rSButtonShapeIcon25;
    private RSMaterialComponent.RSButtonShapeIcon rSButtonShapeIcon26;
    private RSMaterialComponent.RSButtonShapeIcon rSButtonShapeIcon27;
    private RSMaterialComponent.RSButtonShapeIcon rSButtonShapeIcon28;
    private RSMaterialComponent.RSButtonShapeIcon rSButtonShapeIcon29;
    private RSMaterialComponent.RSButtonShapeIcon rSButtonShapeIcon30;
    private RSMaterialComponent.RSButtonShapeIcon rSButtonShapeIcon31;
    private RSMaterialComponent.RSButtonShapeIcon rSButtonShapeIcon32;
    private RSMaterialComponent.RSButtonShapeIcon rSButtonShapeIcon33;
    private RSMaterialComponent.RSButtonShapeIcon rSButtonShapeIcon34;
    private rojerusan.RSFotoCircle rSFotoCircle1;
    private rojeru_san.RSLabelFecha rSLabelFecha1;
    private rojeru_san.RSLabelHora rSLabelHora1;
    private RSMaterialComponent.RSPanelBorder rSPanelBorder1;
    private RSMaterialComponent.RSPanelBorder rSPanelBorder10;
    private RSMaterialComponent.RSPanelBorder rSPanelBorder11;
    private RSMaterialComponent.RSPanelBorder rSPanelBorder12;
    private RSMaterialComponent.RSPanelBorder rSPanelBorder13;
    private RSMaterialComponent.RSPanelBorder rSPanelBorder14;
    private RSMaterialComponent.RSPanelBorder rSPanelBorder15;
    private RSMaterialComponent.RSPanelBorder rSPanelBorder16;
    private RSMaterialComponent.RSPanelBorder rSPanelBorder17;
    private RSMaterialComponent.RSPanelBorder rSPanelBorder2;
    private RSMaterialComponent.RSPanelBorder rSPanelBorder25;
    private RSMaterialComponent.RSPanelBorder rSPanelBorder26;
    private RSMaterialComponent.RSPanelBorder rSPanelBorder27;
    private RSMaterialComponent.RSPanelBorder rSPanelBorder3;
    private RSMaterialComponent.RSPanelBorder rSPanelBorder4;
    private RSMaterialComponent.RSPanelBorder rSPanelBorder5;
    private RSMaterialComponent.RSPanelBorder rSPanelBorder6;
    private RSMaterialComponent.RSPanelBorder rSPanelBorder7;
    private RSMaterialComponent.RSPanelBorder rSPanelBorder8;
    private RSMaterialComponent.RSPanelBorder rSPanelBorder9;
    private rojerusan.RSPanelImage rSPanelImage1;
    private rojerusan.RSPanelImage rSPanelImage2;
    private rojerusan.RSPanelImage rSPanelImage3;
    private rojerusan.RSPanelImage rSPanelImage4;
    private rojerusan.RSPanelImage rSPanelImage5;
    private rojerusan.RSPanelImage rSPanelImage6;
    private javax.swing.JRadioButton rb_activada;
    private javax.swing.JRadioButton rb_desactivar;
    private javax.swing.JButton registrar_foto_empleado;
    private javax.swing.JSpinner spiner_fecha1;
    private javax.swing.JSpinner spiner_fecha2;
    private javax.swing.JSpinner spiner_fecha_fin;
    private javax.swing.JSpinner spiner_fecha_inicio;
    private javax.swing.JTextField telefono;
    private javax.swing.JTextField txt_apellidos_empleado;
    private javax.swing.JTextField txt_codigo_confirmacion;
    private javax.swing.JTextField txt_correo_empleado;
    public javax.swing.JTextField txt_correo_registro;
    private javax.swing.JTextField txt_direccion_empleado;
    private javax.swing.JTextField txt_dni_empleado;
    private javax.swing.JTextField txt_nombre_empleado;
    private javax.swing.JTextField txt_numero_empleado;
    public javax.swing.JPasswordField txt_pass3;
    public javax.swing.JPasswordField txt_pass_registro;
    private javax.swing.JTextField txt_sueldo_empleado;
    public javax.swing.JTextField txt_user3;
    public javax.swing.JTextField txt_usuario_registro;
    private javax.swing.JFrame ventana_codigo;
    private javax.swing.JLabel ver_contra3;
    private javax.swing.JLabel ver_contra4;
    // End of variables declaration//GEN-END:variables
}
