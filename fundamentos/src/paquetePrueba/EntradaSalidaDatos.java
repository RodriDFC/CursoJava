package paquetePrueba;

import java.util.Scanner;

public class EntradaSalidaDatos {
    public static void introducirConsola(){
        Scanner datos=new Scanner(System.in);
        System.out.println("introduce tu nombre");
        String nombre=datos.nextLine();
        System.out.println("introduce tu edad");
        int edad=datos.nextInt();
        System.out.println("tu nombre es: "+nombre+" y tu edad es: "+edad);
    }
    public static void main(String [] args){
        introducirConsola();
    }
}
