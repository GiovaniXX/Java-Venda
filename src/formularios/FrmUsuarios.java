package formularios;

import classes.Dados_db;
import classes.Usuario;
import classes.Utilidades;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmUsuarios extends javax.swing.JInternalFrame {

    private Dados_db msDados_db;
    private int usuAtual = 0;
    private boolean novo = false;
    private DefaultTableModel mTabela;

    public void setDados_db(Dados_db msDados_db) {
        this.msDados_db = msDados_db;
    }

    public FrmUsuarios() {
        initComponents();
        msDados_db = new Dados_db();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIDUsuario = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtSnome = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        txtConfirmar = new javax.swing.JPasswordField();
        cmbPerfil = new javax.swing.JComboBox<>();
        btnPrimeiro = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();

        setClosable(true);
        setTitle("Cadastrar Usuarios :");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setText("ID Usuario.:");

        jLabel2.setText("Perfil.:");

        jLabel3.setText("Nome.:");

        jLabel4.setText("S-Nome.:");

        jLabel5.setText("Senha.:");

        jLabel6.setText("Conf-Senha.:");

        txtIDUsuario.setEnabled(false);

        txtNome.setEnabled(false);

        txtSnome.setEnabled(false);

        txtSenha.setEnabled(false);

        txtConfirmar.setEnabled(false);

        cmbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um perfil", "Administrador", "Funcionario" }));
        cmbPerfil.setEnabled(false);

        btnPrimeiro.setText("Primeiro");
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });

        btnAnterior.setText("Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnProximo.setText("Proximo");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnUltimo.setText("Ultimo");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblTabela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(125, 125, 125)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtNome)
                                .addComponent(txtSnome)
                                .addComponent(txtConfirmar)
                                .addComponent(txtSenha))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnPrimeiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnProximo)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCancelar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnPesquisar)))))
                        .addGap(0, 156, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrimeiro)
                    .addComponent(btnAnterior)
                    .addComponent(btnProximo)
                    .addComponent(btnUltimo)
                    .addComponent(btnNovo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir)
                    .addComponent(btnCancelar)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        btnPrimeiro.setEnabled(false);
        btnAnterior.setEnabled(false);
        btnProximo.setEnabled(false);
        btnUltimo.setEnabled(false);
        btnNovo.setEnabled(false);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnPesquisar.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);

        txtNome.setEnabled(true);
        txtSnome.setEnabled(true);
        txtSenha.setEnabled(true);
        txtConfirmar.setEnabled(true);
        cmbPerfil.setEnabled(true);

        txtIDUsuario.setText("");
        txtNome.setText("");
        txtSnome.setText("");
        txtSenha.setText("");
        txtConfirmar.setText("");
        cmbPerfil.setSelectedIndex(0);

        novo = true;
        txtIDUsuario.requestFocus();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (cmbPerfil.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um perfil");
            cmbPerfil.requestFocusInWindow();
            return;
        }

        if (txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Insira um nome");
            txtNome.requestFocusInWindow();
            return;
        }

        if (txtSnome.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Insira um sobre-nome");
            txtSnome.requestFocusInWindow();
            return;
        }

        String senha = new String(txtSenha.getPassword());
        String confirmar = new String(txtConfirmar.getPassword());

        if (senha.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Insira uma senha válida");
            txtSenha.requestFocusInWindow();
            return;
        }

        if (confirmar.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Confirme sua senha");
            txtConfirmar.requestFocusInWindow();
            return;
        }

        if (!senha.equals(confirmar)) {
            JOptionPane.showMessageDialog(rootPane, "A confirmação da senha não é válida");
            txtSenha.setText("");
            txtConfirmar.setText("");
            txtSenha.requestFocusInWindow();
            return;
        }

        if (novo) {
            if (msDados_db.existeUsuario(txtIDUsuario.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Este usuário já existe na base de dados!");
                txtIDUsuario.requestFocusInWindow();
                return;
            }
        } else {
            if (!msDados_db.existeUsuario(txtIDUsuario.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Este usuário não existe na base de dados!");
                txtIDUsuario.requestFocusInWindow();
                return;
            }
        }

        Usuario mUsuario = new Usuario(
                txtIDUsuario.getText(),
                txtNome.getText(),
                txtSnome.getText(),
                senha,
                cmbPerfil.getSelectedIndex());
        String msg;
        if (novo) {
            msg = msDados_db.adicionarUsuario(mUsuario);
        } else {
            msg = msDados_db.editarUsuario(mUsuario);
        }
        JOptionPane.showMessageDialog(rootPane, msg);

        btnPrimeiro.setEnabled(true);
        btnAnterior.setEnabled(true);
        btnProximo.setEnabled(true);
        btnUltimo.setEnabled(true);
        btnNovo.setEnabled(true);
        btnEditar.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnPesquisar.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);

        txtIDUsuario.setEnabled(false);
        txtNome.setEnabled(false);
        txtSnome.setEnabled(false);
        txtSenha.setEnabled(false);
        txtConfirmar.setEnabled(false);
        cmbPerfil.setEnabled(false);

        txtIDUsuario.setText("");
        txtNome.setText("");
        txtSnome.setText("");
        txtSenha.setText("");
        txtConfirmar.setText("");
        cmbPerfil.setSelectedIndex(0);

        preencherTabela();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        btnPrimeiro.setEnabled(true);
        btnAnterior.setEnabled(true);
        btnProximo.setEnabled(true);
        btnUltimo.setEnabled(true);
        btnNovo.setEnabled(true);
        btnEditar.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnPesquisar.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);

        txtIDUsuario.setEnabled(false);
        txtNome.setEnabled(false);
        txtSnome.setEnabled(false);
        txtSenha.setEnabled(false);
        txtConfirmar.setEnabled(false);
        cmbPerfil.setEnabled(false);

        txtIDUsuario.setText("");
        txtNome.setText("");
        txtSnome.setText("");
        txtSenha.setText("");
        txtConfirmar.setText("");
        cmbPerfil.setSelectedIndex(0);

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        btnPrimeiro.setEnabled(false);
        btnAnterior.setEnabled(false);
        btnProximo.setEnabled(false);
        btnUltimo.setEnabled(false);
        btnNovo.setEnabled(false);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnPesquisar.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);

        txtNome.setEnabled(true);
        txtSnome.setEnabled(true);
        txtSenha.setEnabled(true);
        txtConfirmar.setEnabled(true);
        cmbPerfil.setEnabled(true);

        novo = false;
        txtNome.requestFocus();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        preencherTabela();
        mostrarRegistro();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        usuAtual = 0;
        mostrarRegistro();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        usuAtual = msDados_db.numeroUsuarios() - 1;
        mostrarRegistro();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        usuAtual++;
        if (usuAtual == msDados_db.numeroUsuarios()) {
            usuAtual = 0;
        }
        mostrarRegistro();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        usuAtual--;
        if (usuAtual == - 1) {
            usuAtual = msDados_db.numeroUsuarios() - 1;
        }
        mostrarRegistro();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deletar este cadastro?");
        if (resposta != 0) {
            return;
        }
        String msg;
        msg = msDados_db.deletarUsuario(txtIDUsuario.getText());
        JOptionPane.showMessageDialog(rootPane, msg);
        usuAtual = 0;
        preencherTabela();
        mostrarRegistro();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String usuario = JOptionPane.showInputDialog("Insira o código do usuário");

        if (usuario == null) {
            return;
        }

        if (usuario.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "O código do usuário é obrigatório para a pesquisa");
            return;
        }

        if (!msDados_db.existeUsuario(usuario)) {
            JOptionPane.showMessageDialog(rootPane, "Este usário não existe");
            return;
        }

        int num = tblTabela.getRowCount();
        for (int i = 0; i < num; i++) {
            if (Utilidades.objectToString(tblTabela.getValueAt(i, 0)).equals(usuario)) {
                usuAtual = i;
                break;
            }
        }
        mostrarRegistro();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void mostrarRegistro() {
        txtIDUsuario.setText(Utilidades.objectToString(tblTabela.getValueAt(usuAtual, 0)));
        txtNome.setText(Utilidades.objectToString(tblTabela.getValueAt(usuAtual, 1)));
        txtSnome.setText(Utilidades.objectToString(tblTabela.getValueAt(usuAtual, 2)));
        txtSenha.setText("");
        txtConfirmar.setText("");
        cmbPerfil.setSelectedIndex(perfil(Utilidades.objectToString(tblTabela.getValueAt(usuAtual, 3))));
    }

    private void preencherTabela() {
        try {
            String titulos[] = {"ID Usuario", "Nome", "Sobrenome", "Perfil"};
            String registro[] = new String[4];
            mTabela = new DefaultTableModel(null, titulos);
            ResultSet rs = msDados_db.getUsuarios();

            while (rs.next()) {
                registro[0] = rs.getString("IdUsuario");
                registro[1] = rs.getString("nome");
                registro[2] = rs.getString("sobrenome");
                registro[3] = perfil(rs.getInt("idPerfil"));
                mTabela.addRow(registro);
            }
            tblTabela.setModel(mTabela);
        } catch (SQLException e) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private String perfil(int idPerfil) {
        if (idPerfil == 1) {
            return "Administrador";
        } else {
            return "Usuario";
        }
    }

    private int perfil(String perfil) {
        if (perfil.equals("Administrador")) {
            return 1;
        } else {
            return 2;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JComboBox<String> cmbPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabela;
    private javax.swing.JPasswordField txtConfirmar;
    private javax.swing.JTextField txtIDUsuario;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtSnome;
    // End of variables declaration//GEN-END:variables
}
