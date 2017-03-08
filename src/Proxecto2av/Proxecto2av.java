
package Proxecto2av;

import java.util.ArrayList;


public class Proxecto2av {

    
    public static void main(String[] args) {
        ArrayList tipo=new ArrayList();
        
        ArrayList referencia=new ArrayList();//referencia da prenda
        ArrayList talla=new ArrayList();
        ArrayList unidades=new ArrayList();
        ArrayList precio=new ArrayList();

        Prenda pren=new Prenda(tipo,referencia, talla,unidades, precio);
        pren.ponerTipo("pantalon");
        pren.ponerRef("122");
        pren.ponerPrecio(12.78F);
        pren.ponerTalla("S");
        pren.ponerUnidades(4);
        pren.ponerTipo("falda");
        pren.ponerRef("123");
        pren.ponerPrecio(12.78F);
        pren.ponerTalla("S");
        pren.ponerUnidades(4);
        
        //System.out.println(pren.buscarRef("123")+ ", "+ pren.buscarTipo("pantalon"));
        //pren.borrarTipo("falda");
        //System.out.println(pren.buscarTipo("falda"));
        pren.mostrar(pren.buscarRef("123"));
        
        pren.escribirTexto("proyecto.txt");
        
    }
    
}
