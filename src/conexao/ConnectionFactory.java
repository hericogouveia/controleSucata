package conexao;
import java.sql.Connection; // conexão SQL para Java
import java.sql.DriverManager; // driver de conexão SQL para Java
import java.sql.SQLException; // classe para tratamento de exceções


/**
 *Método que estabelece e retorna conexão com Banco de Dados.
 * 
 * @author herico
 */
public class ConnectionFactory {
    public Connection getConnection() {
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            return DriverManager.getConnection("jdbc:mysql://192.168.60.234:3306/controleSucata","hericogouveia","*a*S*d*14789");
        }
        catch(SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }
}
