/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Movimentacao;

/**
 *
 * @author herico
 */
public class MovimentacaoDAO {
    private Connection connection;
    String movimentacao;

    public MovimentacaoDAO(){
       this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Movimentacao movimentacao){

        String sql = "INSERT INTO Movimentacao(empresa, dataMovimentacao, tipoMaterialMov, quantidade, notaFiscal, ticket, valorMovimentacao, valorNf) VALUES(?,?,?,?,?,?,?,?)";
        try {

           PreparedStatement stmt = connection.prepareStatement(sql);
           stmt.setInt(1, movimentacao.getEmpresa());
           stmt.setDate(2, movimentacao.getDataMovimentacao());
           stmt.setInt(3, movimentacao.getTipoMaterialMov());
           stmt.setDouble(4, movimentacao.getQuantidade());
           stmt.setInt(5, movimentacao.getNotaFiscal());
           stmt.setInt(6, movimentacao.getTicket());
           stmt.setDouble(7, movimentacao.getValorMovimentacao());
           stmt.setDouble(8, movimentacao.getValorNf());
           stmt.execute();
           stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}
