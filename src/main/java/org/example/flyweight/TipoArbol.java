package org.example.flyweight;
// Implementación concreta del Flyweight

public class TipoArbol implements ArbolTipo {
    private final String nombre;
    private final String textura;
    private final String color;

    public TipoArbol(String nombre, String textura, String color) {
        this.nombre = nombre;
        this.textura = textura;
        this.color = color;
    }

    @Override
    public void renderizar(int x, int y) {
        System.out.println(" Renderizando " + nombre + " (" + color + ", " + textura +
                ") en posición (" + x + ", " + y + ")");
    }
}
