package programacionOrientadaObjetos;

public class UsoEmpleado {
    public static void main(String [] args){
        Empleado empleado=new Empleado("sandra",3500,2005,12,26);//instaciar una clase
        Empleado empleado1=new Empleado("rodri",3000,2015,4,11);
        System.out.println(empleado.getContratado());
        System.out.println("el empleado "+empleado.getNombre()+" fue contratado el "+empleado.getContratado());
        empleado.setSueldo(10);
        System.out.println(empleado.getSueldo());
    }
}
