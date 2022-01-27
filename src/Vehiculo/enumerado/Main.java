package Vehiculo.enumerado;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        Vehiculo miVehiculo = new Vehiculo();
        String marca, matricula;
        MarcaDeVehiculo marca2= MarcaDeVehiculo.NO_CONOCIDA;
        Scanner teclado = new Scanner(System.in);

        System.out.println("objeto creado por defecto");
        System.out.println("Marca " + miVehiculo.getMarcaString() + " matricula " + miVehiculo.getMatricula() );
/**
 * le cambio la marca y la matricula a mi coche pidiéndola por consola usando un String por lo que al "setear"
 * la marca tendo que usar el método setMarcaString para validar que es un valor válido
 */
        System.out.println("Introduzca la nueva marca del vehículo  ");
        System.out.println("puede ser BMW, MERCEDES, AVENSIS, TOYOTA, SEAT, NISSAN, AUDI o cualquier otra");
        marca=teclado.nextLine();
        miVehiculo.setMarcaString(marca.toLowerCase());

        System.out.println("Introduzca la nueva matrícula del vehiculo ");
        matricula=teclado.nextLine();
        miVehiculo.setMatriculaString(matricula.toUpperCase());

        System.out.println("ahora mi vehiculo es: ");
        System.out.println("Marca " + miVehiculo.getMarcaString() + " matricula " + miVehiculo.getMatricula() );
/**
 * ahora voy a podir de nueva lo marca del coche pero con un enum, por lo que tengo que usar try/catch por
 * si introduzco un valor no válido,
  */
        boolean correcto=true;
        System.out.println("cambiamos de nuevo la marca pero esta vez capturamos un enum");
//hago lo mismo pero usando el enumerado como parámetro y le pongo a cascoporro que es un Seat
        try {
            System.out.println("introduzca de nuevo otra marca");
            marca2 =MarcaDeVehiculo.valueOf(teclado.nextLine().toUpperCase());
        }
        catch (Exception e){
// capturo el error, como la marca no es válida, la cambio a no conocida y cambio el switch correcto a false
            System.out.println( "marca no válida, cambio marca por NO CONOCIDA");
            marca2=MarcaDeVehiculo.NO_CONOCIDA;
            correcto=false;

        }
        if (correcto){
        miVehiculo.setMarca(marca2);}
        System.out.println("ahora mi vehiculo es: ");
        System.out.println("Marca " + miVehiculo.getMarca() + " matricula " + miVehiculo.getMatricula() );

    }}
