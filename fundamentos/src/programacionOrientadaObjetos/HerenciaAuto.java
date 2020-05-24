package programacionOrientadaObjetos;

public class HerenciaAuto extends Auto {
    private int capacidadCarga;
    private int plazasExtra;

    public HerenciaAuto(int capacidadCarga, int plazasExtra,int largoA, int anchoA, int pesoA,String marcaA){
        super(largoA,anchoA,pesoA,marcaA); //llama al contructor de la clase padre
        //si el contructor lleva parametros ingresar parametros, super(,,,)
        //si no lleva parametros, usar super()
        this.capacidadCarga=capacidadCarga;
        this.plazasExtra=plazasExtra;
    }
    public int getCapacidadCarga(){
        return capacidadCarga;
    }
    //si se sobreescribe en metodo de la clase padre, para diferenciar entre los 2 metodos usar
    // super.MedotoPadre()   ----->   con esto indica al programa que se debe buscar el metodo de la clase padre
}
