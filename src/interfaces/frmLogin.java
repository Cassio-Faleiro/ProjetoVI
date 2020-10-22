
package interfaces;

import controller.FormCadastroController;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import keeptoo.KButton;
import keeptoo.KGradientPanel;

public class frmLogin extends javax.swing.JFrame {
    private final FormCadastroController controller;

    public frmLogin() {
        initComponents();       
        controller = new FormCadastroController(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        kButton3 = new keeptoo.KButton();
        psfSenha3 = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        bnt_exit = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPalavra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        psfSenha = new javax.swing.JPasswordField();
        psfSenha1 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        kButton2 = new keeptoo.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setForeground(new java.awt.Color(153, 153, 153));
        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(0, 204, 204));
        kGradientPanel1.setkGradientFocus(1500);
        kGradientPanel1.setkStartColor(new java.awt.Color(20, 85, 217));
        kGradientPanel1.setOpaque(false);
        kGradientPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(20, 85, 217));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(7, 162, 208));
        jLabel4.setText("LOGIN");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 58, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Nome");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 142, -1, -1));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(7, 162, 208)));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 170, 334, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Senha");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 222, -1, -1));

        kButton3.setBorder(null);
        kButton3.setText("Entrar");
        kButton3.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        kButton3.setkBorderRadius(0);
        kButton3.setkEndColor(new java.awt.Color(20, 85, 217));
        kButton3.setkHoverEndColor(new java.awt.Color(7, 162, 208));
        kButton3.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton3.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(kButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 326, 334, -1));

        psfSenha3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        psfSenha3.setForeground(new java.awt.Color(153, 153, 153));
        psfSenha3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(7, 162, 208)));
        psfSenha3.setCaretColor(new java.awt.Color(255, 153, 0));
        psfSenha3.setOpaque(false);
        jPanel2.add(psfSenha3, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 244, 334, 30));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sofa_with_buttons_120px.png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 6, 150, 110));

        kGradientPanel1.add(jPanel2);
        jPanel2.setBounds(530, 110, 470, 570);

        bnt_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close.png"))); // NOI18N
        bnt_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bnt_exitMouseClicked(evt);
            }
        });
        kGradientPanel1.add(bnt_exit);
        bnt_exit.setBounds(1100, 10, 36, 30);

        jPanel1.setBackground(new java.awt.Color(16, 67, 198));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        txtPalavra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPalavra.setForeground(new java.awt.Color(255, 255, 255));
        txtPalavra.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtPalavra.setCaretColor(new java.awt.Color(255, 153, 0));
        txtPalavra.setOpaque(false);
        jPanel1.add(txtPalavra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 320, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Senha");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Confirmar Senha");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        psfSenha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        psfSenha.setForeground(new java.awt.Color(255, 255, 255));
        psfSenha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        psfSenha.setCaretColor(new java.awt.Color(255, 153, 0));
        psfSenha.setOpaque(false);
        jPanel1.add(psfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 320, 30));

        psfSenha1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        psfSenha1.setForeground(new java.awt.Color(255, 255, 255));
        psfSenha1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        psfSenha1.setCaretColor(new java.awt.Color(255, 153, 0));
        psfSenha1.setOpaque(false);
        jPanel1.add(psfSenha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 320, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Registrar Usuário");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        kButton2.setBorder(null);
        kButton2.setText("Cadastrar");
        kButton2.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        kButton2.setkBorderRadius(40);
        kButton2.setkEndColor(new java.awt.Color(20, 85, 217));
        kButton2.setkHoverEndColor(new java.awt.Color(7, 162, 208));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverStartColor(new java.awt.Color(7, 162, 208));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 150, 40));

        kGradientPanel1.add(jPanel1);
        jPanel1.setBounds(130, 110, 400, 570);

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 730));

        setSize(new java.awt.Dimension(1147, 731));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        frmPrincipal principal = new frmPrincipal();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_kButton3ActionPerformed

    public JLabel getBnt_exit() {
        return bnt_exit;
    }

    public void setBnt_exit(JLabel bnt_exit) {
        this.bnt_exit = bnt_exit;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel10() {
        return jLabel10;
    }

    public void setjLabel10(JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    public JLabel getjLabel13() {
        return jLabel13;
    }

    public void setjLabel13(JLabel jLabel13) {
        this.jLabel13 = jLabel13;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public JLabel getjLabel8() {
        return jLabel8;
    }

    public void setjLabel8(JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JTextField getjTextField1() {
        return jTextField1;
    }

    public void setjTextField1(JTextField jTextField1) {
        this.jTextField1 = jTextField1;
    }

    public KButton getkButton2() {
        return kButton2;
    }

    public void setkButton2(KButton kButton2) {
        this.kButton2 = kButton2;
    }

    public KButton getkButton3() {
        return kButton3;
    }

    public void setkButton3(KButton kButton3) {
        this.kButton3 = kButton3;
    }

    public KGradientPanel getkGradientPanel1() {
        return kGradientPanel1;
    }

    public void setkGradientPanel1(KGradientPanel kGradientPanel1) {
        this.kGradientPanel1 = kGradientPanel1;
    }

    public JPasswordField getPsfSenha() {
        return psfSenha;
    }

    public void setPsfSenha(JPasswordField psfSenha) {
        this.psfSenha = psfSenha;
    }

    public JPasswordField getPsfSenha1() {
        return psfSenha1;
    }

    public void setPsfSenha1(JPasswordField psfSenha1) {
        this.psfSenha1 = psfSenha1;
    }

    public JPasswordField getPsfSenha3() {
        return psfSenha3;
    }

    public void setPsfSenha3(JPasswordField psfSenha3) {
        this.psfSenha3 = psfSenha3;
    }

    public JTextField getTxtPalavra() {
        return txtPalavra;
    }

    public void setTxtPalavra(JTextField txtPalavra) {
        this.txtPalavra = txtPalavra;
    }

    private void bnt_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnt_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_bnt_exitMouseClicked

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        controller.salvaUsuario();
        txtPalavra.setText("");
        psfSenha.setText("");
        psfSenha1.setText("");
    }//GEN-LAST:event_kButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bnt_exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private keeptoo.KButton kButton2;
    private keeptoo.KButton kButton3;
    private keeptoo.KGradientPanel kGradientPanel1;
    public javax.swing.JPasswordField psfSenha;
    public javax.swing.JPasswordField psfSenha1;
    public javax.swing.JPasswordField psfSenha3;
    public javax.swing.JTextField txtPalavra;
    // End of variables declaration//GEN-END:variables
}
