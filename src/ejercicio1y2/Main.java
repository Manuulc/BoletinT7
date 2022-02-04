package ejercicio1y2;

import ejercicio1y2.Marca;
import ejercicio1y2.Vehiculo;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Vehiculo v1 = new Vehiculo();
        Vehiculo v2 = new Vehiculo();


        String matriculaV1,matriculaV2,marca;
        System.out.println("Introduce la matricula del vehiculo 1 : ");
        matriculaV1 = sc.nextLine();
        System.out.println("Introduce la marca de tu vehiculo.\nMarcas disponibles:");
        System.out.println("""
                BMW
                MERCEDES
                AVENSIS
                TOYOTA
                SEAT
                NISSAN
                AUDI
                """);
        marca = sc.nextLine();
        v1.setMatricula(matriculaV1);
        v1.setMarcaString(marca);

        System.out.println("Introduce la matricula del vehiculo 2 : ");
        matriculaV2 = sc.nextLine();
        v2.setMatricula(matriculaV2);
        v2.setMarca(Marca.BMW);

        System.out.println("\n"+v1);
        System.out.println(v2);


    }
}
