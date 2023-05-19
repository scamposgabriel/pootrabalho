/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author gabrielcampos
 */
public class UConection {
  
    
   
    

    public static void insereLusuario(String login, String senha) throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.jdbc.Driver");
        String urlJDBC = "jdbc:mysql://localhost:3306/escola";
        try (Connection conexao = (Connection) DriverManager.getConnection(urlJDBC,
                "root",
                "")) {
            Statement comando = (Statement) conexao.createStatement();
            comando.execute("INSERT INTO lusuarios (login, senha) values"
                    + " ('" +login+ "', '" +senha+ "')");
            conexao.close();
        }   
    }

    

   

}
