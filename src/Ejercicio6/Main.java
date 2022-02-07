package Ejercicio6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
public static final String PEDIR_SEG = "introduzca los segundos, si no quiere, introduzca un 0";
    public static void main(String args[]) {
//creamos el tipo fecha Gregorian para tomar la fecha del día
        int segundos = -1;
        GregorianCalendar fechaHoy = generarCalendario();
//creamos la variable de teclado para recoger posteriormente el número de segundos
        Scanner teclado = new Scanner(System.in);
// swith para controlar si han introducido un valor válido de minutos
        boolean válido = true;

//tomamos los minutos que nos indique el usuario
do {
    try {
        segundos = Integer.parseInt(pedir(teclado, PEDIR_SEG));
        if (segundos >= 0) {

        }
    } catch (Exception e) {
        System.out.println("valor de minutos no válido");
        teclado.nextLine();
        válido = false;
    }

}while (!válido);
// llamamos al constructor de la clase
construirHoras(segundos, fechaHoy);
    }




    private static Horas construirHoras(int segundos, GregorianCalendar fechaHoy){
        Horas fecha = null;
        if (segundos > 0) {
             fecha = new Horas(fechaHoy.get(Calendar.HOUR_OF_DAY), fechaHoy.get(Calendar.MINUTE),
                    fechaHoy.get(Calendar.SECOND));
            for (int i = 1; i <= segundos; i++) {
                fecha.muestraFecha(segundos);
            }

        }
        return fecha;
    }


    private static String pedir(Scanner sc, String petision){
        System.out.println(petision);
        return sc.nextLine();
    }


    private static GregorianCalendar generarCalendario(){
        GregorianCalendar fechaHoy = new GregorianCalendar();
        return fechaHoy;
    }
}