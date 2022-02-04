package ejercicio10;

public class MainGato {

    public static void main(String[] args) {

       Gato g1 = new Gato();
        Gato g2 = new Gato();
        Gato g3 = new Gato("Godofredo","Blanco","Siames",2);

        System.out.println("""
                0 -> Iguales
                -1 -> Distintos
                """);
        System.out.println("---------------PRUEBA COMPARAR NOMBRES---------------");

        System.out.println(g1.compareTo(g2)); // Comparamos el nombre del gato 1 con el del gato 2. (IGUALES)
        System.out.println(g1.compareTo(g3)); // Comparamos el nombre del gato 1 con el del gato 2. (DISTINTOS)
        System.out.println("---------------PRUEBA COMPARAR EDADES---------------");
        System.out.println(g1.compareTo1(g2)); // Comparamos la edad del gato 1 con el del gato 2. (IGUALES)
        System.out.println(g1.compareTo1(g3));// Comparamos la edad del gato 1 con el del gato 2. (DISTINTOS)


    }
}
