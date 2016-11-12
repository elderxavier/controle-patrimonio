/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.elderxavier.resource;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author elder
 */
public class topPanel extends JPanel {

    private Image image;

    public topPanel() {
        this.initialize();
    }

    protected void initialize() {
        this.image = this.getImage();
        this.setLayout(new BorderLayout());
        this.setAlignmentX(0.0F);
        this.setAlignmentY(0.0F);
        this.setAutoscrolls(true);
    }

    public Image getImage() {
        URL imageURL = getClass().getResource("/br/com/elderxavier/images/backgroud1.jpg");
        if (imageURL == null) {
            return null;
        }
        return new ImageIcon(imageURL).getImage();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Dimension dDesktop = this.getSize();
        double width = dDesktop.getWidth();
        double height = dDesktop.getHeight();
        Image background = new ImageIcon(this.image.getScaledInstance(
                (int) width, 150, 1)).getImage();
        g.drawImage(background, 0, 0, this);
    }

    /*public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new MyPanel());
        frame.setSize(400, 300);
        frame.setVisible(true);
    }*/
}
