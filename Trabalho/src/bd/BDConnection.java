/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author gabrielcampos
 */
public class BDConnection {
  
    
    public static void insereUsuario(String nome, String idade, String altura, String peso, String sexo, String cpf,  String data, String cep, String telefone, String email) throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        String urlJDBC = "jdbc:mysql://localhost:3306/escola";
        try (Connection conexao = (Connection) DriverManager.getConnection(urlJDBC,
                "root",
                "")) {
            
            Statement comando = (Statement) conexao.createStatement();
        
        comando.execute(("INSERT INTO alunos (nome, idade, altura, peso, sexo,  cpf, data, cep, telefone, email) values"
                + " ('"+nome+"', '"+idade+"', '"+altura+"', '"+peso+"', '"+sexo+"', '"+cpf+"', '"+data+"', '"+cep+"', '"+telefone+"', '"+email+"')"));
        
        conexao.close();
        
    }
        
    }
}