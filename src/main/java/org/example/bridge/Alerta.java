package org.example.bridge;

public class Alerta extends Notificacion {
    public Alerta(CanalEnvio canal) {

        super(canal);// para pasarselo a la clase padre
    }

    @Override
    public void notificar(String mensaje) {

        canal.enviar("️ ALERTA: Situación que requiere atención inmediata");
    }
}
