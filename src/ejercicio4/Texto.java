package ejercicio4;

public class Texto {

    static final String VOCALES = "aeiouáéíóú";
    private String texto="";
    private int tamañoMaximo = 0;

    public Texto(String texto, int tamañoMaximo) {
        this.texto = texto;
        this.tamañoMaximo = tamañoMaximo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean añadirCaracterAlInicio(String cadena){

        boolean res = false;

        if(this.texto.length() < this.tamañoMaximo){
            this.texto = this.texto + cadena;
            res = true;
        }
        return res;
    }

    public boolean añadirCaracterAlFinal(String cadena){

        boolean res = false;

        if(this.texto.length() < this.tamañoMaximo){
            this.texto = cadena + this.texto;
            res = true;
        }
        return res;
    }

    public boolean tieneVocales(char ch){

        boolean res = false;
        ch = Character.toLowerCase(ch);
        if(VOCALES.indexOf(ch) != 1){
            res = true;
        }
        return res;
    }

    public int cuentaVocales(){

        int res = 0;

        for (int i=0 ; i < this.texto.length() ; i++){
            if (tieneVocales(texto.charAt(i))){
                res++;
            }
        }
        return res;
    }
}
