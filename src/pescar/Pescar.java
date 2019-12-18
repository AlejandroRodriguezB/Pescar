/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pescar;

/**
 *
 * @author Alex y Manu
 */
public class Pescar {
    
    private static char[] frase;
    private static int pos = 0;
    LT lector = new LT();
    
    
    public static void main(String[] args) {
        Pescar init = new Pescar();
        init.inicio();
    }

    private void inicio() {   
        char opciones;
        mainMenu();
        opciones = lector.llegirCaracter();
        while (opciones != 's') {
            switch (opciones) {
                case '1':
                    altaUsario();
                    opciones = lector.llegirCaracter();
                    break;
                case '2':

                    mainMenu();
                    opciones = lector.llegirCaracter();
                    break;
                case '3':

                    mainMenu();
                    opciones = lector.llegirCaracter();
                    break;
                case '4':

                    break;
                case '5':

                    break;
                default:
                    System.out.println("Carácter no válido");
                    mainMenu();
                    opciones = lector.llegirCaracter();

            }
        }
    }

    private void mainMenu() {
        System.out.println("**************************************");
        System.out.println("*   Bienvenido al programa de pesca  *");
        System.out.println("*            Main Menu               *");
        System.out.println("**************************************");
        System.out.println("* 1) Alta de un Usuario              *");
        System.out.println("* 2) Baja de un Usuario              *");
        System.out.println("* 3) Pescar en una pesquera          *");
        System.out.println("* 4) Estadísticas de los Usuarios    *");
        System.out.println("* 5) Estadísticas globales           *");
        System.out.println("* s) Exit                            *");
        System.out.println("**************************************");
        System.out.print("OPCIÓN?");

    }

    
    public static char llegirCaracter() {
        return frase[pos++];
    }
    
    private void altaUsario(){
        String nombre;
        char fr;
        System.out.print("Nombre de usuario:");
        nombre = lector.llegirLinia();
        Lectura f = new Lectura("user1.txt");
        try{
            f.abrir();
            f.leerLinea();
            
            f.cerrar();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                f.cerrar();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
   

        //System.out.print("Nombre de usuario creado");
        mainMenu();
    }

}
