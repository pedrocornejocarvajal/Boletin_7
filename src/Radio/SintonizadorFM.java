package Radio;

public class SintonizadorFM {
    /** tanto cada salto de frecuencia con los frecuencias máximas y mínimas son constantes finales de la clase
     * el unico atributo miembro es la frecuencia
      */
    static final double SALTO = 0.5;
    static final double FRECUENCIAMAX= 108;
    static final double FRECUENCIAMIN = 80;
    private double frecuencia;

    /**
     * constructor, el objeto lo creo con la frecuencia mínima
     */


    public SintonizadorFM(){
        this.frecuencia= FRECUENCIAMIN;
    }

    /**
     * cada vez que aumento el dial da un salto, si llego a la frecuencia máxima, cambio a la frecuencia mínima
     */
    public void up(){
        this.frecuencia += SALTO;
        if (this.frecuencia > FRECUENCIAMAX){
            this.frecuencia= FRECUENCIAMIN;
        }
    }

    /**
     * cada vez que disminuyo el díal, decremento un salto, si llego a la frecuencia mínima, cambio a la frecuencia
     * máxima
     */
        public void down(){
        this.frecuencia -= SALTO;
        if (this.frecuencia < FRECUENCIAMIN){
            this.frecuencia=FRECUENCIAMAX;
        }
    }
    public String toString(){
        String display;
        display = "la frecuencia actual es: "+ this.frecuencia;
        return display;
        }
    }

