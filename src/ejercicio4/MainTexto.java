package ejercicio4;

public class MainTexto {

    public static void main(String[] args) {

        Texto t1 = new Texto("",10);

        t1.añadirCaracterAlInicio("hola");
        t1.añadirCaracterAlFinal(" profe");
        System.out.println(t1.cuentaVocales());
    }



}
