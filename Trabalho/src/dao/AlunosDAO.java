/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import beans.Alunos;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import conexao.Conexao;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author gabrielcampos
 */
public class AlunosDAO {
    private Conexao conexao;
    private Connection conn;
    
    public AlunosDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    
    }
    
    public void inserir(Alunos alunos) {
        String sql = "INSERT INTO alunos (nome, idade, altura, peso, sexo, cpf, data, cep, telefone, email) VALUES"
                + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
        PreparedStatement stmt = (PreparedStatement) this.conn.prepareStatement(sql);
        stmt.setString(1, alunos.getNome());
        stmt.setString(2, alunos.getIdade());
        stmt.setString(3, alunos.getAltura());
        stmt.setString(4, alunos.getPeso());
        stmt.setString(5, alunos.getSexo());
        stmt.setString(6, alunos.getCpf());
        stmt.setString(7, alunos.getData());
        stmt.setString(8, alunos.getCep());
        stmt.setString(9, alunos.getTelefone());
        stmt.setString(10, alunos.getEmail());
        
        stmt.execute();
        
        }
        catch(SQLException e){
            System.out.println("Erro ao inserir alunos: " + e.getMessage());
        
        }
        
    }
    public Alunos getAlunos(String cpf)
    {
        String sql = "SELECT * FROM alunos WHERE cpf = ?";
        try {
            PreparedStatement stmt = (PreparedStatement) this.conn.prepareStatement(sql);
            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();
            Alunos alunos = new Alunos();
            rs.first();
            alunos.setCpf(cpf);
            alunos.setNome(rs.getString("Nome"));
            alunos.setIdade(rs.getString("Idade"));
            alunos.setTelefone(rs.getString("Telefone"));
            alunos.setEmail(rs.getString("Email"));
            return alunos;
        } catch (SQLException e) {
            
            return null;
        }
    }
    
}
