package flujosControl;

import javax.swing.*;

public class bucleFor {
    public static void bucleFOR(int n){
        for (int i=0;i<=n;i++){//for(inicializacionVariable;condicion;contador)
            //en el contador puede estar i++,i--,i+=numero,i-=numero
            System.out.println("hola, este es el bucle numero:  "+i);
        }
    }
    public static void bucleF(){
        String password="hola";
        for (int i=0;i<=5;i++){
            String pass= JOptionPane.showInputDialog("introduce tu password");
            if(!password.equals(pass)){
                System.out.println("contraseña equivocada, le quedan "+(5-i)+" intentos");
            }else {
                System.out.println("tiene acceso al sistema ");
                i=1000;
            }
        }
    }
    public static void factorial(){
        long resultado=1;
        int numero=Integer.parseInt(JOptionPane.showInputDialog("introduce un numero"));
        for (int i=numero;i>0;i--){
            resultado=resultado*i;
        }
        System.out.println("el factorial de "+numero+" es: "+resultado);
    }
    public static void main(String [] args){
        bucleFOR(10);
        bucleF();
        factorial();
    }
}
