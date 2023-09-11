package co.edu.uniquindio.programacion3.recursividad;

public class CerosDeUnArreglo {

    public static void main(String[] args) {
        int[] a = {6,1,0,0};
        int n = 0;
        int cantidad = ceros(n,a);
        System.out.println(cantidad);
    }

    public static int ceros(int n, int[] a){
        if(a.length-1 < n){
            return 0;
        }
        // int contador = (a[n] == 0) ? 1 : 0; esto reemplaza el bloque if-else
        if(a[n]== 0){
            return 1 + ceros(n+1,a);
        }else{
            return ceros(n + 1, a);
        }

    }
}
