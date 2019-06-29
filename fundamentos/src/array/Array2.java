package array;

public class Array2 {
    public static void usoForEach(){
        int []miArray=new int[6];
        miArray[0]=12;
        miArray[1]=-4;
        miArray[2]=3;
        miArray[3]=-8;
        miArray[4]=-7;
        miArray[5]=95;
        for (int array:miArray) {
            System.out.println(array);
        }
    }
    public static void main(String [] args){
        usoForEach();
    }
}
