package org.example.bridge;

public class Email implements CanalEnvio {
    @Override
    public void enviar(String mensaje) {
        System.out.println(" Email enviado " + ": " + mensaje);
    }
}
