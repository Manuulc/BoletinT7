package ejercicio9;

public class PesoAlturaC implements Cloneable{

    private double altura;
    private double peso;

    // Metodo constructor con parametros.
    public PesoAlturaC(double altura, double peso) {
        this.altura = altura;
        this.peso = peso;
    }

    // Metodo constructor por defecto.
    public PesoAlturaC() {
        this.altura = 1.70;
        this.peso = 75.0;
    }

    // Metodo constructor de copia.
    public PesoAlturaC(PesoAlturaC pesoAlturaC){
        this.altura = pesoAlturaC.altura;
        this.peso = pesoAlturaC.peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Altura: " + this.altura +"cm " + "Peso: " + this.peso + "kg";
    }

    public Object clone(){

        PesoAlturaC obj = null;

        try{
            obj = (PesoAlturaC) super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println("No se puede duplicar");
        }
        return obj;
    }

}
