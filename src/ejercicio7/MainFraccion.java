package ejercicio7;

import java.util.Scanner;

public class MainFraccion {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Fraccion f1 = new Fraccion(pedirNumerador(),pedirDenominador());
        Fraccion f2 = new Fraccion(pedirNumerador(),pedirDenominador());

        System.out.println(f1.dividir(f2));
    }

    public static int pedirNumerador(){

        System.out.println("Numerador de la fraccion:");
        return sc.nextInt();
    }

    public static int pedirDenominador(){
        int denominador = 0;
        do{
            System.out.println("Denominador de la fraccion:");
            denominador = sc.nextInt();
        }while(denominador<0);
        return denominador;
    }
}
