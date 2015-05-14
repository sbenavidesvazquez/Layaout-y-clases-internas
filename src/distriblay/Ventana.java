/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distriblay;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Serg Bena
 */
public class Ventana {

    JFrame marco;
    JPanel panel;
    JButton b1;
    JButton b6,b3;

    public Ventana() {
        marco = new JFrame("**LAYOUTS**");
        panel = new JPanel();
        b1 = new JButton("podemos");
        JButton b2 = new JButton("psoe");
         b3 = new JButton("UPyD");
        JButton b4 = new JButton("IU");
        JButton b5 = new JButton("BNG");
        b6 = new JButton("");
         b3.addActionListener(new Evento());

        marco.setSize(500, 500);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*
         FlowLayout dis=new FlowLayout();
         panel.setLayout(dis);
         // TAMEN pane.setLayout(new FlowLayout());
        
         panel.add(b1);
         panel.add(b2);
         panel.add(b3);
         panel.add(b4);
         panel.add(b5);
         marco.add(panel);
         */
        /*
         panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        
         panel.add(b1);
         panel.add(b2);
         panel.add(b3);
         panel.add(b4);
         panel.add(b5);
         marco.add(panel);
         */
        /*
         panel.setLayout(new BorderLayout());
         b1.setSize(1000, 1000);
         panel.add(b1,BorderLayout.NORTH);
         panel.add(b2,BorderLayout.SOUTH);
         panel.add(b3,BorderLayout.CENTER);
         panel.add(b4,BorderLayout.WEST);
         panel.add(b5,BorderLayout.EAST);
         marco.add(panel);
         */

        panel.setLayout(new GridLayout(3, 4));
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        marco.add(panel);
    }

    public class Evento implements ActionListener {

        public Evento() {            

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(b3)) {
                Evento ev = new Evento();
               JFrame mar = new JFrame("Ventana Interna");
               JPanel pam=new JPanel();
               JLabel lab=new JLabel("En serio vas a votar a estos, si ya no existen");
               pam.add(lab);
               mar.add(pam);
            mar.setSize(300, 300);
            mar.setVisible(true);
            mar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }

        }

    }
}
