package Ejercicio1y2;

import java.util.Scanner;

public class Main {

    public static final String PEDIR_MARCA = "Introduzca la nueva marca del vehículo  \n" +
            "puede ser BMW, MERCEDES, AVENSIS, TOYOTA, SEAT, NISSAN, AUDI o cualquier otra";

    public static final String PEDIR_MATRICULA = "Introduzca la nueva matrícula del vehiculo ";

    public static void main(String[] args) {
        Vehiculo miVehiculo = new Vehiculo();
        String matricula;
        MarcaDeVehiculo marca2 = MarcaDeVehiculo.NO_CONOCIDA;
        Scanner teclado = new Scanner(System.in);

        System.out.println("objeto creado por defecto");
        System.out.println("Marca " + miVehiculo.getMarcaString() + " matricula " + miVehiculo.getMatricula());
        boolean correcto = true;
        try {
            marca2 = MarcaDeVehiculo.valueOf(pedir(teclado, PEDIR_MARCA).toUpperCase());
            matricula = pedir(teclado, PEDIR_MATRICULA).toUpperCase();

            miVehiculo.setMatriculaString(matricula.toUpperCase());
        } catch (Exception e) {
            System.out.println("marca no válida, cambio marca por NO CONOCIDA");
            marca2 = MarcaDeVehiculo.NO_CONOCIDA;
            correcto = false;
        }
        if (correcto) {
            miVehiculo.setMarca(marca2);
        }
        System.out.println("ahora mi vehiculo es: ");
        System.out.println("Marca " + miVehiculo.getMarca() + " matricula " + miVehiculo.getMatricula());

    }

    private static String pedir(Scanner sc, String loqueVasAPedir) {
        System.out.println(loqueVasAPedir);
        return sc.nextLine();
    }
}
