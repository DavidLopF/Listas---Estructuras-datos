package co.edu.unbosque.model;

public class NodoDoble {

    private String dato;
    private NodoDoble anterior;
    private NodoDoble siguiente;

    public NodoDoble(String dato) {
        this.dato = dato;
        anterior = null;
        siguiente= null;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }

    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }
}
