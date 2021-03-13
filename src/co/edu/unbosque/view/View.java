package co.edu.unbosque.view;

import javax.swing.*;

public class View {


    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public String capturarmensaje(String mensaje) {
        String r = JOptionPane.showInputDialog(null, mensaje);
        return r;
    }

    public String menuPrincipal() {
        Object[] opciones = {"1. Lista simple", "2.Lista doble","3.Lista circular" ,"Salir"};
        Object opcion = JOptionPane.showInputDialog(null, "      ..:Bienvenido señor usuario :..                " + "\n\n\nSelecciona un operacion a realizar:    ", "Elegir",
                JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        if (opcion == null) {
            mostrarMensaje("Hasta Pronto");
        }
        return opcion.toString();
    }

}
