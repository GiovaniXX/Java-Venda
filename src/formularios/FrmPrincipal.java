package formularios;

import classes.BackGround;
import classes.Dados_db;

public class FrmPrincipal extends javax.swing.JFrame {

    private int perfil;
    private Dados_db msDados_db;

    public void setPerfil(int perfil) {
        this.perfil = this.perfil;
    }

    public void setDados_db(Dados_db msDados_db) {
        this.msDados_db = msDados_db;
    }

    public FrmPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpnDesk = new BackGround();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArquivo = new javax.swing.JMenu();
        mnuArquivoClientes = new javax.swing.JMenuItem();
        mnuArquivoProdutos = new javax.swing.JMenuItem();
        mnuArquivoUsuarios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuArquivoTrocarSenha = new javax.swing.JMenuItem();
        mnuArquivoTrocarUsuario = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuArquivoSair = new javax.swing.JMenuItem();
        mnuMovimentos = new javax.swing.JMenu();
        mnuMovimentosNovaVenda = new javax.swing.JMenuItem();
        mnuMovimentosRelatorioVenda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de vendas :");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout dpnDeskLayout = new javax.swing.GroupLayout(dpnDesk);
        dpnDesk.setLayout(dpnDeskLayout);
        dpnDeskLayout.setHorizontalGroup(
            dpnDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 702, Short.MAX_VALUE)
        );
        dpnDeskLayout.setVerticalGroup(
            dpnDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );

        mnuArquivo.setText("Arquivo");

        mnuArquivoClientes.setText("Clientes");
        mnuArquivoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivoClientesActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivoClientes);

        mnuArquivoProdutos.setText("Produtos");
        mnuArquivoProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivoProdutosActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivoProdutos);

        mnuArquivoUsuarios.setText("Usuarios");
        mnuArquivoUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivoUsuariosActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivoUsuarios);
        mnuArquivo.add(jSeparator1);

        mnuArquivoTrocarSenha.setText("Trocar Senha");
        mnuArquivo.add(mnuArquivoTrocarSenha);

        mnuArquivoTrocarUsuario.setText("Trocar Usuario");
        mnuArquivoTrocarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivoTrocarUsuarioActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivoTrocarUsuario);
        mnuArquivo.add(jSeparator2);

        mnuArquivoSair.setText("Sair");
        mnuArquivoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivoSairActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivoSair);

        jMenuBar1.add(mnuArquivo);

        mnuMovimentos.setText("Movimentos");

        mnuMovimentosNovaVenda.setText("Nova Venda");
        mnuMovimentosNovaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMovimentosNovaVendaActionPerformed(evt);
            }
        });
        mnuMovimentos.add(mnuMovimentosNovaVenda);

        mnuMovimentosRelatorioVenda.setText("Relatorio Venda");
        mnuMovimentosRelatorioVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMovimentosRelatorioVendaActionPerformed(evt);
            }
        });
        mnuMovimentos.add(mnuMovimentosRelatorioVenda);

        jMenuBar1.add(mnuMovimentos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnDesk)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnDesk)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuArquivoUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivoUsuariosActionPerformed
        FrmUsuarios mUsuarios = new FrmUsuarios();
        mUsuarios.setDados_db(msDados_db);
        dpnDesk.add(mUsuarios);
        mUsuarios.show();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_mnuArquivoUsuariosActionPerformed

    private void mnuArquivoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivoSairActionPerformed
        System.exit(0);

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_mnuArquivoSairActionPerformed

    private void mnuArquivoProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivoProdutosActionPerformed
        FrmProdutos msProdutos = new FrmProdutos();
        msProdutos.setDados_db(msDados_db);
        dpnDesk.add(msProdutos);
        msProdutos.show();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_mnuArquivoProdutosActionPerformed

    private void mnuArquivoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivoClientesActionPerformed
        FrmClientes msClientes = new FrmClientes();
        msClientes.setDados_db(msDados_db);
        dpnDesk.add(msClientes);
        msClientes.show();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_mnuArquivoClientesActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ((BackGround) dpnDesk).setImagem("/images/001.jpg");

        if (perfil == 2) {
            mnuArquivoClientes.setEnabled(false);
            mnuArquivoProdutos.setEnabled(false);
            mnuArquivoUsuarios.setEnabled(false);
            mnuMovimentosRelatorioVenda.setEnabled(false);
        }

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_formWindowOpened

    private void mnuArquivoTrocarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivoTrocarUsuarioActionPerformed
        this.setVisible(false);
        FrmLogin mLogin = new FrmLogin();
        mLogin.setDados_db(msDados_db);
        mLogin.setVisible(true);

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_mnuArquivoTrocarUsuarioActionPerformed

    private void mnuMovimentosNovaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMovimentosNovaVendaActionPerformed
        FrmFatura mFatura = new FrmFatura();
        mFatura.setDados_db(msDados_db);
        dpnDesk.add(mFatura);
        mFatura.show();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_mnuMovimentosNovaVendaActionPerformed

    private void mnuMovimentosRelatorioVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMovimentosRelatorioVendaActionPerformed
        FrmRelatorios mRelatorios = new FrmRelatorios();
        mRelatorios.setDados_db(msDados_db);
        dpnDesk.add(mRelatorios);
        mRelatorios.show();

        int id = evt.getID();
        System.out.println("ID do evento: " + id);
    }//GEN-LAST:event_mnuMovimentosRelatorioVendaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpnDesk;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu mnuArquivo;
    private javax.swing.JMenuItem mnuArquivoClientes;
    private javax.swing.JMenuItem mnuArquivoProdutos;
    private javax.swing.JMenuItem mnuArquivoSair;
    private javax.swing.JMenuItem mnuArquivoTrocarSenha;
    private javax.swing.JMenuItem mnuArquivoTrocarUsuario;
    private javax.swing.JMenuItem mnuArquivoUsuarios;
    private javax.swing.JMenu mnuMovimentos;
    private javax.swing.JMenuItem mnuMovimentosNovaVenda;
    private javax.swing.JMenuItem mnuMovimentosRelatorioVenda;
    // End of variables declaration//GEN-END:variables
}
