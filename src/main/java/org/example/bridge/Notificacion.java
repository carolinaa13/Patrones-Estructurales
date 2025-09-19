package org.example.bridge;
//clase padre
// Abstracción: Tipos de notificación
public abstract class Notificacion {
    protected CanalEnvio canal; // Bridge - conexión con la implementación

    public Notificacion(CanalEnvio canal) {

        this.canal = canal;
    }

    public abstract void notificar(String destinatario);
}