package flujosControl;

import java.util.Scanner;

public class WhileII {
    public static void adivinarNumero(int numeroAdivinado){
        long numero=Math.round(Math.random()*100);
        //round sirve para redondear y random para generar numeros aleatorios
        while (numero!=numeroAdivinado){
            System.out.println("Vuelve a introducir un numero");
            if(numero>numeroAdivinado){
                System.out.println("mas alto");
            }else{
                System.out.println("mas bajo");
            }
            Scanner dato=new Scanner(System.in);
            numeroAdivinado=dato.nextInt();
        }
        System.out.println("lo adivinaste");
    }
    public static void adivinarNumeroDoWhile(int numeroAdivinado){
        long numero=Math.round(Math.random()*100);
        //round sirve para redondear y random para generar numeros
        do{
            System.out.println("Vuelve a introducir un numero");
            if(numero>numeroAdivinado){
                System.out.println("mas alto");
            }else{
                System.out.println("mas bajo");
            }
            Scanner dato=new Scanner(System.in);
            numeroAdivinado=dato.nextInt();
        }
        while (numero!=numeroAdivinado);
        //el bucle do while funciona similar a un while so que ejecuta el codigo por lo menos 1 vez
        System.out.println("lo adivinaste");
    }

    public static void main(String [] args){
        System.out.println("introduce un numero");
        Scanner dato=new Scanner(System.in);
        int numeroAdivinado=dato.nextInt();
        adivinarNumero(numeroAdivinado);
        adivinarNumeroDoWhile(numeroAdivinado);
    }
}
