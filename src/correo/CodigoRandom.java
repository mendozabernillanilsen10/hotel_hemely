
package correo;

import java.util.Random;

public final class CodigoRandom {
    private int[]Numero;
    private char[]Letra;
    private int[]Indice;
    private char[]Caract;    
    private  String codigo;
    static CodigoRandom CodRd=null;
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public static CodigoRandom getCodigoRandom(){
        if(CodRd==null){
            CodRd= new CodigoRandom();
        }
        return CodRd;
    }
    public void GenerarCodigoVerificacion(){
    Numero= new int[6];
    Letra= new char[6];
    Caract= new char[6];
    Indice= new int[6];
    Random random = new Random();
    for (int i = 0; i < 6; i++) {
            Numero[i] = (int)(Math.random()*9+1); 
            Indice[i] = (int)(Math.random()*2+1); 
            Letra[i] = (char) (random.nextInt(26)+'A');
            if(Indice[i]==1){
                Caract[i]=(char)(Numero[i]+'0');
            }else 
                 Caract[i]= Letra[i];
        }
    String cd = String.valueOf(Caract);
    this.setCodigo(cd);
    }
    public String codigoIdTablas(){
     
    Numero= new int[8];
    Letra= new char[8];
    Caract= new char[8];
    Indice= new int[8];
    
    Random random = new Random();
        for (int i = 0; i < 8; i++) {
            Numero[i] = (int)(Math.random()*9+1); 
            Indice[i] = (int)(Math.random()*2+1); 
            Letra[i] = (char) (random.nextInt(26)+'A');
            if(Indice[i]==1){
                Caract[i]=(char)(Numero[i]+'0');
            }else 
                 Caract[i]= Letra[i];
        }
    String csd =   String.valueOf(Caract);
    codigo=csd;  

        return codigo;
    }
       
   //sipan5&+-UsS

    /*public void  Expiracion(){
        int minuto=60000;
        int i =    1*minuto;
         try {
                Thread.sleep(i);
                System.out.println("Su codigo expiro");
            this.setCodigo("");
            } catch (InterruptedException ex) {
                
            }
            
        
    }*/
}
