package org.example.bridge;

// ===== EJERCICIO 2 - BRIDGE =====
// Patrón Bridge: Separa la abstracción de la implementación
// para que ambas puedan variar independientemente.

public class Promocion extends Notificacion {
    public Promocion(CanalEnvio canal) {

        super(canal);
    }

    @Override
    public void notificar(String mensaje) {
        canal.enviar(" PROMOCIÓN: ¡Ofertas especiales disponibles!");
    }
}