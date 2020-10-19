
package interfaces;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import static java.lang.reflect.Array.set;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class frmPrincipal extends javax.swing.JFrame {

    
    boolean abertoFechado = true;
    
    public frmPrincipal() {
        initComponents();
        clickButton(bntExpandir, detalhe, 1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cabecalho = new javax.swing.JPanel();
        minMaxSair = new javax.swing.JPanel();
        bntSair = new javax.swing.JPanel();
        lblSair = new javax.swing.JLabel();
        bntMax = new javax.swing.JPanel();
        lblMax = new javax.swing.JLabel();
        bntMin = new javax.swing.JPanel();
        lblMin = new javax.swing.JLabel();
        menu = new keeptoo.KGradientPanel();
        menuIcones = new keeptoo.KGradientPanel();
        bntExpandir = new javax.swing.JPanel();
        lblExpandir = new javax.swing.JLabel();
        detalhe = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        centro = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        cabecalho.setBackground(new java.awt.Color(9, 22, 50));
        cabecalho.setMinimumSize(new java.awt.Dimension(1090, 70));
        cabecalho.setPreferredSize(new java.awt.Dimension(1083, 50));
        cabecalho.setLayout(new java.awt.BorderLayout());

        minMaxSair.setBackground(new java.awt.Color(9, 22, 50));
        minMaxSair.setPreferredSize(new java.awt.Dimension(180, 100));
        minMaxSair.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bntSair.setBackground(new java.awt.Color(9, 22, 50));
        bntSair.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        bntSair.setLayout(new java.awt.BorderLayout());

        lblSair.setBackground(new java.awt.Color(9, 22, 50));
        lblSair.setForeground(new java.awt.Color(204, 204, 204));
        lblSair.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sair_32px.png"))); // NOI18N
        lblSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSairMouseExited(evt);
            }
        });
        bntSair.add(lblSair, java.awt.BorderLayout.CENTER);

        minMaxSair.add(bntSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 50, 50));

        bntMax.setBackground(new java.awt.Color(9, 22, 50));
        bntMax.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        bntMax.setLayout(new java.awt.BorderLayout());

        lblMax.setBackground(new java.awt.Color(9, 22, 50));
        lblMax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/max_32px.png"))); // NOI18N
        lblMax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMaxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMaxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMaxMouseExited(evt);
            }
        });
        bntMax.add(lblMax, java.awt.BorderLayout.CENTER);

        minMaxSair.add(bntMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 50, 50));

        bntMin.setBackground(new java.awt.Color(9, 22, 50));
        bntMin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        bntMin.setForeground(new java.awt.Color(255, 255, 255));
        bntMin.setLayout(new java.awt.BorderLayout());

        lblMin.setBackground(new java.awt.Color(9, 22, 50));
        lblMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/minimize_32px.png"))); // NOI18N
        lblMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMinMouseExited(evt);
            }
        });
        bntMin.add(lblMin, java.awt.BorderLayout.CENTER);

        minMaxSair.add(bntMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 50, 50));

        cabecalho.add(minMaxSair, java.awt.BorderLayout.LINE_END);

        getContentPane().add(cabecalho, java.awt.BorderLayout.NORTH);

        menu.setBackground(new java.awt.Color(0, 51, 153));
        menu.setForeground(new java.awt.Color(0, 0, 153));
        menu.setkBorderRadius(0);
        menu.setkStartColor(new java.awt.Color(0, 0, 204));
        menu.setPreferredSize(new java.awt.Dimension(210, 562));
        menu.setLayout(new java.awt.BorderLayout());

        menuIcones.setkBorderRadius(0);
        menuIcones.setkEndColor(new java.awt.Color(22, 54, 95));
        menuIcones.setkGradientFocus(10);
        menuIcones.setkStartColor(new java.awt.Color(9, 22, 50));
        menuIcones.setPreferredSize(new java.awt.Dimension(61, 562));
        menuIcones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bntExpandir.setBackground(new java.awt.Color(9, 22, 50));
        bntExpandir.setPreferredSize(new java.awt.Dimension(32, 32));

        lblExpandir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExpandir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/menuIOS_32px.png"))); // NOI18N
        lblExpandir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExpandirMouseClicked(evt);
            }
        });

        detalhe.setBackground(new java.awt.Color(255, 255, 255));
        detalhe.setPreferredSize(new java.awt.Dimension(3, 50));

        javax.swing.GroupLayout detalheLayout = new javax.swing.GroupLayout(detalhe);
        detalhe.setLayout(detalheLayout);
        detalheLayout.setHorizontalGroup(
            detalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        detalheLayout.setVerticalGroup(
            detalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bntExpandirLayout = new javax.swing.GroupLayout(bntExpandir);
        bntExpandir.setLayout(bntExpandirLayout);
        bntExpandirLayout.setHorizontalGroup(
            bntExpandirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bntExpandirLayout.createSequentialGroup()
                .addComponent(detalhe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblExpandir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        bntExpandirLayout.setVerticalGroup(
            bntExpandirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(detalhe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblExpandir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        menuIcones.add(bntExpandir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        menu.add(menuIcones, java.awt.BorderLayout.LINE_START);

        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(22, 54, 95));
        kGradientPanel1.setkGradientFocus(10);
        kGradientPanel1.setkStartColor(new java.awt.Color(13, 31, 67));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(140, 620));

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 149, Short.MAX_VALUE)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );

        menu.add(kGradientPanel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(menu, java.awt.BorderLayout.LINE_START);

        centro.setBackground(new java.awt.Color(255, 255, 255));
        centro.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout centroLayout = new javax.swing.GroupLayout(centro);
        centro.setLayout(centroLayout);
        centroLayout.setHorizontalGroup(
            centroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 895, Short.MAX_VALUE)
        );
        centroLayout.setVerticalGroup(
            centroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );

        getContentPane().add(centro, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1105, 638));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    //alterar a cor do botão quando clicado
    public void hover(JPanel hover, Color rand){
        hover.setBackground(rand);
    }
    
    //expandir o menu
    public void expandir(JPanel menu, boolean expandido){
        if(expandido == true){
            menu.setPreferredSize(new Dimension(60, menu.getHeight()));
        }else{
            menu.setPreferredSize(new Dimension(210, menu.getHeight()));     
        }
    }
    
    //altera a cor do botão do menu lateral
    public void clickButton(JPanel jp1, JPanel jp2, int numero){
        if(numero == 1){
            jp1.setBackground(new Color(13,31,67));
            jp2.setBackground(new Color(255,255,255));
        }else{
            jp1.setBackground(new Color(9,22,50));
            jp2.setBackground(new Color(9,22,50));
        }
    }
   
    private void lblSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblSairMouseClicked

    private void lblSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseEntered
        hover(bntSair, new Color(255,5,21));
    }//GEN-LAST:event_lblSairMouseEntered

    private void lblSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseExited
        hover(bntSair, new Color(9,22,50));
    }//GEN-LAST:event_lblSairMouseExited

    private void lblMaxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaxMouseEntered
        hover(bntMax, new Color(33,50,93));
    }//GEN-LAST:event_lblMaxMouseEntered

    private void lblMaxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaxMouseExited
        hover(bntMax, new Color(9,22,50));
    }//GEN-LAST:event_lblMaxMouseExited

    private void lblMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinMouseEntered
        hover(bntMin, new Color(33,50,93));
    }//GEN-LAST:event_lblMinMouseEntered

    private void lblMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinMouseExited
        hover(bntMin, new Color(9,22,50));
    }//GEN-LAST:event_lblMinMouseExited

    private void lblMaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaxMouseClicked
        if(this.getExtendedState() != frmPrincipal.MAXIMIZED_BOTH){
            this.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        }else{
            this.setExtendedState(frmPrincipal.NORMAL);
        }
    }//GEN-LAST:event_lblMaxMouseClicked

    private void lblMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinMouseClicked
        setState(frmPrincipal.ICONIFIED);
    }//GEN-LAST:event_lblMinMouseClicked

    private void lblExpandirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExpandirMouseClicked
        //alterar a cor do botão que expandi o menu
        clickButton(bntExpandir, detalhe, 1);
        
        
        //expandir o menu
        if(abertoFechado == true){
            //alterar a cor do botão que expandi o menu
            clickButton(bntExpandir, detalhe, 0);
            expandir(menu, abertoFechado);
            SwingUtilities.updateComponentTreeUI(this);
            abertoFechado=false;
        }else{
            expandir(menu, abertoFechado);
            SwingUtilities.updateComponentTreeUI(this);
            abertoFechado=true;           
        }
    }//GEN-LAST:event_lblExpandirMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bntExpandir;
    private javax.swing.JPanel bntMax;
    private javax.swing.JPanel bntMin;
    private javax.swing.JPanel bntSair;
    private javax.swing.JPanel cabecalho;
    private javax.swing.JPanel centro;
    private javax.swing.JPanel detalhe;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblExpandir;
    private javax.swing.JLabel lblMax;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblSair;
    private keeptoo.KGradientPanel menu;
    private keeptoo.KGradientPanel menuIcones;
    private javax.swing.JPanel minMaxSair;
    // End of variables declaration//GEN-END:variables
}
