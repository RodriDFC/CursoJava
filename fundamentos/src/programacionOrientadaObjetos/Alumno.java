package programacionOrientadaObjetos;

public class Alumno extends Persona{
    private String carrera;

    public Alumno(String nombre,String carrera){
        super(nombre);
        this.carrera=carrera;
    }
    public String getCarrera(){ return carrera; }
    public String datos(){
        return "El alumno: "+getNombre()+" y esta en la carrera "+getCarrera();
    }
}
