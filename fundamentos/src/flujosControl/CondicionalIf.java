package flujosControl;

import java.util.Scanner;

public class CondicionalIf {

    public static int obtenerEdad(){
        System.out.println("introduce tu edad");
        Scanner dato=new Scanner(System.in);
        return dato.nextInt();
    }
    public static void ifMultiples(int edad){
        if(edad<18){
            System.out.println("eres un adolecente o niño");
        }else if(edad>=18 && edad<61){
            System.out.println("Eres joven o adulto");
        }else {
            System.out.println("eres adulto mayor");
        }
    }
    public static void main(String [] args){
        int edad=obtenerEdad();
        if(edad>18){
            System.out.println("Eres mayor de edad");
        }else {
            System.out.println("Eres menor de edad");
        }
        ifMultiples(edad);
    }

}
