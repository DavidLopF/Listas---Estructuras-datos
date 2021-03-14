package co.edu.unbosque.model;

public class NodoSimple {

    private String dato;
    private NodoSimple siguiente;

    public NodoSimple(String dato) {
        this.dato = dato;
        siguiente = null;
    }


    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoSimple getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSimple siguiente) {
        this.siguiente = siguiente;
    }
}
