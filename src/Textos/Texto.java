package Textos;

//enum Vocales {a,e,i,o,u,á, é, í, ó,ú,ü}

public class Texto {
    /**
     * variable estática con todas las vocales posibles
      */
    static final String VOCALES ="aeiouáéíóúü";
//la declaramos final para que no varíe el tamaño una vez que lo hayamos declarado
    private final int tamañoMax;
    private String texto="";

     //Constructor con longitud del texto
    public Texto (int tamañoMax){
        this.texto="";
        this.tamañoMax= tamañoMax;
    }
    //método getter
    public String getTexto(){
        return this.texto;
    }
    /**
     * método para añadir un carácter al inicio de la cadena si hay espacio
     * precondicion: ninguna
     * postcondicion. si el tamaño del texto es el máximo, no se puede añadir el carácter
     * @param c. caracter a incluir al principio de la cadea
     * @return booleano indicando si se ha podido realizar la acción
     * el método compruebaa que la longitud del texto es menor al máximo y le añade el carácter
     */
        public boolean añadirCaracterPpio(char c){
        boolean resultado=false;
        if (this.texto.length()<this.tamañoMax) {
            this.texto = c + this.texto;
            resultado=true;
        }
        return resultado;
    }

    /**
     * método para añadir un carácter al final de la cadena si hay espacio
     * precondicion: ninguna
     * postcondicion. si el tamaño del texto es el máximo, no se puede añadir el carácter
     * @param c. caracter a incluir al final de la cadea
     * @return booleano indicando si se ha podido realizar la acción
     * el método compruebaa que la longitud del texto es menor al máximo y le añade el carácter
     *
     */
        public boolean añadirCaracterFinal(char c){
        boolean resultado=false;
        if (this.texto.length()<this.tamañoMax) {
            this.texto = this.texto + c;
            resultado=true;
        }
        return resultado;
    }
    //añadir una cadena al principio si hay espacio
    public boolean añadirCadenaPpio(String cadena){
        boolean resultado=false;
        if ((this.texto.length()+ cadena.length())<this.tamañoMax) {
            this.texto = cadena+ this.texto;
            resultado=true;
        }
        return resultado;
    }
    //añadir una cadena al final si hay espacio
    public boolean añadirCadenaFinal(String cadena){
        boolean resultado=false;
        if ((this.texto.length()+ cadena.length())<this.tamañoMax) {
            this.texto = this.texto + cadena;
            resultado=true;
        }
        return resultado;
    }

//Contar cuántas vocales hay en el texto.

    public int contarVocales() {
        int resultado = 0;
        for (int i = 0; i < this.texto.length(); i++) {
            if (esVocal(this.texto.charAt(i))) {
                resultado++;
            }
              }
        return resultado;
    }
public boolean esVocal(char c){
        c=Character.toLowerCase(c);
        boolean resultado = false;
        if (VOCALES.indexOf(c)!=-1){
            resultado=true;
         }
        Character caracter=c;

        return resultado;

}

}
