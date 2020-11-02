
package interfaces;

public class frmInfo extends javax.swing.JFrame {

    public frmInfo() {
        this.setResizable(false);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackground = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblAndre = new javax.swing.JLabel();
        lblCassio = new javax.swing.JLabel();
        lblMatheus = new javax.swing.JLabel();
        lvlVersao = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Informação do Sistema");
        setAutoRequestFocus(false);
        setFocusTraversalPolicyProvider(true);
        setFocusableWindowState(false);

        panelBackground.setBackground(new java.awt.Color(0, 0, 0));
        panelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo.jpeg"))); // NOI18N
        panelBackground.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 651, 140));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(153, 153, 153));
        lblTitulo.setText("Criado Por:");
        panelBackground.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 75, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        panelBackground.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 188, 10));

        lblAndre.setBackground(new java.awt.Color(255, 255, 255));
        lblAndre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAndre.setForeground(new java.awt.Color(153, 153, 153));
        lblAndre.setText("Andre");
        panelBackground.add(lblAndre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, -1));

        lblCassio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCassio.setForeground(new java.awt.Color(153, 153, 153));
        lblCassio.setText("Cássio Luis Faleiro");
        panelBackground.add(lblCassio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, -1));

        lblMatheus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMatheus.setForeground(new java.awt.Color(153, 153, 153));
        lblMatheus.setText("Matheus");
        panelBackground.add(lblMatheus, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 70, -1));

        lvlVersao.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lvlVersao.setForeground(new java.awt.Color(153, 153, 153));
        lvlVersao.setText("Versão: 2.1");
        panelBackground.add(lvlVersao, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, -1, -1));

        lblIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/java_25px.png"))); // NOI18N
        panelBackground.add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAndre;
    private javax.swing.JLabel lblCassio;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMatheus;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lvlVersao;
    private javax.swing.JPanel panelBackground;
    // End of variables declaration//GEN-END:variables
}
