package co.edu.unbosque.model;

public class ListaDoble {

    private NodoDoble primero;
    private NodoDoble fin;

    public ListaDoble() {
        primero = null;
        fin = null;
    }

    private boolean estaVacia() {
        return primero == null;
    }

    public void insertar(String elemento) {
        if (estaVacia()) {
            primero = new NodoDoble(elemento);
            fin = primero;
        } else {
            NodoDoble nuevo = new NodoDoble(elemento);
            nuevo.setSiguiente(primero);
            primero.setAnterior(nuevo);
            primero = nuevo;
        }
    }

    public String mostrarListaDoble() {
        if (!estaVacia()) {
            NodoDoble actual = primero;
            String r = "";
            while (actual != null) {
                r += actual.getDato() + " <-> ";
                actual = actual.getSiguiente();
            }
            r = r.substring(0, r.length() - 4);
            return r;
        } else {
            return "Lista vacia";
        }
    }

    public void eliminarIterativamente(){
        NodoDoble ultimo = primero;

        while (ultimo.getSiguiente() != null ){
            ultimo = ultimo.getSiguiente();
        }

        NodoDoble antepenultimo = ultimo.getAnterior();
        antepenultimo.setSiguiente(null);
        ultimo = null;
    }

    public NodoDoble elimiarREcursivamente(NodoDoble ultimo){


    }


}
