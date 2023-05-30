/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import beans.Professores;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import conexao.Conexao;
import java.sql.SQLException;

/**
 *
 * @author gabrielcampos
 */
public class ProfessoresDAO {
    private Conexao conexao;
    private Connection conn;
    
    public ProfessoresDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    
    }
    
    public void inserir(Professores professores) {
        String sql = "INSERT INTO professores (nome, idade, sexo, cpf, data, cep, telefone, email, formacao, materia) VALUES"
                + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
        PreparedStatement stmt = (PreparedStatement) this.conn.prepareStatement(sql);
        stmt.setString(1, professores.getNome());
        stmt.setString(2, professores.getIdade());
        stmt.setString(3, professores.getSexo());
        stmt.setString(4, professores.getCpf());
        stmt.setString(5, professores.getData());
        stmt.setString(6, professores.getCep());
        stmt.setString(7, professores.getTelefone());
        stmt.setString(8, professores.getEmail());
        stmt.setString(9, professores.getFormacao());
        stmt.setString(10, professores.getMateria());
        
        stmt.execute();
        
        }
        catch(SQLException e){
            System.out.println("Erro ao inserir professores: " + e.getMessage());
        
        }
        
    }
    
}
