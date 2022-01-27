package EjercicioJoseMaria;


public class ClaseEjemploNB {

    public static void main(String[] args) throws CloneNotSupportedException {

        Alumno juanjo = new Alumno("Juanjo", 20, 1, false);
        Alumno juanjo2 = new Alumno("Juanjo", 20, 1, false);
        Alumno santi = new Alumno("Santi", 18, 1, false);
        Alumno nadine = new Alumno("Nadine", 20, 1, false);
        Alumno george = new Alumno("George", 21, 2, true);
        Alumno pedro = new Alumno("Pedro", 18, 1, true);

        System.out.println("PRUEBA DE METODOS:");
        System.out.println("");
        System.out.println("Hash de juanjo: \t" + juanjo.hashCode());
        System.out.println("Hash de juanjo2: \t" + juanjo2.hashCode());
        System.out.println("Hash de santi: \t\t" + santi.hashCode());
        System.out.println("Hash de nadine: \t" + nadine.hashCode());
        System.out.println("Hash de george: \t" + george.hashCode());
        System.out.println("Hash de pedro: \t\t" + pedro.hashCode());

        System.out.println("");
        /*
        System.out.println("_________________________________________________________________");
        System.out.println("Pruebas de equals:");
        System.out.print("Juanjo y juanjo2 ");
        if (juanjo.equals(juanjo2)) {
            System.out.println("son iguales");
        } else {
            System.out.println("no son iguales");
        }

        System.out.print("Santi y george ");
        if (santi.equals(george)) {
            System.out.println("son iguales");
        } else {
            System.out.println("no son iguales");
        }

        System.out.print("Juanjo y Nadine ");
        if (juanjo.equals(nadine)) {
            System.out.println("son iguales");
        } else {
            System.out.println("no son iguales");
        }

        System.out.println("");

        System.out.println("_________________________________________________________________");
        System.out.println("Estos alumnos son clones");
        Alumno delegada = nadine.clone();

        System.out.print("Nadine y delegada ");
        if (nadine.equals(delegada)) {
            System.out.println("son iguales");
        } else {
            System.out.println("no son iguales");
        }

        System.out.println("");

        System.out.println("_________________________________________________________________");
        System.out.println("toString():");
        System.out.println(juanjo.toString());
        System.out.println("");
        System.out.println(juanjo2.toString());
        System.out.println("");
        System.out.println(santi.toString());
        System.out.println("");
        System.out.println(nadine.toString());
        System.out.println("");
        System.out.println(george.toString());
        System.out.println("");
        System.out.println(pedro.toString());
        System.out.println("");
        System.out.println(delegada.toString());

        System.out.println("");

        System.out.println("_________________________________________________________________");
        System.out.println("El metodo compareTo() muestra:");
        System.out.println("\t 1 -> Si un alumno es más valioso o tiene más edad\n" +
                            "\t 0 -> Si ambos alumnos son iguales\n" +
                            "\t-1 -> Si el alumno tiene menos edad o es menos valioso (o si es Pedro)\n");

        System.out.println("Juanjo contra Santi: "+juanjo.compareTo(santi));
        System.out.println("Nadine contra George: "+nadine.compareTo(george));
        System.out.println("Juanjo contra Nadine: "+juanjo.compareTo(nadine));
        System.out.println("George contra Pedro: "+george.compareTo(pedro));
        System.out.println("Santi contra Pedro: "+santi.compareTo(pedro));
        System.out.println("Pedro contra delegada: "+pedro.compareTo(delegada));


        System.out.println("_________________________________________________________________");
        System.out.println("");
        System.out.println("_________________________________________________________________");
        ProductosCovid19 mascarilla = new ProductosCovid19("2347824", "mascarilla", 2030, 8, 12, 1.20f);
        ProductosCovid19 vacuna = new ProductosCovid19("4456781", "vacuna", 2021, 6, 1, 248.478874f);
        ProductosCovid19 respirador = new ProductosCovid19("1234567", "respirador",2050, 12, 31,  4784f);

        System.out.println("");
        System.out.println("toString de ProductosCovid:");
        System.out.println(mascarilla.toString());
        System.out.println("");
        System.out.println(vacuna.toString());
        System.out.println("");
        System.out.println(respirador.toString());

        System.out.println("_________________________________________________________________");
        System.out.println("");
        System.out.println("Prueba clone en profundidad:");
        ProductosCovid19 FFP2 = mascarilla.clone();
        System.out.println("Creamos el objeto FFP2");
        System.out.println(FFP2.toString());
        mascarilla.setFechaCaducidad(new GregorianCalendar(2025, 8, 12));
        System.out.println("");
        System.out.println("Tras modificar la fecha de mascarilla vemos que solo cambia la de esta");
        System.out.println(mascarilla.toString());
        System.out.println("");
        System.out.println(FFP2.toString());
        System.out.println("");

        System.out.println("_________________________________________________________________");
        System.out.println("Prueba clone superficial (poco util, no recomendable):");
        ProductosCovid19 vacunaInglesa = vacuna.cloneSuperficial();
        System.out.println("Creamos el objeto vacunaInglesa");
        System.out.println(vacunaInglesa.toString());
        vacuna.setNombre("LaVacuna");
        vacunaInglesa.incrementarFecha(4);
        System.out.println("");
        System.out.println("Tras modificar la fecha y el nombre observamos que ambos modifican su fecha de caducidad");
        System.out.println(vacuna.toString());
        System.out.println("");
        System.out.println(vacunaInglesa.toString());

        /*

        */
    }

}

