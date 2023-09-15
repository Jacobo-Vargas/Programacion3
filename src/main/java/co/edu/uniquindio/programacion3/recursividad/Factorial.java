package co.edu.uniquindio.programacion3.recursividad;

public class Factorial {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println(f.factorial(10));

    }

    public Double factorial(int numero){
        if(numero == 1 ){
            return 1.0;
        }
        return numero*factorial(numero-1);
    }
}
