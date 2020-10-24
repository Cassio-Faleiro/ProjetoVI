
package interfaces;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import static java.lang.reflect.Array.set;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class frmPrincipal extends javax.swing.JFrame {

    boolean abertoFechado = false;
    int x,y;
    
    public frmPrincipal() {
        initComponents();
        clickButton(bntExpandir, detalhe1, 0);
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
        userLogin = new javax.swing.JPanel();
        iconUser = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        menu = new keeptoo.KGradientPanel();
        menuIcones = new keeptoo.KGradientPanel();
        detalhe1 = new javax.swing.JPanel();
        bntExpandir = new javax.swing.JPanel();
        lblExpandir = new javax.swing.JLabel();
        detalhe2 = new javax.swing.JPanel();
        bntHome = new javax.swing.JPanel();
        lblHome = new javax.swing.JLabel();
        menuExpandido = new keeptoo.KGradientPanel();
        lblCadastro = new javax.swing.JLabel();
        separadorCadastro = new javax.swing.JSeparator();
        bntCliente = new javax.swing.JPanel();
        lblCliente = new javax.swing.JLabel();
        bntFornecedor = new javax.swing.JPanel();
        lblFornecedor = new javax.swing.JLabel();
        bntProduto = new javax.swing.JPanel();
        lblProduto = new javax.swing.JLabel();
        bntOrcamento = new javax.swing.JPanel();
        lblOrcamento = new javax.swing.JLabel();
        lblServico = new javax.swing.JLabel();
        separadorServico = new javax.swing.JSeparator();
        lblEstoque = new javax.swing.JLabel();
        separadorEstoque = new javax.swing.JSeparator();
        bntEsto = new javax.swing.JPanel();
        lblEsto = new javax.swing.JLabel();
        centro = new javax.swing.JPanel();
        eventFechaMenu = new javax.swing.JLabel();
        frmCliente = new javax.swing.JPanel();
        frmFornecedor = new javax.swing.JPanel();
        frmProduto = new javax.swing.JPanel();
        frmOrcamento = new javax.swing.JPanel();
        frmEstoque = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        cabecalho.setBackground(new java.awt.Color(9, 22, 50));
        cabecalho.setMinimumSize(new java.awt.Dimension(1090, 70));
        cabecalho.setPreferredSize(new java.awt.Dimension(1083, 50));
        cabecalho.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                cabecalhoMouseDragged(evt);
            }
        });
        cabecalho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cabecalhoMousePressed(evt);
            }
        });
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

        userLogin.setBackground(new java.awt.Color(9, 22, 50));

        iconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/userr_32px.png"))); // NOI18N

        lblUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUser.setForeground(new java.awt.Color(204, 204, 204));
        lblUser.setText("Usuário");

        javax.swing.GroupLayout userLoginLayout = new javax.swing.GroupLayout(userLogin);
        userLogin.setLayout(userLoginLayout);
        userLoginLayout.setHorizontalGroup(
            userLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        userLoginLayout.setVerticalGroup(
            userLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userLoginLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(userLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iconUser)
                    .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        cabecalho.add(userLogin, java.awt.BorderLayout.LINE_START);

        getContentPane().add(cabecalho, java.awt.BorderLayout.NORTH);

        menu.setBackground(new java.awt.Color(0, 51, 153));
        menu.setForeground(new java.awt.Color(0, 0, 153));
        menu.setkBorderRadius(0);
        menu.setkStartColor(new java.awt.Color(0, 0, 204));
        menu.setPreferredSize(new java.awt.Dimension(60, 562));
        menu.setLayout(new java.awt.BorderLayout());

        menuIcones.setkBorderRadius(0);
        menuIcones.setkEndColor(new java.awt.Color(22, 54, 95));
        menuIcones.setkGradientFocus(10);
        menuIcones.setkStartColor(new java.awt.Color(9, 22, 50));
        menuIcones.setPreferredSize(new java.awt.Dimension(61, 562));
        menuIcones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        detalhe1.setBackground(new java.awt.Color(9, 22, 50));
        detalhe1.setPreferredSize(new java.awt.Dimension(3, 50));
        detalhe1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                detalhe1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                detalhe1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout detalhe1Layout = new javax.swing.GroupLayout(detalhe1);
        detalhe1.setLayout(detalhe1Layout);
        detalhe1Layout.setHorizontalGroup(
            detalhe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        detalhe1Layout.setVerticalGroup(
            detalhe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        menuIcones.add(detalhe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 5));

        bntExpandir.setBackground(new java.awt.Color(9, 22, 50));
        bntExpandir.setPreferredSize(new java.awt.Dimension(32, 32));

        lblExpandir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExpandir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/menuIOS_32px.png"))); // NOI18N
        lblExpandir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExpandirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bntExpandirLayout = new javax.swing.GroupLayout(bntExpandir);
        bntExpandir.setLayout(bntExpandirLayout);
        bntExpandirLayout.setHorizontalGroup(
            bntExpandirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bntExpandirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblExpandir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bntExpandirLayout.setVerticalGroup(
            bntExpandirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bntExpandirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblExpandir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menuIcones.add(bntExpandir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 60, 50));

        detalhe2.setBackground(new java.awt.Color(9, 22, 50));
        detalhe2.setPreferredSize(new java.awt.Dimension(3, 50));

        javax.swing.GroupLayout detalhe2Layout = new javax.swing.GroupLayout(detalhe2);
        detalhe2.setLayout(detalhe2Layout);
        detalhe2Layout.setHorizontalGroup(
            detalhe2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        detalhe2Layout.setVerticalGroup(
            detalhe2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        menuIcones.add(detalhe2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 60, 5));

        bntHome.setBackground(new java.awt.Color(9, 22, 50));
        bntHome.setPreferredSize(new java.awt.Dimension(32, 32));
        bntHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bntHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bntHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bntHomeMouseExited(evt);
            }
        });

        lblHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home_32px.png"))); // NOI18N

        javax.swing.GroupLayout bntHomeLayout = new javax.swing.GroupLayout(bntHome);
        bntHome.setLayout(bntHomeLayout);
        bntHomeLayout.setHorizontalGroup(
            bntHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bntHomeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblHome, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bntHomeLayout.setVerticalGroup(
            bntHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHome, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        menuIcones.add(bntHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 60, 50));

        menu.add(menuIcones, java.awt.BorderLayout.LINE_START);

        menuExpandido.setkBorderRadius(0);
        menuExpandido.setkEndColor(new java.awt.Color(22, 54, 95));
        menuExpandido.setkGradientFocus(10);
        menuExpandido.setkStartColor(new java.awt.Color(13, 31, 67));
        menuExpandido.setPreferredSize(new java.awt.Dimension(140, 620));

        lblCadastro.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblCadastro.setForeground(new java.awt.Color(204, 204, 204));
        lblCadastro.setText("CADASTROS");

        separadorCadastro.setBackground(new java.awt.Color(84, 97, 127));
        separadorCadastro.setPreferredSize(new java.awt.Dimension(50, 50));

        bntCliente.setBackground(new java.awt.Color(13, 31, 67));
        bntCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bntClienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bntClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bntClienteMouseExited(evt);
            }
        });
        bntCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(204, 204, 204));
        lblCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCliente.setText("Cliente");
        bntCliente.add(lblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 60, -1));

        bntFornecedor.setBackground(new java.awt.Color(13, 31, 67));
        bntFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bntFornecedorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bntFornecedorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bntFornecedorMouseExited(evt);
            }
        });
        bntFornecedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFornecedor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFornecedor.setForeground(new java.awt.Color(204, 204, 204));
        lblFornecedor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFornecedor.setText("Fornecedor");
        bntFornecedor.add(lblFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 100, -1));

        bntProduto.setBackground(new java.awt.Color(13, 31, 67));
        bntProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bntProdutoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bntProdutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bntProdutoMouseExited(evt);
            }
        });
        bntProduto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblProduto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblProduto.setForeground(new java.awt.Color(204, 204, 204));
        lblProduto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblProduto.setText("Produto");
        bntProduto.add(lblProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 100, -1));

        bntOrcamento.setBackground(new java.awt.Color(22, 54, 95));
        bntOrcamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bntOrcamentoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bntOrcamentoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bntOrcamentoMouseExited(evt);
            }
        });
        bntOrcamento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOrcamento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblOrcamento.setForeground(new java.awt.Color(204, 204, 204));
        lblOrcamento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblOrcamento.setText("Orçamento");
        bntOrcamento.add(lblOrcamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, -1));

        lblServico.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblServico.setForeground(new java.awt.Color(204, 204, 204));
        lblServico.setText("SERVIÇOS");

        separadorServico.setBackground(new java.awt.Color(84, 97, 127));
        separadorServico.setPreferredSize(new java.awt.Dimension(50, 50));

        lblEstoque.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblEstoque.setForeground(new java.awt.Color(204, 204, 204));
        lblEstoque.setText("ESTOQUE");

        separadorEstoque.setBackground(new java.awt.Color(84, 97, 127));
        separadorEstoque.setPreferredSize(new java.awt.Dimension(50, 50));

        bntEsto.setBackground(new java.awt.Color(22, 54, 95));
        bntEsto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bntEstoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bntEstoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bntEstoMouseExited(evt);
            }
        });
        bntEsto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEsto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEsto.setForeground(new java.awt.Color(204, 204, 204));
        lblEsto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEsto.setText("Listar Produtos");
        bntEsto.add(lblEsto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 120, 20));

        javax.swing.GroupLayout menuExpandidoLayout = new javax.swing.GroupLayout(menuExpandido);
        menuExpandido.setLayout(menuExpandidoLayout);
        menuExpandidoLayout.setHorizontalGroup(
            menuExpandidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separadorCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bntCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bntFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bntProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuExpandidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCadastro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(bntOrcamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(separadorServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(separadorEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuExpandidoLayout.createSequentialGroup()
                .addGroup(menuExpandidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblServico, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(bntEsto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuExpandidoLayout.setVerticalGroup(
            menuExpandidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuExpandidoLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separadorCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(bntCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bntFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bntProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(lblServico, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separadorServico, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(bntOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(lblEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separadorEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(bntEsto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        menu.add(menuExpandido, java.awt.BorderLayout.CENTER);

        getContentPane().add(menu, java.awt.BorderLayout.LINE_START);

        centro.setBackground(new java.awt.Color(255, 255, 255));
        centro.setForeground(new java.awt.Color(204, 204, 204));
        centro.setLayout(new java.awt.CardLayout());

        eventFechaMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eventFechaMenuMouseClicked(evt);
            }
        });
        centro.add(eventFechaMenu, "card2");

        frmCliente.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout frmClienteLayout = new javax.swing.GroupLayout(frmCliente);
        frmCliente.setLayout(frmClienteLayout);
        frmClienteLayout.setHorizontalGroup(
            frmClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1045, Short.MAX_VALUE)
        );
        frmClienteLayout.setVerticalGroup(
            frmClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );

        centro.add(frmCliente, "card3");

        frmFornecedor.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout frmFornecedorLayout = new javax.swing.GroupLayout(frmFornecedor);
        frmFornecedor.setLayout(frmFornecedorLayout);
        frmFornecedorLayout.setHorizontalGroup(
            frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1045, Short.MAX_VALUE)
        );
        frmFornecedorLayout.setVerticalGroup(
            frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );

        centro.add(frmFornecedor, "card3");

        frmProduto.setBackground(new java.awt.Color(255, 51, 255));

        javax.swing.GroupLayout frmProdutoLayout = new javax.swing.GroupLayout(frmProduto);
        frmProduto.setLayout(frmProdutoLayout);
        frmProdutoLayout.setHorizontalGroup(
            frmProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1045, Short.MAX_VALUE)
        );
        frmProdutoLayout.setVerticalGroup(
            frmProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );

        centro.add(frmProduto, "card3");

        frmOrcamento.setBackground(new java.awt.Color(51, 255, 51));

        javax.swing.GroupLayout frmOrcamentoLayout = new javax.swing.GroupLayout(frmOrcamento);
        frmOrcamento.setLayout(frmOrcamentoLayout);
        frmOrcamentoLayout.setHorizontalGroup(
            frmOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1045, Short.MAX_VALUE)
        );
        frmOrcamentoLayout.setVerticalGroup(
            frmOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );

        centro.add(frmOrcamento, "card3");

        frmEstoque.setBackground(new java.awt.Color(51, 255, 204));

        javax.swing.GroupLayout frmEstoqueLayout = new javax.swing.GroupLayout(frmEstoque);
        frmEstoque.setLayout(frmEstoqueLayout);
        frmEstoqueLayout.setHorizontalGroup(
            frmEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1045, Short.MAX_VALUE)
        );
        frmEstoqueLayout.setVerticalGroup(
            frmEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );

        centro.add(frmEstoque, "card3");

        getContentPane().add(centro, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1105, 718));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    //alterar a cor do botão quando cursor passar por cima
    public void hover(JPanel hover, Color rand){
        hover.setBackground(rand);
    }
    
    //alterar a cor da fonte quando cursor passar por cima
    public void hoverForeground(JLabel hover, Color rand){
        hover.setForeground(rand);
    }
    
    //expandir o menu
    public void expandir(JPanel menu, boolean expandido){
        if(expandido == true){
            menu.setPreferredSize(new Dimension(60, menu.getHeight()));
        }else{
            menu.setPreferredSize(new Dimension(250, menu.getHeight()));     
        }
    }
    
    //altera a cor do botão do menu lateral
    public void clickButton(JPanel jp1, JPanel jp2, int numero){
        if(numero == 1){
            jp1.setBackground(new Color(13,31,67));
            jp2.setBackground(new Color(67,206,162));
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
        clickButton(bntExpandir, detalhe1, 1);
                
        //expandir o menu
        if(abertoFechado == true){
            //alterar a cor do botão que expandi o menu
            clickButton(bntExpandir, detalhe1, 0);
            expandir(menu, abertoFechado);
            SwingUtilities.updateComponentTreeUI(this);
            abertoFechado=false;
        }else{
            expandir(menu, abertoFechado);
            SwingUtilities.updateComponentTreeUI(this);
            abertoFechado=true;           
        }
    }//GEN-LAST:event_lblExpandirMouseClicked

    private void cabecalhoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cabecalhoMousePressed
        //evento para movimentar a janela na tela
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_cabecalhoMousePressed

    private void cabecalhoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cabecalhoMouseDragged
        //evento para movimentar a janela na tela 
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx-x, yy-y);
    }//GEN-LAST:event_cabecalhoMouseDragged

    private void bntClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntClienteMouseClicked
        //remove frame
        centro.removeAll();
        centro.repaint();
        centro.revalidate();
        //add frame
        centro.add(frmCliente);
        centro.repaint();
        centro.revalidate();
    }//GEN-LAST:event_bntClienteMouseClicked

    private void bntClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntClienteMouseEntered
        hover(bntCliente, new Color(18, 44, 83));
        hoverForeground(lblCliente, new Color(255,255,255));
    }//GEN-LAST:event_bntClienteMouseEntered

    private void bntClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntClienteMouseExited
        hover(bntCliente, new Color(13,31,67));
        hoverForeground(lblCliente, new Color(204,204,204));
    }//GEN-LAST:event_bntClienteMouseExited

    private void bntFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntFornecedorMouseClicked
        //remove frame
        centro.removeAll();
        centro.repaint();
        centro.revalidate();
        //add frame
        centro.add(frmFornecedor);
        centro.repaint();
        centro.revalidate();
    }//GEN-LAST:event_bntFornecedorMouseClicked

    private void bntFornecedorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntFornecedorMouseEntered
        hover(bntFornecedor, new Color(18, 44, 83));
        hoverForeground(lblFornecedor, new Color(255,255,255));
    }//GEN-LAST:event_bntFornecedorMouseEntered

    private void bntFornecedorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntFornecedorMouseExited
        hover(bntFornecedor, new Color(13,31,67));
        hoverForeground(lblFornecedor, new Color(204,204,204));
    }//GEN-LAST:event_bntFornecedorMouseExited

    private void bntProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntProdutoMouseClicked
        //remove frame
        centro.removeAll();
        centro.repaint();
        centro.revalidate();
        //add frame
        centro.add(frmProduto);
        centro.repaint();
        centro.revalidate();
    }//GEN-LAST:event_bntProdutoMouseClicked

    private void bntProdutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntProdutoMouseEntered
        hover(bntProduto, new Color(18, 44, 83));
        hoverForeground(lblProduto, new Color(255,255,255));
    }//GEN-LAST:event_bntProdutoMouseEntered

    private void bntProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntProdutoMouseExited
        hover(bntProduto, new Color(13,31,67));
        hoverForeground(lblProduto, new Color(204,204,204));
    }//GEN-LAST:event_bntProdutoMouseExited

    private void bntOrcamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntOrcamentoMouseClicked
        //remove frame
        centro.removeAll();
        centro.repaint();
        centro.revalidate();
        //add frame
        centro.add(frmOrcamento);
        centro.repaint();
        centro.revalidate();
    }//GEN-LAST:event_bntOrcamentoMouseClicked

    private void bntOrcamentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntOrcamentoMouseEntered
        hover(bntOrcamento, new Color(18, 44, 83));
        hoverForeground(lblOrcamento, new Color(255,255,255));
    }//GEN-LAST:event_bntOrcamentoMouseEntered

    private void bntOrcamentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntOrcamentoMouseExited
        hover(bntOrcamento, new Color(22,54,95));
        hoverForeground(lblOrcamento, new Color(204,204,204));
    }//GEN-LAST:event_bntOrcamentoMouseExited

    private void bntEstoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntEstoMouseClicked
        //remove frame
        centro.removeAll();
        centro.repaint();
        centro.revalidate();
        //add frame
        centro.add(frmEstoque);
        centro.repaint();
        centro.revalidate();
    }//GEN-LAST:event_bntEstoMouseClicked

    private void bntEstoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntEstoMouseEntered
        hover(bntEsto, new Color(18, 44, 83));
        hoverForeground(lblEsto, new Color(255,255,255));
    }//GEN-LAST:event_bntEstoMouseEntered

    private void bntEstoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntEstoMouseExited
        hover(bntEsto, new Color(22,54,95));
        hoverForeground(lblEsto, new Color(204,204,204));
    }//GEN-LAST:event_bntEstoMouseExited

    private void eventFechaMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventFechaMenuMouseClicked
        //fechar o menu com click no lado de fora
        clickButton(bntExpandir, detalhe1, 0);
        expandir(menu, abertoFechado);
        SwingUtilities.updateComponentTreeUI(this);
        abertoFechado=false;
    }//GEN-LAST:event_eventFechaMenuMouseClicked

    private void detalhe1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detalhe1MouseEntered
        clickButton(bntExpandir, detalhe1, 1);
    }//GEN-LAST:event_detalhe1MouseEntered

    private void detalhe1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detalhe1MouseExited
        clickButton(bntExpandir, detalhe1, 0);
    }//GEN-LAST:event_detalhe1MouseExited

    private void bntHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntHomeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bntHomeMouseClicked

    private void bntHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntHomeMouseEntered
        clickButton(bntHome, detalhe2, 1);
    }//GEN-LAST:event_bntHomeMouseEntered

    private void bntHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntHomeMouseExited
        clickButton(bntHome, detalhe2, 0);
    }//GEN-LAST:event_bntHomeMouseExited

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
    private javax.swing.JPanel bntCliente;
    private javax.swing.JPanel bntEsto;
    private javax.swing.JPanel bntExpandir;
    private javax.swing.JPanel bntFornecedor;
    private javax.swing.JPanel bntHome;
    private javax.swing.JPanel bntMax;
    private javax.swing.JPanel bntMin;
    private javax.swing.JPanel bntOrcamento;
    private javax.swing.JPanel bntProduto;
    private javax.swing.JPanel bntSair;
    private javax.swing.JPanel cabecalho;
    private javax.swing.JPanel centro;
    private javax.swing.JPanel detalhe1;
    private javax.swing.JPanel detalhe2;
    private javax.swing.JLabel eventFechaMenu;
    private javax.swing.JPanel frmCliente;
    private javax.swing.JPanel frmEstoque;
    private javax.swing.JPanel frmFornecedor;
    private javax.swing.JPanel frmOrcamento;
    private javax.swing.JPanel frmProduto;
    private javax.swing.JLabel iconUser;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblEsto;
    private javax.swing.JLabel lblEstoque;
    private javax.swing.JLabel lblExpandir;
    private javax.swing.JLabel lblFornecedor;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblMax;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblOrcamento;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblSair;
    private javax.swing.JLabel lblServico;
    private javax.swing.JLabel lblUser;
    private keeptoo.KGradientPanel menu;
    private keeptoo.KGradientPanel menuExpandido;
    private keeptoo.KGradientPanel menuIcones;
    private javax.swing.JPanel minMaxSair;
    private javax.swing.JSeparator separadorCadastro;
    private javax.swing.JSeparator separadorEstoque;
    private javax.swing.JSeparator separadorServico;
    private javax.swing.JPanel userLogin;
    // End of variables declaration//GEN-END:variables
}
