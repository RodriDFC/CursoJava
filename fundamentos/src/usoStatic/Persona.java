package usoStatic;

public class Persona {
    private String nombre;
    private static int aux=0;
    private int id;


    public Persona(String nombre ){
        this.nombre=nombre;
        aux++;
        id=aux;
    }
    public void datosPersona(){
        System.out.println("el nombre es: "+nombre+" y su id es "+id);
    }
    public static String variableAuxId(){
        return "la variable es: "+aux;
        //solo puede acceder a variables del tipo static
    }
}
