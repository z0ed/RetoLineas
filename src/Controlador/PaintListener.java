package Controlador;

import Modelo.Linea;
import Modelo.Modelo;
import Vista.Vista;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener; 

public class PaintListener {

    private Linea linea;
    private Vista vista;
    private Modelo modelo;

    public PaintListener(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void MouseFirstClick(MouseEvent e){
        linea.setX1(e.getX());
        linea.setY1(e.getY());
    }

    public void MouseSecondClick(MouseEvent e){
        linea.setX2(e.getX());
        linea.setY2(e.getY());
    }

}
