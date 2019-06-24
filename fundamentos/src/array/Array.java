package array;

public class Array {
    public static void arrays(){
        int []miArray=new int[5];//el array es una coleccion de datos similares
        //tienen un tamaño
        miArray[0]=45;
        miArray[1]=-4;
        miArray[2]=21;
        miArray[3]=19;
        miArray[4]=-7;
        //el primer indice del array es 0 y el ultimo es tamaño-1
        //tamaño array: miArray.length
        for (int i=0; i<miArray.length ;i++){
            System.out.println(miArray[i]);
        }
    }
    public static void main(String [] args){
       arrays();
    }
}
