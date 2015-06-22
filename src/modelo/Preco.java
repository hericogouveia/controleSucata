/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.sql.Date;

/**
 *
 * @author herico
 */
public class Preco {
    private int id;
    private Date dataPreco;
    private int tipoMaterial;
    private double preco;

    /**
     * @return the dataPreco
     */
    public Date getDataPreco() {
        return dataPreco;
    }

    /**
     * @param dataPreco the dataPreco to set
     */
    public void setDataPreco(Date dataPreco) {
        this.dataPreco = dataPreco;
    }

    /**
     * @return the tipoMaterial
     */
    public int getTipoMaterial() {
        return tipoMaterial;
    }

    /**
     * @param tipoMaterial the tipoMaterial to set
     */
    public void setTipoMaterial(int tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }    
}
