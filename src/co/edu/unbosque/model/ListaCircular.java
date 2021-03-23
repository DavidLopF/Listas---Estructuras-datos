package co.edu.unbosque.model;

public class ListaCircular {

    private NodoSimple primero;
    private NodoSimple ultimo;

    public ListaCircular() {
        primero = null;
        ultimo = null;
    }

    public void insertar(String elemento) {
        NodoSimple nuevo = new NodoSimple(elemento);
        if (primero == null) {

            primero = nuevo;
            ultimo = primero;
            primero.setSiguiente(ultimo);
        } else {
            ultimo.setSiguiente(nuevo);
            nuevo.setSiguiente(primero);
            ultimo = nuevo;
        }
    }

    public boolean listaVacia() {
        return primero == null;
    }

    public String mostrarLista() {
        if (!listaVacia()) {
            NodoSimple actual = primero;
            String r = "";
            do {
                r += actual.getDato() + " -> ";
                actual = actual.getSiguiente();
            } while (actual != primero);

            r += "primer elemento";
            return r;
        } else {
            return "Lista vacia";
        }
    }

    public void eliminarIterativametne() {
        if (!listaVacia()) {
            if (ultimo == primero) {
                ultimo = null;
                primero = null;
            } else {
                NodoSimple actual = primero;
                while (actual.getSiguiente() != ultimo) {
                    actual = actual.getSiguiente();
                }
                actual.setSiguiente(primero);
                ultimo = actual;
            }
        }
    }

    public NodoSimple eliminaRecurisvamente(NodoSimple actual) {
        if (!listaVacia()) {
            if (ultimo == primero) {
                ultimo = null;
                primero = null;
            } else {
                actual = primero;
                if (actual.getSiguiente() != ultimo) {
                    return eliminaRecurisvamente(actual.getSiguiente());
                }

                actual.setSiguiente(primero);
                ultimo = actual;

            }
        }
        return null;
    }
    
    public String busquedaIterativa(String dato) {
    	return "x";
    }


    public NodoSimple busquedaRecursiva(NodoSimple actual, NodoSimple dato,String a) {
        if (!listaVacia()) {
            if (actual != primero.getSiguiente() && actual != ultimo) {
                if (actual.getSiguiente().getDato().equals(dato.getDato())) {
                    a = actual.getDato();
                }
                return busquedaRecursiva(actual.getSiguiente(), dato ,a);
            }
        
    }
    
        NodoSimple temp = new NodoSimple(a);
        return temp;
    }

    public NodoSimple getPrimero() {
        return primero;
    }

	
	
}
