package Controlador;

import Modelo.Linea;
import Modelo.Modelo;
import Vista.Vista;

public class PaintListener {
    private Modelo model;
    private Vista view;

    public PaintListener(Modelo model, Vista view) {
        this.model = model;
        this.view = view;
    }

    public void addLinea(Linea linea) {
        model.addLinea(linea);
        view.repaint();
        System.out.println("dibuje la linea controlador");

    }

    public void undo() {
        model.undo();
        view.repaint();
    }

    public void redo() {
        model.redo();
        view.repaint();
    }
}
