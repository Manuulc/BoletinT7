package ejercicio8;

public class MainPunto {

    public static void main(String[] args) {

        Punto p1 = new Punto(2,3);
        Punto p2 = new Punto (2,3);
        Punto p3 = new Punto (3,2);

        System.out.println("----------------------PRUEBA PUNTOS IGUALES----------------------");
        p1.igual(p2); // Comparamos el punto (2,3) con el punto (2,3) (IGUALES)
        p1.igual(p3); // Comapramos el punto (2,3) con el punto (3,2) (DISTINTOS)
        System.out.println("----------------------PRUEBA DISTANCIA AL ORIGEN----------------------");
        p1.distancia(); // Distancia desde el punto (2,3) hasta el origen (0,0)
        System.out.println("----------------------PRUEBA DISTANCIA ENTRE PUNTOS----------------------");
        p1.distancia(p2); // Distancia desde el punto (2,3) hasta el punto (2,3) (DEBERIA SER 0)
        p1.distancia(p3); // Distancia desde el punto (2,3) hasta el punto (3,2)

    }
}
