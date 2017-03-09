
package Proxecto2av;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class LeerFicheros extends Prenda {
       public void leerLineas() throws FileNotFoundException, IOException{
        String s1;
        String s2;
 
        // Cargamos el buffer con el contenido del archivo
        BufferedReader br = new BufferedReader (new FileReader ("Proyecto.txt"));
 
        // Leemos la primera linea
        do{
        s1 = br.readLine();
        if(s1!=null){
            StringTokenizer st = new StringTokenizer(s1,",");
            System.out.println ("En stock: " + s1);
            while (st.hasMoreTokens()){
                ponerRef(st.nextToken());
                ponerTipo(st.nextToken());
                ponerTalla(st.nextToken());
                ponerUnidades(Integer.parseInt(st.nextToken()));
                ponerPrecio(Float.parseFloat(st.nextToken()));
            }
                
        }
        }
        while(s1!=null);

 
}
    
}
