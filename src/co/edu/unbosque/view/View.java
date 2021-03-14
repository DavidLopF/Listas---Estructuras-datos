package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

public class View {


    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public String capturarmensaje(String mensaje) {
        String r = JOptionPane.showInputDialog(null, mensaje);
        return r;
    }

    public String menuPrincipal() {
        Object[] opciones = {"1. Lista simple", "2.Lista doble", "3.Lista circular", "Salir"};
        Object opcion = JOptionPane.showInputDialog(null, "      ..:Bienvenido señor usuario :..                " + "\n\n\nSelecciona un operacion a realizar:    ", "Elegir",
                JOptionPane.QUESTION_MESSAGE, devolverImagen("icon", "jpg", 55, 55), opciones, opciones[0]);
        if (opcion == null) {
            mostrarMensaje("Hasta Pronto");
        }
        return opcion.toString();
    }

    public String menuLista() {
        Object[] opciones = {"1. Ingresar", "2. Borrar iterativamente", "3. Borrar recursivamente", "4. Busqueda secuencial recursivamente",
                "5. Busqueda secuencial iterativametne", "Salir"};
        Object opcion = JOptionPane.showInputDialog(null, "Selecciona un operacion a realizar:    ", "Elegir",
                JOptionPane.QUESTION_MESSAGE, devolverImagen("icon", "jpg", 55, 55), opciones, opciones[0]);
        if (opcion == null) {
            mostrarMensaje("Hasta Pronto");
        }
        return opcion.toString();
    }


    public ImageIcon devolverImagen(String src, String tipo, int escalax, int escalay) {
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/" + src + "." + tipo));
        ImageIcon icon = new ImageIcon(imagen1.getImage().getScaledInstance(escalax, escalay, Image.SCALE_DEFAULT));
        return icon;
    }


}
