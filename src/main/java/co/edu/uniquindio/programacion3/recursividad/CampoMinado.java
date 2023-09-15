package co.edu.uniquindio.programacion3.recursividad;

public class CampoMinado {

    public String[][] campoMinado = {
            {"CA", "E1",  "A", "CA",  "A", "CA", "CA", "CA", "E1"},
            {"CA", "E1", "E2", "CA",  "A", "E1", "CA", "E1", "CA"},
            {"CA", "CA", "CA", "CA", "CA", "CA", "CA", "CA", "CA"},
            {"E1", "CA", "E1",  "A", "CA", "E1",  "A", "CA", "CA"},
            { "A", "CA",  "A", "CA", "CA", "E2", "E1", "CA", "E2"},
            {"CA", "CA", "CA", "CA", "CA", "CA", "CA", "CA", "CA"},
            {"CA",  "A", "E1", "CA", "E1",  "A", "CA",  "A", "CA"},
            {"CA", "E2", "CA", "CA", "CA", "E1", "CA", "CA", "CA"},
            {"CA", "CA", "CA",  "A", "CA", "CA", "CA", "E2", "CA"},
    };

    public static int enemigosE1 = 0;//12 enemigos E1
    public static int enemigosE2 = 0;//5 enemigos E2
    public static int aliados = 0; // 11 aliados


    public static void main(String[] args) {

    }

    public boolean recorrerCampo(){

    }
}
