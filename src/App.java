import Controlador.PaintListener;
import Modelo.Modelo;
import Vista.Vista;



public class App {
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista(modelo);
        PaintListener controlador = new PaintListener(modelo, vista);
        controlador.iniciar();
    }
    
}
