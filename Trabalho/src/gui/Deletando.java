/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author gabrielcampos
 */
public class Deletando extends JFrame {
    
     private JLabel lblDeletando;
     private JButton btnSair;
     private Container ctn;
     
     public Deletando () {
     setSize(400, 400);
     setTitle("Deletando");
     ctn = getContentPane();
     lblDeletando = new JLabel ("Deletando");
     btnSair = new JButton("Sair");
     
     ctn.setLayout(null);
     
     lblDeletando.setBounds(190, 50, 100, 25);
     btnSair.setBounds(0, 330, 50, 30);
     
     
     ctn.add(lblDeletando);
     ctn.add(btnSair);
     
    setVisible(true);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
     
     
     btnSair.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            cliqueBtnSair();
        }
    });
     
     
     
     }
     private void cliqueBtnSair(){
         this.dispose();
        new Logado();
     }
}
