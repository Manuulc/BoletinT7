package ejercicio7;

public class Fraccion {

    private double numerador;
    private double denominador;

    // Metodo constructor con parametros.
    public Fraccion(double numerador, double denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    // Metodo constructor por defecto, lo pongo en 1 para que la fraccion no sea 0/0
    public Fraccion() {
        this.numerador = 1;
        this.denominador = 1;
    }

    // GETTERS Y SETTERS
    public double getNumerador() {
        return numerador;
    }

    public void setNumerador(double numerador) {
        this.numerador = numerador;
    }

    public double getDenominador() {
        return denominador;
    }

    public void setDenominador(double denominador) {
        this.denominador = denominador;
    }

    /* Aclaracion: en estos metodos hago que devuelva un objeto de la clase Fraccion para que al imprimirla por pantalla
       aparezca con el toString() que he creado y que en lugar de que la fraccion aparezca como 0.5 , aparezca como 1/2
       por ejemplo.
    */

    /**
     * Metodo para multiplicar una fraccion por un numero introducido como parametro.
     * Precondiciones: ninguna
     * Postcondiciones: multiplica la fraccion por el numero y devuelve un objeto de tipo fraccion
     * @param numero
     * @return f
     */
    public Fraccion multiplicar(double numero){

        Fraccion f = new Fraccion();

        f.numerador = this.numerador*numero;
        f.denominador = this.denominador;

        return f;
    }

    /**
     * Metodo para multiplicar una fraccion por otra fraccion introducida como parametro.
     * Precondiciones: ninguna
     * Postcondiciones: multiplica las fracciones haciendo las cuentas correspondientes y devuelve un objeto de tipo fraccion
     * @param fraccion
     * @return f
     */
    public Fraccion multiplicar(Fraccion fraccion){

        Fraccion f = new Fraccion();

        f.numerador = this.numerador* fraccion.numerador;
        f.denominador = this.denominador * fraccion.denominador;

        return f;
    }

    /**
     * Metodo para dividir una fraccion por un numero introducido como parametro
     * Precondiciones: ninguna
     * Postcondiciones: divide la fraccion por el numero haciendo la cuenta correspondiente y devuelve un objeto de tipo fraccion
     * @param numero
     * @return f
     */
    public Fraccion dividir(double numero){

        Fraccion f = new Fraccion();

        f.numerador = this.numerador;
        f.denominador = this.denominador*numero;

        return f;
    }

    /**
     * Metodo para dividir una fraccion por otra fraccion introducida como parametro.
     * Precondiciones: ninguna
     * Postcondiciones: divide las dos fracciones haciendo las cuentas correspondientes y devuelve un objeto de tipo fraccion
     * @param fraccion
     * @return f
     */
    public Fraccion dividir(Fraccion fraccion){

        Fraccion fra = new Fraccion();

        fra.numerador = this.numerador * fraccion.denominador;
        fra.denominador = this.denominador * fraccion.numerador;

        return fra;
    }

    /**
     * Metodo para invertir el signo de la fraccion, invirtiendo el signo (multiplicar por -1) del numerador
     * o del denominador (solo uno), la fraccion ya tendria el signo invertido. Por ej: 1/2 = 0.5 || -1/2 o 1/-2 = -0.5
     */
    public void invertirSigno(){
        this.numerador*=-1;
    }

    @Override
    public String toString() {
        return this.numerador+"/"+this.denominador;
    }
}
