/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import beans.Professores;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import conexao.Conexao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
    
    public void editar (Professores professores){
        String sql = "UPDATE professores SET nome=?, idade=?, telefone=?, email=? WHERE CPF=?";
        try {
            PreparedStatement stmt = (PreparedStatement) this.conn.prepareStatement(sql);
            stmt.setString(1, professores.getNome());
            stmt.setString(2, professores.getIdade());
            stmt.setString(3, professores.getTelefone());
            stmt.setString(4, professores.getEmail());
            stmt.setString(5, professores.getCpf());
            stmt.execute();
        } catch (SQLException e) {
            System.out.println("Erro ao editar professores; " + e.getMessage());
        }
    }
    
    
    public void excluir(String cpf){
        String sql = "DELETE FROM professores WHERE cpf =?";
        try {
            PreparedStatement stmt = (PreparedStatement) this.conn.prepareStatement(sql);
            stmt.setString(1, cpf);
            stmt.execute();
        } catch (Exception e) {
            System.out.println("Erro ao excluir professores: " + e.getMessage());
        }
    }
    
    
    
    public Professores getProfessores(String cpf)
    {
        String sql = "SELECT * FROM professores WHERE cpf = ?";
        try {
            PreparedStatement stmt = (PreparedStatement) this.conn.prepareStatement(sql);
            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();
            Professores professores = new Professores();
            rs.first();
            professores.setCpf(cpf);
            professores.setNome(rs.getString("Nome"));
            professores.setIdade(rs.getString("Idade"));
            professores.setTelefone(rs.getString("Telefone"));
            professores.setEmail(rs.getString("Email"));
            return professores;
        } catch (SQLException e) {
            
            return null;
        }
    }
    
    public List <Professores> getProfessores()
    {
        String sql = "SELECT * FROM Professores";
        try {
            PreparedStatement stmt = (PreparedStatement) this.conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            List<Professores> listaProfessores = new ArrayList<>();
            while(rs.next()){
                Professores professores = new Professores();
                professores.setCpf(rs.getString("cpf"));
                professores.setNome(rs.getString("Nome"));
                professores.setIdade(rs.getString("Idade"));
                professores.setTelefone(rs.getString("Telefone"));
                professores.setEmail(rs.getString("Email"));
                listaProfessores.add(professores);
            }
            return listaProfessores;
        } catch (SQLException e) {
            return null;
        }
    }
    
}
