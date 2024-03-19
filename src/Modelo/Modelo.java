package Modelo;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Modelo {
    private List<Linea> lineas;
    private List<Linea> lineasBorradas;
    private boolean undoRealizado;

    public Modelo() {
        lineas = new ArrayList<>();
        lineasBorradas = new ArrayList<>();
        undoRealizado = false;
    }

    public void agregarLinea(Linea linea) {
        if (undoRealizado) {
            lineasBorradas.clear();
            undoRealizado = false;
        }
        lineas.add(linea);
    }

    public List<Linea> getLineas() {
        return lineas;
    }

    public void borrarUltimaLinea() {
        if (!lineas.isEmpty()) {
            Linea ultimaLinea = lineas.remove(lineas.size() - 1);
            lineasBorradas.add(ultimaLinea);
            undoRealizado = true;
        }
    }

    public void redo() {
        if (undoRealizado && !lineasBorradas.isEmpty()) {
            Linea ultimaLineaBorrada = lineasBorradas.remove(lineasBorradas.size() - 1);
            lineas.add(ultimaLineaBorrada);
        }
    }
}

