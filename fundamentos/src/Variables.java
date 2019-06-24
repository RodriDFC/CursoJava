public class Variables {
    private static int variable(){
        int a=25;
        return a;
    }
    private static int suma(int a, int b){
        return a+b;
    }
    private static int variables(int a,int b){
        a++;
        b+=5;
        int c=a*b;
        return c;
    }
    private static void constante(){
        final int cm=100;
        // no sepuede editar una constante cm=454;
        System.out.println("la constante es:"+cm);
    }
    public static void main(String [] args){
        System.out.print("la variable a es: "+variable()+"\n");
        System.out.print("se suman los numeros 7 y 5 es: "+suma(7,5)+"\n");
        System.out.print(variables(5,5)+"\n");
        constante();
    }
}
