public class ClaseString {
    //clase String para cadena de caracteres (texto)
    public static int tamañoCadena(String a){
       return a.length();
    }
    public static char posicionCadena(String a, int pos){
        return a.charAt(pos);
    }
    public static String subCadena(String a, int pos1,int pos2){
        return a.substring(pos1,pos2);
        //pos1  desde donde
        //pos2  hasta donde
    }
    public static boolean equalCadena(String a, String b){
        return a.equals(b);//mira si las cadenas son totalmente iguales
    }
    public static boolean equalIgnoreCaseCadena(String a, String b){
        return a.equalsIgnoreCase(b);
        //mira si las cadenas son iguales sin mirar mayusculas y minusculas
    }
    public static void main(String [] args){
        String palabra="hola mundo";
        int posicion=3;
        //en una cadena la primera posicion empieza en 0 y la ultima letra es cadena.length()-1
        int pos1=5;
        int pos2=10;
        String cadena="Rodrigo";
        String cadena1="Rodrigo";
        String cadena2="rodrigo";
        System.out.println("el tamaño de la cadena: "+palabra+" es: "+tamañoCadena(palabra));
        System.out.println("la letra de la posicion: "+posicion+" de la cadena: "+palabra+" es: "+posicionCadena(palabra,posicion));
        System.out.println("la subcadena de: "+palabra+" desde "+pos1+" hasta "+pos2+" es: "+subCadena(palabra,pos1,pos2));
        System.out.println(equalCadena(cadena,cadena1));
        System.out.println(equalCadena(cadena,cadena2));
        System.out.println(equalIgnoreCaseCadena(cadena,cadena1));
        System.out.println(equalIgnoreCaseCadena(cadena,cadena2));
    }
}
