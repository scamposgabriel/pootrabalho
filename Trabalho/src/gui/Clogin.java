/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import bd.UConection;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author gabrielcampos
 */
public class Clogin extends JFrame {
    
    private JLabel lblLogin;
    private JTextField txtLogin;
    private JLabel lblSenha;
    private JTextField txtSenha;
    private JButton btnOK;
    private Container ctn;
    
    
    
    
    public Clogin () {
    setSize(360, 360);
    setTitle("Criando Login");
    ctn = getContentPane();
    lblLogin = new JLabel (" Login");
    txtLogin = new JTextField();
    lblSenha = new JLabel (" Senha");
    txtSenha = new JTextField();
    
    btnOK = new JButton("Finalizar cadastro");
    
    
    
    
  
    
    ctn.setLayout(null);
    
 
    lblLogin.setBounds(50, 100, 100, 25);
    txtLogin.setBounds(100, 100, 200, 25);
    lblSenha.setBounds(50, 150, 100, 25);
    txtSenha.setBounds(100, 150, 200, 25);
    btnOK.setBounds(125, 200, 150, 50);
   
    ctn.add(lblLogin);
    ctn.add(txtLogin);
    ctn.add(lblSenha);
    ctn.add(txtSenha);
    ctn.add(btnOK);
   
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
    

    
}
    
    private void cliqueBtnOK(){
        
        this.dispose();
        new Login();
        String login = txtLogin.getText(),
               senha = txtSenha.getText();
               
               
        
        
        System.out.println("login : " + login);
        System.out.println("senha : " + senha);
        
        try(PrintWriter pw = new PrintWriter(new File("lusuarios"))){
            pw.println("login : " + login);
            pw.println("senha : " + senha);
        }catch(FileNotFoundException e){
            System.out.println("Arquivo não existe");
        }
        try {
             UConection.insereLusuario(login, senha);
        } catch (Exception e) {
            System.out.println(e);
        }
        
     
    }
    
    
}
