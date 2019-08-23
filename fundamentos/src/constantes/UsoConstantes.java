package constantes;



public class UsoConstantes {

    public static void main(String [] args){
        Trabajador trabajador=new Trabajador("rodri",9332363);
        Trabajador trabajador1=new Trabajador("sandra",415216);
        trabajador.datosTrabajador();
        trabajador1.datosTrabajador();
        trabajador1.setArea("Auditora");
        trabajador1.datosTrabajador();
    }

}
