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
public class LogadoP extends JFrame {
    private JLabel lblOpcoes;
    private JButton btnModificar;
    private JButton btnDeletar;
    private JButton btnListar;
    private JButton btnSair;
    private JButton btnValun;
    private Container ctn;
    
    public LogadoP () {
    setSize(400, 400);
    setTitle("Home");
    ctn = getContentPane();
    lblOpcoes = new JLabel ("Menu Professores");
    
    btnModificar = new JButton("Modificar cadastros");
    btnDeletar = new JButton("Deletar cadastros");
    btnListar = new JButton("Listar cadastros");
    btnSair = new JButton("Sair");
    btnValun = new JButton("Menu Alunos");
    
    
    
  
    
    ctn.setLayout(null);
    
 
    lblOpcoes.setBounds(150, 50, 150, 25);
    btnModificar.setBounds(125, 100, 150, 50);
    btnDeletar.setBounds(125, 150, 150, 50);
    btnListar.setBounds(125, 200, 150, 50);
    btnSair.setBounds(0, 342, 50, 30);
    btnValun.setBounds(250, 342, 150, 30);
   
    ctn.add(lblOpcoes);
    ctn.add(btnModificar);
    ctn.add(btnDeletar);
    ctn.add(btnListar);
    ctn.add(btnSair);
    ctn.add(btnValun);
   
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
    
    btnModificar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            cliqueBtnModificar();
        }
    });
    
    btnDeletar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            cliqueBtnDeletar();
        }
    });
    
    btnListar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            cliqueBtnListar();
        }
    });
    
    btnValun.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            cliqueBtnValun();
        }
    });
   
    

    
}
    private void cliqueBtnSair(){
         this.dispose();
        new Login();
     }
    
    private void cliqueBtnModificar(){
         this.dispose();
        new ModificandoP();
     }
    
    private void cliqueBtnDeletar(){
         this.dispose();
        new DeletandoP();
     }
    
    private void cliqueBtnListar(){
         this.dispose();
        new ListandoP();
     }
    private void cliqueBtnValun(){
        this.dispose();
        new Logado();
    }
    
    public static void main (String[] args) {
 
        Logado logado  = new Logado();
        
    }
    
}
