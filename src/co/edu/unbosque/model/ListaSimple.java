package co.edu.unbosque.model;

public class ListaSimple {

    private NodoSimple primero;

    public ListaSimple() {
        primero = null;
    }

    public boolean listaVacia() {
        return primero == null;
    }

    public void insertarTop(String elemento) {
        NodoSimple nuevo = new NodoSimple(elemento);
        nuevo.setSiguiente(primero);
        primero = nuevo;

    }

    public String mostrarListaSimple() {
        if (!listaVacia()) {
            NodoSimple actual = primero;
            String r = "";
            while (actual != null) {
                r += actual.getDato() + " -> ";
                actual = actual.getSiguiente();
            }
            r = r.substring(0, r.length() - 3);
            return r;
        } else {
            return "Lista vacia";
        }
    }

    public void eliminarIterativamente() {
        if (!listaVacia()) {
            if (primero.getSiguiente() != null) {
                NodoSimple a = primero;
                NodoSimple b = primero.getSiguiente();
                while (b.getSiguiente() != null) {
                    a = a.getSiguiente();
                    b = b.getSiguiente();
                }
                b = null;
                a.setSiguiente(null);
            } else {
                primero = null;

            }
        }
    }

    public NodoSimple eliminarRecursivamente(NodoSimple anterioUltimo, NodoSimple ultimo) {
        if (!listaVacia()) {
            if (primero.getSiguiente() != null) {
                anterioUltimo = primero;
                ultimo = primero.getSiguiente();
                if (ultimo.getSiguiente() != null) {
                    return eliminarRecursivamente(anterioUltimo.getSiguiente(), ultimo.getSiguiente());
                }
                ultimo = null;
                anterioUltimo.setSiguiente(null);
            } else {
                primero = null;
            }
        }
        return null;
    }

    //parte gonzo
}
