package formularios;

import classes.Dados_db;
import classes.Opcoes;
import classes.Produto;
import classes.Utilidades;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class FrmFatura extends javax.swing.JInternalFrame {

    private Dados_db msDados_db;
    private DefaultTableModel mTabela;

    public void setDados_db(Dados_db msDados_db) {
        this.msDados_db = msDados_db;
    }

    public FrmFatura() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        cmbCliente = new javax.swing.JComboBox();
        cmbProduto = new javax.swing.JComboBox<>();
        txtQuantidade = new javax.swing.JTextField();
        btnPesqCliente = new javax.swing.JButton();
        btnPesqProduto = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnDeletarTodos = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtTotalQuantidade = new javax.swing.JTextField();
        txtTotalValor = new javax.swing.JTextField();

        setClosable(true);
        setResizable(true);
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

        jLabel1.setText("Data.:");

        jLabel2.setText("Cliente.:");

        jLabel3.setText("Produto.:");

        jLabel4.setText("Quantidade.:");

        txtData.setEnabled(false);

        btnPesqCliente.setText("Pesquisar Cliente");
        btnPesqCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqClienteActionPerformed(evt);
            }
        });

        btnPesqProduto.setText("Pesquisar Produto");
        btnPesqProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqProdutoActionPerformed(evt);
            }
        });

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnDeletarTodos.setText("Deletar Todos");
        btnDeletarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarTodosActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
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

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Total.:");

        txtTotalQuantidade.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalQuantidade.setEnabled(false);

        txtTotalValor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalValor.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                    .addComponent(txtQuantidade))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDeletarTodos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(37, 37, 37))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(50, 50, 50)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnPesqProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                            .addComponent(btnPesqCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                        .addGap(68, 68, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotalQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotalValor, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesqCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesqProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnDeletar)
                    .addComponent(btnDeletarTodos)
                    .addComponent(btnSalvar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTotalQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {
            Opcoes opc = new Opcoes("Developer: GvC", "Selecione um cliente");
            cmbCliente.addItem(opc);
            ResultSet rsCli = msDados_db.getClientes();

            while (rsCli.next()) {
                opc = new Opcoes(
                        rsCli.getString("idCliente"),
                        rsCli.getString("nome") + ""
                        + rsCli.getString("sobreNome"));
                cmbCliente.addItem(opc);
            }

            opc = new Opcoes("Developer: GvC", "Selecione um produto");
            cmbProduto.addItem(opc);
            ResultSet rsPro = msDados_db.getProdutos();

            while (rsPro.next()) {
                opc = new Opcoes(
                        rsPro.getString("idProduto"),
                        rsPro.getString("descricao"));
                cmbProduto.addItem(opc);
            }

            txtData.setText(Utilidades.formatDate(new Date()));
            txtTotalQuantidade.setText("0");
            txtTotalValor.setText("0");

            preencherTabela();

        } catch (SQLException e) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, e);
        }
        
        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        if (cmbProduto.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um produto");
            cmbProduto.requestFocusInWindow();
            return;
        }

        if (txtQuantidade.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Digite uma quantidade");
            txtQuantidade.requestFocusInWindow();
            return;
        }

        if (!Utilidades.isNumeric(txtQuantidade.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Digite somente numeros");
            txtQuantidade.setText("");
            txtQuantidade.requestFocusInWindow();
            return;
        }

        int qtde = Integer.parseInt(txtQuantidade.getText());
        System.out.println("Quantidade: " + qtde);
        if (qtde <= 0) {
            JOptionPane.showMessageDialog(rootPane, "Digite somente numeros positivos");
            txtQuantidade.setText("");
            txtQuantidade.requestFocusInWindow();
            return;
        }

        Produto mProduto = msDados_db.getProduto(((Opcoes) cmbProduto.getSelectedItem()).getValor());

        String registro[] = new String[5];
        registro[0] = mProduto.getIdProduto();
        registro[1] = mProduto.getDescricao();
        registro[2] = String.valueOf(mProduto.getPreco());
        registro[3] = String.valueOf(qtde);
        registro[4] = String.valueOf(qtde * mProduto.getPreco());
        mTabela.addRow(registro);

        cmbProduto.setSelectedIndex(0);
        txtQuantidade.setText("");
        cmbProduto.requestFocusInWindow();

        total();
        
        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnAdicionarActionPerformed

    public void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (cmbCliente.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um cliente");
            cmbCliente.requestFocusInWindow();
            return;
        }

        if (cmbProduto.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um produto para a venda");
            cmbProduto.requestFocusInWindow();
            return;
        }

        int total = Integer.parseInt(txtTotalQuantidade.getText());
        System.out.println("Total: " + total);
        if (total == 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione a quantidade do produto");
            txtQuantidade.requestFocusInWindow();
            return;
        }

        if (tblTabela.getRowCount() == 0) {
            JOptionPane.showMessageDialog(rootPane, "A venda precisa estar adicionada na tabela antes de salvar");
            return;
        }

        int resposta = JOptionPane.showConfirmDialog(rootPane, "Realizar está venda?");
        if (resposta != 0) {
            return;
        }

        int numeroFatura = msDados_db.getNumeroFatura();
        msDados_db.adicionarFatura(numeroFatura, ((Opcoes) cmbCliente.getSelectedItem()).getValor(), new Date());

        int numero = tblTabela.getRowCount();

        for (int i = 0; i < numero; i++) {
            msDados_db.adicionarDetalheFatura(numeroFatura, i,
                    Utilidades.objectToString(tblTabela.getValueAt(i, 0)),
                    Utilidades.objectToString(tblTabela.getValueAt(i, 1)),
                    Utilidades.objectToInt(tblTabela.getValueAt(i, 2)),
                    Utilidades.objectToInt(tblTabela.getValueAt(i, 3)));
        }
        JOptionPane.showMessageDialog(rootPane, "Venda:" + numeroFatura + "Realizada com cucesso!");

        cmbCliente.setSelectedIndex(0);
        limparTabela();
        total();
        cmbCliente.requestFocusInWindow();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnDeletarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarTodosActionPerformed
        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deletar todas as vendas?");
        if (resposta != 0) {
            return;
        }
        limparTabela();
        total();
        
        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnDeletarTodosActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        if (cmbProduto.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Venda deletada com sucesso.!");
            cmbProduto.requestFocusInWindow();
            return;
        }
        try {
            DefaultTableModel modelo = (DefaultTableModel) tblTabela.getModel();
            int linha = tblTabela.getRowCount();
            for (int i = 0; i < linha; i++) {
                String tabela = Utilidades.objectToString(tblTabela.getValueAt(i, 0));
                String combo = ((Opcoes) cmbProduto.getSelectedItem()).getValor();
                if (tabela.equals(combo)) {
                    modelo.removeRow(0);
                    total();
                    return;
                }
            }
        } catch (Exception e) {
        }
        
        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnPesqClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqClienteActionPerformed
        FrmPesquisarCliente mPesqCliente = new FrmPesquisarCliente(null, closable);
        mPesqCliente.setDados_db(msDados_db);
        mPesqCliente.setVisible(true);

        String rta = mPesqCliente.getResposta();
        if (rta.equals("")) {
            return;
        }
        for (int i = 0; i < cmbCliente.getItemCount(); i++) {
            if (((Opcoes) cmbCliente.getItemAt(i)).getValor().equals(rta)) {
                cmbCliente.setSelectedIndex(i);
                return;
            }
        }
        
        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnPesqClienteActionPerformed

    private void btnPesqProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqProdutoActionPerformed
        FrmPesquisarProduto mPesqProduto = new FrmPesquisarProduto(null, closable);
        mPesqProduto.setDados_db(msDados_db);
        mPesqProduto.setVisible(true);

        String rta = mPesqProduto.getResposta();
        if (rta.equals("")) {
            return;
        }
        for (int i = 0; i < cmbProduto.getItemCount(); i++) {
            if (((Opcoes) cmbProduto.getItemAt(i)).getValor().equals(rta)) {
                cmbProduto.setSelectedIndex(i);
                return;
            }
        }
        
        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_btnPesqProdutoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnDeletarTodos;
    private javax.swing.JButton btnPesqCliente;
    private javax.swing.JButton btnPesqProduto;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cmbCliente;
    private javax.swing.JComboBox cmbProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtTotalQuantidade;
    private javax.swing.JTextField txtTotalValor;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {
        String titulos[] = {"ID", "Descricao", "Preco", "Quantidade", "Valor"};
        String registro[] = new String[5];
        mTabela = new DefaultTableModel(null, titulos);

        tblTabela.setModel(mTabela);

        DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
        dtcr.setHorizontalAlignment(SwingConstants.RIGHT);
        tblTabela.getColumnModel().getColumn(2).setCellRenderer(dtcr);
        tblTabela.getColumnModel().getColumn(3).setCellRenderer(dtcr);
        tblTabela.getColumnModel().getColumn(4).setCellRenderer(dtcr);

        //mTabela.addRow(registro);
    }

    private void total() {
        int numero = tblTabela.getRowCount();
        int somaQuantidade = 0, somaValor = 0;
        for (int i = 0; i < numero; i++) {
            somaQuantidade += Utilidades.objectToInt(tblTabela.getValueAt(i, 3));
            somaValor += Utilidades.objectToInt(tblTabela.getValueAt(i, 4));
        }
        txtTotalQuantidade.setText(String.valueOf(somaQuantidade));
        txtTotalValor.setText(String.valueOf(somaValor));
    }

    public void limparTabela() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) tblTabela.getModel();
            int linha = tblTabela.getRowCount();
            for (int i = 0; linha > i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Estes métodos só serão usado para a classe de teste junit (Test Packages,  "ISO-8859-1")
    public Object getCmbProduto() {
        return cmbProduto;
    }

    public JComboBox getCmbCliente() {
        return cmbCliente;
    }

    public Object getTxtQuantidade() {
        return txtQuantidade;
    }
}
