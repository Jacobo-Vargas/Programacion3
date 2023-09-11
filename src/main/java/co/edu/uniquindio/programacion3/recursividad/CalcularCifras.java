package co.edu.uniquindio.programacion3.recursividad;

public class CalcularCifras {

    public static int calcularCifras (int n){
        if (n < 10){
            return 1;
        }else{
            return calcularCifras(n/10)+1;
        }
    }

    public static void main(String[] args) {
        int n = 14578;
        System.out.println(calcularCifras(n));
    }
}
