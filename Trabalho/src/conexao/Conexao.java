/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author gabrielcampos
 */
public class Conexao {
    
    public Connection getConexao() 
    {
        try {
            Connection conn = (Connection) DriverManager.getConnection (
                    "jdbc:mysql://localhost:3306/escola",
                    "root",
                    ""
            
            );
            System.out.println("conectado");
            return conn;
        } catch (SQLException e) {
            System.out.println("Erro ao conectar" + e.getMessage());
            return null;
        }
    }

    
}
