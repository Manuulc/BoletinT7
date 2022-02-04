package ejercicio6;

public class Hora {

    private int hora;
    private int minutos;
    private int segundos;

    public Hora(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public Hora() {
        this.hora = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    /**
     * Metodo para ir comprobando las horas minutos y segundos y controlar que cada vez que se sobrepase la hora
     * maxima (23), los minutos maximos (59), y los segundos maximos (59) se incremente en 1 el siguiente valor de la hora.
     * Precondiciones: ninguna
     * Postcondiciones: tras comprobar si la hora,minutos o segundos sobrepasan los valores maximos, incrementara en 1
     * los minutos si sobrepasan los segundos, en 1 la hora si sobrepasan los minutos.
     */
    private void comprobarHora(){

        if(this.segundos>59){
            this.segundos = 0;
            this.minutos++;
        }
        if(this.minutos>59){
            this.minutos = 0;
            this.hora++;
        }
        if(this.hora>23){
            this.hora = 0;
        }

    }

    /**
     * Metodo para sumar los segundos introducidos por teclado a la hora del sistema e imprimir la hora en pantalla.
     * Precondiciones: debe ser un numero entero positivo.
     * Postcondiciones: la hora se ira incrementando en 1 segundo y mostrando en pantalla la hora cada vez que sume 1 segundo.
     * @param segundo
     */
    public void sumarYPintar(int segundo){

        for (int i = 0 ; i<segundo; i++){
            this.segundos+=1;
            comprobarHora();
            System.out.println(this.hora+":"+this.minutos+":"+this.segundos);
        }
    }
}
