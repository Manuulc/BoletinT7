package ejercicio6;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class MainHora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int segundos = 0;
        GregorianCalendar hoy = new GregorianCalendar();
        String horaSistema;

        // Usando los metodos de GregorianCalendar le asignamos la hora, minutos y segundos del sistema en el constructor.
        Hora h1 = new Hora(hoy.get(Calendar.HOUR_OF_DAY), hoy.get(Calendar.MINUTE), hoy.get(Calendar.SECOND));
        horaSistema = h1.getHora()+":"+ h1.getMinutos()+":"+ h1.getSegundos(); // Creo la variable horaSistema para que
        System.out.println("La hora del sistema es: "+horaSistema);             // el sout no sea tan largo.
        System.out.println("¿Cuantos segundos quieres sumar?");

        /* En este try-catch controlo que se introduzca un numero por teclado, de lo contrario aparecera
           'NO VALIDO' si hemos introducido una letra. Si introduce una letra o un numero negativo no se sumara nada.
         */
        try{
            segundos = sc.nextInt();
        }catch (Exception e){
            System.out.println("NO VALIDO");

        }

        System.out.println("Le sumarás "+segundos+" segundos a las "+horaSistema);
        h1.sumarYPintar(segundos);
    }
}
