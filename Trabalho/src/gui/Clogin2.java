/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import beans.Logins;
import dao.LoginsDAO;
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
public class Clogin2 extends JFrame {
    
    private JLabel lblLogin;
    private JTextField txtLogin;
    private JLabel lblSenha;
    private JTextField txtSenha;
    private JButton btnOK;
     private JButton btnVoltar;
    private Container ctn;
    
    
    
    
    public Clogin2 () {
    setSize(360, 360);
    setTitle("Criando Login");
    ctn = getContentPane();
    lblLogin = new JLabel (" Login");
    txtLogin = new JTextField();
    lblSenha = new JLabel (" Senha");
    txtSenha = new JTextField();
    
    btnOK = new JButton("Finalizar cadastro");
    btnVoltar = new JButton("Voltar");
    
    
    
    
  
    
    ctn.setLayout(null);
    
 
    lblLogin.setBounds(50, 100, 100, 25);
    txtLogin.setBounds(100, 100, 200, 25);
    lblSenha.setBounds(50, 150, 100, 25);
    txtSenha.setBounds(100, 150, 200, 25);
    btnOK.setBounds(125, 200, 150, 50);
    btnVoltar.setBounds(1, 290, 100, 40);
   
    ctn.add(lblLogin);
    ctn.add(txtLogin);
    ctn.add(lblSenha);
    ctn.add(txtSenha);
    ctn.add(btnOK);
    ctn.add(btnVoltar);
   
    setVisible(true);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    
    
    
    
    btnOK.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            cliqueBtnOK();
            }
    });
    
    btnVoltar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            cliqueBtnVoltar();
        }
    });
    

    
}
    
    private void cliqueBtnOK(){
        
        this.dispose();
        new Login();
        String login = txtLogin.getText(),
               senha = txtSenha.getText();
               
               
        
        
        Logins logins = new Logins();
        logins.setLogin(login);
        logins.setSenha(senha);
        
        
        LoginsDAO loginsDAO = new LoginsDAO();
        loginsDAO.inserir(logins);
        
        txtLogin.setText("");
        
     
    }
    
    private void cliqueBtnVoltar(){
     this.dispose();
        new Tela2();
    }
    
    
}
