package Ejercicio7;

import java.util.Scanner;


public class Main {
    public static final String PEDIR_F_A_M = "Introduzca la fraccion a multiplicar";
    public static final String MENU = "Elige:\n" +
            "1 -> Crear de nuevo \n" +
            "2 -> Multiplicar\n" +
            "3 -> Dividir\n" +
            "4 -> Simplificar Fraccion\n" +
            "5 -> Invertir Signo\n" +
            "0 -> Salir";
    public static final String ERROR_NUM = "Creo que eso no era un número";
    public static final String PEDIR_NUMERO = "Introduce un numero";
    public static final String PEDIR_NUMERADOR = "introduzca el numerador";
    public static final String PEDIR_DENOMINADOR = "introduzca un denominador distinto de 0";

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

// Creo mi fracción
        Fraccion fraccion = crearFraccion(sc);
        System.out.println("la fracción introducida es: ");
        System.out.println(fraccion);
        int eleccion = -1;
        do {
             eleccion = Integer.parseInt(pedir(sc, MENU));

            try {
                Fraccion fraccion2 = menu(sc, eleccion, fraccion);
                fraccion = fraccion2;
            } catch (Exception w) {
                System.out.println(ERROR_NUM);
            }
        }while(eleccion != 0);
//voy a multiplicar la fracción por 5


        /**
         //voy a dividir la fracción por 5
         miFraccion.dividirPor(5);
         System.out.println("divido por 5:");
         System.out.println(miFraccion);
         //voy a multiplicar la fracción por 3/5
         Fraccion miSegundaFraccion = new Fraccion(3,5);
         miFraccion.multiplicarPor(miSegundaFraccion);
         System.out.println("multiplico mi fracción por 3/5:");
         System.out.println(miFraccion);
         //voy a dividir  la fracción por 3/5
         miFraccion.dividirPor(miSegundaFraccion);
         System.out.println("divido mi fracción por 3/5:");
         System.out.println(miFraccion);
         //voy a invertir la fracción de signo
         miFraccion.invertirSigno();
         System.out.println("le cambio el signo");
         System.out.println(miFraccion);
         */

    }



    private static Fraccion crearFraccion(Scanner sc){

        int numerador, denominador;

            do {

                try {
                    numerador = Integer.parseInt(pedir(sc, PEDIR_NUMERADOR));
                denominador = Integer.parseInt(pedir(sc, PEDIR_DENOMINADOR));

            } catch (Exception w) {
                denominador = -1;
                numerador = 0;
            }
            } while (denominador < 0);

        Fraccion fr = new Fraccion(numerador, denominador);
        return fr;
    }





    private static Fraccion menu(Scanner sc, int eleccion, Fraccion fraccion) {

            switch (eleccion) {
                case 1 -> {
                    fraccion = crearFraccion(sc);
                    System.out.println("la fracción introducida es: ");
                    System.out.println(fraccion);
                }
                case 2 -> {
                    eleccionInternaMult(sc, fraccion);
                }
                case 3 -> {
                    eleccionInternaDiv(sc, fraccion);
                }
                case 4 -> {
                    System.out.println(simplificar(fraccion));
                }
                case 5 -> {
                    invertirSigno(fraccion);
                }


            }
            return fraccion;

    }


    /**
     *
     * @param fraccion
     * @return
     */
    private static Fraccion simplificar(Fraccion fraccion){
        fraccion.simplificar(fraccion);
        return fraccion;
    }


    /**
     *
     * @param sc
     * @param fr
     */
    private static void eleccionInternaDiv(Scanner sc, Fraccion fr){
        int eleccion;
        boolean salir = false;
        do {
            System.out.println("Multiplicar por: \n" +
                    "1 -> Numero\n" +
                    "2 -> Fraccion\n" +
                    "0 -> Salir" +
                    "");
            eleccion = Integer.parseInt(sc.nextLine());
            switch (eleccion) {
                case 1 -> {
                    dividirPorNumero(sc, fr);
                    salir = true;
                }
                case 2 -> {
                    dividirPorFraccion(sc,fr);
                    salir = true;
                }
                case 0 -> {
                    eleccion = 0;
                }
                default -> {
                    eleccion = -1;
                }
            }

        }while(eleccion != 0 && !salir);
    }


    /**
     *
     * @param sc
     * @param fraccion
     */
    private static void eleccionInternaMult(Scanner sc, Fraccion fraccion){
        int eleccion;
        boolean salir = false;
        do {
            System.out.println("Multiplicar por: \n" +
                    "1 -> Numero\n" +
                    "2 -> Fraccion\n" +
                    "0 -> Salir" +
                    "");
            eleccion = Integer.parseInt(sc.nextLine());
            switch (eleccion) {
                case 1 -> {
                    multiplicarPorNumero(sc, fraccion);
                    salir = true;
                }
                case 2 -> {
                    multiplicarPorFraccion(sc,fraccion);
                    salir = true;
                }
                case 0 -> {
                    eleccion = 0;
                }
                default -> {
                    eleccion = -1;
                }
            }

        }while(eleccion != 0 && !salir);
    }


    /**
     *
     * @param sc
     * @param fraccion
     */
    private static void multiplicarPorFraccion(Scanner sc, Fraccion fraccion){
        System.out.println(PEDIR_F_A_M);
        Fraccion fracMult = crearFraccion(sc);

        System.out.println(fracMult + " * " + fraccion + " = ");
        fraccion = fraccion.multiplicarPor(fracMult);
        System.out.println(fraccion);
    }


    /**
     *
     * @param sc
     * @param fraccion
     */
    private static void dividirPorFraccion(Scanner sc, Fraccion fraccion){
        System.out.println(PEDIR_F_A_M);
        Fraccion fracMult = crearFraccion(sc);
        System.out.print(fracMult + " : " + fraccion + " = ");
        fraccion.dividirPor(fracMult);
        System.out.println(fraccion);
    }

    /**
     *
     * Método que se encarga de pedir un dato por teclado al usuario
     *
     * @param sc - Scanner para peticion
     * @param petision - peticion a realizar
     * @return devol - cadena de resultado
     */
    private static String pedir(Scanner sc, String petision) {
        System.out.println(petision);
        String devol = sc.nextLine();
        return devol;
    }

    /**
     *
     * @param sc
     * @param miFraccion
     */
    private static void multiplicarPorNumero(Scanner sc, Fraccion miFraccion) {
        int mult = pedirNumero(sc);
        System.out.print(mult + " * " + miFraccion + " = ");
        miFraccion.multiplicarPor(mult);
        System.out.println(miFraccion);
    }


    /**
     *
     * @param sc
     * @return
     */
    private static int pedirNumero(Scanner sc){
        boolean salir = false;
        int res = 0;
        do {
            try {
                res = Integer.parseInt(pedir(sc, PEDIR_NUMERO));
                salir = true;
            } catch (Exception w) {
                System.out.println(ERROR_NUM);
            }
        } while (!salir);
        return res;
    }

    /**
     *
     * @param sc
     * @param fraccion
     */
    private static void dividirPorNumero(Scanner sc, Fraccion fraccion){
        int div = pedirNumero(sc);
        System.out.print(div + " / " + fraccion + " = ");
        fraccion.dividirPor(div);
        System.out.println(fraccion);
    }


    /**
     *
     * @param fraccion
     */
    private static void invertirSigno(Fraccion fraccion){
        fraccion.invertirSigno();
        System.out.println(fraccion);
    }

}
