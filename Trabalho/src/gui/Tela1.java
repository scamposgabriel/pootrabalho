/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gui;

//1 passo 

import bd.BDConnection;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.ParseException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class Tela1 extends JFrame {
    //2 passo
    private JLabel lblNome;
    private JTextField txtNome;
    private JLabel lblIdade;
    private JTextField txtIdade;
    private JLabel lblAltura;
    private JTextField txtAltura;
    private JLabel lblPeso;
    private JTextField txtPeso;
    private JLabel lblSexo;
    private JComboBox cmbSexo;
    private JLabel lblCPF;
    private JFormattedTextField txtCPF;
    private JLabel lblData;
    private JFormattedTextField txtData;
    private JLabel lblCep;
    private JFormattedTextField txtCep;
    private JLabel lblTelefone;
    private JFormattedTextField txtTelefone;
    private JLabel lblEmail;
    private JTextField txtEmail;
//    private JLabel lblLogin;
//    private JTextField txtLogin;
//    private JLabel lblSenha;
//    private JTextField txtSenha;
//    private JLabel lblTipo;
//    private JComboBox cmbTipo;
    private final String[] tiposSexo = {
    "Masculino",  "Feminino", "Não-binário", "Prefiro não informar", "Outro"};
    private JButton btnOK;
    private JButton btnVoltar;
    private Container ctn;
    
    
    
   
    
    
    

public Tela1 () {
    setSize(400, 700);
    setTitle("Alunos");
    ctn = getContentPane();
    lblNome = new JLabel (" Nome");
    txtNome = new JTextField();
    lblIdade = new JLabel (" Idade");
    txtIdade = new JTextField();
    lblAltura = new JLabel (" Altura");
    txtAltura = new JTextField();
    lblPeso = new JLabel (" Peso");
    txtPeso = new JTextField();
    lblCPF = new JLabel(" CPF");
    lblData = new JLabel(" Data de nascimento");
    lblCep = new JLabel(" Cep");
    lblTelefone = new JLabel(" Telefone");
    lblEmail = new JLabel(" Email");
    txtEmail = new JTextField();
//    lblLogin = new JLabel(" Login");
//    txtLogin = new JTextField();
//    lblSenha = new JLabel(" Senha");
//    txtSenha = new JTextField();
    
    
    
    
    
    
    try {
        txtCPF = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
    } catch (ParseException e) {
    e.printStackTrace();
    }
    try {
        txtData = new JFormattedTextField(new MaskFormatter("####/##/##"));
    } catch (ParseException e) {
    e.printStackTrace();
    }
    try {
        txtCep = new JFormattedTextField(new MaskFormatter("#####-###"));
    } catch (ParseException e) {
    e.printStackTrace();
    }
    try {
        txtTelefone = new JFormattedTextField(new MaskFormatter("(##)#####-####"));
    } catch (ParseException e) {
    e.printStackTrace();
    }
    

    lblSexo = new JLabel(" Sexo");
    cmbSexo = new JComboBox (tiposSexo);
    btnOK = new JButton("Continuar");
    btnVoltar = new JButton("Voltar");
    
    
   btnVoltar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
             cliqueBtnVoltar();
        }
    });
    
     
    btnOK.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
             cliqueBtnEnviar();
        }
    });
    
    ctn.setLayout(null);
    
    
    
   
    
    
    
    
    
   
    
    lblNome.setBounds(0, 0, 100, 25);
    txtNome.setBounds(150, 0, 200, 25);
    lblIdade.setBounds(0, 50, 100, 25);
    txtIdade.setBounds(150, 50, 200, 25);
    lblAltura.setBounds(0, 100, 100, 25);
    txtAltura.setBounds(150, 100, 200, 25);
    lblPeso.setBounds(0, 150, 100, 25);
    txtPeso.setBounds(150, 150, 200, 25);
    lblSexo.setBounds(0, 200, 200, 25);
    cmbSexo.setBounds(150, 200, 200, 25);
    lblCPF.setBounds(0, 250, 100, 25);
    txtCPF.setBounds(150, 250, 200, 25);
    lblData.setBounds(0, 300, 200, 25);
    txtData.setBounds(150, 300, 200, 25);
    lblCep.setBounds(0, 350, 100, 25);
    txtCep.setBounds(150, 350, 200, 25);
    lblTelefone.setBounds(0, 400, 100, 25);
    txtTelefone.setBounds(150, 400, 200, 25);
    lblEmail.setBounds(0, 450, 100, 25);
    txtEmail.setBounds(150, 450, 200, 25);
//    lblLogin.setBounds(0, 500, 100, 25);
//    txtLogin.setBounds(150, 500, 200, 25);
//    lblSenha.setBounds(0, 550, 100, 25);
//    txtSenha.setBounds(150, 550, 200, 25);
    btnOK.setBounds(200, 600, 100, 50);
    btnVoltar.setBounds(1, 620, 100, 40);
    ctn.add(lblNome);
    ctn.add(txtNome);
    ctn.add(lblIdade);
    ctn.add(txtIdade);
    ctn.add(lblAltura);
    ctn.add(txtAltura);
    ctn.add(lblPeso);
    ctn.add(txtPeso);
    ctn.add(lblSexo);
    ctn.add(cmbSexo);
    ctn.add(lblCPF);
    ctn.add(txtCPF);
    ctn.add(lblData);
    ctn.add(txtData);
    ctn.add(lblCep);
    ctn.add(txtCep);
    ctn.add(lblTelefone);
    ctn.add(txtTelefone);
    ctn.add(lblEmail);
    ctn.add(txtEmail);
//    ctn.add(lblLogin);
//    ctn.add(txtLogin);
//    ctn.add(lblSenha);
//    ctn.add(txtSenha);
    ctn.add(btnOK);
    ctn.add(btnVoltar);
    setVisible(true);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    
    

    
}
    public static void main (String[] args) {
 
        new Tela1 ();
    }
    
    
     
    
    private void cliqueBtnEnviar(){
        this.dispose();
        new Clogin();
        String nome = txtNome.getText(),
               idade = txtIdade.getText(), 
               altura = txtAltura.getText(),
               peso = txtPeso.getText(),
               sexo = cmbSexo.getSelectedItem().toString(),
               cpf = txtCPF.getText(),
               data  = txtData.getText(),
               cep = txtCep.getText(),
               telefone = txtTelefone.getText(),
               email = txtEmail.getText();
//               login = txtLogin.getText(),
//               senha = txtSenha.getText();
//               
               
        
        System.out.println("nome : " + nome);
        System.out.println("idade : " + idade);
        System.out.println("altura : " + altura);
        System.out.println("peso : " + peso);
        System.out.println("sexo : " + sexo);
        System.out.println("cpf : " + cpf);
        System.out.println("data : " + data);
        System.out.println("cep : " + cep);
        System.out.println("telefone : " + telefone);
        System.out.println("email : " + email);
//        System.out.println("login : " + login);
//        System.out.println("senha : " + senha);
        
        try(PrintWriter pw = new PrintWriter(new File("alunos"))){
            pw.println("nome : " + nome);
            pw.println("idade : " + idade);
            pw.println("altura : " + altura);
            pw.println("peso    : " + peso);
            pw.println("sexo : " + sexo);
            pw.println("cpf : " + cpf);
            pw.println("data : " + data);
            pw.println("cep : " + cep);
            pw.println("telefone : " + telefone);
            pw.println("email : " + email);
//            pw.println("login : " + login);
//            pw.println("senha : " + senha);
        }catch(FileNotFoundException e){
            System.out.println("Arquivo não existe");
        }
        try {
             BDConnection.insereUsuario(nome, idade, altura, peso, sexo, cpf, data, cep, telefone, email);
        } catch (Exception e) {
            System.out.println(e);
        }
        
     
    }
     private void cliqueBtnVoltar(){
         this.dispose();
        new Cadastro();
     }
    
}
