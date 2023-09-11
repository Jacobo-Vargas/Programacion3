package co.edu.uniquindio.programacion3.recursividad;

public class Vocales {

    public static void main(String[] args) {
        String[][] matriz = {{"juanes", "jose", "pedro"}, {"lina", "raul", "azul"}, {"Miguel", "pablo", "daniel"}};
        //vocales(matriz, 0, 0);
    }

//    public static boolean vocales(String[][] matriz, int fila, int columna) {
//        String palabra = matriz[fila][columna];
//        if(verificarPalabra(palabra,0) == true){
//            return true;
//        }else{
//            verificarPalabra(matriz);
//        }
//    }
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

    public static boolean verificarPalabra(String palabra, int i) {

        if (i > palabra.length() - 1) {
            return false;
        }
        if ((palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i' || palabra.charAt(i) == 'o' || palabra.charAt(i) == 'u') && palabra.charAt(i + 1) == 'a' || palabra.charAt(i + 1) == 'e' || palabra.charAt(i + 1) == 'i' || palabra.charAt(i + 1) == 'o' || palabra.charAt(i + 1) == 'u') {
            return true;
        }else{
            verificarPalabra(palabra, i + 1);
        }
        return false;
    }
}
