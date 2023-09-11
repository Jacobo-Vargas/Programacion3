package co.edu.uniquindio.programacion3.recursividad;

public class BuscarElemento {

    public static String encontrarNumero(int [] vector, int numero,int indice){
        if(vector.length-1 == indice){
            return "No se encontro.";
        }
        if(vector[indice] == numero){
            return "Si esta el elemento "+numero;
        }else{
            return encontrarNumero(vector,numero,indice+1);
        }
    }
    public static String encontrarLetra(char[] vector, char caracter,int indice){
        if(vector.length-1 == indice){
            return "No se encontro.";
        }
        if(vector[indice] == caracter){
            return "Si esta el elemento.";
        }else{
            return encontrarLetra(vector,caracter,indice+1);
        }
    }


    public static void main(String[] args) {
        char [] vector = {'J','A','C','O','B','O'};
        char caracter = 'O';
        System.out.println(encontrarLetra(vector,caracter,0));
    }
}
