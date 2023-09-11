package co.edu.uniquindio.programacion3.recursividad;

public class Nreinas {

    public static void main(String[] args) {
        char[][] tablero = crearTablero(4);
        acomodarReinas(tablero, 0, 0, 4);
    }

    /**
     * matriz que se llena dependiendo de los datos indicados o las n  reinas que se quieran acomodar
     *
     * @param reinas cantidad de reinas a tener en el tablero
     * @return retorna una matriz de caracteres
     */


    public static char[][] crearTablero(int reinas) {

        char[][] tablero = new char[reinas][reinas];

        // crear el tablero con casillas negras (' ') y blancas (' ')
        for (int i = 0; i < reinas; i++) {
            for (int j = 0; j < reinas; j++) {
                    tablero[i][j] = '0';
            }
        }
        return tablero;
    }

    public static int acomodarReinas(char[][] tablero, int i, int j, int reinas) {
        if (i > tablero[0].length - 1 || j > tablero[0].length - 1 || reinas < 1) {
            return 0;
        }
        if (esMovimientoValido(tablero,i,j)) {
            tablero[i][j] = '1';
            imprimirTablero(tablero);
            System.out.println("-------------------");
            acomodarReinas(tablero, i + 1, j + 1, reinas - 1);
        } else {
            tablero[i][j] = '0';
            acomodarReinas(tablero, i, j+1, reinas);
        }
        return 0;


    }

//    private boolean esSeguro(int fila, int col) {
//        // Verificar la fila
//        if (col < N && tablero[fila][col] == 1) {
//            return false;
//        }
//
//        // Verificar diagonal superior izquierda
//        if (!verificarDiagonalSuperiorIzquierda(fila, col)) {
//            return false;
//        }
//
//        // Verificar diagonal inferior izquierda
//        if (!verificarDiagonalInferiorIzquierda(fila, col)) {
//            return false;
//        }
//
//        return true;
//    }

    public static boolean esMovimientoValido(char[][] tablero, int fila, int columna) {
        return validarDiagonal(tablero, fila, columna) == 0 &&
                validarFila(tablero, fila, columna) == 0 &&
                validarDiagonalSuperior(tablero, fila, columna) == 0;
    }
    public static int validarDiagonal(char[][] tablero, int i, int j) {
        if (j >= 0 && i < tablero[i].length-1) {
            if (tablero[i][j] == '0') {
                return validarDiagonal(tablero, i + 1, j - 1);
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public static int validarFila(char[][] tablero, int i, int j) {
        if (j >= 0 && i < tablero[i].length-1) {
            if (tablero[i][j] == '0') {
                return validarFila(tablero, i, j - 1);
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public static int validarDiagonalSuperior(char[][] tablero, int i, int j) {
        if (j >= 0 && i >= 0) {
            if (tablero[i][j] == '0') {
                return validarDiagonalSuperior(tablero, i - 1, j - 1);
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    private static void imprimirTablero(char[][] tablero) {
        for (int i = 0; i < tablero[0].length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                System.out.print("[" + tablero[i][j] + "]");
            }
            System.out.println();
        }
    }

}
