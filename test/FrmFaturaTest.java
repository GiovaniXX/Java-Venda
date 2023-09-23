
import classes.Opcoes;
import formularios.FrmFatura;
import javax.swing.JComboBox;
import org.junit.Test;
import static org.junit.Assert.*;

public class FrmFaturaTest {

    @Test
    public void testClassCastException() {
        FrmFatura frmFatura = new FrmFatura();

        // Simule a situação na qual o erro ocorre
        JComboBox<String> cmbProduto = (JComboBox<String>) frmFatura.getCmbProduto();
        cmbProduto.addItem("Item de Texto"); // Adiciona uma String ao cmbProduto

        // Teste se o erro de ClassCastException é lançado quando tentamos fazer o cast
        assertThrows(ClassCastException.class, () -> {
            Opcoes opcoes = (Opcoes) cmbProduto.getSelectedItem();
        });
    }
}
