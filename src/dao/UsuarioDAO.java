package dao;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.TipoUsuario;
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

        String sql = "INSERT INTO Usuario(id,tipo,nome,senha) VALUES(?,?,?,?)";
        try {
           PreparedStatement stmt = connection.prepareStatement(sql);
           stmt.setInt(1, usuario.getCod());
           stmt.setInt(2, usuario.getTipo());
           stmt.setString(3, usuario.getNome());
           stmt.setString(4, usuario.getSenha());
           stmt.execute();
           stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
    public int login(Usuario usuario){
        int tipo=0;
        String sql = "SELECT tipo FROM usuario WHERE id=? AND senha=?";
        try{
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setInt(1, usuario.getCod());
        stmt.setString(2, usuario.getSenha());
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            tipo = rs.getInt("tipo");
        }
        rs.close();
        stmt.close();
        return tipo;
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
        public List<TipoUsuario> listarTodosTipoUsuario() {
        List<TipoUsuario> tiposUsuario = new ArrayList<TipoUsuario>();
        String sql = "SELECT * FROM TipoUsuario";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                TipoUsuario tipoUsuario = new TipoUsuario();
                tipoUsuario.setId(rs.getInt("id"));
                tipoUsuario.setTipo(rs.getString("tipo"));
                tiposUsuario.add(tipoUsuario);
            }
            rs.close();
            stmt.close();
            return tiposUsuario;
            
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }        
    }
}
