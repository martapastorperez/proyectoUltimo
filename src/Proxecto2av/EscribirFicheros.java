
package Proxecto2av;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class EscribirFicheros extends Coleccion{
    
    
    
    public void escribirTexto(String nombreFichero){
         File fich;
         PrintWriter f = null;
        try{
            fich = new File (nombreFichero);
            f= new PrintWriter(fich);
            for(int i=0;i<super.tipo.size();i++){
              f.println(super.referencia.get(i)+ "," +super.tipo.get(i)+","+ super.talla.get(i)+ ","+Integer.parseInt(super.unidades.get(i).toString())+ ","+Float.parseFloat(super.precio.get(i).toString()));  
//          
            }
           
        }catch (FileNotFoundException ex){
            System.out.println("Error 4 " + ex.getMessage());  
        }
        finally{
            f.close();
        }      
}
}
