package co.edu.uniquindio.programacion3.recursividad;

public class SumaDiagonal {
    public static int recorrer (int [][] matriz, int fila, int columna){
        if(fila > matriz[0].length-1 || columna > matriz[0].length-1){
            return 0;
        }
        if(fila == columna){
            System.out.println("Suma "+matriz[fila][columna]+" en la posicion "+fila+columna);
            return matriz[fila][columna] + recorrer(matriz,fila+1,columna+1);

        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        int[][] matriz ={{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(recorrer(matriz,0,0));
    }
}
