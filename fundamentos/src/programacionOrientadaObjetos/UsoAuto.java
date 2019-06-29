package programacionOrientadaObjetos;

public class UsoAuto {
    public static void main(String [] args){
        Auto auto=new Auto(2,2,2000,"toyota");//instaciar una clase
        System.out.println("este coche tiene "+auto.getRuedas()+" ruedas y es de marca "+auto.marca
        +" ,tiene un largo de "+auto.largo+" y tiene un ancho de "+auto.getAncho());
        //se usa los metodos get y set para acceder y modificar los atributos de la clase
        // que son privados desde otra clase
        auto.setColor("azul");
        System.out.println("el color del auto es: "+auto.getColor());
    }
}
