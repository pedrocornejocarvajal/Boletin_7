package Ejercicio6;

public class Horas {
    private int horas;
    private int minutos;
    private int segundos;

    public Horas(int hh, int mm, int ss){
        this.horas=hh;
        this.minutos= mm;
        this.segundos=ss;
    }

    public void muestraFecha(int segundos) {
        this.suma();
        System.out.println("la hora es: "+ this.horas+ ":"+ this.minutos +":"+ this.segundos);

    }

    private void suma() {
        this.segundos += 1;
        if (this.segundos>59) {
            this.segundos = 0;
            this.minutos += 1;
            if (this.minutos>59){
                this.minutos=0;
                this.horas +=1;
                if (this.horas>23) {
                    this.horas = 0;
                }
            }
        }
    }
}
