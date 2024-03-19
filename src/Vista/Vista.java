package Vista;

import javax.swing.*;
import Modelo.Linea;
import Modelo.Modelo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Vista extends JPanel {
    private JFrame frame;
    private JButton redoButton;
    private JButton undoButton;
    private JPanel drawingPanel;
    private Modelo model;

    public Vista(Modelo model) {
        this.model = model;
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Line Drawer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        redoButton = new JButton("Redo");
        undoButton = new JButton("Undo");

        redoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.redo();
                drawingPanel.repaint();
            }
        });

        undoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.undo();
                drawingPanel.repaint();
            }
        });

        drawingPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                Linea currentLinea = model.getCurrentLinea();
                if (currentLinea != null) {
                    g2d.drawLine(currentLinea.getX1(), currentLinea.getY1(),
                                 currentLinea.getX2(), currentLinea.getY2());
                }
                System.out.println("linea"+currentLinea);
            }
        };

        frame.setLayout(new BorderLayout());
        frame.add(drawingPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(undoButton);
        buttonPanel.add(redoButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
