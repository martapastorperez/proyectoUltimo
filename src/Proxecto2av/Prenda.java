
package Proxecto2av;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class Prenda extends Coleccion{
     public Prenda() {
    }

    public Prenda(ArrayList tipo, ArrayList referencia, ArrayList talla, ArrayList unidades, ArrayList precio) {
        super(tipo, referencia, talla, unidades, precio);
       
    }

    @Override
    public void ponerTipo(String tipo) {
        super.tipo.add(tipo);
    }

    @Override
    public void ponerRef(String referencia) {
        super.referencia.add(referencia);
    }

    @Override
    public void ponerTalla(String talla) {
        super.talla.add(talla);
    }

    @Override
    public void ponerUnidades(int unidades) {
        super.unidades.add(unidades);
    }

    @Override
    public void ponerPrecio(float precio) {
        super.precio.add(precio);
    }

    @Override
    public void borrarTipo(String tipo) {
        super.tipo.remove(super.tipo.indexOf(tipo));
    }

    @Override
    public void borrarRef(String referencia) {
        super.referencia.remove(super.referencia.indexOf(referencia));
    }

    @Override
    public void borrarTalla(String talla) {
        super.talla.remove(super.talla.indexOf(talla));
    }

    @Override
    public void borrarUnidades(int unidades) {
        super.unidades.remove(super.unidades.indexOf(unidades));
    }

    @Override
    public void borrarPrecio(float precio) {
        super.precio.remove(super.precio.indexOf(precio));
    }

    @Override
    public String buscarTipo(String tipo) {
        String buscartipo="";
        if(super.tipo.contains(tipo)==true){
            buscartipo=super.tipo.get(super.tipo.indexOf(tipo)).toString();
        }else{
            buscartipo="Esta prenda no existe.";
        }
        return buscartipo;
    }

    @Override
    public int buscarRef(String referencia) {
        int buscarref;
        if(super.referencia.contains(referencia)==true){
            buscarref=(super.referencia.indexOf(referencia));
        }else{
            buscarref=-1;
        }
        return buscarref;
    }

    @Override
    public String buscarTalla(String talla) {
        String buscartalla="";
        if(super.talla.contains(talla)==true){
            buscartalla=super.talla.get(super.talla.indexOf(talla)).toString();
        }else{
            buscartalla="Esta prenda no existe.";
        }
        return buscartalla;
    }

    @Override
    public int buscarUnidades(int unidades) {
        int buscarUni=0;
        if(super.unidades.contains(unidades)==true){
            buscarUni=Integer.parseInt(super.unidades.get(super.unidades.indexOf(unidades)).toString());
        }else{
            buscarUni=0;
        }
        return buscarUni;
        
    }

    @Override
    public float buscarPrecio(float precio) {
        float buscarPrecio=0;
        if(super.precio.contains(precio)==true){
            buscarPrecio= Float.parseFloat(super.precio.get(super.precio.indexOf(precio)).toString());
        }else{
            buscarPrecio=0;
        }
        return buscarPrecio;
    }
     @Override
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
              f.println("Referencia: " + super.referencia.get(i)+ " Tipo de prenda:  " +super.tipo.get(i)+ " Talla: " + super.talla.get(i)+ " Unidades disponibles: "+Integer.parseInt(super.unidades.get(i).toString())+ " Precio:  "+Float.parseFloat(super.precio.get(i).toString())+ "€");  
//              
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
