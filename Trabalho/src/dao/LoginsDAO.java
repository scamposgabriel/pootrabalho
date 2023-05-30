/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import beans.Logins;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import conexao.Conexao;
import java.sql.SQLException;

/**
 *
 * @author gabrielcampos
 */
public class LoginsDAO {
    
     private Conexao conexao;
    private Connection conn;
    
    public LoginsDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    
    }
    
    public void inserir(Logins logins) {
        String sql = "INSERT INTO logins (login, senha) VALUES"
                + "(?, ?)";
        try {
        PreparedStatement stmt = (PreparedStatement) this.conn.prepareStatement(sql);
        stmt.setString(1, logins.getLogin());
        stmt.setString(2, logins.getSenha());
        
        stmt.execute();
        
        }
        catch(SQLException e){
            System.out.println("Erro ao inserir login: " + e.getMessage());
        
        }
        
    }
    
}
