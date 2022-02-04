package ejercicio9;

public class PersonaC implements Cloneable{

    private String nombre;
    private int edad;
    private PesoAlturaC pesoAlturaC;

    // Metodo constructor con parametros.
    public PersonaC(String nombre, int edad, PesoAlturaC pesoAlturaC) {
        this.nombre = nombre;
        this.edad = edad;
        this.pesoAlturaC = pesoAlturaC;
    }

    // Metodo constructor por defecto.

    public PersonaC() {
    }

    // Metodo constructor de copia.
    public PersonaC(PersonaC personaC) {
        this.nombre = personaC.nombre;
        this.edad = personaC.edad;
        this.pesoAlturaC = personaC.pesoAlturaC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public PesoAlturaC getPesoAlturaC() {
        return pesoAlturaC;
    }

    public void setPesoAlturaC(PesoAlturaC pesoAlturaC) {
        this.pesoAlturaC = pesoAlturaC;
    }

    public Object clone(){

        PersonaC obj = null;
        try{
            obj = (PersonaC) super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println("No se puede duplicar");
        }
        obj.pesoAlturaC = (PesoAlturaC) obj.pesoAlturaC.clone();
        return obj;
    }

    public Object cloneSuperficial(){

        PersonaC obj = null;
        try{
            obj = (PersonaC) super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println("No se puede duplicar");
        }
        return obj;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " Edad: " + this.edad + " " + this.pesoAlturaC;
    }
}
