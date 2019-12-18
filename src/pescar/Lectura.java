/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pescar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 *
 * @author AlejandroRodriguezB
 */
public class Lectura {
    private String name;
    private FileReader fr;
    private BufferedReader br;

    public Lectura(String n) { 
        name = n;
    }

    public void abrir() throws FileNotFoundException {  // abro el fichero para leer
        fr= new FileReader(name);
        br= new BufferedReader(fr);   
    }

public char[] leerLinea() throws IOException { // devolveis un array de char o un string y lo convertís después
        
        return br.readLine().toCharArray();
    }

    public void cerrar() throws IOException {
        br.close();
        fr.close();
    }
    
    
}
