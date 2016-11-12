/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.awt.BorderLayout;

import java.awt.Dimension;
import java.net.URL;

 

import javax.swing.BorderFactory;

import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.JScrollPane;

import javax.swing.JTextArea;

import javax.swing.UIManager;

 



 

public class TesteJFrameWithBackground {

        public void initEste() {
            

               try{

                       //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

               } catch(Exception exception){

                      

               }

              

               JPanel jPanel3 = new JPanel(new BorderLayout());

               jPanel3.add(new JLabel("teste-background"), BorderLayout.NORTH);

               jPanel3.add(new JLabel("texto:"), BorderLayout.WEST);

               jPanel3.add(new JScrollPane(new JTextArea()), BorderLayout.CENTER);

               jPanel3.add(new JLabel("teste-background-fim"), BorderLayout.SOUTH);

               jPanel3.setPreferredSize(new Dimension(400,500));

               jPanel3.setBorder(BorderFactory.createTitledBorder("jPanel3"));

               jPanel3.setOpaque(false);

              URL resource = this.getClass().getResource("backgroud1.jpg");
               String t = resource.toString();
               t = t.replaceAll("file:", "");

               JFrameWithBackground jFrame = new JFrameWithBackground(t);
               
               

               jFrame.setLayout(new BorderLayout());

               jFrame.getContentPane().add(jPanel3, BorderLayout.NORTH);

               jFrame.setVisible(true);

        }
        
        public static void main(String[] args) {
            TesteJFrameWithBackground t = new TesteJFrameWithBackground();
            t.initEste();
        }

}

