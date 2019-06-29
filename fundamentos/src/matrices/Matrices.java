package matrices;

public class Matrices {
    public static void matrices(){
        int [][] matriz=new int[5][3];//los indices empiezan en cero
        for (int i=0;i<4;i++){//i representan las filas
            System.out.println();
            for(int j=0;j<3;j++){ //j representan las columnas
                matriz[i][j]=(int)Math.round(Math.random()*100);
                System.out.print(matriz[i][j]+" ");
            }
        }
    }
    public static void main(String [] args){
        matrices();
    }
}
