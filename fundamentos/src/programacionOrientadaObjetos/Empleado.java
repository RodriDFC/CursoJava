package programacionOrientadaObjetos;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {
    private String nombre;
    private double sueldo;
    private Date contratado;

    public Empleado(String nombre, double sueldo, int año,int mes,int dia){
        this.nombre=nombre;
        this.sueldo=sueldo;
        GregorianCalendar calendar=new GregorianCalendar(año,mes-1,dia); //crea una fecha con el
        //constructor GregorianCalendar calendar=new GregorianCalendar(año,mes,dia)   mes==> enero=0 feb=1.....dic=11
        contratado=calendar.getTime();//devuelve la fecha del objeto calendar
    }
    public String getNombre(){
        return nombre;
    }
    public double getSueldo(){
        return sueldo;
    }
    public Date getContratado(){
        return contratado;
    }
    public void setSueldo(double porcentajeAumento){
        double aumento=sueldo*(porcentajeAumento/100);
        sueldo+=aumento;
    }
}
