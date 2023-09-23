package classes;

import formularios.FrmLogin;
import java.text.ParseException;

public class JavaVenda {

    public static void main(String[] args) throws ParseException {
        Dados_db msDados_db = new Dados_db();
        FrmLogin miLogin = new FrmLogin();
        miLogin.setDados_db(msDados_db);
        miLogin.setVisible(true);
    }
}
