import javax.swing.*;
import java.awt.*;

public class LineDrawer extends JPanel {

    public LineDrawer() {
        // Establecer el tamaño preferido del panel
        setPreferredSize(new Dimension(400, 400));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Dibujar una línea
        g2d.drawLine(200, 50, 200, 200);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Line Drawer");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new LineDrawer());
                frame.pack();
                frame.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
                frame.setVisible(true);
            }
        });
    }
}