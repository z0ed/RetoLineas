package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Modelo {
    private List<Linea> lineas;
    private int currentIndex;

    public Modelo() {
        lineas = new ArrayList<>();
        currentIndex = -1;
    }

    public void addLinea(Linea linea) {
        lineas.add(linea);
        currentIndex++;
    }

    public void undo() {
        if (currentIndex >= 0) {
            currentIndex--;
        }
    }

    public void redo() {
        if (currentIndex < lineas.size() - 1) {
            currentIndex++;
        }
    }

    public Linea getCurrentLinea() {
        if (currentIndex >= 0 && currentIndex < lineas.size()) {
            return lineas.get(currentIndex);
        }
        return null;
    }
}
