/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import modelo.Usuario;
import dao.UsuarioDAO;
import javax.swing.JOptionPane;


/**
 *
 * @author herico
 */
public class PrincipalGUI extends javax.swing.JFrame {
    
    Usuario usuario = new Usuario();
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
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        fundo = new javax.swing.JLabel();
        jInternalFrameLogin = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextFieldCodUsuario = new javax.swing.JFormattedTextField();
        jPasswordFieldSenhaUsuario = new javax.swing.JPasswordField();
        jButtonEntrar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jMenuBarPrincipal = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemUsuario = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemCadastroEmpresa = new javax.swing.JMenuItem();
        jMenuItemCadastroPrecos = new javax.swing.JMenuItem();
        jMenuItemCadastroTipoMaterial = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuFechar = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuItemMovimentacaoPeriodo = new javax.swing.JMenuItem();
        jMenuItemNFsPeriodo = new javax.swing.JMenuItem();

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

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/LoginRed.jpg"))); // NOI18N
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBarPrincipaisTransacoes.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/sair.jpg"))); // NOI18N
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBarPrincipaisTransacoes.add(jButton4);

        jLayeredPane1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1111, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );

        fundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Copobras.jpg"))); // NOI18N

        jInternalFrameLogin.setVisible(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("LOGIN");

        jLabel2.setText("Código:");

        jLabel3.setText("Senha:");

        jFormattedTextFieldCodUsuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jButtonEntrar.setText("Entrar");
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrameLoginLayout = new javax.swing.GroupLayout(jInternalFrameLogin.getContentPane());
        jInternalFrameLogin.getContentPane().setLayout(jInternalFrameLoginLayout);
        jInternalFrameLoginLayout.setHorizontalGroup(
            jInternalFrameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameLoginLayout.createSequentialGroup()
                .addGroup(jInternalFrameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jInternalFrameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextFieldCodUsuario)
                            .addComponent(jPasswordFieldSenhaUsuario)))
                    .addGroup(jInternalFrameLoginLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jInternalFrameLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jInternalFrameLoginLayout.setVerticalGroup(
            jInternalFrameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jFormattedTextFieldCodUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordFieldSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEntrar)
                    .addComponent(jButtonCancelar))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        jMenuCadastro.setText("Cadastro");

        jMenuItemUsuario.setText("Usuários");
        jMenuItemUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuarioActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemUsuario);
        jMenuCadastro.add(jSeparator2);

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

        jMenuItemMovimentacaoPeriodo.setText("Movimentação do Período");
        jMenuItemMovimentacaoPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMovimentacaoPeriodoActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItemMovimentacaoPeriodo);

        jMenuItemNFsPeriodo.setText("Notas Fiscais e Tickets Período");
        jMenuItemNFsPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNFsPeriodoActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItemNFsPeriodo);

        jMenuBarPrincipal.add(jMenuRelatorios);

        setJMenuBar(jMenuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBarPrincipaisTransacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(302, 302, 302)
                .addComponent(jInternalFrameLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 365, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLayeredPane1))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(42, 42, 42)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBarPrincipaisTransacoes, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jInternalFrameLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(336, 336, 336))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLayeredPane1))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuFecharActionPerformed

    private void jMenuItemCadastroEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroEmpresaActionPerformed
        if(usuario.getTipo()==0 || usuario.getTipo()==3){
            JOptionPane.showMessageDialog(null, "Acesso negato para usuário");            
        } else {
            EmpresaGUI empresaGUI = new EmpresaGUI();
            empresaGUI.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItemCadastroEmpresaActionPerformed

    private void jMenuItemCadastroPrecosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroPrecosActionPerformed
        if(usuario.getTipo()==1){
            PrecoGUI precoGUI = new PrecoGUI();
            precoGUI.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Acesso negato para usuário");
        }
    }//GEN-LAST:event_jMenuItemCadastroPrecosActionPerformed

    private void jMenuItemCadastroTipoMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroTipoMaterialActionPerformed
        if(usuario.getTipo()==0 || usuario.getTipo()==3){
            JOptionPane.showMessageDialog(null, "Acesso negato para usuário");            
        } else {
            TipoMaterialGUI tipoMaterialGUI = new TipoMaterialGUI();
            tipoMaterialGUI.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItemCadastroTipoMaterialActionPerformed

    private void jButtonMovimentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMovimentacaoActionPerformed
        if(usuario.getTipo()==0 || usuario.getTipo()==3){
            JOptionPane.showMessageDialog(null, "Acesso negato para usuário");  
        } else {
            MovimentacaoGUI movimentacaoGUI = new MovimentacaoGUI();
            movimentacaoGUI.setVisible(true);
        }
    }//GEN-LAST:event_jButtonMovimentacaoActionPerformed

    private void jMenuItemMovimentacaoPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMovimentacaoPeriodoActionPerformed
        if(usuario.getTipo()==1){
            MovimentacaoPeriodoGUI movimentacaoPeriodoGUI = new MovimentacaoPeriodoGUI();
            movimentacaoPeriodoGUI.setVisible(true);
        }else {
            JOptionPane.showMessageDialog(null, "Acesso negato para usuário");
        }   
    }//GEN-LAST:event_jMenuItemMovimentacaoPeriodoActionPerformed

    private void jButtonPagamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPagamentosActionPerformed
        if(usuario.getTipo() == 1){
        PagamentoGUI pagamentoGUI = new PagamentoGUI();
        pagamentoGUI.setVisible(true);
        } else {
             JOptionPane.showMessageDialog(null, "Acesso negato para usuário");
        }
    }//GEN-LAST:event_jButtonPagamentosActionPerformed

    private void jMenuItemNFsPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNFsPeriodoActionPerformed
        if(usuario.getTipo()==0){
            JOptionPane.showMessageDialog(null, "Acesso negato para usuário");
        } else {
            NotasFiscaisPeriodoGUI notasFiscaisPeriodoGUI = new NotasFiscaisPeriodoGUI();
            notasFiscaisPeriodoGUI.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItemNFsPeriodoActionPerformed

    private void jMenuItemUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuarioActionPerformed
        if(usuario.getTipo()==1){
            UsuarioGUI usuarioGUI = new UsuarioGUI();
            usuarioGUI.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Acesso negato para usuário");
        }
    }//GEN-LAST:event_jMenuItemUsuarioActionPerformed

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        usuario.setCod(Integer.parseInt(jFormattedTextFieldCodUsuario.getText()));
        usuario.setSenha(jPasswordFieldSenhaUsuario.getText());
        UsuarioDAO dao = new UsuarioDAO();
        dao.login(usuario);
        if(usuario.getTipo()==0){
             JOptionPane.showMessageDialog(null, "Usuário ou senha errado!");
        } else {
            jInternalFrameLogin.setVisible(false);
        }
    }//GEN-LAST:event_jButtonEntrarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        usuario.setCod(0);
        usuario.setSenha(null);
        usuario.setTipo(0);
        jInternalFrameLogin.setVisible(true);
        jFormattedTextFieldCodUsuario.setText("");
        jPasswordFieldSenhaUsuario.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

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
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonMovimentacao;
    private javax.swing.JButton jButtonPagamentos;
    private javax.swing.JFormattedTextField jFormattedTextFieldCodUsuario;
    private javax.swing.JInternalFrame jInternalFrameLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenuBar jMenuBarPrincipal;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuFechar;
    private javax.swing.JMenuItem jMenuItemCadastroEmpresa;
    private javax.swing.JMenuItem jMenuItemCadastroPrecos;
    private javax.swing.JMenuItem jMenuItemCadastroTipoMaterial;
    private javax.swing.JMenuItem jMenuItemMovimentacaoPeriodo;
    private javax.swing.JMenuItem jMenuItemNFsPeriodo;
    private javax.swing.JMenuItem jMenuItemUsuario;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JPasswordField jPasswordFieldSenhaUsuario;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JToolBar jToolBarPrincipaisTransacoes;
    // End of variables declaration//GEN-END:variables
}
