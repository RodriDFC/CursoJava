package paquetePrueba;

import javax.swing.*;

public class EntradaDatos {
    public static void introducirDatos(){
        String dato= JOptionPane.showInputDialog("introduce tu nombre");
        //el metodo showInputDialog devuelve un String
        int edad=Integer.parseInt(JOptionPane.showInputDialog("introduce edad"));
        System.out.println("tu nombre es: "+dato+" y tu edad es: "+edad);
    }
    public static void introducirNumero(){
        double numero=Double.parseDouble(JOptionPane.showInputDialog("introduce un numero para obtener su raiz"));
        double raiz=Math.sqrt(numero);
        System.out.println("la raiz de: "+numero+" es: "+raiz);
    }
    public static void main(String [] args){
        introducirDatos();
        introducirNumero();
    }
}
