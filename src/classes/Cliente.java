package classes;

import java.util.Date;

public class Cliente {

    private String idcliente;
    private int tipo;
    private String nome;
    private String snome;
    private String endereco;
    private String telefone;
    private int cidade;
    private Date dataNascimento;
    private Date dataCadastro;

    public Cliente(String idcliente, int tipo, String nome, String snome, String endereco, String telefone, int cidade, Date dataNascimento, Date dataCadastro) {
        this.idcliente = idcliente;
        this.tipo = tipo;
        this.nome = nome;
        this.snome = snome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cidade = cidade;
        this.dataNascimento = dataNascimento;
        this.dataCadastro = dataCadastro;
    }

    public String getIdCliente() {
        return idcliente;
    }

    public void setIdCliente(String idcliente) {
        this.idcliente = idcliente;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSnome() {
        return snome;
    }

    public void setSnome(String snome) {
        this.snome = snome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getCidade() {
        return cidade;
    }

    public void setCidade(int cidade) {
        this.cidade = cidade;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String toString() {
        return idcliente + "|"
                + tipo + "|"
                + nome + "|"
                + snome + "|"
                + endereco + "|"
                + telefone + "|"
                + cidade + "|"
                + Utilidades.formatDate(dataNascimento) + "|"
                + Utilidades.formatDate(dataCadastro);
    }
}
