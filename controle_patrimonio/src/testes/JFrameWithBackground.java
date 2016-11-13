/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.awt.Graphics;

import java.awt.Image;

import java.awt.Toolkit;

import javax.swing.JFrame;

import javax.swing.JPanel;

public class JFrameWithBackground extends JFrame {

    Image bImage;

    public JFrameWithBackground(String path) {

        this.bImage = this.createImage(path);

        this.initComponents();

    }

    public void initComponents() {

        super.setContentPane(new NewContentPane());

        super.setExtendedState(JFrame.MAXIMIZED_BOTH);

    }

    private Image createImage(String path) {

        return Toolkit.getDefaultToolkit().createImage(path);

    }

    private class NewContentPane extends JPanel {

        protected void paintComponent(final Graphics g) {

            super.paintComponent(g);

            g.drawImage(bImage, 0, 0, this);

        }

    }

}
