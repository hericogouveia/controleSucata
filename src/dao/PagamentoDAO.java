package dao;
import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Pagamento;
/**
 *Classe que contém os métodos CRUD para tabela de Pagamentos.
 * @author Herico
 */
public class PagamentoDAO {
    private Connection connection;

    public PagamentoDAO(){
       this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Pagamento pagamento){

        String sql = "insert into pagamentos(empresa,dataPagamento,mesReferencia,valor) VALUES(?,?,?,?)";
        try {
           PreparedStatement stmt = connection.prepareStatement(sql);
           stmt.setInt(1, pagamento.getEmpresa());
           stmt.setDate(2, pagamento.getDataPagamento());
           stmt.setDate(3, pagamento.getMesReferencia());
           stmt.setDouble(4, pagamento.getValor());
           stmt.execute();
           stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

}
