package org.example.adapter;

// ADAPTER: Hace compatible ImpresoraTexto con la interfaz Impresora
public class AdaptadorImpresoraTexto implements Impresora {
    private ImpresoraAdvanced impresora;

    public AdaptadorImpresoraTexto(){
        impresora = new ImpresoraAdvanced();
    }

    @Override
    public void imprimir(String documento) {
        if(documento.equalsIgnoreCase("PDF")){
            impresora.imprimirPDF(documento);
        }else if(documento.equalsIgnoreCase("Texto")){
            impresora.imprimirTexto(documento);
        }
    }
}