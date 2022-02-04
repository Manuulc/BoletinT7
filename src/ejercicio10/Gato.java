package ejercicio10;

public class Gato implements Comparable<Gato> {

    private String nombre;
    private String color;
    private String raza;
    private int edad;

    public Gato(String nombre, String color, String raza, int edad) {
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
        this.edad = edad;
    }

    public Gato() {
        this.nombre = "Rodolfo";
        this.color = "Naranja";
        this.raza = "Persa";
        this.edad = 1;
    }

    @Override
    public int compareTo(Gato gato){
        return (this.nombre).compareTo(gato.nombre);
    }

    public int compareTo1(Gato gato){
        return this.edad-gato.edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " Edad: " + this.edad + " Raza: " + this.raza + " Color: " + this.color;
    }
}
