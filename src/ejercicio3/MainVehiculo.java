package ejercicio3;

public class MainVehiculo {

    public static void main(String[] args) {

        Vehiculo[] vehiculos = Vehiculo.values(); // Declaro un array de vehiculos como en el ejemplo, aunque no hayamos
                                                    // dado los arrays aun.

        System.out.println("---------------NUMERO DE ORDEN---------------");
        for (int i = 0; i < vehiculos.length; i++) { // Bucle for para recorrer el array de vehiculos.
            System.out.println(vehiculos[i] + " es el indice " + (i+1)); // Incremento i en 1 para que no salga indice 0 y salga del 1 al 5
        }

        Vehiculo v1 = Vehiculo.BARCO;
        Vehiculo v2 = Vehiculo.TREN;

        System.out.println("---------------COMPARACIONES---------------"); //Con el compareTo de los enum
        if(v1.compareTo(v2)<0) {
            System.out.println(v1 + " es mas lento que " + v2);
        }
        if(v2.compareTo(v1)>0) {
            System.out.println(v2 + " es mas rapido que " + v1);
        }
        if(v1.compareTo(v2)==0) {
            System.out.println(v1 + " es igual de rapido que " + v2);
        }

    }
}
