package classes;

public class Usuario {

    private String idusuario;
    private String nome;
    private String snome;
    private String senha;
    private int perfil;

    public Usuario(String idusuario, String nome, String snome, String senha, int perfil) {
        this.idusuario = idusuario;
        this.nome = nome;
        this.snome = snome;
        this.senha = senha;
        this.perfil = perfil;
    }

    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return "Usuario{" + "perfil=" + perfil + '}';
    }
}
