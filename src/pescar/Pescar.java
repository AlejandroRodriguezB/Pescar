/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pescar;

/**
 *
 * @author alumno
 */
public class Pescar {
    
    private static char[] frase;
    private static int pos = 0;
    
    public static void main(String[] args) {
        Pescar init = new Pescar();
        init.inicio();
    }

    private void inicio() {
        char opciones;
        String nombre;
        LT lector = new LT();
        mainMenu();
        opciones = lector.llegirCaracter();
        while (opciones != 's') {
            switch (opciones) {
                case '1':
                    System.out.print("Nombre de usuario:");
                    nombre = lector.llegirLinia();
                    //si existe error si no 

                    //System.out.print("Nombre de usuario creado");
                    mainMenu();
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

    public void mainMenu() {
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

    public boolean Comprobar() {
        
        return true;
    }
    
    public static char llegirCaracter() {
        return frase[pos++];
    }

}
