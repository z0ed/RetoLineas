package Modelo;
import java.awt.*;

public class Linea {
    private Point puntoInicial;
    private Point puntoFinal;

    public Linea(Point puntoInicial, Point puntoFinal) {
        this.puntoInicial = puntoInicial;
        this.puntoFinal = puntoFinal;
    }

    public Point getPuntoInicial() {
        return puntoInicial;
    }

    public Point getPuntoFinal() {
        return puntoFinal;
    }
}
