package ejercicio8;

import java.util.Objects;

public class Punto {

    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void igual(Punto punto){

        if(this.x == punto.x && this.y == punto.y){
            System.out.println("LOS PUNTOS SON IGUALES");
        }else{
            System.out.println("SON DISTINTOS PUNTOS");
        }
    }

    public void distancia(){

        double elevarX,elevarY,res,distancia;

        //En este caso tenemos es un objeto Punto P1:(x,y) y P2:(0,0)
        elevarX = Math.pow(0-this.x,2);
        elevarY = Math.pow(0-this.y,2);
        res = elevarX+elevarY;
        distancia = Math.sqrt(res);

        System.out.println("La distancia desde P1 al origen de coordenadas es: " + distancia);
    }

    public void distancia(Punto punto){

        double elevarX,elevarY,res,distancia;

        //En este caso tenemos es un objeto Punto P1:(x,y) y otro objeto Punto P2:(punto.x,punto.y)
        elevarX = Math.pow(punto.x-this.x,2);
        elevarY = Math.pow(punto.y-this.y,2);
        res = elevarX+elevarY;
        distancia = Math.sqrt(res);

        System.out.println("La distancia desde P1 al P2 es: " + distancia);
    }
}
