package Controlador;

import Modelo.Modelo;
import Vista.Vista;

public class PaintListener {
    private Modelo modelo;
    private Vista vista;

    public PaintListener(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        vista.setVisible(true);
    }
}

