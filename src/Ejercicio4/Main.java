package Ejercicio4;

import org.w3c.dom.Text;

import java.util.Scanner;

public class Main {
    public static final String FALLO_ENTERO = "No se ha podido parsear entero";
    public static final String PEDIR_CADENA_P_F = "Introduce \n" +
            "1 -> Añadir cadena al final \n" +
            "2 -> Añadir cadena al principio";
    public static final String PEDIR_CADENA = "Introduce una cadena o caracter";
    public static final String PEDIR_NUMERO = "Introduce la cantidad máxima de caracteres que tendrá el String";


    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        String cadena = pedir(teclado, PEDIR_CADENA);

        int len = Integer.parseInt(pedir(teclado, PEDIR_NUMERO));


        Texto miTexto = new Texto(len);

        addTexto(teclado, miTexto, cadena);

        System.out.println("El resultado es: " + miTexto.getTexto().toString());
        System.out.println("El texto tiene: " + miTexto.contarVocales() + " vocales.");
    }







    private static String pedir(Scanner sc, String petision) {
        System.out.println(petision);
        return sc.nextLine();
    }

    private static void addTexto(Scanner sc, Texto miTexto, String cadena) {
        String eleccionC = pedir(sc, PEDIR_CADENA_P_F);
        int eleccion = 0;
        try {
            eleccion = Integer.parseInt(eleccionC);
        } catch (Exception e) {
            System.out.println(FALLO_ENTERO);
        }

        switch (eleccion) {
            case 1:
                miTexto.añadirCadenaFinal(cadena);
                break;
            case 2:
                miTexto.añadirCadenaPpio(cadena);
        }
    }
}
