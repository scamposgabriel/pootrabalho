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
public class Cadastro extends JFrame {
    
    private JLabel lblEscolha;
    private JButton btnAl;
    private JButton btnPf;
    private JButton btnVoltar;
    private Container ctn;
    
    
    
    
    public Cadastro () {
    setSize(400, 400);
    setTitle("Cadastro");
    ctn = getContentPane();
    lblEscolha = new JLabel ("Escolha uma das opções");
    
    btnAl = new JButton("Aluno");
    btnPf = new JButton("Professor");
    btnVoltar = new JButton("Voltar");
    
    
    
  
    
    ctn.setLayout(null);
    
 
    lblEscolha.setBounds(125, 100, 500, 25);
    btnAl.setBounds(125, 150, 150, 50);
    btnPf.setBounds(125, 200, 150, 50);
    btnVoltar.setBounds(0, 320, 50, 50);
   
    ctn.add(lblEscolha);
    ctn.add(btnAl);
    ctn.add(btnPf);
    ctn.add(btnVoltar);
   
    setVisible(true);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    
    
    
    btnVoltar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            cliqueBtnVoltar();
        }
    });
    
    btnAl.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            cliqueBtnAl();
            }
    });
    
    btnPf.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            cliqueBtnPf();
            }
    });

    
}
    private void cliqueBtnVoltar(){
         this.dispose();
        new Login();
     }
    private void cliqueBtnAl(){
         this.dispose();
        new Tela1();
     }
    private void cliqueBtnPf(){
         this.dispose();
        new Tela2();
     }
}
