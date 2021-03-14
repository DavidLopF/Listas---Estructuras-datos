package co.edu.unbosque.controller;


import co.edu.unbosque.model.ListaDoble;
import co.edu.unbosque.model.ListaSimple;
import co.edu.unbosque.model.NodoDoble;
import co.edu.unbosque.model.NodoSimple;
import co.edu.unbosque.view.View;

public class Controller {

    private View view;
    private ListaSimple listaSimple;
    private ListaDoble listaDoble;

    public Controller() {

        view = new View();
        funcionar();
    }

    private void funcionar() {
        String opcion = view.menuPrincipal();
        switch (opcion) {

            case "1. Lista simple":
                listaSimple = new ListaSimple();
                opcionesListaSimple();
                break;

            case "2.Lista doble":
                listaDoble = new ListaDoble();
                opcionesListaDoble();
                break;

            case "3.Lista circular":
                opcionesListaCiruliar();
                break;

        }

    }

    private void opcionesListaSimple() {
        String opcion = view.menuLista();
        switch (opcion) {
            case "1. Ingresar":
                String elemento = view.capturarmensaje("Ingrese dato a agregar a la lista: ");
                listaSimple.insertarTop(elemento);
                view.mostrarMensaje("Elemento agregado con exito.\n" + "La lista es:\n" + listaSimple.mostrarListaSimple());
                opcionesListaSimple();

            case "2. Borrar iterativamente":

                listaSimple.eliminarIterativamente();
                view.mostrarMensaje("Elemento eliminado con exito:\n" + "La lista es:\n" + listaSimple.mostrarListaSimple());
                opcionesListaSimple();

            case "3. Borrar recursivamente":

                NodoSimple ultimo = null;
                NodoSimple antepenultimo = null;
                listaSimple.eliminarRecursivamente(antepenultimo, ultimo);
                view.mostrarMensaje("Elemento eliminado con exito:\n" + "La lista es:\n" + listaSimple.mostrarListaSimple());
                opcionesListaSimple();

            case "Salir":
                funcionar();


                //parte de gonzo
        }

    }

    public void opcionesListaDoble() {
        String opcion = view.menuLista();
        switch (opcion) {
            case "1. Ingresar":
                String elemento = view.capturarmensaje("Ingrese dato a agregar a la lista: ");
                listaDoble.insertar(elemento);
                view.mostrarMensaje("Elemento ingresado con exito\n\n" + "La lista es:\n" + listaDoble.mostrarListaDoble());
                opcionesListaDoble();

            case "2. Borrar iterativamente":
                listaDoble.eliminarIterativamente();
                view.mostrarMensaje("Elemento eliminado con exito:\n\n" + "La lista es:\n" + listaDoble.mostrarListaDoble());
                opcionesListaDoble();

            case "3. Borrar recursivamente":
                NodoDoble ultimo = listaDoble.getPrimero();
                listaDoble.elimiarRecursivamente(ultimo);
                view.mostrarMensaje("Elemento eliminado con exito:\n\n" + "La lista es:\n" + listaDoble.mostrarListaDoble());
                opcionesListaDoble();

            case "Salir":
                funcionar();


                //parte gonzo

        }

    }

    public void opcionesListaCiruliar() {
        String opcion = view.menuLista();
        switch (opcion) {
            case "1. Ingresar":
        }

    }


}
