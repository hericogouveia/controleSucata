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
import modelo.Preco;

/**
 *
 * @author herico
 */
public class PrecoDAO {
    private Connection connection;
    String nomePreco;

    public PrecoDAO(){
       this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Preco preco){

        String sql = "INSERT INTO Preco(dataPreco, tipoMaterial, preco) VALUES(?,?,?)";
        try {
           PreparedStatement stmt = connection.prepareStatement(sql);
           stmt.setDate(1, preco.getDataPreco());
           stmt.setInt(2, preco.getTipoMaterial());
           stmt.setDouble(3, preco.getPreco());
           stmt.execute();
           stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
    public double preco(int tipoMaterial){
        double valor = 0;
        String sql = "SELECT max(id), preco FROM preco WHERE tipoMaterial = ?";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, tipoMaterial);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                valor = rs.getDouble("preco");
            }
            rs.close();
            stmt.close();
            return valor;
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }    
    }
}