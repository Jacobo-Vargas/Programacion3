package co.edu.uniquindio.programacion3.recursividad;

public class Presos {

    public static int presos;
    public char[][] carcel = {
            {' ', 'p', 'x', ' ', 'p', 'p', ' ', 'p'},
            {' ', 'p', 'p', ' ', 'p', 'p', ' ', 'p'},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {'p', ' ', 'p', 'p', ' ', 'p', 'p', ' '},
            {'p', ' ', 'x', 'p', ' ', 'p', 'p', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {'p', 'x', 'p', ' ', 'p', 'p', ' ', 'p'}
    };

    public static void main(String[] args) {
        Presos p = new Presos();
        p.carcel[5][7] = 'C';
        p.carcel[0][0] = 'S';
        p.resuelve(0, 0);
        p.verificarPresos(26);
        p.imprimirCarcel(p.carcel);


    }

    public void resuelve(int i, int j) {
        if(ronda(i,j)){
            carcel[i][j] = 'C';
        }
    }



    public boolean ronda(int i, int j) {
        System.out.println(i+","+j);
        // para que no se desborde
        if (j > carcel[0].length - 1 || j < 0) {
            return false;
        } else if (i > carcel.length - 1 || i < 0) {
            return false;
        }
        if(carcel[i][j] == 'C'){
            System.out.println("false");
            return false;
        }

        if (carcel[i][j] == 'x') {
            carcel[i][j] = 'R';
            presos += 1;
            return false;

        } else if (carcel[i][j] == '*' || carcel[i][j] == 'p' || carcel[i][j] == 'R') {
            return false;
        }

        carcel[i][j] = '*';// marca las posiciones verificadas

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
        return result;
    }

    public void verificarPresos(int presosExistentes) {
        if (presosExistentes - presos == presosExistentes) {
            System.out.println("Los presos estan completos");
        } else {
            System.out.println("Faltan " + (presos) + " presos.");
        }
    }

    public void imprimirCarcel(char[][] carcel) {
        for (int i = 0; i < carcel.length; i++) {
            for (int j = 0; j <= carcel.length; j++) {
                System.out.print("[" + carcel[i][j] + "]");
            }
            System.out.println();
        }
    }

}
