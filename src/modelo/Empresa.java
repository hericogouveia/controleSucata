package modelo;

/**
 *Objeto que contém variáveis para o método CRUD da tabela Empresa.
 * 
 * @author herico
 */
public class Empresa {
    private int id;
    private String nomeEmpresa;
    private double valorNF;

    /**
     * @return Retorna Nome da Empresa.
     */
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    /**
     * @param nomeEmpresa Recebe NOme da Empresa.
     */
    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    /**
     * @return Retorna Id da Empresa.
     */
    public int getId() {
        return id;
    }

    /**
     * @param id Recebe Id da Empresa.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the valorNF
     */
    public double getValorNF() {
        return valorNF;
    }

    /**
     * @param valorNF the valorNF to set
     */
    public void setValorNF(double valorNF) {
        this.valorNF = valorNF;
    }
}
