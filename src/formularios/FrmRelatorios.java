package formularios;

import classes.Dados_db;
import classes.Opcoes;
import classes.Relatorio;
import classes.Utilidades;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FrmRelatorios extends javax.swing.JInternalFrame {

    private Dados_db msDados_db;

    public void setDados_db(Dados_db msDados_db) {
        this.msDados_db = msDados_db;
    }

    public FrmRelatorios() {
        initComponents();
        bgTipo.add(jrbTodasVendas);
        bgTipo.add(jrbSelecaoVendas);

        bgFiltro.add(jrbDataVenda);
        bgFiltro.add(jrbNumeroVenda);
        bgFiltro.add(jrbCliente);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgFiltro = new javax.swing.ButtonGroup();
        bgTipo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtArquivo = new javax.swing.JTextField();
        btnSelecao = new javax.swing.JButton();
        jrbDataVenda = new javax.swing.JRadioButton();
        jrbNumeroVenda = new javax.swing.JRadioButton();
        jrbCliente = new javax.swing.JRadioButton();
        jrbTodasVendas = new javax.swing.JRadioButton();
        jrbSelecaoVendas = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jdcDataInicial = new com.toedter.calendar.JDateChooser();
        jdcDataFinal = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbVendaInicial = new javax.swing.JComboBox<>();
        cmbVendaFinal = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cmbCliente = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cmbClienteFinal = new javax.swing.JComboBox<>();
        btnGerarRelatorio = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setClosable(true);
        setTitle("Relatorios  de vendas");
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

        jLabel1.setText("Arquivo.:");

        txtArquivo.setText("arquivo");

        btnSelecao.setText("Seleção");
        btnSelecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecaoActionPerformed(evt);
            }
        });

        jrbDataVenda.setSelected(true);
        jrbDataVenda.setText("Data da venda");
        jrbDataVenda.setEnabled(false);
        jrbDataVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbDataVendaActionPerformed(evt);
            }
        });

        jrbNumeroVenda.setText("Numero da venda");
        jrbNumeroVenda.setEnabled(false);
        jrbNumeroVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbNumeroVendaActionPerformed(evt);
            }
        });

        jrbCliente.setText("Cliente");
        jrbCliente.setEnabled(false);
        jrbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbClienteActionPerformed(evt);
            }
        });

        jrbTodasVendas.setSelected(true);
        jrbTodasVendas.setText("Todas as vendas");
        jrbTodasVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbTodasVendasActionPerformed(evt);
            }
        });

        jrbSelecaoVendas.setText("Seleção de vendas");
        jrbSelecaoVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbSelecaoVendasActionPerformed(evt);
            }
        });

        jLabel2.setText("Data Inicial.:");

        jLabel3.setText("Data Final.:");

        jdcDataInicial.setEnabled(false);

        jdcDataFinal.setEnabled(false);

        jLabel4.setText("Venda Inicial.:");

        jLabel5.setText("Venda Final.:");

        cmbVendaInicial.setEnabled(false);

        cmbVendaFinal.setEnabled(false);

        jLabel6.setText("Cliente.:");

        cmbCliente.setEnabled(false);

        jLabel7.setText("Cliente Final.:");
        jLabel7.setEnabled(false);

        cmbClienteFinal.setEnabled(false);

        btnGerarRelatorio.setText("Gerar Relatorio");
        btnGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarRelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jrbDataVenda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jrbTodasVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jrbSelecaoVendas))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnSelecao))
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(233, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jrbNumeroVenda)
                            .addComponent(jLabel6)
                            .addComponent(cmbVendaInicial, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jdcDataInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(jrbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jdcDataFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(cmbVendaFinal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7)
                            .addComponent(cmbClienteFinal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGerarRelatorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelecao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbTodasVendas)
                    .addComponent(jrbSelecaoVendas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbDataVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdcDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdcDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jrbNumeroVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbVendaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbVendaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jrbCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbClienteFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                .addComponent(btnGerarRelatorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbTodasVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbTodasVendasActionPerformed
        habilitarCampos();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_jrbTodasVendasActionPerformed

    private void jrbSelecaoVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbSelecaoVendasActionPerformed
        habilitarCampos();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_jrbSelecaoVendasActionPerformed

    private void jrbDataVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbDataVendaActionPerformed
        habilitarCampos();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_jrbDataVendaActionPerformed

    private void jrbNumeroVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbNumeroVendaActionPerformed
        habilitarCampos();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_jrbNumeroVendaActionPerformed

    private void jrbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbClienteActionPerformed
        habilitarCampos();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_jrbClienteActionPerformed

    private void btnGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarRelatorioActionPerformed
        if (txtArquivo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Preencher todos os campos");
            return;
        }

        try {
            String arquivo = txtArquivo.getText() + ".pdf";

            //@formatter off
            String sql = "SELECT fatura.idFatura, fatura.idCliente, CONCAT(nome, sobreNome) AS nomeFull, data, idLinha, idProduto, descricao, preco, quantidade, preco*detalhefatura.quantidade AS valor FROM fatura INNER JOIN clientes ON fatura.idCliente = clientes.idCliente INNER JOIN detalhefatura ON fatura.idFatura = detalhefatura.idFatura ";
            //@formatter on

            String filtro = "";
            if (jrbTodasVendas.isSelected()) {
                filtro = "";
            } else {
                if (jrbCliente.isSelected()) {
                    if (cmbCliente.getSelectedIndex() == 0) {
                        JOptionPane.showMessageDialog(rootPane, "Selecione um cliente");
                        cmbCliente.requestFocusInWindow();
                        return;
                    }
                    filtro = "WHERE fatura.idCliente ='" + ((Opcoes) cmbCliente.getSelectedItem()).getValor() + "'";
                }
                if (jrbNumeroVenda.isSelected()) {
                    if (cmbVendaInicial.getSelectedIndex() == 0) {
                        JOptionPane.showMessageDialog(rootPane, "Selecione a venda inicial");
                        cmbVendaFinal.requestFocusInWindow();
                        return;
                    }
                    if (jrbNumeroVenda.isSelected()) {
                        if (cmbVendaFinal.getSelectedIndex() == 0) {
                            JOptionPane.showMessageDialog(rootPane, "Selecione a venda final");
                            cmbVendaFinal.requestFocusInWindow();
                            return;
                        }
                        //@formatter off
                        filtro = "WHERE fatura.idFatura >= " + ((Opcoes) cmbVendaInicial.getSelectedItem()).getValor() + " AND fatura.idFatura <= " + ((Opcoes) cmbVendaFinal.getSelectedItem()).getValor();
                        //@formatter on
                    }
                    if (jrbDataVenda.isSelected()) {
                        if (jdcDataInicial.getDate() == null) {
                            JOptionPane.showMessageDialog(rootPane, "Selecione a data inicial");
                            jdcDataInicial.requestFocusInWindow();
                            return;
                        }
                        if (jdcDataFinal.getDate() == null) {
                            if (cmbVendaFinal.getSelectedIndex() == 0) {
                                JOptionPane.showMessageDialog(rootPane, "Selecione a data final");
                                jdcDataInicial.requestFocusInWindow();
                                return;
                            }
                            //@formatter off
                            filtro = "WHERE data >= '" + Utilidades.formatDate(jdcDataInicial.getDate()) + "' AND data <= '" + Utilidades.formatDate(jdcDataFinal.getDate()) + "'";
                            //@formatter on
                        }
                    }
                }
                sql = sql + filtro;
                Relatorio.relatorioFatura(arquivo, msDados_db.getConsulta(sql));
                JOptionPane.showMessageDialog(rootPane, "Relatório gerado com sucesso!");
            }

        } catch (HeadlessException e) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, e);
        }

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnGerarRelatorioActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {
            Opcoes opc = new Opcoes("Developer: GvC", "Selecione um cliente");
            cmbCliente.addItem(opc);
            //cmbClienteFinal.addItem(opc);
            ResultSet rsCli = msDados_db.getClientes();

            while (rsCli.next()) {
                opc = new Opcoes(
                        rsCli.getString("idCliente"),
                        rsCli.getString("nome") + ""
                        + rsCli.getString("sobreNome"));
                cmbCliente.addItem(opc);
                //cmbClienteFinal.addItem(opc);
            }

            opc = new Opcoes("Developer: GvC", "Selecione uma venda");
            cmbVendaInicial.addItem(opc);
            cmbVendaFinal.addItem(opc);
            ResultSet rsFat = msDados_db.getFatura();

            while (rsFat.next()) {
                opc = new Opcoes(
                        rsFat.getString("idFatura"),
                        rsFat.getString("idFatura"));
                cmbVendaInicial.addItem(opc);
                cmbVendaFinal.addItem(opc);
            }
        } catch (SQLException e) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, e);
        }

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnSelecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecaoActionPerformed
        FrmArquivo mArquivo = new FrmArquivo(null, closable);
        mArquivo.setVisible(true);
        String arquivo = mArquivo.getArquivo();

        if (!arquivo.equals("")) {
            txtArquivo.setText(arquivo);
        }

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnSelecaoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgFiltro;
    private javax.swing.ButtonGroup bgTipo;
    private javax.swing.JButton btnGerarRelatorio;
    private javax.swing.JButton btnSelecao;
    private javax.swing.JComboBox<Opcoes> cmbCliente;
    private javax.swing.JComboBox<Opcoes> cmbClienteFinal;
    private javax.swing.JComboBox<Opcoes> cmbVendaFinal;
    private javax.swing.JComboBox<Opcoes> cmbVendaInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private com.toedter.calendar.JDateChooser jdcDataFinal;
    private com.toedter.calendar.JDateChooser jdcDataInicial;
    private javax.swing.JRadioButton jrbCliente;
    private javax.swing.JRadioButton jrbDataVenda;
    private javax.swing.JRadioButton jrbNumeroVenda;
    private javax.swing.JRadioButton jrbSelecaoVendas;
    private javax.swing.JRadioButton jrbTodasVendas;
    private javax.swing.JTextField txtArquivo;
    // End of variables declaration//GEN-END:variables

    private void habilitarCampos() {
        if (jrbTodasVendas.isSelected()) {
            jrbDataVenda.setEnabled(false);
            jrbNumeroVenda.setEnabled(false);
            jrbCliente.setEnabled(false);

            jdcDataInicial.setEnabled(false);
            jdcDataFinal.setEnabled(false);

            cmbVendaInicial.setEnabled(false);
            cmbVendaFinal.setEnabled(false);
            cmbCliente.setEnabled(false);
            //cmbClienteFinal.setEnabled(false);
        } else {
            jrbDataVenda.setEnabled(true);
            jrbNumeroVenda.setEnabled(true);
            jrbCliente.setEnabled(true);

            if (jrbDataVenda.isSelected()) {
                jdcDataInicial.setEnabled(true);
                jdcDataFinal.setEnabled(true);

                cmbVendaInicial.setEnabled(false);
                cmbVendaFinal.setEnabled(false);
                cmbCliente.setEnabled(false);
                //cmbClienteFinal.setEnabled(false);
            }

            if (jrbNumeroVenda.isSelected()) {
                jdcDataInicial.setEnabled(false);
                jdcDataFinal.setEnabled(false);

                cmbVendaInicial.setEnabled(true);
                cmbVendaFinal.setEnabled(true);
                cmbCliente.setEnabled(false);
                //cmbClienteFinal.setEnabled(false);
            }

            if (jrbCliente.isSelected()) {
                jdcDataInicial.setEnabled(false);
                jdcDataFinal.setEnabled(false);

                cmbVendaInicial.setEnabled(false);
                cmbVendaFinal.setEnabled(false);
                cmbCliente.setEnabled(true);
                //cmbClienteFinal.setEnabled(true);
            }
        }
    }
}
