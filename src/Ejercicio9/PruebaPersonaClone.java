package Ejercicio9;

public class PruebaPersonaClone {
    public static void main(String[] args) {
//clonamos superficialmente
    PersonaC personaC1 =new PersonaC("12334",34,"Pepe",new PesoAlturaC(45,180));
    PersonaC personaC2 = (PersonaC) personaC1.cloneSup();
        System.out.println("persona original = "+ personaC1.toString());
        System.out.println("persona clonada superficialmente = "+ personaC2.toString());
        System.out.println("\ncambiamos atributos al objeto clonado superficialmente");
        personaC2.setDni("555555");
        personaC2.setEdad(45);
        personaC2.setNombre("Juan");
        personaC2.getPesoAltura().setAltura(190);
        personaC2.getPesoAltura().setPeso(89);
        System.out.println("del objeto original solo se modifica el peso y la altura");
        System.out.println("persona original = "+ personaC1.toString());
        System.out.println("persona clonada = "+ personaC2.toString());

        PersonaC personaC3 = (PersonaC) personaC1.cloneDeep();
        System.out.println("\npersona original = "+ personaC1.toString());
        System.out.println("persona clonada profundamente = "+ personaC3.toString());
        System.out.println("\ncambiamos atributos al objeto clonado profundamente");
        System.out.println("del objeto original no debe cambiar nada");
        personaC3.setDni("666666");
        personaC3.setNombre("Manolo");
        personaC3.setEdad(55);
        personaC3.getPesoAltura().setAltura(150);
        personaC3.getPesoAltura().setPeso(55);
        System.out.println("persona original = "+ personaC1.toString());
        System.out.println("persona clonada = "+ personaC3.toString());
    }
}