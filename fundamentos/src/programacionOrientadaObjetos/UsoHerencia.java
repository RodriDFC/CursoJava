package programacionOrientadaObjetos;

public class UsoHerencia {
    public static void main(String [] args){
        Auto auto=new Auto(2,2,2000,"Nissan");
        auto.setColor("negro");

        HerenciaAuto camion=new HerenciaAuto(2000,5,5,3,5000,"toyota");
        camion.setColor("blanco");//el metodo setColor es de la clase padre Auto
        camion.setAsientosCuero(true);

        System.out.println("este coche tiene "+auto.getRuedas()+" ruedas y es de marca "+auto.marca
                +" ,tiene un largo de "+auto.largo+" y tiene un ancho de "+auto.getAncho());
        System.out.println("este camion tiene "+camion.getRuedas()+" ruedas y es de marca "+camion.marca
                +" ,tiene un largo de "+camion.largo+", tiene un ancho de "+camion.getAncho()
                +" y una capacidad de carga de "+camion.getCapacidadCarga());
    }
}
