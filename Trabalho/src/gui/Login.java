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
import javax.swing.JTextField;

/**
 *
 * @author gabrielcampos
 */
public class Login extends JFrame {
    
    private JLabel lblLogin;
    private JTextField txtLogin;
    private JLabel lblSenha;
    private JTextField txtSenha;
    private JButton btnOK;
    private JButton btnCd;
    private Container ctn;
    
    
    
    
    public Login () {
    setSize(360, 360);
    setTitle("Login");
    ctn = getContentPane();
    lblLogin = new JLabel (" Login");
    txtLogin = new JTextField();
    lblSenha = new JLabel (" Senha");
    txtSenha = new JTextField();
    
    btnOK = new JButton("Entrar");
    btnCd = new JButton("Criar cadastro");
    
    
    
  
    
    ctn.setLayout(null);
    
 
    lblLogin.setBounds(50, 100, 100, 25);
    txtLogin.setBounds(100, 100, 200, 25);
    lblSenha.setBounds(50, 150, 100, 25);
    txtSenha.setBounds(100, 150, 200, 25);
    btnOK.setBounds(125, 200, 150, 50);
    btnCd.setBounds(125, 250, 150, 50);
   
    ctn.add(lblLogin);
    ctn.add(txtLogin);
    ctn.add(lblSenha);
    ctn.add(txtSenha);
    ctn.add(btnOK);
    ctn.add(btnCd);
   
    setVisible(true);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    
    
    btnCd.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            cliqueBtnCd();
        }
    });
    
    btnOK.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            cliqueBtnOK();
            }
    });
    

    
}
    private void cliqueBtnCd(){
         this.dispose();
        new Cadastro();
     }
    
    private void cliqueBtnOK(){
         this.dispose();
        new Logado();
     }
    
}
