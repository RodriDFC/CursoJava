package programacionOrientadaObjetos;

public class Auto {
    private int ruedas;
    int largo; //falta encapsulacion  private, public, protected
    private int ancho;
    protected int peso;
    public String marca;
    private String color;
    //public cualquier clase puede acceder y modificar el atributo
    //private solo la clase puede puede acceder y modificar el atributo
    //protected solo las clase dentro del paquete(carpeta) pueden accder y modificar el atributo

    public Auto(int largoA, int anchoA, int pesoA,String marcaA){//metodo constructor para la clase Auto
        //debe tener el mismo nombre de la clase
        //el contructor inicializa una clase con los atributos importantes
        ruedas=4;
        largo=largoA;
        ancho=anchoA;
        peso=pesoA;
        marca=marcaA;
    }
    public int getRuedas(){//los metodos get y set son para acceder a atributos de la clasw
        // que son privados desde otra clase
        return ruedas;
    }
    public int getAncho(){//los metodos get obtinen el valor del atributo
        return ancho;
    }
    public void setColor(String color){//los metodos set cambian el valor del atributo
        this.color=color;
    }
    public String getColor(){
        return color;
    }
}
