package co.edu.unbosque.controller;


import co.edu.unbosque.model.*;
import co.edu.unbosque.view.View;

public class Controller {

    private View view;
    private ListaSimple listaSimple;
    private ListaDoble listaDoble;
    private ListaCircular listaCircular;

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
                listaCircular = new ListaCircular();
                opcionesListaCirculiar();
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

           
            case "4. Busqueda secuencial recursivamente":
                String dato1 = view.capturarmensaje("Ingrese valor a buscar en la lista.");
                NodoSimple data = new NodoSimple(dato1);
                NodoSimple actual = listaSimple.getPrimero();
                if (listaSimple.busquedaRecursiva(actual, data, "").getDato().isEmpty()) {
                    view.mostrarMensaje("El dato " + dato1 + " ingresado no se encuentra en la lista\n" + listaSimple.mostrarListaSimple());
                } else {
                    view.mostrarMensaje("El dato " + dato1 + " ingresado se encuentra en la lista\n" + listaSimple.mostrarListaSimple());
                }
                opcionesListaSimple();

            case "5. Busqueda secuencial iterativametne":
                String dato = view.capturarmensaje("Ingrese valor a buscar en la lista.");
                if (listaSimple.busquedaIterativa(dato).isEmpty()) {
                    view.mostrarMensaje("El dato " + dato + " ingresado no se encuentra en la lista\n" + listaSimple.mostrarListaSimple());
                } else {
                    view.mostrarMensaje("El dato " + dato + " ingresado se encuentra en la lista\n" + listaSimple.mostrarListaSimple());
                }
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
                
            case "4. Busqueda secuencial recursivamente":
                String dato1 = view.capturarmensaje("Ingrese valor a buscar en la lista.");
                NodoDoble data = new NodoDoble(dato1);
                NodoDoble actual = listaDoble.getPrimero();
                if (listaDoble.busquedaRecursiva(actual, data,"").getDato().isEmpty()) {
                    view.mostrarMensaje("El dato " + dato1 + " ingresado no  se encuentra en la lista\n" + listaDoble.mostrarListaDoble());
                } else {
                    view.mostrarMensaje("El dato " + dato1 + " ingresado   se encuentra en la lista\n" + listaDoble.mostrarListaDoble());
                }
                opcionesListaDoble();

            case "5. Busqueda secuencial iterativamente":
                String dato = view.capturarmensaje("Ingrese valor a buscar en la lista.");
                if (listaDoble.busquedaIterativa(dato).isEmpty()) {
                    view.mostrarMensaje("El dato " + dato + " ingresado no se encuentra en la lista\n" +  listaDoble.mostrarListaDoble());
                } else {
                    view.mostrarMensaje("El dato " + dato + " ingresado   se encuentra en la lista\n" +  listaDoble.mostrarListaDoble());
                }
           

            case "Salir":
                funcionar();


                //parte gonzo

        }

    }

    public void opcionesListaCirculiar() {
        String opcion = view.menuLista();
        switch (opcion) {
            case "1. Ingresar":
                String elemento = view.capturarmensaje("Ingrese elemento a agregar a la lista circular");
                listaCircular.insertar(elemento);
                view.mostrarMensaje("La lista es :\n" + listaCircular.mostrarLista());
                opcionesListaCirculiar();
            case "2. Borrar iterativamente":
                listaCircular.eliminarIterativametne();
                view.mostrarMensaje("La lista es :\n" + listaCircular.mostrarLista());
                opcionesListaCirculiar();

            case "3. Borrar recursivamente":
                listaCircular.eliminaRecurisvamente(listaCircular.getPrimero());
                view.mostrarMensaje("La lista es :\n" + listaCircular.mostrarLista());
                opcionesListaCirculiar();
                
            case "4. Busqueda secuencial recursivamente":
                String dato1 = view.capturarmensaje("Ingrese valor a buscar en la lista.");
                NodoSimple data = new NodoSimple(dato1);
                NodoSimple actual = listaCircular.getPrimero();
                if (listaCircular.busquedaRecursiva(actual, data, "").getDato().isEmpty()) {
                    view.mostrarMensaje("El dato " + dato1 + " ingresado  se encuentra en la lista\n" + listaCircular.mostrarLista());
                } else {
                    view.mostrarMensaje("El dato " + dato1 + " ingresado no se encuentra en la lista\n" + listaCircular.mostrarLista());
                }
                opcionesListaCirculiar();

            case "5. Busqueda secuencial iterativamente":
                String dato = view.capturarmensaje("Ingrese valor a buscar en la lista.");
                if (listaCircular.busquedaIterativa(dato).isEmpty()) {
                    view.mostrarMensaje("El dato " + dato + " ingresado no se encuentra en la lista\n" + listaCircular.mostrarLista());
                } else { 
                    view.mostrarMensaje("El dato " + dato + " ingresado se encuentra en la lista\n" + listaCircular.mostrarLista());
                }
                opcionesListaCirculiar();
           
                
            case "Salir":
                funcionar();

                //parte gonzo :)
        }

    }


}
