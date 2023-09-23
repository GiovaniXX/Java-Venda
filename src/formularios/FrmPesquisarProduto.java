package formularios;

import classes.Dados_db;
import classes.Utilidades;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class FrmPesquisarProduto extends javax.swing.JDialog {

    private Dados_db msDados_db;
    private DefaultTableModel mTabela;
    private String resposta = "";

    public void setDados_db(Dados_db msDados_db) {
        this.msDados_db = msDados_db;
    }

    public String getResposta() {
        return resposta;
    }

    private void preencherTabela() {
        String titulos[] = {"ID Produto", "Descricao"};
        String registro[] = new String[2];
        mTabela = new DefaultTableModel(null, titulos);
        String sql = "";

        if (txtPesqProduto.getText().equals("")) {
            sql = "select idProduto, descricao from produtos";
        } else {
            if (jrbId.isSelected()) {
                sql = "select idProduto, descricao from produtos " + " where idProduto like '" + txtPesqProduto.getText() + "%'";
            }
            if (jrbDescricao.isSelected()) {
                sql = "select idProduto, descricao from produtos " + " where descricao like '" + txtPesqProduto.getText() + "%'";
            }
        }
        ResultSet rs = msDados_db.getConsulta(sql);
        try {
            while (rs.next()) {
                registro[0] = rs.getString("idProduto");
                registro[1] = rs.getString("descricao");
                mTabela.addRow(registro);
            }

            tblTabela.setModel(mTabela);
            return;

        } catch (SQLException e) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public FrmPesquisarProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        bgTipoPesquisa.add(jrbId);
        bgTipoPesquisa.add(jrbDescricao);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipoPesquisa = new javax.swing.ButtonGroup();
        jrbId = new javax.swing.JRadioButton();
        jrbDescricao = new javax.swing.JRadioButton();
        txtPesqProduto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();
        btnPesqCliente = new javax.swing.JButton();
        btnPesqSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisar Produto");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jrbId.setSelected(true);
        jrbId.setText("ID Produto");

        jrbDescricao.setText("Descricao");
        jrbDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbDescricaoActionPerformed(evt);
            }
        });

        txtPesqProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesqProdutoActionPerformed(evt);
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

        btnPesqCliente.setText("Pesquisar");

        btnPesqSair.setText("Sair");
        btnPesqSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPesqCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesqSair, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
                            .addComponent(txtPesqProduto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrbId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jrbDescricao)))))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbDescricao)
                    .addComponent(jrbId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPesqProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesqCliente)
                    .addComponent(btnPesqSair))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        preencherTabela();
        txtPesqProduto.requestFocusInWindow();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_formWindowOpened

    private void jrbDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbDescricaoActionPerformed
        txtPesqProduto.setText("");
        txtPesqProduto.requestFocusInWindow();
        preencherTabela();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_jrbDescricaoActionPerformed

    private void txtPesqProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesqProdutoActionPerformed
        int numero = tblTabela.getRowCount();
        if (numero == 0) {
            resposta = "";
            dispose();
            return;
        }

        for (int i = 0; i < numero; i++) {
            if (tblTabela.isRowSelected(i)) {
                resposta = Utilidades.objectToString(tblTabela.getValueAt(i, 0));
                dispose();
                return;
            }
        }
        resposta = Utilidades.objectToString(tblTabela.getValueAt(0, 0));
        dispose();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_txtPesqProdutoActionPerformed

    private void btnPesqSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqSairActionPerformed
        resposta = "";
        dispose();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);

    }//GEN-LAST:event_btnPesqSairActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPesquisarProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPesquisarProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPesquisarProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPesquisarProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmPesquisarProduto dialog = new FrmPesquisarProduto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgTipoPesquisa;
    private javax.swing.JButton btnPesqCliente;
    private javax.swing.JButton btnPesqSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jrbDescricao;
    private javax.swing.JRadioButton jrbId;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtPesqProduto;
    // End of variables declaration//GEN-END:variables
}
