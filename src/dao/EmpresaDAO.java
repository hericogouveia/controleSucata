/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import conexao.ConnectionFactory;
import modelo.Empresa;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author herico
 */
public class EmpresaDAO {
    private Connection connection;
    String nomeEmpresa;

    public EmpresaDAO(){
       this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Empresa empresa){

        String sql = "INSERT INTO Empresa(descEmpresa) VALUES(?)";
        try {

           PreparedStatement stmt = connection.prepareStatement(sql);
           stmt.setString(1, empresa.getNomeEmpresa());
           stmt.execute();
           stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
    public void excluir(Empresa empresa) {

        String sql = "DELETE FROM Empresa WHERE id = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, empresa.getId());
            stmt.execute();
            stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
    public void atualizar(Empresa empresa) {

        String sql = "UPDATE Empresa set descEmpresa =? WHERE id = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, empresa.getNomeEmpresa());      
            stmt.setInt(2, empresa.getId());
            stmt.execute();
            stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
    public List<Empresa> listarTodos() {
        List<Empresa> empresas = new ArrayList<Empresa>();
        String sql = "SELECT * FROM Empresa";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Empresa empresa = new Empresa();
                empresa.setId(rs.getInt("id"));
                empresa.setNomeEmpresa(rs.getString("descEmpresa"));
                empresas.add(empresa);
            }
            rs.close();
            stmt.close();
            return empresas;
            
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }        
    }
    

    /**
     * Retorna id de Empresa a partir da Descrição
     * @param descEmpresa Nome da Empresa a ser pesquisada
     * @return Retorna id da Empresa
     */
    public int retornarId(String descEmpresa){
        int id = 0;
        String sql = "SELECT id FROM empresa WHERE descEmpresa = ?";
        
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, descEmpresa);
            ResultSet rs = stmt.executeQuery();
            id = rs.getInt("id");
            return id;
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
    public double valorNF(int empresa){
        double valor=0;
        String sql = "SELECT valorNf FROM empresa WHERE id = ?";
        
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, empresa);
                        ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                valor = rs.getDouble("valorNf");
            }
            rs.close();
            stmt.close();
            return valor;
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}

