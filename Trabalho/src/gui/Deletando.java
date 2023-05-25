/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author gabrielcampos
 */
public class Deletando extends JFrame {
    
     private JLabel lblDeletando;
     private JButton btnSair;
     private JLabel lblCPF;
     private JTextField txtCPF;
     private JButton btnDeletar;
     private Container ctn;
     
     public Deletando () {
     setSize(400, 400);
     setTitle("Deletando");
     ctn = getContentPane();
     lblDeletando = new JLabel ("Digite o CPF");
     lblCPF = new JLabel ("CPF");
     txtCPF = new JTextField();
     btnSair = new JButton("Sair");
     btnDeletar = new JButton("Deletar");
     
     ctn.setLayout(null);
     
     lblDeletando.setBounds(190, 50, 100, 25);
     btnSair.setBounds(0, 330, 50, 30);
     lblCPF.setBounds(100, 100, 100, 25);
     txtCPF.setBounds(150, 100, 200, 25);
     btnDeletar.setBounds(200, 150, 100, 50);
     
     
     ctn.add(lblDeletando);
     ctn.add(lblCPF);
     ctn.add(txtCPF);
     ctn.add(btnSair);
     ctn.add(btnDeletar);
     
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
