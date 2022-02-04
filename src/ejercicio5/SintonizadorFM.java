package ejercicio5;

public class SintonizadorFM {

    private double frecuencia;

    public SintonizadorFM(double frecuencia) {
        this.frecuencia = frecuencia;
    }

    public SintonizadorFM(){
        this.frecuencia = 80;
    }

    public double getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(double frecuencia) {
        this.frecuencia = frecuencia;
    }

    /**
     * Metodo para incrementar el atributo frecuencia en 0.5 MHz
     * Precondiciones: ninguna
     * Postcondiciones: incrementa en 0.5 la frecuencia
     */
    public void subirFrecuencia(){

        this.frecuencia+=0.5;

        if(this.frecuencia>108){
            this.frecuencia = 80;
        }
    }
    /**
     * Metodo para decrementar el atributo frecuencia en 0.5 MHz
     * Precondiciones: ninguna
     * Postcondiciones: decrementa en 0.5 la frecuencia
     */
    public void bajarFrecuencia(){

        this.frecuencia-=0.5;

        if(this.frecuencia<80){
            this.frecuencia = 108;
        }
    }
    /**
     * Metodo para imprimir por pantalla el atributo frecuencia
     * Precondiciones: ninguna
     * Postcondiciones: imprime por pantalla el atributo frecuencia
     */
    public void display(){
        System.out.println(this.frecuencia + "MHz");
    }
}
