package org.example.bridge;

public class SMS implements CanalEnvio {
    @Override
    public void enviar(String mensaje) {
        System.out.println(" SMS enviado " + ": " + mensaje);
    }
}
