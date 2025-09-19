package org.example.proxy;


// PROXY: Controla el acceso al objeto real
public class ArchivoProxy implements Archivo {
    private ArchivoReal archivoReal;
    private String nombreArchivo;
    private String usuario;

    public ArchivoProxy(String nombreArchivo, String usuario) {
        this.nombreArchivo = nombreArchivo;
        this.usuario = usuario;
    }

    private boolean tienePermiso() {
        // Simulamos verificación de permisos
        return "admin".equals(usuario) || "editor".equals(usuario);
    }

    @Override
    public void abrir() {
        if (tienePermiso()) {
            if (archivoReal == null) {
                archivoReal = new ArchivoReal(nombreArchivo);
            }
            archivoReal.abrir();
        } else {
            System.out.println(" Acceso denegado para usuario: " + usuario);
        }
    }

    @Override
    public String leer() {
        if (tienePermiso()) {
            if (archivoReal == null) {
                archivoReal = new ArchivoReal(nombreArchivo);
            }
            return archivoReal.leer();
        } else {
            return " Acceso denegado para usuario: " + usuario;
        }
    }
}