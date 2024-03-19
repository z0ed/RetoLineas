package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Modelo {
    private List<Linea> lineas;
    private List<Linea> lineasBorradas;

    public Modelo() {
        lineas = new ArrayList<>();
        lineasBorradas = new ArrayList<>();
    }

    public void agregarLinea(Linea linea) {
        lineas.add(linea);
    }

    public List<Linea> getLineas() {
        return lineas;
    }

    public void borrarUltimaLinea() {
        if (!lineas.isEmpty()) {
            Linea ultimaLinea = lineas.remove(lineas.size() - 1);
            lineasBorradas.add(ultimaLinea);
        }
    }

    public void redo() {
        if (!lineasBorradas.isEmpty()) {
            Linea ultimaLineaBorrada = lineasBorradas.remove(lineasBorradas.size() - 1);
            lineas.add(ultimaLineaBorrada);
        }
    }
}
