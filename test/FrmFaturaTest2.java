
import classes.Opcoes;
import java.io.*;
import formularios.*;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FrmFaturaTest2 {

    private FrmFatura frmFatura;

    @Before
    public void setUp() {
        frmFatura = new FrmFatura();
    }

    @Test
    public void testSalvarVenda() {
        // Simule o cenário onde um cliente é selecionado
        JComboBox<String> cmbCliente = (JComboBox<String>) frmFatura.getCmbCliente();
        cmbCliente.setSelectedIndex(1);

        // Simule o cenário onde um produto é selecionado
        JComboBox<Opcoes> cmbProduto = (JComboBox<Opcoes>) frmFatura.getCmbProduto();
        cmbProduto.setSelectedIndex(1);

        // Simule a inserção de uma quantidade
        JTextField txtQuantidade = (JTextField) frmFatura.getTxtQuantidade();
        txtQuantidade.setText("5");

        // Verifique se a venda é salva corretamente
        frmFatura.btnSalvarActionPerformed(null);

        // Verifique se o arquivo Configuracao.ini foi criado
        File file = new File("Configuracao.ini");
        assertTrue(file.exists());

        // Verifique se o arquivo contém os dados da venda
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            boolean vendaEncontrada = false;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("1|")) { // Verifica se a linha contém os dados da venda
                    vendaEncontrada = true;
                    break;
                }
            }
            assertTrue("A venda não foi encontrada no arquivo Configuracao.ini", vendaEncontrada);

        } catch (IOException e) {
            fail("Erro ao ler o arquivo Configuracao.ini");
        }
    }

    @Test
    public void testErroSemProduto() {
        // Simule o cenário onde nenhum produto é selecionado
        frmFatura.getCmbCliente().setSelectedIndex(1);

        // Verifique se a mensagem de erro é exibida corretamente
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        frmFatura.btnSalvarActionPerformed(null);

        String expectedOutput = "Selecione um produto para a venda";
        assertTrue(outContent.toString().contains(expectedOutput));
    }
}
