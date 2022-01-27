package Textos;

public class Main {

    public static void main (String args[]){
/**
 * Creo una texto de 20 de longitud y voy añadiendo contendo hasta que formo la frase "hola, ¿qué tal está?
 * finalmente cuento las vocales que tiene el texto
 *
 */
        System.out.println("voy a crear un objeto texto de longitud 20 y como cadena de inicio" +
                "¿qué tal está");
        System.out.println("luego le añado la cadena 'ola' al principio, posteriormente le añado 'H' y al final" +
                " le añado '?'");
        System.out.println("Por último cuento las vocales");
        Texto miTexto = new Texto(20);
//Añado un texto al final, si Ok, añado el comienzo del texto
        if (miTexto.añadirCadenaFinal("¿qué tal está")){
            if (miTexto.añadirCadenaPpio("ola,")){
                if (miTexto.añadirCaracterPpio('H')){
                    miTexto.añadirCaracterFinal('?');
                }
            }
        }
//cuanto las vocales que tiene mi texto
        System.out.println("El resultado es: "+ miTexto.getTexto().toString());
        System.out.println("El texto tiene: "+ miTexto.contarVocales()+" vocales.");
    }
}
