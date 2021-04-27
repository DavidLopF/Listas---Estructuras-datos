package co.edu.unbosque.model;

public class ListaDoble {

    private NodoDoble primero;


    public ListaDoble() {
        primero = null;
    }

    private boolean estaVacia() {
        return primero == null;
    }

    public void insertar(String elemento) {
        if (estaVacia()) {
            primero = new NodoDoble(elemento);
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

    public void eliminarIterativamente() {
        if (!estaVacia()) {
            if (primero.getSiguiente() != null) {
                NodoDoble ultimo = primero;

                while (ultimo.getSiguiente() != null) {
                    ultimo = ultimo.getSiguiente();
                }

                NodoDoble antepenultimo = ultimo.getAnterior();
                antepenultimo.setSiguiente(null);
                ultimo = null;
            } else {
                primero = null;
            }
        }
    }

    public NodoDoble elimiarRecursivamente(NodoDoble ultimo) {
        if (!estaVacia()) {
            if (primero.getSiguiente() != null) {
                if (ultimo.getSiguiente() != null) {
                    return elimiarRecursivamente(ultimo.getSiguiente());
                }
                NodoDoble antepenultimo = ultimo.getAnterior();
                ultimo = null;
                antepenultimo.setSiguiente(null);
            } else {
                primero = null;
            }
        }
        return null;
    }
    public String busquedaIterativa(String dato) {
        String r = "";
        if (!estaVacia()) {
            NodoDoble actual = primero;
            while (actual != null ) {
                if (actual.getDato().equals(dato)) {
                    r = actual.getDato();
                }
                actual = actual.getSiguiente();
            }
        }
        return r;
    }


    public NodoSimple busquedaRecursiva(NodoDoble actual, NodoDoble data,String a) {
        if (!estaVacia()) {
            if (actual != null) {
                if (actual.getDato().equals(data.getDato())) {
                    a = actual.getDato();
                }
                return busquedaRecursiva(actual.getSiguiente(), data ,a);
            }
        }
        NodoSimple temp = new NodoSimple(a);
        return temp;
    }

   
    

    public NodoDoble getPrimero() {
        return primero;
    }
}
