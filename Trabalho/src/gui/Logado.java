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
public class Logado extends JFrame {
    private JLabel lblOpcoes;
    private JButton btnModificar;
    private JButton btnDeletar;
    private JButton btnListar;
    private JButton btnSair;
    private JButton btnVprof;
    private Container ctn;
    
    public Logado () {
    setSize(400, 400);
    setTitle("Home");
    ctn = getContentPane();
    lblOpcoes = new JLabel ("Menu Alunos");
    
    btnModificar = new JButton("Modificar cadastros");
    btnDeletar = new JButton("Deletar cadastros");
    btnListar = new JButton("Listar cadastros");
    btnSair = new JButton("Sair");
    btnVprof = new JButton("Menu Professores");
    
    
    
  
    
    ctn.setLayout(null);
    
 
    lblOpcoes.setBounds(150, 50, 100, 25);
    btnModificar.setBounds(125, 100, 150, 50);
    btnDeletar.setBounds(125, 150, 150, 50);
    btnListar.setBounds(125, 200, 150, 50);
    btnSair.setBounds(0, 342, 50, 30);
    btnVprof.setBounds(250, 342, 150, 30);
   
    ctn.add(lblOpcoes);
    ctn.add(btnModificar);
    ctn.add(btnDeletar);
    ctn.add(btnListar);
    ctn.add(btnSair);
    ctn.add(btnVprof);
   
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
    
    btnVprof.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            cliqueBtnVprof();
        }
    });
   
    

    
}
    private void cliqueBtnSair(){
         this.dispose();
        new Login();
     }
    
    private void cliqueBtnModificar(){
         this.dispose();
        new Modificando();
     }
    
    private void cliqueBtnDeletar(){
         this.dispose();
        new Deletando();
     }
    
    private void cliqueBtnListar(){
         this.dispose();
        new Listando();
     }
    private void cliqueBtnVprof(){
        this.dispose();
        new LogadoP();
    }
    
    public static void main (String[] args) {
 
        Logado logado  = new Logado();
        
    }
    
}
