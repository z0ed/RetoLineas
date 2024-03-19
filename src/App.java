import Controlador.PaintListener;
import Modelo.Modelo;
import Modelo.Linea;
import Vista.Vista;



public class App {
    public static void main(String[] args) {
        Modelo model = new Modelo();
        Vista view = new Vista(model);
        PaintListener controller = new PaintListener(model, view);

        // Agregar una línea inicial
        Linea lineaInicial = new Linea(50, 50, 200, 200);
        controller.addLinea(lineaInicial);
    }
}
