package constantes;

public class Trabajador {
    private String nombreEmpleado;
    //un trabajador no puede cambiar su carnet
    private final int carnetIdentidad;//una vez que se asigne un valor al atributo este no
    // se puede modificar
    private String area;

    public Trabajador(String nombreEmpleado, int carnetIdentidad){
        this.nombreEmpleado=nombreEmpleado;
        this.carnetIdentidad=carnetIdentidad;
        area="practicante";
    }

    public void datosTrabajador(){
        System.out.println("el nombre es: "+nombreEmpleado+" su carnet es "+carnetIdentidad+" y el area de trabajo es "+area);
    }
    public void setArea(String area){
        this.area=area;
    }/*
    no se puede cambiar porque es una constante
    public void setCarnet(int carnetIdentidad){
        this.carnetIdentidad=carnetIdentidad;
    }
    */
}
