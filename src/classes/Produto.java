package classes;

public class Produto {

    private String idproduto;
    private String descricao;
    private int preco;
    private int imposto;
    private String anotacao;

    public Produto(String idproduto, String descricao, int preco, int imposto, String anotacao) {
        this.idproduto = idproduto;
        this.descricao = descricao;
        this.preco = preco;
        this.imposto = imposto;
        this.anotacao = anotacao;
    }

    public String getIdProduto() {
        return idproduto;
    }

    public void setIdProduto(String idproduto) {
        this.idproduto = idproduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getImposto() {
        return imposto;
    }

    public void setImposto(int imposto) {
        this.imposto = imposto;
    }

    public String getAnotacao() {
        return anotacao;
    }

    public void setAnotacao(String anotacao) {
        this.anotacao = anotacao;
    }

    public String toString() {
        return idproduto + "|"
                + descricao + "|"
                + preco + "|"
                + imposto + "|"
                + anotacao;
    }
}
