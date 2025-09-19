 package org.example.flyweight;

// Árbol concreto: tiene posición (extrínseco) y un TipoArbol compartido (intrínseco)

public class Arbol {
    private final int x;
    private final int y;
    private final ArbolTipo tipo;

    public Arbol(int x, int y, ArbolTipo tipo) {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
    }

    public void renderizar() {
        tipo.renderizar(x, y); // delega en el flyweight
    }
}
