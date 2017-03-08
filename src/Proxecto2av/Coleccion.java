
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
    
    

    
//    //métodos para meter info
//    public abstract void ponerTipo(String tipo);
//    public abstract void ponerRef(String referencia);
//    public abstract void ponerTalla(String talla);
//    public abstract void ponerUnidades(int unidades);
//    public abstract void ponerPrecio(float precio);
//    //metodos para borrar
//    public abstract void borrarTipo(String tipo);
//    public abstract void borrarRef(String referencia);
//    public abstract void borrarTalla(String talla);
//    public abstract void borrarUnidades(int unidades);
//    public abstract void borrarPrecio(float precio);
//    //metodos buscar
//    public abstract String buscarTipo(String tipo);
//    public abstract int buscarRef(String referencia);
//    public abstract String buscarTalla(String talla);
//    public abstract int buscarUnidades(int unidades);
//    public abstract float buscarPrecio(float precio);
//    //metodo mostrar
//    public abstract void mostrar(int indice);
}
