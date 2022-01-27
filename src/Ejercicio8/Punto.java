package Ejercicio8;
//Implementar una clase Punto cuyos datos miembros sean las coordenadas de un punto del plano. Estos datos
// han de ser privados. Para esta clase se piden los siguientes métodos y constructores:

public class Punto {
    private double x,y;
//El constructor Punto() recibe como argumento dos números reales, a y b, y construye un nuevo
// punto de la clase Punto cuyas coordenadas son a y b.

    public Punto (double a, double b){
        this.x = a;
        this.y = b;
    }
//Los métodos de acceso getX() y getY(), sin argumentos, que devuelven las coordenadas de un objeto Punto.

    public double getX(){
        return this.x;
    }
    public double gety(){
        return this.y;
    }
// Los métodos modificadores setX() y setY(), que reciben un argumento y modifican el valor de la correspondiente
// coordenada de un objeto Punto.
    public void setX(double a){
        this.x=a;
    }
    public void setY(double b){
        this.y=b;
    }
// El método igual(), que comprueba si un objeto de la clase Punto es igual a otro dado
// que se pasa como argumento.
    public boolean igual(Punto p){
        boolean resultado=false;
        if (this.x==p.x && this.y==p.y){
            resultado=true;
        }
        return resultado;
    }
//El método distancia(), sin argumentos, que calcula la distancia de un objeto de la
// clase Punto al origen de coordenadas.
//La distancia entre dos puntos es igual a la longitud del segmento que los une. Por lo tanto, en matemáticas,
// para determinar la distancia entre dos puntos diferentes se deben calcular los cuadrados de las diferencias
// entre sus coordenadas y luego hallar la raíz de la suma de dichos cuadrados.
// Dadas las coordenadas de dos puntos distintos:    A(x1,y1) y B(x2,y2)
// La fórmula de la distancia entre dos puntos es:
// d(A,B) = sqrt{(x2-x1)^2+(y2-y1)^2
    public double distanciaAlOrigen() {
        double resultado = Math.sqrt(Math.pow((this.x),2) + Math.pow((this.y),2));
        System.out.println("x al cuadrado es " + Math.pow((this.x),2));
        return resultado;
    }
//El método distancia(), que calcula la distancia de un objeto de la clase Punto a otro que se
// proporciona como argumento.
public double distanciaAlOrigen(Punto z) {
    double resultado = Math.sqrt(Math.pow((this.x-z.x),2) + Math.pow((this.y- z.y),2));
    return resultado;
}
public String toString(){
        String display;
        return display = "la cordenada X del punto es: "+this.x+ " la coordenada y del punto es:"+ this.y;
        }
}
