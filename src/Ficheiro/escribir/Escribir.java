/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ficheiro.escribir;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Escribir {
    public static void main(String[] args) throws IOException {
        String ruta = "Users\\Ara\\Desktop\\proxectoPROGRAMACION/archivo.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("El fichero ya existía.");
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("Fichero creado.");
        }
        bw.close();
    }
}
