
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
        this.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        clickButton(bntExpandir, detalhe1, 0);     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoSexoMeF = new javax.swing.ButtonGroup();
        grupoSituacao = new javax.swing.ButtonGroup();
        cabecalho = new javax.swing.JPanel();
        minMaxSair = new javax.swing.JPanel();
        bntSair = new javax.swing.JPanel();
        lblSair = new javax.swing.JLabel();
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
        telas = new javax.swing.JPanel();
        eventFechaMenu = new javax.swing.JLabel();
        frmCliente = new javax.swing.JPanel();
        Mural = new keeptoo.KGradientPanel();
        lblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lvlIcon = new javax.swing.JLabel();
        GridLayout = new javax.swing.JPanel();
        pnlCadastroBasico1 = new javax.swing.JPanel();
        lblNome1 = new javax.swing.JLabel();
        txtNome1 = new javax.swing.JTextField();
        lvlCPF1 = new javax.swing.JLabel();
        txtCPF1 = new javax.swing.JFormattedTextField();
        lblSexo1 = new javax.swing.JLabel();
        rbFeminino1 = new javax.swing.JRadioButton();
        rbMasculino1 = new javax.swing.JRadioButton();
        txtSobrenome1 = new javax.swing.JTextField();
        lblSobrenome1 = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtContato = new javax.swing.JFormattedTextField();
        lblContato = new javax.swing.JLabel();
        lblTipoCadastro = new javax.swing.JLabel();
        rbCliente = new javax.swing.JRadioButton();
        rbFornecedor = new javax.swing.JRadioButton();
        rbUsuário = new javax.swing.JRadioButton();
        lblSituacao = new javax.swing.JLabel();
        rbAtivo = new javax.swing.JRadioButton();
        rbBloqueado = new javax.swing.JRadioButton();
        rbInativo = new javax.swing.JRadioButton();
        pnlEndereco = new javax.swing.JPanel();
        lblRua = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        lvlNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        cbBairro = new javax.swing.JComboBox<>();
        lvlCEP = new javax.swing.JLabel();
        txtCPF2 = new javax.swing.JFormattedTextField();
        lblCidade = new javax.swing.JLabel();
        cbCidade = new javax.swing.JComboBox<>();
        lvlEstado = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox<>();
        lvlComplemento = new javax.swing.JLabel();
        txaComplemento = new javax.swing.JTextArea();
        pnlButtons = new javax.swing.JPanel();
        bntCadastro = new keeptoo.KButton();
        frmFornecedor = new javax.swing.JPanel();
        frmProduto = new javax.swing.JPanel();
        frmOrcamento = new javax.swing.JPanel();
        frmEstoque = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1045, 668));

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

        minMaxSair.add(bntMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 50, 50));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblExpandirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblExpandirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bntExpandirLayout = new javax.swing.GroupLayout(bntExpandir);
        bntExpandir.setLayout(bntExpandirLayout);
        bntExpandirLayout.setHorizontalGroup(
            bntExpandirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bntExpandirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblExpandir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        bntExpandirLayout.setVerticalGroup(
            bntExpandirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bntExpandirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblExpandir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(535, 535, 535))
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

        lblHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home_32px.png"))); // NOI18N
        lblHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblHomeMouseExited(evt);
            }
        });

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
            .addComponent(bntOrcamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(separadorServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(separadorEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bntEsto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuExpandidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuExpandidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCadastro)
                    .addComponent(lblServico, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu.add(menuExpandido, java.awt.BorderLayout.CENTER);

        getContentPane().add(menu, java.awt.BorderLayout.LINE_START);

        telas.setBackground(new java.awt.Color(255, 255, 255));
        telas.setForeground(new java.awt.Color(204, 204, 204));
        telas.setLayout(new java.awt.CardLayout());

        eventFechaMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eventFechaMenuMouseClicked(evt);
            }
        });
        telas.add(eventFechaMenu, "card2");

        frmCliente.setBackground(new java.awt.Color(255, 255, 255));

        Mural.setkBorderRadius(0);
        Mural.setkEndColor(new java.awt.Color(0, 204, 204));
        Mural.setkStartColor(new java.awt.Color(20, 85, 217));
        Mural.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Cadastro de Cliente.....");
        Mural.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 180, 40));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        Mural.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 10, 70));

        lvlIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lvlIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user_group_100px.png"))); // NOI18N
        Mural.add(lvlIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, 70));

        GridLayout.setBackground(new java.awt.Color(255, 255, 255));
        GridLayout.setOpaque(false);
        GridLayout.setLayout(new java.awt.GridLayout(2, 2, 5, 5));

        pnlCadastroBasico1.setBackground(new java.awt.Color(255, 255, 255));
        pnlCadastroBasico1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro Básico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI", 1, 14))); // NOI18N

        lblNome1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNome1.setForeground(new java.awt.Color(102, 102, 102));
        lblNome1.setText("Nome");

        txtNome1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNome1.setForeground(new java.awt.Color(102, 102, 102));
        txtNome1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 204, 255)));

        lvlCPF1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lvlCPF1.setForeground(new java.awt.Color(102, 102, 102));
        lvlCPF1.setText("CPF");

        txtCPF1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 204, 255)));
        txtCPF1.setForeground(new java.awt.Color(102, 102, 102));
        try {
            txtCPF1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lblSexo1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSexo1.setForeground(new java.awt.Color(102, 102, 102));
        lblSexo1.setText("Sexo");

        rbFeminino1.setBackground(new java.awt.Color(255, 255, 255));
        grupoSexoMeF.add(rbFeminino1);
        rbFeminino1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbFeminino1.setForeground(new java.awt.Color(102, 102, 102));
        rbFeminino1.setText("Feminino");

        rbMasculino1.setBackground(new java.awt.Color(255, 255, 255));
        grupoSexoMeF.add(rbMasculino1);
        rbMasculino1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbMasculino1.setForeground(new java.awt.Color(102, 102, 102));
        rbMasculino1.setText("Maculino");

        txtSobrenome1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtSobrenome1.setForeground(new java.awt.Color(102, 102, 102));
        txtSobrenome1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 204, 255)));

        lblSobrenome1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSobrenome1.setForeground(new java.awt.Color(102, 102, 102));
        lblSobrenome1.setText("Sobrenome");

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(102, 102, 102));
        lblEmail.setText("Email");

        txtEmail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(102, 102, 102));
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 204, 255)));

        txtContato.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 204, 255)));
        txtContato.setForeground(new java.awt.Color(102, 102, 102));
        try {
            txtContato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtContato.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lblContato.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblContato.setForeground(new java.awt.Color(102, 102, 102));
        lblContato.setText("Contato");

        lblTipoCadastro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTipoCadastro.setForeground(new java.awt.Color(102, 102, 102));
        lblTipoCadastro.setText("Tipo de Cadastro");

        rbCliente.setBackground(new java.awt.Color(255, 255, 255));
        rbCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbCliente.setForeground(new java.awt.Color(102, 102, 102));
        rbCliente.setText("Cliente");

        rbFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        rbFornecedor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbFornecedor.setForeground(new java.awt.Color(102, 102, 102));
        rbFornecedor.setText("Fornecedor");

        rbUsuário.setBackground(new java.awt.Color(255, 255, 255));
        rbUsuário.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbUsuário.setForeground(new java.awt.Color(102, 102, 102));
        rbUsuário.setText("Usuário");

        lblSituacao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSituacao.setForeground(new java.awt.Color(102, 102, 102));
        lblSituacao.setText("Situação");

        rbAtivo.setBackground(new java.awt.Color(255, 255, 255));
        grupoSituacao.add(rbAtivo);
        rbAtivo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbAtivo.setForeground(new java.awt.Color(102, 102, 102));
        rbAtivo.setText("Ativo");

        rbBloqueado.setBackground(new java.awt.Color(255, 255, 255));
        grupoSituacao.add(rbBloqueado);
        rbBloqueado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbBloqueado.setForeground(new java.awt.Color(102, 102, 102));
        rbBloqueado.setText("Bloqueada");

        rbInativo.setBackground(new java.awt.Color(255, 255, 255));
        grupoSituacao.add(rbInativo);
        rbInativo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbInativo.setForeground(new java.awt.Color(102, 102, 102));
        rbInativo.setText("Inativo");

        javax.swing.GroupLayout pnlCadastroBasico1Layout = new javax.swing.GroupLayout(pnlCadastroBasico1);
        pnlCadastroBasico1.setLayout(pnlCadastroBasico1Layout);
        pnlCadastroBasico1Layout.setHorizontalGroup(
            pnlCadastroBasico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroBasico1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlCadastroBasico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCadastroBasico1Layout.createSequentialGroup()
                        .addComponent(txtNome1)
                        .addGap(70, 70, 70)
                        .addComponent(txtSobrenome1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(pnlCadastroBasico1Layout.createSequentialGroup()
                        .addGroup(pnlCadastroBasico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCadastroBasico1Layout.createSequentialGroup()
                                .addGroup(pnlCadastroBasico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlCadastroBasico1Layout.createSequentialGroup()
                                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(248, 248, 248))
                                    .addGroup(pnlCadastroBasico1Layout.createSequentialGroup()
                                        .addComponent(txtEmail)
                                        .addGap(75, 75, 75)))
                                .addGroup(pnlCadastroBasico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblContato, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtContato, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlCadastroBasico1Layout.createSequentialGroup()
                                .addGroup(pnlCadastroBasico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCPF1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lvlCPF1))
                                .addGap(197, 197, 197)
                                .addGroup(pnlCadastroBasico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlCadastroBasico1Layout.createSequentialGroup()
                                        .addComponent(rbFeminino1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbMasculino1))
                                    .addComponent(lblSexo1))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlCadastroBasico1Layout.createSequentialGroup()
                        .addGroup(pnlCadastroBasico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCadastroBasico1Layout.createSequentialGroup()
                                .addComponent(lblNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSobrenome1))
                            .addGroup(pnlCadastroBasico1Layout.createSequentialGroup()
                                .addGroup(pnlCadastroBasico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblTipoCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(lblSituacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbAtivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlCadastroBasico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbBloqueado, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlCadastroBasico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(rbInativo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rbUsuário, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(197, 197, 197))))
        );
        pnlCadastroBasico1Layout.setVerticalGroup(
            pnlCadastroBasico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroBasico1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlCadastroBasico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSobrenome1)
                    .addComponent(lblNome1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCadastroBasico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSobrenome1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(pnlCadastroBasico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCadastroBasico1Layout.createSequentialGroup()
                        .addComponent(lvlCPF1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPF1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCadastroBasico1Layout.createSequentialGroup()
                        .addComponent(lblSexo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCadastroBasico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbFeminino1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbMasculino1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(pnlCadastroBasico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContato)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCadastroBasico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContato, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(lblTipoCadastro)
                .addGap(14, 14, 14)
                .addGroup(pnlCadastroBasico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCadastroBasico1Layout.createSequentialGroup()
                        .addComponent(rbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblSituacao)
                        .addGap(14, 14, 14)
                        .addComponent(rbAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCadastroBasico1Layout.createSequentialGroup()
                        .addComponent(rbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(rbBloqueado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCadastroBasico1Layout.createSequentialGroup()
                        .addComponent(rbUsuário, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(rbInativo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(164, Short.MAX_VALUE))
        );

        GridLayout.add(pnlCadastroBasico1);

        pnlEndereco.setBackground(new java.awt.Color(255, 255, 255));
        pnlEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI", 1, 14))); // NOI18N

        lblRua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRua.setForeground(new java.awt.Color(102, 102, 102));
        lblRua.setText("Rua");

        txtRua.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtRua.setForeground(new java.awt.Color(102, 102, 102));
        txtRua.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 204, 255)));

        lvlNumero.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lvlNumero.setForeground(new java.awt.Color(102, 102, 102));
        lvlNumero.setText("Número");

        txtNumero.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNumero.setForeground(new java.awt.Color(102, 102, 102));
        txtNumero.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 204, 255)));

        lblBairro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblBairro.setForeground(new java.awt.Color(102, 102, 102));
        lblBairro.setText("Bairro");

        cbBairro.setBackground(new java.awt.Color(255, 255, 255));
        cbBairro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbBairro.setForeground(new java.awt.Color(153, 153, 153));
        cbBairro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar...", "Aviação", "Centro", "Cidade Nova", "Xangrila" }));

        lvlCEP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lvlCEP.setForeground(new java.awt.Color(102, 102, 102));
        lvlCEP.setText("CEP");

        txtCPF2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 204, 255)));
        txtCPF2.setForeground(new java.awt.Color(102, 102, 102));
        try {
            txtCPF2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lblCidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCidade.setForeground(new java.awt.Color(102, 102, 102));
        lblCidade.setText("Cidade");

        cbCidade.setBackground(new java.awt.Color(255, 255, 255));
        cbCidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbCidade.setForeground(new java.awt.Color(153, 153, 153));
        cbCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar...", "Venâncio", "Lajeado", "Santa Cruz do Sul" }));

        lvlEstado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lvlEstado.setForeground(new java.awt.Color(102, 102, 102));
        lvlEstado.setText("Estado");

        cbEstado.setBackground(new java.awt.Color(255, 255, 255));
        cbEstado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbEstado.setForeground(new java.awt.Color(153, 153, 153));
        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UF", "RJ", "RS", "SC", "SP", "PR" }));

        lvlComplemento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lvlComplemento.setForeground(new java.awt.Color(102, 102, 102));
        lvlComplemento.setText("Complemento");

        txaComplemento.setBackground(new java.awt.Color(204, 204, 204));
        txaComplemento.setColumns(20);
        txaComplemento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txaComplemento.setForeground(new java.awt.Color(102, 102, 102));
        txaComplemento.setRows(5);
        txaComplemento.setBorder(null);

        javax.swing.GroupLayout pnlEnderecoLayout = new javax.swing.GroupLayout(pnlEndereco);
        pnlEndereco.setLayout(pnlEnderecoLayout);
        pnlEnderecoLayout.setHorizontalGroup(
            pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEnderecoLayout.createSequentialGroup()
                        .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txaComplemento)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlEnderecoLayout.createSequentialGroup()
                                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlEnderecoLayout.createSequentialGroup()
                                        .addComponent(txtRua)
                                        .addGap(137, 137, 137))
                                    .addGroup(pnlEnderecoLayout.createSequentialGroup()
                                        .addComponent(lblRua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(189, 189, 189)))
                                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lvlNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlEnderecoLayout.createSequentialGroup()
                                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbBairro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbCidade, 0, 191, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCPF2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lvlEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lvlCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEnderecoLayout.createSequentialGroup()
                        .addComponent(lvlComplemento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(416, 416, 416))))
        );
        pnlEnderecoLayout.setVerticalGroup(
            pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEnderecoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lvlNumero)
                    .addComponent(lblRua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lvlCEP)
                    .addComponent(lblBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEnderecoLayout.createSequentialGroup()
                        .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCPF2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(lblCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEnderecoLayout.createSequentialGroup()
                        .addComponent(lvlEstado)
                        .addGap(10, 10, 10)
                        .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lvlComplemento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txaComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
        );

        GridLayout.add(pnlEndereco);

        pnlButtons.setBackground(new java.awt.Color(255, 255, 255));

        bntCadastro.setBorder(null);
        bntCadastro.setText("Cadastrar");
        bntCadastro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bntCadastro.setkBackGroundColor(new java.awt.Color(91, 98, 218));
        bntCadastro.setkEndColor(new java.awt.Color(18, 44, 83));
        bntCadastro.setkHoverEndColor(new java.awt.Color(22, 54, 95));
        bntCadastro.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        bntCadastro.setkHoverStartColor(new java.awt.Color(22, 54, 95));
        bntCadastro.setkStartColor(new java.awt.Color(91, 98, 218));

        javax.swing.GroupLayout pnlButtonsLayout = new javax.swing.GroupLayout(pnlButtons);
        pnlButtons.setLayout(pnlButtonsLayout);
        pnlButtonsLayout.setHorizontalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bntCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(397, Short.MAX_VALUE))
        );
        pnlButtonsLayout.setVerticalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonsLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(bntCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(461, Short.MAX_VALUE))
        );

        GridLayout.add(pnlButtons);

        javax.swing.GroupLayout frmClienteLayout = new javax.swing.GroupLayout(frmCliente);
        frmCliente.setLayout(frmClienteLayout);
        frmClienteLayout.setHorizontalGroup(
            frmClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Mural, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(GridLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frmClienteLayout.setVerticalGroup(
            frmClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmClienteLayout.createSequentialGroup()
                .addComponent(Mural, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GridLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        telas.add(frmCliente, "card3");

        frmFornecedor.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout frmFornecedorLayout = new javax.swing.GroupLayout(frmFornecedor);
        frmFornecedor.setLayout(frmFornecedorLayout);
        frmFornecedorLayout.setHorizontalGroup(
            frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        frmFornecedorLayout.setVerticalGroup(
            frmFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        telas.add(frmFornecedor, "card3");

        frmProduto.setBackground(new java.awt.Color(255, 51, 255));

        javax.swing.GroupLayout frmProdutoLayout = new javax.swing.GroupLayout(frmProduto);
        frmProduto.setLayout(frmProdutoLayout);
        frmProdutoLayout.setHorizontalGroup(
            frmProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        frmProdutoLayout.setVerticalGroup(
            frmProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        telas.add(frmProduto, "card3");

        frmOrcamento.setBackground(new java.awt.Color(51, 255, 51));

        javax.swing.GroupLayout frmOrcamentoLayout = new javax.swing.GroupLayout(frmOrcamento);
        frmOrcamento.setLayout(frmOrcamentoLayout);
        frmOrcamentoLayout.setHorizontalGroup(
            frmOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        frmOrcamentoLayout.setVerticalGroup(
            frmOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        telas.add(frmOrcamento, "card3");

        frmEstoque.setBackground(new java.awt.Color(51, 255, 204));

        javax.swing.GroupLayout frmEstoqueLayout = new javax.swing.GroupLayout(frmEstoque);
        frmEstoque.setLayout(frmEstoqueLayout);
        frmEstoqueLayout.setHorizontalGroup(
            frmEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1117, Short.MAX_VALUE)
        );
        frmEstoqueLayout.setVerticalGroup(
            frmEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );

        telas.add(frmEstoque, "card3");

        getContentPane().add(telas, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1177, 718));
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

    private void lblMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinMouseEntered
        hover(bntMin, new Color(33,50,93));
    }//GEN-LAST:event_lblMinMouseEntered

    private void lblMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinMouseExited
        hover(bntMin, new Color(9,22,50));
    }//GEN-LAST:event_lblMinMouseExited

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
        telas.removeAll();
        telas.repaint();
        telas.revalidate();
        //add frame
        telas.add(frmCliente);
        telas.repaint();
        telas.revalidate();
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
        telas.removeAll();
        telas.repaint();
        telas.revalidate();
        //add frame
        telas.add(frmFornecedor);
        telas.repaint();
        telas.revalidate();
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
        telas.removeAll();
        telas.repaint();
        telas.revalidate();
        //add frame
        telas.add(frmProduto);
        telas.repaint();
        telas.revalidate();
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
        telas.removeAll();
        telas.repaint();
        telas.revalidate();
        //add frame
        telas.add(frmOrcamento);
        telas.repaint();
        telas.revalidate();
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
        telas.removeAll();
        telas.repaint();
        telas.revalidate();
        //add frame
        telas.add(frmEstoque);
        telas.repaint();
        telas.revalidate();
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

    private void lblExpandirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExpandirMouseEntered
        clickButton(bntExpandir, detalhe1, 1);
    }//GEN-LAST:event_lblExpandirMouseEntered

    private void lblExpandirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExpandirMouseExited
        clickButton(bntExpandir, detalhe1, 0);
    }//GEN-LAST:event_lblExpandirMouseExited

    private void lblHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseEntered
        clickButton(bntHome, detalhe2, 1);
    }//GEN-LAST:event_lblHomeMouseEntered

    private void lblHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseExited
        clickButton(bntHome, detalhe2, 0);
    }//GEN-LAST:event_lblHomeMouseExited

    private void lblHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblHomeMouseClicked

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
    private javax.swing.JPanel GridLayout;
    private keeptoo.KGradientPanel Mural;
    private keeptoo.KButton bntCadastro;
    private javax.swing.JPanel bntCliente;
    private javax.swing.JPanel bntEsto;
    private javax.swing.JPanel bntExpandir;
    private javax.swing.JPanel bntFornecedor;
    private javax.swing.JPanel bntHome;
    private javax.swing.JPanel bntMin;
    private javax.swing.JPanel bntOrcamento;
    private javax.swing.JPanel bntProduto;
    private javax.swing.JPanel bntSair;
    private javax.swing.JPanel cabecalho;
    private javax.swing.JComboBox<String> cbBairro;
    private javax.swing.JComboBox<String> cbCidade;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JPanel detalhe1;
    private javax.swing.JPanel detalhe2;
    private javax.swing.JLabel eventFechaMenu;
    private javax.swing.JPanel frmCliente;
    private javax.swing.JPanel frmEstoque;
    private javax.swing.JPanel frmFornecedor;
    private javax.swing.JPanel frmOrcamento;
    private javax.swing.JPanel frmProduto;
    private javax.swing.ButtonGroup grupoSexoMeF;
    private javax.swing.ButtonGroup grupoSituacao;
    private javax.swing.JLabel iconUser;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblContato;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEsto;
    private javax.swing.JLabel lblEstoque;
    private javax.swing.JLabel lblExpandir;
    private javax.swing.JLabel lblFornecedor;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblOrcamento;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblSair;
    private javax.swing.JLabel lblServico;
    private javax.swing.JLabel lblSexo1;
    private javax.swing.JLabel lblSituacao;
    private javax.swing.JLabel lblSobrenome1;
    private javax.swing.JLabel lblTipoCadastro;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lvlCEP;
    private javax.swing.JLabel lvlCPF1;
    private javax.swing.JLabel lvlComplemento;
    private javax.swing.JLabel lvlEstado;
    private javax.swing.JLabel lvlIcon;
    private javax.swing.JLabel lvlNumero;
    private keeptoo.KGradientPanel menu;
    private keeptoo.KGradientPanel menuExpandido;
    private keeptoo.KGradientPanel menuIcones;
    private javax.swing.JPanel minMaxSair;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JPanel pnlCadastroBasico1;
    private javax.swing.JPanel pnlEndereco;
    private javax.swing.JRadioButton rbAtivo;
    private javax.swing.JRadioButton rbBloqueado;
    private javax.swing.JRadioButton rbCliente;
    private javax.swing.JRadioButton rbFeminino1;
    private javax.swing.JRadioButton rbFornecedor;
    private javax.swing.JRadioButton rbInativo;
    private javax.swing.JRadioButton rbMasculino1;
    private javax.swing.JRadioButton rbUsuário;
    private javax.swing.JSeparator separadorCadastro;
    private javax.swing.JSeparator separadorEstoque;
    private javax.swing.JSeparator separadorServico;
    private javax.swing.JPanel telas;
    private javax.swing.JTextArea txaComplemento;
    private javax.swing.JFormattedTextField txtCPF1;
    private javax.swing.JFormattedTextField txtCPF2;
    private javax.swing.JFormattedTextField txtContato;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome1;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtSobrenome1;
    private javax.swing.JPanel userLogin;
    // End of variables declaration//GEN-END:variables
}
