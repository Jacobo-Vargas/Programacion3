package co.edu.uniquindio.programacion3.recursividad;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        // Declarar e inicializar un HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Agregar elementos al HashMap
        hashMap.put("manzanas", 10);
        hashMap.put("platanos", 5);
        hashMap.put("uvas", 20);

        // Declarar un Map usando la interfaz y asignarlo a un HashMap
        Map<String, Integer> map = new HashMap<>();
        map.put("rojo", 1);
        map.put("verde", 2);
        map.put("azul", 3);

        // Acceder a elementos en el Map
        int cantidadManzanas = hashMap.get("manzanas");
        System.out.println("Cantidad de manzanas: " + cantidadManzanas);

        // Verificar si una clave existe
        boolean tieneUvas = hashMap.containsKey("uvas");
        System.out.println("Tiene uvas: " + tieneUvas);

        // Iterar a través de las claves y valores del Map
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            String fruta = entry.getKey();
            int cantidad = entry.getValue();
            System.out.println(fruta + ": " + cantidad);
        }

        // Remover un elemento del Map
        hashMap.remove("platanos");
        System.out.println("Después de remover plátanos: " + hashMap);
    }
}
