package co.edu.unbosque.controller;


import co.edu.unbosque.model.ListaSimple;
import co.edu.unbosque.view.View;

public class Controller {

    private View view;
    private ListaSimple listaSimple;

    public Controller() {

        view = new View();
        funcionar();
    }

    private void funcionar() {
        String opcion = view.menuPrincipal();
        switch (opcion) {

            case "1. Lista simple":
                listaSimple = new ListaSimple();


                break;

        }

    }


}
