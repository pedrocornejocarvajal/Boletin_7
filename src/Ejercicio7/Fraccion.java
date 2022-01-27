package Ejercicio7;

public class Fraccion {

    private int signo;
    private int numerador;
    private int denominador;

    //constructor
    public Fraccion(int numerador, int denominador) {
        this.signo = obtenerSigno (numerador,denominador);
        this.numerador = Math.abs(numerador);
        this.denominador = Math.abs(denominador);
    }
//calculo el signo de mi fracción
    public int obtenerSigno (int numerador, int denominador) {
        int resultado = 1;
        if (numerador < 0 || denominador < 0) {
            if (!( numerador < 0 && denominador < 0 )) {
                resultado = -1;
            }
        }
        return resultado;
    }
//método para multiplicar por un número
    public void multiplicarPor(int num) {
        this.numerador=this.numerador*Math.abs(num);
        if (num<0){
            this.signo *=-1;
        }
    }
//método para multiplicar por una fracción
    public void multiplicarPor(Fraccion f) {
        Fraccion f2= new Fraccion(Math.abs(this.numerador*f.numerador),Math.abs(this.denominador*f.denominador));
        f2.signo = obtenerSigno(f.numerador, f.denominador);
        f2=simplificar(f2);
        this.numerador=f2.numerador;
        this.denominador=f2.denominador;
        this.signo *= f2.signo;

        }
    public void dividirPor(int num) {
        this.numerador=this.numerador/Math.abs(num);
        if (num<0){
            this.signo *=-1;
        }

    }
    public void dividirPor(Fraccion f) {
        Fraccion f2= new Fraccion(Math.abs(this.numerador*f.denominador),Math.abs(this.denominador*f.numerador));
        f2.signo = obtenerSigno(f.numerador, f.denominador);
        f2=simplificar(f2);
        this.numerador=f2.numerador;
        this.denominador=f2.denominador;
        this.signo *= f2.signo;

    }
    public Fraccion simplificar (Fraccion f){
        Fraccion f2= new Fraccion(f.numerador,f.denominador);
        for (int i = 2; i<=Math.min(f.numerador, f.denominador);i++) {
            if (( f.numerador % i == 0 ) && ( f.denominador % i == 0 )) {
                f.numerador /= i;
                f.denominador /= i;
            }
        }
        f2.denominador= f.denominador;
        f2.numerador= f.numerador;
        return f2;
    }

    public void invertirSigno() {
        this.signo *= -1;
    }

    public String toString(){
        String resultado;
        char signo=' ';
        if (this.signo== 1)
        {
            signo = '+';
        }
        else
        {signo = '-';
        }

        resultado=("La fracción es: " + signo + this.numerador + "/ "+ this.denominador);
        return resultado;

    }
}