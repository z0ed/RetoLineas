package Vista;

import javax.swing.*;

import Modelo.Modelo;

import java.awt.*;

public class Vista {

JFrame frame;

DrawArea drawArea;


    public Vista(){

        frame = new JFrame("Reto Semanal");
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        drawArea= new DrawArea();
        frame.add(drawArea, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        JButton undoButton = new JButton("Undo");
        JButton redoButton = new JButton("redo");

        buttonPanel.add(redoButton);
        buttonPanel.add(undoButton);

         undoButton.addActionListener(e -> Modelo.addLine());

        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    public class DrawArea extends JPanel {

    
        
    }

}
