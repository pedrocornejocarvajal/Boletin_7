package Radio;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main (String args[]){
        SintonizadorFM controlador = new SintonizadorFM();
//subimos el controlador
        System.out.println("subo el controlador");
        controlador.up();
        System.out.println(controlador);

//bajamos el controlador
        System.out.println("bajo el controlador");
        controlador.down();
        System.out.println(controlador);

//vuelvo a bajar el controlador
        System.out.println("bajo el controlador otra vez, se tiene que poner a la máxima frecuencia");
        controlador.down();
        System.out.println(controlador);
//subo el controlador por lo que se tiene que poner a valor mínimo
        System.out.println("subo el controlador, se tiene que poner a la mínima frecuencia");
        controlador.up();
        System.out.println(controlador);

    }
}
