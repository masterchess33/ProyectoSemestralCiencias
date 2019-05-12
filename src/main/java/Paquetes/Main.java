package Paquetes;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    /** Inicio del programa.
     * 
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Ingrese una operación");
        String operacion=recibirPalabra();
        Calculadora c = new Calculadora(operacion);
        Led l = new Led();
        c.ingresarOperacion();
        c.verificarOperaciones();
        c.setResultado();
        l.numeroAled(c.getResultado());



        /**
         * Led l=new Led();
         *         System.out.println("Ingrese un numero");
         *         String numero=recibirPalabra();
         *         l.numeroAled(numero);
         */

    }

    public static String recibirPalabra() {
    String num = " ";
    boolean estado = true;

    while (estado) {

        try {
            Scanner sc = new Scanner(System.in);

            num = sc.nextLine();
            estado = false;

        } catch (InputMismatchException e) {
            System.out.println("El caracter ingresado no es una palabra, intentelo nuevamente.");
            estado = true;
        }

    }
    return num;
}
}
