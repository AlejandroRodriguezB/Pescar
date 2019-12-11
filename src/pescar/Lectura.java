/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pescar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;


/**
 *
 * @author AlejandroRodriguezB
 */
public class Lectura {
    private String nom;
    private FileReader fr;
    private BufferedReader br;

    public Lectura(String n) { // n es el nombre del fichero que queremos abrir
        
        FileReader input = null;
        try {
            input = new FileReader(n);
            int valor;
            valor = input.read();
            while (valor != -1) {
                char c = (char) valor;
                System.out.print(c);
                valor = input.read();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                input.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void abrir() {  // abro el fichero para leer
        
    }

    public char[] leerLinea() { // devolveis un array de char o un string y lo convertís después
        char [] res = null;
        
        return res;
    }

    public void cerrar() {

    }
    
    
}