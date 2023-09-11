package co.edu.uniquindio.programacion3.recursividad;

public class RecorrerMatriz {

    public static String recorrer(int[][] matriz, int fila, int columna) {
        if (fila <= matriz[0].length-1){
            if(columna > matriz[0].length-1) {
                columna = 0;
                return recorrer(matriz, fila +1, columna);

            }else if(columna < matriz[0].length-1){
                return "\nRecorrio " + matriz[fila][columna] + recorrer(matriz, fila, columna+1);
            }
            else{
                return "\nRecorrio "+ matriz[fila][columna]+ recorrer(matriz,fila,columna+1);
            }
        }else{
            return "\nFin";
        }
    }

    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(recorrer(matriz, 0, 0));
    }
}
