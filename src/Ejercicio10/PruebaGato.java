package Ejercicio10;

public class PruebaGato {
    public static void main(String[] args) {
        Gato migato1=new Gato("micifú", "gris", "siamés", 12);
        Gato migato2=new Gato("rufo", "crema", "angora",5);
        System.out.println("gatos ordenados por nombre ascendentemente");
        if (migato1.compareTo(migato2)<0) {
            System.out.println(migato1);
            System.out.println(migato2);
        }else{
            System.out.println(migato2);
            System.out.println(migato1);
        }
        System.out.println("\ngatos ordenados por edad ascendentemente");
        if (migato1.compareTo2(migato2)<0) {
            System.out.println(migato1);
            System.out.println(migato2);
        }else{
            System.out.println(migato2);
            System.out.println(migato1);
        }
    }
}
