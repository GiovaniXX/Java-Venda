package classes;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dados_db {

    private Connection cnn;

    private static final String PROPERTIES_FILE = "E:/PROJETOS JAVA 2023/NetBeans/config.properties";
    private static String dbUrl;
    private static String dbUsername;
    private static String dbPassword;

    public Dados_db() {
        loadDatabaseProperties();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cnn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        } catch (ClassNotFoundException | SQLException e) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, "Erro ao estabelecer conexão com o banco de dados", e);
        }
    }

    private void loadDatabaseProperties() {
        Properties properties = new Properties();
        try (InputStream input = new FileInputStream(PROPERTIES_FILE)) {
            properties.load(input);
            dbUrl = properties.getProperty("db.url");
            dbUsername = properties.getProperty("db.username");
            dbPassword = properties.getProperty("db.password");
        } catch (IOException e) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, "Erro ao carregar arquivo de propriedades", e);
        }
    }

    public Boolean validarUsuario(String usuario, String senha) {
        try {
            String sql = "select (1) from usuarios where idUsuario='" + usuario + "' and senha ='" + senha + "'";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, "Erro ao validar usuário", e);
            return false;
        }
    }

    public int getPerfil(String usuario) {
        try {
            String sql = "select idPerfil from usuarios where idUsuario='"
                    + usuario + "'";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return rs.getInt("idPerfil");
            } else {
                return -1;
            }
        } catch (SQLException e) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, e);
            return -1;
        }
    }

    public boolean existeUsuario(String usuario) {
        try {
            String sql = "select (1) from usuarios where idUsuario ='"
                    + usuario + "'";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }

    public boolean existeCliente(String cliente) {
        try {
            String sql = "select (1) from clientes where idCliente ='"
                    + cliente + "'";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }

    public boolean existeProduto(String produto) {
        try {
            String sql = "select (1) from produtos where idProduto ='"
                    + produto + "'";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }

    public String adicionarUsuario(Usuario mUsuario) {
//        try {
//            String sql = "INSERT INTO usuarios (nome, sobrenome, senha, idPerfil) VALUES (?, ?, ?, ?)";
//            PreparedStatement ps = cnn.prepareStatement(sql);
//            ps.setString(1, mUsuario.getNome());
//            ps.setString(2, mUsuario.getSnome());
//            ps.setString(3, mUsuario.getSenha());
//            ps.setInt(4, mUsuario.getPerfil());
//            ps.executeUpdate();
//
//            return "Usuário cadastrado com sucesso";
//        } catch (SQLException e) {
//            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, e);
//            return "Não foi possível cadastrar este usuário";
//        }
        try {
            String sql = "INSERT INTO usuarios (nome, sobrenome, senha, idPerfil) VALUES ('"
                    + mUsuario.getNome() + "', '"
                    + mUsuario.getSnome() + "', '"
                    + mUsuario.getSenha() + "', '"
                    + mUsuario.getPerfil() + "')";

            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
            return "Usuario cadastrado com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, e);
            return "Não foi possível cadastrar este usuário";
        }
    }

    public String adicionarProduto(Produto mProduto) {
        try {
            String sql = "INSERT INTO produtos (descricao, preco, imposto, anotacao) VALUES ('"
                    + mProduto.getDescricao() + "', '"
                    + mProduto.getPreco() + ", "
                    + mProduto.getImposto() + ", '"
                    + mProduto.getAnotacao() + "')";

            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
            return "Produto cadastrado com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, e);
            return "Não foi possível cadastrar este usuário";
        }
    }

    public String adicionarCliente(Cliente mCliente) {
        try {
            String sql = "INSERT INTO clientes (tipo, nome, sobrenome, endereco, telefone, cidade, dataNascimento, dataCadastro) VALUES ('"
                    + mCliente.getTipo() + "', '"
                    + mCliente.getNome() + "', '"
                    + mCliente.getSnome() + ", "
                    + mCliente.getEndereco() + ", '"
                    + mCliente.getTelefone() + ", '"
                    + mCliente.getCidade() + ", '"
                    + Utilidades.formatDate(mCliente.getDataNascimento()) + ", '"
                    + Utilidades.formatDate(mCliente.getDataCadastro()) + "')";

            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
            return "Cliente cadastrado com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, e);
            return "Não foi possível cadastrar este cliente";
        }
    }

    public String editarUsuario(Usuario mUsuario) {
        try {
            String sql = "UPDATE usuarios SET "
                    + "nome = '" + mUsuario.getNome() + "', "
                    + "sobrenome = '" + mUsuario.getSnome() + "', "
                    + "senha = '" + mUsuario.getSenha() + "', "
                    + "idPerfil = '" + mUsuario.getPerfil() + "' "
                    + "WHERE idUsuario = '" + mUsuario.getIdusuario() + "'";

            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
            return "Usuario editado com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, e);
            return "Não foi possível editar este usuário";
        }
    }

    public String editarProduto(Produto mProduto) {
        try {
            String sql = "UPDATE produtos SET "
                    + "descricao = '" + mProduto.getDescricao() + "', "
                    + "preco = '" + mProduto.getPreco() + "', "
                    + "imposto = '" + mProduto.getImposto() + "', "
                    + "anotacao = '" + mProduto.getAnotacao() + "' "
                    + "WHERE idProduto = '" + mProduto.getIdProduto() + "'";

            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
            return "Produto editado com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, e);
            return "Não foi possível editar este produto";
        }
    }

    public String editarCliente(Cliente mCliente) {
        try {
            String sql = "INSERT INTO clientes (tipo, nome, sobrenome, endereco, telefone, cidade, dataNascimento, dataCadastro) VALUES ('"
                    + mCliente.getTipo() + "', '"
                    + mCliente.getNome() + "', '"
                    + mCliente.getSnome() + ", "
                    + mCliente.getEndereco() + ", '"
                    + mCliente.getTelefone() + ", '"
                    + mCliente.getCidade() + ", '"
                    + Utilidades.formatDate(mCliente.getDataNascimento()) + ", '"
                    + Utilidades.formatDate(mCliente.getDataCadastro()) + "', "
                    + "where idCliente = '" + mCliente.getIdCliente() + "'";

            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
            return "Cliente editado com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, e);
            return "Não foi possível editar este cliente";
        }
    }

    public String deletarUsuario(String usuario) {
        try {
            String sql = "delete from usuarios where idUsuario = '" + usuario + "'";
            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
            return "Usuário deletado com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, e);
            return "Não foi possível deletar este usuário";
        }
    }

    public String deletarCliente(String cliente) {
        try {
            String sql = "delete from clientes where idCliente = '" + cliente + "'";
            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
            return "Cliente deletado com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, e);
            return "Não foi possível deletar este cliente";
        }
    }

    public String deletarProduto(String produto) {
        try {
            String sql = "delete from produtos where idProduto = '" + produto + "'";
            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
            return "Produto deletado com sucesso";
        } catch (SQLException e) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, e);
            return "Não foi possível deletar este produto";
        }
    }

    public ResultSet getUsuarios() {
        try {
            String sql = "select * from usuarios";
            Statement st = cnn.createStatement();
            return st.executeQuery(sql);
        } catch (Exception e) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    public ResultSet getClientes() {
        try {
            String sql = "select * from clientes";
            Statement st = cnn.createStatement();
            return st.executeQuery(sql);
        } catch (Exception e) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    public ResultSet getFatura() {
        try {
            String sql = "select * from fatura";
            Statement st = cnn.createStatement();
            return st.executeQuery(sql);
        } catch (Exception e) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

//    public ResultSet getConsulta(String sql) throws SQLException {
//        try {
//            Statement st = cnn.createStatement();
//            return st.executeQuery(sql);
//        } catch (SQLException e) {
//            // Registre a exceção ou faça outras ações de tratamento aqui, se necessário.
//            // Você pode usar o logger ou imprimir a exceção para fins de depuração.
//            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, e);
//
//            // Lançar uma exceção personalizada com uma mensagem informativa.
//            throw new SQLException("Erro ao executar a consulta SQL: " + sql, e);
//        }
//    }
    public ResultSet getConsulta(String sql) {
        try {
            Statement st = cnn.createStatement();
            return st.executeQuery(sql);
        } catch (Exception e) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    public ResultSet getProdutos() {
        try {
            String sql = "select * from produtos";
            Statement st = cnn.createStatement();
            return st.executeQuery(sql);
        } catch (Exception e) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    public int numeroUsuarios() {
        try {
            String sql = "select count(*) as num from usuarios";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return rs.getInt("num");
            } else {
                return 0;
            }
        } catch (Exception e) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, e);
            return 0;
        }
    }

    public int numeroClientes() {
        try {
            String sql = "select count(*) as num from clientes";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return rs.getInt("num");
            } else {
                return 0;
            }
        } catch (Exception e) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, e);
            return 0;
        }
    }

    public int numeroProdutos() {
        try {
            String sql = "select count(*) as num from produtos";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return rs.getInt("num");
            } else {
                return 0;
            }
        } catch (Exception e) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, e);
            return 0;
        }
    }

    public Produto getProduto(String idProduto) {
        try {
            Produto mProduto = null;
            String sql = "select * from produtos " + "where idProduto = '" + idProduto + "'";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                mProduto = new Produto(
                        rs.getString("idProduto"),
                        rs.getString("descricao"),
                        rs.getInt("preco"),
                        rs.getInt("imposto"),
                        rs.getString("anotacao"));
            }
            return mProduto;

        } catch (Exception e) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    public int getNumeroFatura() {
        try {
            String sql = "SELECT MAX(idFatura) as numero FROM fatura";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                return rs.getInt("numero") + 1;
            } else {
                return 1;
            }
        } catch (Exception e) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, e);
            return 1;
        }
    }

    public void adicionarFatura(int idFatura, String idCliente, Date data) {
        try {
            String sql = "INSERT INTO fatura VALUES ("
                    + idFatura + ", '"
                    + idCliente + "', '"
                    + Utilidades.formatDate(data) + "')";
            Statement st = cnn.createStatement();
            st.executeUpdate(sql);

        } catch (SQLException e) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void adicionarDetalheFatura(int idFatura, int idLinha, String idProduto, String descricao, int preco, int quantidade) {
        try {
            String sql = "INSERT INTO detalhefatura (idFatura, idLinha, idProduto, descricao, preco, quantidade) VALUES ("
                    + idFatura + ", "
                    + idLinha + ", '"
                    + idProduto + "', '"
                    + descricao + "', "
                    + preco + ", "
                    + quantidade + ")";

            Statement st = cnn.createStatement();
            st.executeUpdate(sql);

        } catch (Exception e) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
