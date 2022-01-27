package Ejercicio6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
//creamos el tipo fecha Gregorian para tomar la fecha del día
        GregorianCalendar fechaHoy = new GregorianCalendar();
        int segundos = 0;
//creamos la variable de teclado para recoger posteriormente el número de segundos
        Scanner teclado = new Scanner(System.in);
// swith para controlar si han introducido un valor válido de minutos
        boolean válido = false;
        while (!válido) {
//tomamos los minutos que nos indique el usuario

            try {
                System.out.println("introduzca los segundos, si no quiere, introduzca un 0");
                segundos = teclado.nextInt();
                if (segundos >= 0) {
                    válido = true;
                }
            } catch (Exception e) {
                System.out.println("valor de minutos no válido");
                teclado.nextLine();
            }
        }
// llamamos al constructor de la clase
        if (segundos > 0) {
            Horas fecha = new Horas(fechaHoy.get(Calendar.HOUR_OF_DAY), fechaHoy.get(Calendar.MINUTE),
                    fechaHoy.get(Calendar.SECOND));
            for (int i = 1; i <= segundos; i++) {
                fecha.muestraFecha(segundos);
            }

        }
    }
}