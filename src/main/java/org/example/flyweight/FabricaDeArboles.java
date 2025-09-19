package org.example.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaDeArboles {
    private static final Map<String, ArbolTipo> tiposArboles = new HashMap<>();

    public static ArbolTipo getTipoArbol(String nombre, String textura, String color) {
        String clave = nombre + textura + color;

        if (!tiposArboles.containsKey(clave)) {
            tiposArboles.put(clave, new TipoArbol(nombre, textura, color));
            System.out.println("➕ Creando nuevo tipo de árbol: " + nombre + " (" + color + ", " + textura + ")");
        }

        return tiposArboles.get(clave);
    }

    public static int getCantidadTiposCreados() {
        return tiposArboles.size();
    }
}
