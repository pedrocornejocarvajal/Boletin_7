package Ejercicio3;


// la clase ENUM la he creado con una relación de transportes de menor a mayor rapidez

public class Transportes {
    public static final String ORDEN = " es el orden ";

    public static void main(String args[]) {
        Transporte t1, t2, t3, t4;
        t1 = Transporte.AVION;
        t2 = Transporte.BARCO;
        t3 = Transporte.AVION;


//mostramos el ordinal de cada elemento
        System.out.println(Transporte.COCHE.name() + ORDEN + Transporte.COCHE.ordinal());
        System.out.println(Transporte.BARCO.name() + ORDEN + Transporte.BARCO.ordinal());
        System.out.println(Transporte.CAMION.name() + ORDEN + Transporte.CAMION.ordinal());
        System.out.println(Transporte.AVION.name() + ORDEN + Transporte.AVION.ordinal());
/**
 * mostramos el valor de los transportes t1, t2 y t3 para ver cómo funciona valueOf y name() que es lo mismo
 * que toString()
 *
 */
        System.out.println("t1 es un " + Transporte.valueOf(t1.name()));
        System.out.println("t2 es un " + Transporte.valueOf(t2.toString()));
        System.out.println("t3 es un " + Transporte.valueOf(t3.name()));


/**
 * igual el transporte 3 al 4 para ver que se puedem igualar dos enum sin problemas
 */
        t4 = t3;
        System.out.println("transporte 3(AVIÓn) lo igual al  4");
        System.out.println(" el transporte 4 es = " + Transporte.valueOf(t4.name()));

//COMPARAMOS LOS MEDIOS DE TRANSPORTE
        if (t2.velocidad < t1.velocidad) {
            System.out.println(t2 + " es más lento que " + t1);
        }
        if (t1.compareTo(t2) > 0) {
            System.out.println(t1 + " es más rápido que " + t2);
        }
        if (t1.compareTo(t3) == 0) {
            System.out.println(t1 + " es igual de rápido que " + t3);
        }
    }
}


