package co.edu.uniquindio.programacion3.recursividad;

public class MenorDeUnArreglo {
    public static void main(String[] args) {
        int[] a = {2, 4, 1, 5, 7, 6, 0, 3};
        int i = 0;
        int f = a.length - 1;
        System.out.println(menor(a, i, f));
    }

    public static int menor(int[] a, int i, int f) {
        int menor  = Math.min(a[i],a[f]);
        if (i != f ) {
            menor = Math.min(menor, menor(a,i,f-1));
        }
        return menor;
    }
}
