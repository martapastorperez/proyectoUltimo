
package Proxecto2av;

import java.util.ArrayList;


public class Coleccion {//quitei abstract class e comentei os metodos abstractos
    ArrayList tipo;//tipo de prenda
    ArrayList referencia;//referencia da prenda
    ArrayList talla;
    ArrayList unidades;
    ArrayList precio;
   
    public Coleccion() {
    }

    public Coleccion(ArrayList tipo, ArrayList referencia, ArrayList talla, ArrayList unidades, ArrayList precio) {
        this.tipo = tipo;
        this.referencia = referencia;
        this.talla = talla;
        this.unidades = unidades;
        this.precio = precio;
    }

    public ArrayList getTipo() {
        return tipo;
    }

    public void setTipo(ArrayList tipo) {
        this.tipo = tipo;
    }

    public ArrayList getReferencia() {
        return referencia;
    }

    public void setReferencia(ArrayList referencia) {
        this.referencia = referencia;
    }

    public ArrayList getTalla() {
        return talla;
    }

    public void setTalla(ArrayList talla) {
        this.talla = talla;
    }

    public ArrayList getUnidades() {
        return unidades;
    }

    public void setUnidades(ArrayList unidades) {
        this.unidades = unidades;
    }

    public ArrayList getPrecio() {
        return precio;
    }

    public void setPrecio(ArrayList precio) {
        this.precio = precio;
    }
    
    

    

}
