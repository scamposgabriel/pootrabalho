

package bd;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author gabrielcampos
 */
public class Conection2 {
  
    
   
    public static void insereProfessores(String nome, String idade, String sexo, String cpf, String data, String cep, String telefone, String email, String formacao, String materia) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        String urlJDBC = "jdbc:mysql://localhost:3306/escola";
        try (Connection conexao = (Connection) DriverManager.getConnection(urlJDBC,
                "root",
                "")) {
            Statement comando = (Statement) conexao.createStatement();
            comando.execute("INSERT INTO professores (nome, idade, sexo,  cpf, data, cep, telefone, email, formacao, materia) values"
                    + " ('" +nome+ "', '" +idade+ "', '" +sexo+ "', '" +cpf+ "', '" +data+ "', '" +cep+ "', '" +telefone+ "', '" +email+ "', '" +formacao+ "', '"+ materia+ "')");
            conexao.close();
        }
    }

   

}