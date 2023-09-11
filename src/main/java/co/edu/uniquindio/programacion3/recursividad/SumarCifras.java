package co.edu.uniquindio.programacion3.recursividad;

public class SumarCifras {

    public static int suma(int n){
        if(n < 10){
            return n;
        }else{
            return (n%10) + suma(n/10);
        }
    }

    public static void main(String[] args) {
        System.out.println(suma(2356));
    }
}
