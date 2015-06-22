/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;



/**
 *
 * @author herico
 */
public class PrincipalGUI extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalGUI
     */
    public PrincipalGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBarPrincipaisTransacoes = new javax.swing.JToolBar();
        jButtonMovimentacao = new javax.swing.JButton();
        jButtonPagamentos = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        fundo = new javax.swing.JLabel();
        jMenuBarPrincipal = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCadastroEmpresa = new javax.swing.JMenuItem();
        jMenuItemCadastroPrecos = new javax.swing.JMenuItem();
        jMenuItemCadastroTipoMaterial = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuFechar = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Venda de Resíduos");
        setBackground(new java.awt.Color(0, 0, 0));
        setExtendedState(PrincipalGUI.MAXIMIZED_BOTH);

        jToolBarPrincipaisTransacoes.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBarPrincipaisTransacoes.setRollover(true);

        jButtonMovimentacao.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        jButtonMovimentacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/IconeMovimentacao.jpg"))); // NOI18N
        jButtonMovimentacao.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonMovimentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMovimentacaoActionPerformed(evt);
            }
        });
        jToolBarPrincipaisTransacoes.add(jButtonMovimentacao);

        jButtonPagamentos.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        jButtonPagamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/boleto_01-20.jpg"))); // NOI18N
        jButtonPagamentos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonPagamentos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPagamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPagamentosActionPerformed(evt);
            }
        });
        jToolBarPrincipaisTransacoes.add(jButtonPagamentos);

        jLayeredPane1.setBackground(new java.awt.Color(0, 0, 0));

        fundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Copobras.jpg"))); // NOI18N

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jLayeredPane1.setLayer(fundo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenuCadastro.setText("Cadastro");

        jMenuItemCadastroEmpresa.setText("Empresa");
        jMenuItemCadastroEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroEmpresaActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadastroEmpresa);

        jMenuItemCadastroPrecos.setText("Preços");
        jMenuItemCadastroPrecos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroPrecosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadastroPrecos);

        jMenuItemCadastroTipoMaterial.setText("Tipo Material");
        jMenuItemCadastroTipoMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroTipoMaterialActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadastroTipoMaterial);
        jMenuCadastro.add(jSeparator1);

        jMenuFechar.setText("Fechar");
        jMenuFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFecharActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuFechar);

        jMenuBarPrincipal.add(jMenuCadastro);

        jMenuRelatorios.setText("Relatórios");

        jMenuItem1.setText("Movimentação do Período");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItem1);

        jMenuItem2.setText("Notas Fiscais e Tickets Período");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItem2);

        jMenuBarPrincipal.add(jMenuRelatorios);

        setJMenuBar(jMenuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBarPrincipaisTransacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 877, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLayeredPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBarPrincipaisTransacoes, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLayeredPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuFecharActionPerformed

    private void jMenuItemCadastroEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroEmpresaActionPerformed
        EmpresaGUI empresaGUI = new EmpresaGUI();
        empresaGUI.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastroEmpresaActionPerformed

    private void jMenuItemCadastroPrecosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroPrecosActionPerformed
        PrecoGUI precoGUI = new PrecoGUI();
        precoGUI.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastroPrecosActionPerformed

    private void jMenuItemCadastroTipoMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroTipoMaterialActionPerformed
        TipoMaterialGUI tipoMaterialGUI = new TipoMaterialGUI();
        tipoMaterialGUI.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastroTipoMaterialActionPerformed

    private void jButtonMovimentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMovimentacaoActionPerformed
        MovimentacaoGUI movimentacaoGUI = new MovimentacaoGUI();
        movimentacaoGUI.setVisible(true);
    }//GEN-LAST:event_jButtonMovimentacaoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        MovimentacaoPeriodoGUI movimentacaoPeriodoGUI = new MovimentacaoPeriodoGUI();
        movimentacaoPeriodoGUI.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButtonPagamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPagamentosActionPerformed
        PagamentoGUI pagamentoGUI = new PagamentoGUI();
        pagamentoGUI.setVisible(true);
    }//GEN-LAST:event_jButtonPagamentosActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        NotasFiscaisPeriodoGUI notasFiscaisPeriodoGUI = new NotasFiscaisPeriodoGUI();
        notasFiscaisPeriodoGUI.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PrincipalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fundo;
    private javax.swing.JButton jButtonMovimentacao;
    private javax.swing.JButton jButtonPagamentos;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenuBar jMenuBarPrincipal;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuFechar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemCadastroEmpresa;
    private javax.swing.JMenuItem jMenuItemCadastroPrecos;
    private javax.swing.JMenuItem jMenuItemCadastroTipoMaterial;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar jToolBarPrincipaisTransacoes;
    // End of variables declaration//GEN-END:variables
}
