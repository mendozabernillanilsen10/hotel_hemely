
package correo;

import java.io.UnsupportedEncodingException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public final class EmailSender {
        private CodigoRandom Codex;
        private Properties props;
        private String CodigoC;
        private MensajesHtml sms;
        private String Destinatario="";
    
    public EmailSender(){
      props = new Properties();

        //props.setProperty("PI", "3.14");
        props.setProperty("mail.smtp.host", "smtp.gmail.com");
        props.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        // TLS si está disponible
        props.setProperty("mail.smtp.starttls.enable", "true");
        // Puerto de gmail para envio de correos
        props.setProperty("mail.smtp.port","587");
        // Nombre del usuario
        props.setProperty("mail.smtp.user", "Hotel Emely");
        // Si requiere o no usuario y passwoCodex para conectarse.
        props.setProperty("mail.smtp.auth", "true");
    }

    public void enviarCorreo(){
        Codex=CodigoRandom.getCodigoRandom();
        sms= new MensajesHtml ();
        Codex.GenerarCodigoVerificacion();
        CodigoC=Codex.getCodigo();
        
        // Nombre del host de correo, es smtp.gmail.com
        
        Session session = Session.getDefaultInstance(props);
        //session.setDebug(true);

        try {
            MimeMessage message = new MimeMessage(session);
            
            try {
               // Quien envia el correo de la EMPRESA
               message.setFrom(new InternetAddress("emelyhotel@gmail.com","Hotel Emely")); 
               
            } catch (UnsupportedEncodingException | MessagingException e) {
            }
            // A quien va dirigido CLIENTES
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(this.getDestinatario()));
            //---------------------------------------------------------------------------------------------------
            message.setSubject("Hotel Emely - Codigo de Verificacion");
            message.setText(sms.mensajeCodigo(Codex.getCodigo()),"ISO-8859-1","html");
            Transport t = session.getTransport("smtp");
            //Crear correo de empresa y colocar aca
            t.connect("emelyhotel@gmail.com", "todosunidos123");
            t.sendMessage(message,message.getAllRecipients());
            t.close();


        } catch (AddressException e) {
            //e.printStackTrace();
        } catch (MessagingException e) {
            //e.printStackTrace();
        }
    }
        public String getDestinatario() {
        return Destinatario;
    }

    public void setDestinatario(String Destinatario) {
        this.Destinatario = Destinatario;
    }

    public String getCodigoC() {
        return CodigoC;
    }
    
}
