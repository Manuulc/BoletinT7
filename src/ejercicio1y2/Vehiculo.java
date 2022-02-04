package ejercicio1y2;

public class Vehiculo {

    private String matricula;
    private Marca marca;

    // Metodo constructor con parametros.
    public Vehiculo(String matricula, Marca marca) {
        this.matricula = matricula;
        this.marca = marca;
    }

    // Metodo constructor por defecto.
    public Vehiculo() {
    }

    // Constructor de copia.
    public Vehiculo(Vehiculo vehiculo){
        this.matricula = vehiculo.matricula;
        this.marca = vehiculo.marca;
    }

    //GETTERS Y SETTERS
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Marca getMarcaString() {
        return marca;
    }

    /**
     * Metodo para setear el atributo marca segun la cadena que nos han introducido por teclado.
     * Precondiciones : se debe introducir una cadena de texto.
     * Postcondiciones : se le atribuye el valor correspondiente del enum Marca al atributo marca de la clase Vehiculo.
     * @param marcaString
     */
    public void setMarcaString(String marcaString) {

        marcaString = marcaString.toLowerCase();

        switch (marcaString) {

            case "bmw" -> this.marca = Marca.BMW;
            case "mercedes" -> this.marca = Marca.MERCEDES;
            case "avensis" -> this.marca = Marca.AVENSIS;
            case "toyota" -> this.marca = Marca.TOYOTA;
            case "seat" -> this.marca = Marca.SEAT;
            case "nissan" -> this.marca = Marca.NISSAN;
            case "audi" -> this.marca = Marca.AUDI;
            default -> this.marca = null;
        }
    }
    /**
     * Metodo para setear el atributo marca pasandole directamente un valor del enum como parametro.
     * Precondiciones :
     * Postcondiciones : se le atribuye el valor correspondiente del enum Marca al atributo marca de la clase Vehiculo.
     * @param marcaEnum
     */
    public void setMarca(Marca marcaEnum){

        switch (marcaEnum) {
            case BMW -> this.marca = Marca.BMW;
            case MERCEDES -> this.marca = Marca.MERCEDES;
            case AVENSIS -> this.marca = Marca.AVENSIS;
            case TOYOTA -> this.marca = Marca.TOYOTA;
            case SEAT -> this.marca = Marca.SEAT;
            case NISSAN -> this.marca = Marca.NISSAN;
            case AUDI -> this.marca = Marca.AUDI;
            default -> this.marca = null;
        }
    }

    @Override
    public String toString() {
        return "ejercicio1y2.Vehiculo {" +
                " Matricula='" + matricula + '\'' +
                ", ejercicio1y2.Marca=" + marca +
                '}';
    }
}
