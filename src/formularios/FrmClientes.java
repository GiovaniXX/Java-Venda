package formularios;

import classes.Cliente;
import classes.Dados_db;
import classes.Utilidades;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmClientes extends javax.swing.JInternalFrame {

    private Dados_db msDados_db;
    private int cliAtual = 0;
    private boolean novo = false;
    private DefaultTableModel mTabela;

    public void setDados_db(Dados_db msDados_db) {
        this.msDados_db = msDados_db;
    }

    public FrmClientes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIDCliente = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtSnome = new javax.swing.JTextField();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jdcDataNascimento = new com.toedter.calendar.JDateChooser();
        jdcDataCadastro = new com.toedter.calendar.JDateChooser();
        cmbIdentificacao = new javax.swing.JComboBox<>();
        cmbCidade = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("Cadastrar Clientes :");
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

        jLabel1.setText("ID Cliente.:");

        jLabel2.setText("Telefone.:");

        jLabel3.setText("Nome.:");

        jLabel4.setText("S-Nome.:");

        jLabel6.setText("Endereco.:");

        txtIDCliente.setEnabled(false);

        txtNome.setEnabled(false);

        txtSnome.setEnabled(false);

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
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblTabela);

        jLabel5.setText("Identificação.:");

        jLabel7.setText("Cidade.:");

        txtEndereco.setEnabled(false);

        txtTelefone.setEnabled(false);

        jLabel8.setText("Data Nascimento.:");

        jLabel9.setText("Data Cadastro.:");

        cmbIdentificacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a Identificacao", "rg", "cpf" }));

        cmbCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a cidade", "Lages", "Blumenau", "Joinvile" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(23, 23, 23)
                                .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnPrimeiro))
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
                                            .addComponent(btnPesquisar))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel7))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                                        .addComponent(txtSnome)
                                        .addComponent(txtEndereco)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtTelefone)
                                                .addComponent(cmbIdentificacao, 0, 170, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel9))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jdcDataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jdcDataCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(cmbCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jLabel6)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addComponent(jdcDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel9))
                    .addComponent(cmbIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(cmbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        Date dataAtual = new Date();
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

        txtIDCliente.setEnabled(true);
        cmbIdentificacao.setEnabled(true);
        txtNome.setEnabled(true);
        txtSnome.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtTelefone.setEnabled(true);
        cmbCidade.setEnabled(true);
        jdcDataNascimento.setEnabled(true);

        txtIDCliente.setText("");
        cmbIdentificacao.setSelectedIndex(0);
        txtNome.setText("");
        txtSnome.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");
        cmbCidade.setSelectedIndex(0);
        jdcDataNascimento.setDate(dataAtual);
        jdcDataCadastro.setDate(dataAtual);

        novo = true;
        txtIDCliente.requestFocus();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (txtIDCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Insira um número de ID");
            txtIDCliente.requestFocusInWindow();
            return;
        }

        if (cmbIdentificacao.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione a identificação");
            cmbIdentificacao.requestFocusInWindow();
            return;
        }

        if (txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Insira o nome");
            txtNome.requestFocusInWindow();
            return;
        }

        if (txtSnome.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Insira o sobre-nome");
            txtSnome.requestFocusInWindow();
            return;
        }

        if (jdcDataNascimento.getDate().after(new Date())) {
            JOptionPane.showMessageDialog(rootPane, "Insira a data de nascimento");
            jdcDataNascimento.requestFocusInWindow();
            return;
        }

//        if (jdcDataCadastro.getDate().after(new Date())) {
//            JOptionPane.showMessageDialog(rootPane, "Insira a data de cadastro");
//            jdcDataCadastro.requestFocusInWindow();
//            return;
//        }
        if (novo) {
            if (msDados_db.existeCliente(txtIDCliente.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Este cliente já existe");
                txtIDCliente.requestFocusInWindow();
                return;
            }
        } else {
            if (!msDados_db.existeCliente(txtIDCliente.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Este cliente ainda não existe");
                txtIDCliente.requestFocusInWindow();
                return;
            }
        }

        Cliente mCliente = new Cliente(
                txtIDCliente.getText(),
                cmbIdentificacao.getSelectedIndex(),
                txtNome.getText(),
                txtSnome.getText(),
                txtEndereco.getText(),
                txtTelefone.getText(),
                cmbCidade.getSelectedIndex(),
                jdcDataNascimento.getDate(),
                jdcDataCadastro.getDate());

        String msg;
        if (novo) {
            msg = msDados_db.adicionarCliente(mCliente);
        } else {
            msg = msDados_db.editarCliente(mCliente);
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

        txtIDCliente.setEnabled(false);
        cmbIdentificacao.setEnabled(false);
        txtNome.setEnabled(false);
        txtSnome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        cmbCidade.setEnabled(false);
        jdcDataNascimento.setEnabled(false);
        jdcDataCadastro.setEnabled(false);

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

        txtIDCliente.setEnabled(false);
        cmbIdentificacao.setEnabled(false);
        txtNome.setEnabled(false);
        txtSnome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        cmbCidade.setEnabled(false);
        jdcDataNascimento.setEnabled(false);
        jdcDataCadastro.setEnabled(false);

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

        txtIDCliente.setEnabled(true);
        cmbIdentificacao.setEnabled(true);
        txtNome.setEnabled(true);
        txtSnome.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtTelefone.setEnabled(true);
        cmbCidade.setEnabled(true);
        jdcDataNascimento.setEnabled(true);

        novo = false;
        cmbIdentificacao.requestFocus();

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
        cliAtual = 0;
        mostrarRegistro();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        cliAtual = msDados_db.numeroClientes() - 1;
        mostrarRegistro();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        cliAtual++;
        if (cliAtual == msDados_db.numeroClientes()) {
            cliAtual = 0;
        }
        mostrarRegistro();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        cliAtual--;
        if (cliAtual == - 1) {
            cliAtual = msDados_db.numeroClientes() - 1;
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
        msg = msDados_db.deletarCliente(txtIDCliente.getText());
        JOptionPane.showMessageDialog(rootPane, msg);
        cliAtual = 0;
        preencherTabela();
        mostrarRegistro();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String cliente = JOptionPane.showInputDialog("Insira o código do cliente");

        if (cliente == null) {
            return;
        }

        if (cliente.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "O código do cliente é obrigatório para a pesquisa");
            return;
        }

        if (!msDados_db.existeCliente(cliente)) {
            JOptionPane.showMessageDialog(rootPane, "Este cliente não existe");
            return;
        }

        int num = tblTabela.getRowCount();
        for (int i = 0; i < num; i++) {
            if (Utilidades.objectToString(tblTabela.getValueAt(i, 0)).equals(cliente)) {
                cliAtual = i;
                break;
            }
        }
        mostrarRegistro();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void mostrarRegistro() {
        txtIDCliente.setText(Utilidades.objectToString(tblTabela.getValueAt(cliAtual, 0)));
        cmbIdentificacao.setSelectedIndex(tipo(Utilidades.objectToString(tblTabela.getValueAt(cliAtual, 1))));
        txtNome.setText(Utilidades.objectToString(tblTabela.getValueAt(cliAtual, 2)));
        txtSnome.setText(Utilidades.objectToString(tblTabela.getValueAt(cliAtual, 3)));
        txtEndereco.setText(Utilidades.objectToString(tblTabela.getValueAt(cliAtual, 4)));
        txtTelefone.setText(Utilidades.objectToString(tblTabela.getValueAt(cliAtual, 5)));
        cmbCidade.setSelectedIndex(cidade(Utilidades.objectToString(tblTabela.getValueAt(cliAtual, 6))));
        jdcDataNascimento.setDate(Utilidades.objectToDate(tblTabela.getValueAt(cliAtual, 7)));
        jdcDataCadastro.setDate(Utilidades.objectToDate(tblTabela.getValueAt(cliAtual, 8)));
    }

    private void preencherTabela() {
        try {
            String titulos[] = {"ID Cliente", "Tipo", "Nome", "S-Nome", "Endereco", "Telefone", "Cidade", "D-Nascimento", "D-Cadastro"};
            String registro[] = new String[9];
            mTabela = new DefaultTableModel(null, titulos);
            ResultSet rs = msDados_db.getClientes();

            while (rs.next()) {
                registro[0] = rs.getString("idCliente");
                registro[1] = tipo(rs.getInt("tipo"));
                registro[2] = rs.getString("nome");
                registro[3] = rs.getString("sobrenome");
                registro[4] = rs.getString("endereco");
                registro[5] = rs.getString("telefone");
                registro[6] = cidade(rs.getInt("cidade"));
                registro[7] = rs.getString("dataNascimento");
                registro[8] = rs.getString("dataCadastro");
                mTabela.addRow(registro);
            }
            tblTabela.setModel(mTabela);
        } catch (SQLException e) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private String tipo(int tipo) {
        return switch (tipo) {
            case 0 ->
                "Identificacao";
            case 1 ->
                "rg";
            case 2 ->
                "cpf";
            default ->
                "Não definido";
        };
    }

    private int tipo(String tipo) {
        return switch (tipo.toLowerCase()) {
            case "identificacao" ->
                0;
            case "rg" ->
                1;
            case "cpf" ->
                2;
            default ->
                -1;
        };
    }

    private String cidade(int cidade) {
        return switch (cidade) {
            case 0 ->
                "Selecione a cidade";
            case 1 ->
                "Lages";
            case 2 ->
                "Blumenau";
            case 3 ->
                "Joinville";
            default ->
                "Não definido";
        };
    }

    private int cidade(String cidade) {
        return switch (cidade.toLowerCase()) {
            case "selecione a cidade" ->
                0;
            case "lages" ->
                1;
            case "blumenau" ->
                2;
            case "joinville" ->
                3;
            default ->
                -1;
        };
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
    private javax.swing.JComboBox<String> cmbCidade;
    private javax.swing.JComboBox<String> cmbIdentificacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcDataCadastro;
    private com.toedter.calendar.JDateChooser jdcDataNascimento;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtIDCliente;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSnome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
