package co.edu.uniquindio.programacion3.recursividad;

public class NumeroApariciones {

    public static int apariciones(int inicio,int fin,int numero, int[] vector){
        if(inicio > fin){
            return 0;
        }
        if(vector[inicio] == numero){
            return 1 + apariciones(inicio+1,fin,numero,vector);
        }else{
            return apariciones(inicio+1,fin,numero,vector);
        }
    }

    public static void main(String[] args) {
        int [] vector ={2,1,1,2,5,6,4,8,7,1};
        System.out.println(apariciones(0,vector.length-1,1,vector));

    }
}
