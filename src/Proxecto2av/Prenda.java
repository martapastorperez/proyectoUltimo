
package Proxecto2av;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;






public class Prenda extends Coleccion{
     public Prenda() {
    }

    public Prenda(ArrayList <String> tipo, ArrayList <String> referencia, ArrayList <String> talla, ArrayList <Integer> unidades, ArrayList <Float> precio) {
        super(tipo, referencia, talla, unidades, precio);
       
    }

   
    public void ponerTipo(String tipo) {
        super.tipo.add(tipo);
    }

    
    public void ponerRef(String referencia) {
        super.referencia.add(referencia);
    }

   
    public void ponerTalla(String talla) {
        super.talla.add(talla);
    }

   
    public void ponerUnidades(int unidades) {
        super.unidades.add(unidades);
    }

    
    public void ponerPrecio(float precio) {
        super.precio.add(precio);
    }

    
    public void borrarTipo(String tipo) {
        super.tipo.remove(tipo);
    }

    
    public boolean borrarRef(String referencia) {
      int indice=buscarRef(referencia);
      if(indice<0){
          return false;
      }else{
          super.tipo.remove(indice);
          super.talla.remove(indice);
          super.unidades.remove(indice);
          super.precio.remove(indice);
          super.referencia.remove(indice);
          return true;
      }
    
    }

  //metodo para que devolva o indice onde esta a palabra
    public int buscarTipo(String tipo) {
        int buscartipo;
        if(super.tipo.contains(tipo)==true){
            buscartipo=(super.tipo.indexOf(tipo));
        }else{
            buscartipo=-1;
        }
        return buscartipo;
    }

    
    public int buscarRef(String referencia) {
        int buscarref;
        if(super.referencia.contains(referencia)==true){
            buscarref=(super.referencia.indexOf(referencia));
        }else{
            buscarref=-1;
        }
        return buscarref;
    }

   
    public int buscarTalla(String talla) {
        int buscartalla;
        if(super.talla.contains(talla)==true){
            buscartalla=super.talla.indexOf(talla);
        }else{
            buscartalla=-1;
        }
        return buscartalla;
    }

   
    public int buscarUnidades(int unidades) {
        int buscarUni=0;
        if(super.unidades.contains(unidades)==true){
            buscarUni=super.unidades.indexOf(unidades);
        }else{
            buscarUni=-1;
        }
        return buscarUni;
        
    }

    
    public float buscarPrecio(float precio) {
        float buscarPrecio=0;
        if(super.precio.contains(precio)==true){
            buscarPrecio= super.precio.indexOf(precio);
        }else{
            buscarPrecio=-1;
        }
        return buscarPrecio;
    }
    public void mostrar(int indice){
        if(indice<0){
            System.out.println("No existe la prenda.");
        }else{
            
            System.out.println(super.referencia.get(indice)+ ", " + super.tipo.get(indice)+ ", "+super.talla.get(indice)+", "+ Integer.parseInt(super.unidades.get(indice).toString())+ ", " + Float.parseFloat(super.precio.get(indice).toString()));
        }
        
     
    }
    

    public void escribirTexto(String nombreFichero){
         File fich;
         PrintWriter f = null;
        try{
            fich = new File (nombreFichero);
            f= new PrintWriter(fich);
            for(int i=0;i<super.tipo.size();i++){
              f.println(super.referencia.get(i)+ "," +super.tipo.get(i)+","+ super.talla.get(i)+ ","+Integer.parseInt(super.unidades.get(i).toString())+ ","+Float.parseFloat(super.precio.get(i).toString()));  
          
            }
           
        }catch (FileNotFoundException ex){
            System.out.println("Error 4 " + ex.getMessage());  
        }catch(IndexOutOfBoundsException ex){
            System.out.println("Error 5: "+ ex.getMessage());
        }
        finally{
            f.close();
        }      
}

        public void leerLineas() throws FileNotFoundException, IOException{
        String s1;
        String s2;
 
        
        BufferedReader br = new BufferedReader (new FileReader ("Proyecto.txt"));
 
       
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
