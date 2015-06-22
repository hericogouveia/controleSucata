package dao;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Usuario;

/**
 *Classe responsável por cadastrar usuários da aplicação e dar privilegios para manipulação.
 * @author Herico
 */
public class UsuarioDAO {
    private Connection connection;

    /**
     *Conexão com o BD. 
     */
    public UsuarioDAO(){
       this.connection = new ConnectionFactory().getConnection();
    }

    /**
     * Método responsável por adicionar usuários a tabela Usuários no BD.
     * @param usuario Objeto com informações para inclusão na tabela usuários.
     */
    public void adiciona(Usuario usuario){

        String sql = "INSERT INTO Usuario(tipo,nome,senha) VALUES(?,?,?)";
        try {
           PreparedStatement stmt = connection.prepareStatement(sql);
           stmt.setInt(1, usuario.getTipo());
           stmt.setString(2, usuario.getNome());
           stmt.setString(3, usuario.getSenha());
           stmt.execute();
           stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}
