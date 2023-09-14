package co.edu.uniquindio.programacion3.recursividad;

import java.util.ArrayList;

public class MatrizTraspuesta {
    public static int[][] matriz = {{1, 2},
            {3, 4},
            {5, 6},
            {7, 8}
    };

    public static int[][] matrizTraspuesta = new int[2][4];
    public static ArrayList<Integer> numeros = new ArrayList<>();

    public static void main(String[] args) {
        MatrizTraspuesta m = new MatrizTraspuesta();
        m.recorrerMatriz(matriz, 0, 0);
        m.matrizTraspuesta(numeros, matrizTraspuesta, 0, 0);
        System.out.println();
//        for (int i = 0; i < numeros.size(); i++) {
//            System.out.println(numeros.get(i));
//        }
        m.imprimirMatriz(matrizTraspuesta);

    }

    public boolean matrizTraspuesta(ArrayList<Integer> numeros, int[][] matrizTraspuesta, int i, int j) {
        if (j == matrizTraspuesta[0].length) {           // si el valor de j es mayor  a el numero de columnas que tiene la matriz
            j = 0;                                         // aumente a la siguiente fila y reinicie la columna
            i += 1;
        }
        if (numeros.isEmpty()) {                         // si la lista de numeros esta vacia  retorne false para que finalice
            return false;
        }
        matrizTraspuesta[i][j] = numeros.get(0);            // asigna en la posicion [i][j] de la matriz el valor inicial de la lista
        numeros.remove(0);                             // remueve el valor asignado

        return matrizTraspuesta(numeros, matrizTraspuesta, i, j + 1);    // vuelve  iterar para acomodar el siguiente numero
    }

    public boolean recorrerMatriz(int[][] matriz, int i, int j) {

        // este ejemplo de recorrer la matriz lo hace manera vetical


        if (i > matriz.length - 1) {                       //cuando se desborde la ultima fila vuelve a la fila 0
            i = 0;                                         // y avanza a la siguiente columna
            j = j + 1;
        }
        if (j > matriz[0].length - 1) {                    // si llega a la ultima columna  retorna false para indicar
            return false;                                  // que no hay nada mas por recorrer
        }
        numeros.add(matriz[i][j]);                         // en esta linea adiciono los valores de la matriz en un array
        return recorrerMatriz(matriz, i+1, j);          // llamado recursivo que aumenta cada fila en su iteracion
    }

    public void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(); // Agregar un salto de línea después de cada fila
        }
    }

}
