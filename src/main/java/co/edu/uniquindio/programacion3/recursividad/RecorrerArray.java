package co.edu.uniquindio.programacion3.recursividad;

public class RecorrerArray {

    public static String recorrer(int [] array, int inicio){
        if(array.length-1 < inicio){
            return "fin, no hay mas valores.";
        }else{
            return "se recorrio el "+array[inicio] +"\n"+ recorrer(array,inicio+1);
        }
    }

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,9,8,7};
        System.out.println(recorrer(array,0));
    }
}
