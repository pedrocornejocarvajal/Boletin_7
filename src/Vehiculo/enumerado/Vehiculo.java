package Vehiculo.enumerado;

public class Vehiculo {
    /**
     * La clase vehículo tiene dos atributos, la marca que es un enum MarcaDeVehiculo y la matricula que es un
     * String
     */
    private MarcaDeVehiculo marca;
    private String matricula;

    //constructores

    /**
     * constructores por defecto. incluyo la impresión del resultado usando los métodos toString y name
     */

    public Vehiculo() {
        this.marca = MarcaDeVehiculo.NO_CONOCIDA;
        this.matricula = "";
//        System.out.println("el auto creado es de la marca");
//        System.out.println(marca.name());
//        System.out.println(marca.toString());
    }

    //getter and setter

    /**
     * incluyo un switch para validar la marca del coche que tengo que modificar
     * @param marca
     */
    public void setMarcaString(String marca) {
        switch (marca) {
            case "audi":
                this.marca = MarcaDeVehiculo.AUDI;
                break;
            case "bmw":
                this.marca = MarcaDeVehiculo.BMW;
                break;
            case "mercedes":
                this.marca = MarcaDeVehiculo.MERCEDES;
                break;
            case "avensis":
                this.marca = MarcaDeVehiculo.AVENSIS;
                break;
            case "toyota":
                this.marca = MarcaDeVehiculo.TOYOTA;
                break;
            case "seat":
                this.marca = MarcaDeVehiculo.SEAT;
                break;
            case "nissan":
                this.marca = MarcaDeVehiculo.NISSAN;
                break;
            default:
                this.marca = MarcaDeVehiculo.NO_CONOCIDA;
                break;
        }

    }

    public void setMatriculaString(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public String  getMarcaString() {

//        return marca.toString().toUpperCase();
       String s = marca.name().toUpperCase();
        return s;
    }

  /*  //ToString
    public String toString() {
        String resultado;
        return resultado = ( "el vehiculo de marca " + this.marca + " tiene la matricula " + this.matricula );
    }

   */

    /**
     * en este set no valido nada ya que el argumento es enum por lo que tiene un valor válido para la marca
     * del coche
     * @param marca
     */
    public void setMarca(MarcaDeVehiculo marca) {
        this.marca=marca;

    }
    public MarcaDeVehiculo getMarca() {
        return this.marca;

    }
}