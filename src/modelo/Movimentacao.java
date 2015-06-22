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
public class Movimentacao {
    private int id;
    private int empresa;
    private int tipoMaterialMov;
    private int notaFiscal;
    private int ticket;
    private Date dataMovimentacao;
    private double quantidade;
    private double valorMovimentacao;

    /**
     * @return the empresa
     */
    public int getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(int empresa) {
        this.empresa = empresa;
    }

    /**
     * @return the tipoMaterialMov
     */
    public int getTipoMaterialMov() {
        return tipoMaterialMov;
    }

    /**
     * @param tipoMaterialMov the tipoMaterialMov to set
     */
    public void setTipoMaterialMov(int tipoMaterialMov) {
        this.tipoMaterialMov = tipoMaterialMov;
    }

    /**
     * @return the notaFiscal
     */
    public int getNotaFiscal() {
        return notaFiscal;
    }

    /**
     * @param notaFiscal the notaFiscal to set
     */
    public void setNotaFiscal(int notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    /**
     * @return the ticket
     */
    public int getTicket() {
        return ticket;
    }

    /**
     * @param ticket the ticket to set
     */
    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    /**
     * @return the dataMovimentacao
     */
    public Date getDataMovimentacao() {
        return dataMovimentacao;
    }

    /**
     * @param dataMovimentacao the dataMovimentacao to set
     */
    public void setDataMovimentacao(Date dataMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;
    }

    /**
     * @return the quantidade
     */
    public double getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
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

    /**
     * @return the valorMovimentacao
     */
    public double getValorMovimentacao() {
        return valorMovimentacao;
    }

    /**
     * @param valorMovimentacao the valorMovimentacao to set
     */
    public void setValorMovimentacao(double valorMovimentacao) {
        this.valorMovimentacao = valorMovimentacao;
    }    
}
