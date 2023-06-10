/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import beans.Professores;
import dao.ProfessoresDAO;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author gabrielcampos
 */
public class ModificandoP extends JFrame {
    
     private JLabel lblListando;
     private JButton btnSair;
     private JButton btnListar;
     private JButton btnModificar;
     private JLabel lblCpf;
     private JTextField txtCpf;
     private JLabel lblNome;
     private JTextField txtNome;
     private JLabel lblIdade;
     private JTextField txtIdade;
     private JLabel lblTelefone;
     private JTextField txtTelefone;
     private JLabel lblEmail;
     private JTextField txtEmail;
     
     private Container ctn;
     
     public ModificandoP () {
     setSize(400, 500);
     setTitle("Modificando");
     ctn = getContentPane();
     lblListando = new JLabel ("Modificando Professores");
     lblCpf = new JLabel ("Procurar por CPF");
     txtCpf = new JTextField ();
     btnSair = new JButton("Sair");
     btnListar = new JButton("Procurar");
     btnModificar = new JButton("Modificar");
     lblNome = new JLabel ("Nome");
     txtNome = new JTextField ();
     lblIdade = new JLabel ("Idade");
     txtIdade = new JTextField ();
     lblTelefone = new JLabel ("Telefone");
     txtTelefone = new JTextField ();
     lblEmail = new JLabel ("Email");
     txtEmail = new JTextField ();
     
     ctn.setLayout(null);
     
     lblListando.setBounds(150, 50, 160, 25);
     lblCpf.setBounds(50, 150, 105, 25);
     txtCpf.setBounds(160, 150, 100, 25);
     lblNome.setBounds(100, 200, 100, 25);
     txtNome.setBounds(160, 200, 150, 25);
     lblIdade.setBounds(100, 250, 100, 25);
     txtIdade.setBounds(160, 250, 150, 25);
     lblTelefone.setBounds(100, 300, 100, 25);
     txtTelefone.setBounds(160, 300, 150, 25);
     lblEmail.setBounds(100, 350, 100, 25);
     txtEmail.setBounds(160, 350, 180, 25);
     btnSair.setBounds(0, 440, 50, 30);
     btnListar.setBounds(260, 150, 100, 30);
     btnModificar.setBounds(150, 400, 100, 30);
     
     
     ctn.add(lblListando);
     ctn.add(lblCpf);
     ctn.add(txtCpf);
     ctn.add(lblNome);
     ctn.add(txtNome);
     ctn.add(lblIdade);
     ctn.add(txtIdade);
     ctn.add(lblTelefone);
     ctn.add(txtTelefone);
     ctn.add(lblEmail);
     ctn.add(txtEmail);
     ctn.add(btnSair);
     ctn.add(btnListar);
     ctn.add(btnModificar);
     
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
     
     btnListar.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             cliqueBtnListar();
            }
     });
     
     btnModificar.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             cliqueBtnModificar();
             
             }
     });
     
     
     
     }
     
     
     private void cliqueBtnModificar(){
         String cpf = txtCpf.getText();
         String nome = txtNome.getText(),        
               telefone = txtTelefone.getText(),
               idade = txtIdade.getText(),
               email = txtEmail.getText();
        
        Professores professores = new Professores();
        professores.setCpf(cpf);
        professores.setNome(nome);
        professores.setIdade(idade);
        professores.setTelefone(telefone);
        professores.setEmail(email);
        
        ProfessoresDAO professoresDAO = new ProfessoresDAO();
        professoresDAO.editar(professores);
        
        txtNome.setText("");
        txtIdade.setText("");
        txtTelefone.setText("");
        txtEmail.setText("");
     }
     
     private void cliqueBtnSair(){
         this.dispose();
        new LogadoP();
     }
     
     private void cliqueBtnListar(){
        String cpf = txtCpf.getText();
        ProfessoresDAO professoresDAO = new ProfessoresDAO ();
        Professores professores = professoresDAO.getProfessores(cpf);
        if(professores == null){
            JOptionPane.showMessageDialog(this, "Professores não encontrado");
            
        } 
        else {
            txtNome.setText(professores.getNome());
            txtIdade.setText(professores.getIdade());
            txtTelefone.setText(professores.getTelefone());
            txtEmail.setText(professores.getEmail());
        }
     }
}
