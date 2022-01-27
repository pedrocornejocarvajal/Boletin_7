package Ejercicio7;

import java.util.Scanner;

public class PruebaFraccion {
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        int numerador, denominador;

        System.out.println("introduzca el numerador");
        numerador= teclado.nextInt();

        System.out.println("introduzca el denominador distinto de 0");
        denominador= teclado.nextInt();

        while (denominador ==0){
            System.out.println("introduzca  el denominador distinto de 0");
            denominador= teclado.nextInt();
        }
// Creo mi fracción
        Fraccion miFraccion = new Fraccion(numerador,denominador);
        System.out.println("la fracción introducida es: ");
        System.out.println(miFraccion);
//voy a multiplicar la fracción por 5
        miFraccion.multiplicarPor(-5);
        System.out.println("multiplico por -5:");
        System.out.println(miFraccion);

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

    }
}
