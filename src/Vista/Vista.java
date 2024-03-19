package Vista;

import javax.swing.*;

import Modelo.Linea;
import Modelo.Modelo;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Vista extends JFrame {
    private JPanel lienzo;
    private Modelo modelo;
    private Point puntoInicial;

    public Vista(Modelo modelo) {
        this.modelo = modelo;
        setTitle("Canvas con Undo y Redo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        lienzo = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                for (Linea linea : modelo.getLineas()) {
                    g.drawLine(linea.getPuntoInicial().x, linea.getPuntoInicial().y,
                            linea.getPuntoFinal().x, linea.getPuntoFinal().y);
                }
            }
        };
        lienzo.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (puntoInicial == null) {
                    puntoInicial = e.getPoint();
                } else {
                    modelo.agregarLinea(new Linea(puntoInicial, e.getPoint()));
                    puntoInicial = null;
                    repaint();
                }
            }
        });

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(lienzo, BorderLayout.CENTER);

        JPanel panelBotones = new JPanel();
        JButton undoButton = new JButton("Undo");
        undoButton.addActionListener(e -> {
            modelo.borrarUltimaLinea();
            repaint();
        });
        JButton redoButton = new JButton("Redo");
        redoButton.addActionListener(e -> {
            modelo.redo();
            repaint();
        });
        panelBotones.add(undoButton);
        panelBotones.add(redoButton);
        getContentPane().add(panelBotones, BorderLayout.SOUTH);

        setVisible(true);
    }
}
