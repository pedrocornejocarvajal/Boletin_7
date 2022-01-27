package Ejercicio8;

public class PruebaPunto {
    public static void main (String args[]) {
//creo el punto
        Punto miPunto = new Punto(10, 20);
//display con toString
        System.out.println(miPunto);
//display con los getter
        System.out.println("la cordenada X del punto es: "+ miPunto.getX()+
                " la coordenada y del punto es:"+ miPunto.gety());
//calculo la distancia al origen
        System.out.println("la distancia del punto al origen es = "+ miPunto.distanciaAlOrigen());
//calculo la distancia del punto a otro que le paso de referencia
        System.out.println("la distancia de mi punto al punto (34,56) es = "
                + miPunto.distanciaAlOrigen(new Punto(34,56)));

    }
}
