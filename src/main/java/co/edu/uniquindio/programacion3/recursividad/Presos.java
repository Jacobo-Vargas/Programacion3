package co.edu.uniquindio.programacion3.recursividad;

public class Presos {

    public static int presos;
    public char[][] carcel = {
            {'#', '#', '#', '#', '#', '#', '#', '#','#','#'},
            {'#',' ', 'p', 'x', ' ', 'p', 'p', ' ', 'p','#'},
            {'#',' ', 'p', 'p', ' ', 'p', 'p', ' ', 'p','#'},
            {'#',' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ','#'},
            {'#','p', ' ', 'p', 'p', ' ', 'p', 'p', ' ','#'},
            {'#','p', ' ', 'x', 'p', ' ', 'p', 'p', ' ','#'},
            {'#',' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ','#'},
            {'#','p', 'x', 'p', ' ', 'p', 'p', ' ', 'p','#'},
            {'#', '#', '#', '#', '#', '#', '#', '#','#','#'}
    };

    public static void main(String[] args) {
        Presos p = new Presos();
        p.carcel[1][1] = 's';
        p.resuelve(1, 1);
        p.verificarPresos(26);

    }

    public void resuelve(int x, int y) {
        if (ronda(x, y)) {
            carcel[x][y] = 's';
        }
    }

    public boolean ronda(int i, int j) {
        if (carcel[i][j] == 'G') {
            return true;
        }

        if (carcel[i][j] == 'p') {
            presos += 1;
        }
        if (carcel[i][j] == 'G') {
            return true;
        }
        if (carcel[i][j] == '#' ||carcel[i][j]  == '*' || carcel[i][j]  == 'f') {
            return false;
        }

        carcel[i][j] = '*';

        boolean result;
        result = ronda(i, j + 1);// hacia la derecha
        if (result) {
            return true;
        }
        result = ronda(i + 1, j);// hacia abajo
        if (result) {
            return true;
        }
        result = ronda(i - 1, j);// hacia arriba
        if (result) {
            return true;
        }
        result = ronda(i, j - 1);// hacia la izquierda
        if (result) {
            return true;
        }
        carcel[i][j] = '*';
        return false;
    }

    public void verificarPresos(int presosExistentes){
        if(presosExistentes-presos == 0){
            System.out.println("Los presos estan completos");
        }else{
            System.out.println("Faltan "+(presosExistentes-presos)+" presos.");
        }
    }

    public static void imprimirCarcel(char[][] carcel) {
        for (int i = 0; i < carcel.length; i++) {
            for (int j = 0; j < carcel.length; j++) {
                System.out.print("[" + carcel[i][j] + "]");
            }
            System.out.println();
        }
    }

}
