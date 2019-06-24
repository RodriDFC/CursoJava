package flujosControl;

import javax.swing.*;

public class BucleWhile {
    public static void verificarPassword(String password){
        String clave="Rodri";
        while (!clave.equals(password)){//while entra al ciclo si su condicion es verdad
            //!clave.equals(password) e lo mismo que clave.equals(password)==false
            password= JOptionPane.showInputDialog("vuelve a introducir tu contraseña");
            System.out.println("contraseña incorrecta");
        }
        System.out.println("tienes acceso al sistema");
    }
    public static void main(String [] args){
        String password= JOptionPane.showInputDialog("indoduce tu contraseña");
        verificarPassword(password);
    }
}
