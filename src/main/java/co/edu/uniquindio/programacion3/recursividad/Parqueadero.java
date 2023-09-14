package co.edu.uniquindio.programacion3.recursividad;

public class Parqueadero {

    public static void main(String[] args) {
        Parqueadero p = new Parqueadero();
        p.buscarPropio(parqueadero,11,0);
    }

    /*
    'O' de ocupado
    'L' de libre
    ' ' camino
    'R' de reservado
    'P' propio disponible
    'D' de discapacitados
     */

    public static char[][] parqueadero = {
            {'L', ' ', 'L', ' ', 'P', 'L', ' '},
            {'L', ' ', 'L', 'O', ' ', 'L', ' '},
            {' ', ' ', ' ', 'O', ' ', ' ', ' '},
            {'O', ' ', ' ', 'O', 'D', 'D', ' '},
            {'O', ' ', ' ', ' ', ' ', 'L', ' '},
            {'O', ' ', 'O', ' ', ' ', 'L', ' '},
            {'O', ' ', 'O', ' ', 'O', 'O', ' '},
            {' ', ' ', 'O', ' ', ' ', ' ', ' '},
            {'O', ' ', 'O', ' ', 'O', ' ', 'O'},
            {'O', ' ', 'R', ' ', 'O', ' ', 'R'},
            {' ', ' ', 'R', ' ', 'O', 'O', 'R'},
            {' ', ' ', 'R', ' ', ' ', ' ', 'P'}
    };

    public static int carrosPropios = 2;

//    public void parquear() {
//        if (carrosPropios == 2) {
//            buscarPropio(parqueadero, 11, 0);
//        } else if (carrosPropios == 1) {
//            buscarPropio(parqueadero, 11, 0);
//        }
//    }

    public boolean buscarPropio(char[][] parqueadero, int i, int j) {
        if (i < 0 || i > parqueadero.length - 1) {
            return false;
        } else if (j < 0 || j > parqueadero[0].length - 1) {
            return false;
        }
        if (parqueadero[i][j] == '+') {
            return false;
        }

        if (parqueadero[i][j] == 'P') {
            parqueadero[i][j] = 'x';
            carrosPropios -= 1;
            System.out.println("se parquea un carro en la posisicion "+ i+" "+j);
            System.out.println();
            imprimirMatriz(parqueadero);
            recorrerMatriz(parqueadero,0,0);
            buscarPropio(parqueadero,11,0);
            return true;
        }
        if (parqueadero[i][j] == 'D' || parqueadero[i][j] == 'L' || parqueadero[i][j] == 'R' || parqueadero[i][j] == 'x' || parqueadero[i][j] == 'O') {
            return false;
        }
        parqueadero[i][j] = '+';

        boolean result;
        result = buscarPropio(parqueadero, i, j + 1);       // validar a la derecha
        if (result) {
            return true;
        }
        result = buscarPropio(parqueadero, i + 1, j); // validar hacia abajo
        if (result) {
            return true;
        }
        result = buscarPropio(parqueadero, i - 1, j);// validar hacia arriba
        if (result) {
            return true;
        }
        result = buscarPropio(parqueadero, i, j - 1);// validar hacia la izquierda
        return result;
    }

    public void imprimirMatriz(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }
    }

    public boolean recorrerMatriz(char[][] matriz, int i, int j) {
        if (i > matriz.length - 1) {
            i = 0;
            j +=1;
        }else if (j > matriz[0].length - 1) {
            return false;
        }else if (matriz[i][j] == '+') {
            matriz[i][j] = ' ';
        }
        return recorrerMatriz(matriz, i + 1, j);
    }

}
