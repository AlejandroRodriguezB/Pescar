/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pescar;
import java.io.File;
/**
 *
 * @author alumno
 */
public class RenombrarFichero {
    //borrar() dar de baja
    public void inicio(){
        File original = new File("FicheroOriginal.txt");
        original.delete();
        File nuevo = new File("FicheroNuevo.txt");
        nuevo.renameTo(original);
    }
}
