package ejercicio5;

public class MainRadio {

    public static void main(String[] args) {

        System.out.println("---------PRUEBA BAJAR FRECUENCIA CON R1---------");
        SintonizadorFM r1 = new SintonizadorFM(); //Por defecto tiene frecuencia 80
        System.out.println("La radio se ha encendido en la frecuencia "+ r1.getFrecuencia() + "MHz");
        System.out.println("Bajando 0.5 MHz la frecuencia...");
        r1.bajarFrecuencia(); //Bajamos 0.5 la frecuencia...
        r1.display(); //Aqui saldrá 108.0 ya que como el minimo es 80, al bajar pasa al otro extremo.
        r1.bajarFrecuencia(); // Ahora ya no hay problema ya que la frecuencia se encuentra en 108.0
        System.out.println("Bajando 0.5 MHz la frecuencia...");
        r1.display(); //Aqui saldra 107.5 ya que puede bajar la frecuencia sin problema.
        System.out.println("---------PRUEBA SUBIR FRECUENCIA CON R2---------");
        SintonizadorFM r2 = new SintonizadorFM(108.0); //Le ponemos frecuencia 108 con el constructor con parametros.
        System.out.println("La radio se ha encendido en la frecuencia "+ r2.getFrecuencia() + "MHz");
        System.out.println("Subiendo 0.5 MHz la frecuencia...");
        r2.subirFrecuencia(); //Subimos 0.5 la frecuencia...
        r2.display(); //Aqui saldrá 80.0 ya que como el maximo es 108, al subir pasa al otro extremo.
        r2.subirFrecuencia(); // Ahora ya no hay problema ya que la frecuencia se encuentra en 80.0
        System.out.println("Subiendo 0.5 MHz la frecuencia...");
        r2.display(); //Aqui saldra 80.5 ya que puede bajar la frecuencia sin problema.
    }
}
