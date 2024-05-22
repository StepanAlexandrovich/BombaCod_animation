package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class AnimationFrame extends JFrame{
    private JLabel label;
    private BufferedImage image = new BufferedImage(200, 200, BufferedImage.TYPE_INT_ARGB);

    public AnimationFrame() {
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon(image));

        this.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));

        this.add(label);

        this.setBounds(0,0,210,230);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private int i = 0;
    public void update(){
        Graphics g = image.getGraphics();
        int multiplication = 10;
        g.setColor(Color.RED);
        g.fillRect(0,0,200,200);
        g.setColor(Color.BLACK);
        g.fillRect(i*multiplication,0,multiplication,multiplication);
        i++;
        ////////////////
        repaint();
    }
}
