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
import modelo.TipoMaterial;

/**
 *
 * @author herico
 */
public class TipoMaterialDAO {
    private Connection connection;
    String nomeTipoMaterial;

    public TipoMaterialDAO(){
       this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(TipoMaterial tipoMaterial){

        String sql = "INSERT INTO TipoMaterial(descTipoMaterial) VALUES(?)";
        try {

           PreparedStatement stmt = connection.prepareStatement(sql);
           stmt.setString(1, tipoMaterial.getTipoMaterial());
           stmt.execute();
           stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
    public void localizar(TipoMaterial tipoMaterial) {

        String sql = "SELECT id FROM TipoMaterial WHERE descTipoMaterial = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, tipoMaterial.getId());
            stmt.setString(2, tipoMaterial.getTipoMaterial());
            stmt.execute();
            stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }    
    
    public void excluir(TipoMaterial tipoMaterial) {

        String sql = "DELETE FROM TipoMaterial WHERE id = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, tipoMaterial.getId());
            stmt.execute();
            stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

        public void atualizar(TipoMaterial tipoMaterial) {

        String sql = "UPDATE TipoMaterial set descTipoMaterial =? WHERE id = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, tipoMaterial.getTipoMaterial());      
            stmt.setInt(2, tipoMaterial.getId());
            stmt.execute();
            stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public List<TipoMaterial> listarTodos() {
        List<TipoMaterial> tipoMateriais = new ArrayList<TipoMaterial>();
        String sql = "SELECT * FROM TipoMaterial";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                TipoMaterial tipoMaterial = new TipoMaterial();
                tipoMaterial.setId(rs.getInt("id"));
                tipoMaterial.setTipoMaterial(rs.getString("descTipoMaterial"));
                tipoMateriais.add(tipoMaterial);
            }
            rs.close();
            stmt.close();
            return tipoMateriais;
            
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }    
    }
    
    /**
     * Retorna id de Tipo Material a partir da Descrição
     * @param descTipoMaterial Descrição do tipo de Material a ser retornado
     * @return Retorna id do Tipo de Material
     */
    public int retornarId(String descTipoMaterial){
        int id = 0;
        String sql = "SELECT id FROM tipoMaterial WHERE descTipoMaterial = ?";
                try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, descTipoMaterial);
            ResultSet rs = stmt.executeQuery();
            id = rs.getInt("id");
            return id;
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}