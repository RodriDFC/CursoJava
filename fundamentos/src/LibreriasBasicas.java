public class LibreriasBasicas {
    public static double libreriaMathRaiz(double a){
        double c=Math.sqrt(a);//llamamos a un metodo de una clase con "clase.metodo", clase=tipo no simple
        return c;
    }
    public static int libreriaMathRedondeo(double b){
        int c=(int)Math.round(b);
        return c;
    }
    public static double libreriaMathPotencia(int base, int exponente){
        double c=Math.pow(base,exponente);
        return c;
    }
    public static void main(String [] args){
        System.out.println("la raiz de 9 es: "+libreriaMathRaiz(9));
        System.out.println("redondeo de 5.9741: "+libreriaMathRedondeo(5.74597));
        System.out.println("el resultado de 2 elevado a 2 es: "+libreriaMathPotencia(2,2));
    }
}
