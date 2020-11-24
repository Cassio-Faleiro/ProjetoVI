
package interfaces;

import dao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import dao.CadastraPessoa;
import dao.CadastraProduto;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import net.proteanit.sql.DbUtils;
import model.ComumPessoa;
import model.Endereco;
import model.Fisica;
import model.Juridica;
import model.Produto;

public class frmPrincipal extends javax.swing.JFrame {
    
    boolean abertoFechado = false;
    int x,y;
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public frmPrincipal() {
        initComponents();     
        conexao = conexao = Conexao.conector();
        //inicia na tela home
        //remove frame
        telas.removeAll();
        //add frame
        telas.add(frmHome);
        this.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        //prencher as tabelas ao abrir o sistema
        clickButton(btnExpandir, detalhe1, 0); 
        pesquisaCliente();
        pesquisaProdutos();
        pesquisaOrc();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoSexoMeF = new javax.swing.ButtonGroup();
        grupoSituacao = new javax.swing.ButtonGroup();
        grupoTipoCadastro = new javax.swing.ButtonGroup();
        grupoTipoPessoa = new javax.swing.ButtonGroup();
        cabecalho = new javax.swing.JPanel();
        minMaxSair = new javax.swing.JPanel();
        btnSair = new javax.swing.JPanel();
        lblSair = new javax.swing.JLabel();
        btnMin = new javax.swing.JPanel();
        lblMin = new javax.swing.JLabel();
        userLogin = new javax.swing.JPanel();
        iconUser = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        menu = new keeptoo.KGradientPanel();
        menuIcones = new keeptoo.KGradientPanel();
        detalhe1 = new javax.swing.JPanel();
        btnExpandir = new javax.swing.JPanel();
        lblExpandir = new javax.swing.JLabel();
        detalhe2 = new javax.swing.JPanel();
        btnHome = new javax.swing.JPanel();
        lblHome = new javax.swing.JLabel();
        btnInfo = new javax.swing.JPanel();
        lblInfo = new javax.swing.JLabel();
        btnTrocaUsuario = new javax.swing.JPanel();
        lblTrocaUsuario = new javax.swing.JLabel();
        menuExpandido = new keeptoo.KGradientPanel();
        lblCadastro = new javax.swing.JLabel();
        separadorCadastro = new javax.swing.JSeparator();
        bntCliente = new javax.swing.JPanel();
        lblCliente = new javax.swing.JLabel();
        bntProduto = new javax.swing.JPanel();
        lblProduto = new javax.swing.JLabel();
        bntOrcamento = new javax.swing.JPanel();
        lblOrcamento = new javax.swing.JLabel();
        lblServico = new javax.swing.JLabel();
        separadorServico = new javax.swing.JSeparator();
        telas = new javax.swing.JPanel();
        eventFechaMenu = new javax.swing.JLabel();
        frmHome = new javax.swing.JPanel();
        MuralHome = new keeptoo.KGradientPanel();
        lblTitulo1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lvlIcon1 = new javax.swing.JLabel();
        GridHome = new javax.swing.JPanel();
        pnlClientes = new javax.swing.JPanel();
        txtPesquisaNome = new javax.swing.JTextField();
        lblPesquisaCli = new javax.swing.JLabel();
        scrollClientes = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        pnlProdutos = new javax.swing.JPanel();
        txtPesquisaProduto = new javax.swing.JTextField();
        lblPesquisaEsto = new javax.swing.JLabel();
        scrollEstoque = new javax.swing.JScrollPane();
        tblEstoque = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        frmCliente = new javax.swing.JPanel();
        MuralCliente = new keeptoo.KGradientPanel();
        lblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lvlIcon = new javax.swing.JLabel();
        GridLayout = new javax.swing.JPanel();
        pnlCadastroBasico1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lvlCPF = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        lblSexo = new javax.swing.JLabel();
        rbFeminino = new javax.swing.JRadioButton();
        rbMasculino = new javax.swing.JRadioButton();
        txtSobrenome = new javax.swing.JTextField();
        lblSobrenome = new javax.swing.JLabel();
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
        cbxPessoaFisica = new javax.swing.JCheckBox();
        cbxPessoaJuri = new javax.swing.JCheckBox();
        lvlCNPJ = new javax.swing.JLabel();
        txtCNPJ = new javax.swing.JFormattedTextField();
        pnlEndereco = new javax.swing.JPanel();
        lblRua = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        lvlNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        cbBairro = new javax.swing.JComboBox<>();
        lvlCEP = new javax.swing.JLabel();
        txtCEP = new javax.swing.JFormattedTextField();
        lblCidade = new javax.swing.JLabel();
        cbCidade = new javax.swing.JComboBox<>();
        lvlEstado = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox<>();
        lvlComplemento = new javax.swing.JLabel();
        txaComplemento = new javax.swing.JTextArea();
        pnlButtons = new javax.swing.JPanel();
        bntCadastro = new keeptoo.KButton();
        frmEstoque = new javax.swing.JPanel();
        MuralEstoque = new keeptoo.KGradientPanel();
        lblTitulo3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lblIconFornecedor1 = new javax.swing.JLabel();
        GridEstoque = new javax.swing.JPanel();
        pnlEstoque = new javax.swing.JPanel();
        txtProd = new javax.swing.JTextField();
        lblProd = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        lblValor = new javax.swing.JLabel();
        lblQtdMed = new javax.swing.JLabel();
        txtQuant = new javax.swing.JTextField();
        lblUnidade = new javax.swing.JLabel();
        txtUnidade = new javax.swing.JTextField();
        bntCadastraProd = new keeptoo.KButton();
        bntEditProd = new keeptoo.KButton();
        pnlSeparador = new javax.swing.JPanel();
        frmOrcamento = new javax.swing.JPanel();
        MuralOrc = new keeptoo.KGradientPanel();
        lblTitulo5 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        lblIconOrc = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        GridOrc = new javax.swing.JPanel();
        pnlOrc = new javax.swing.JPanel();
        scrollOrc = new javax.swing.JScrollPane();
        tblOrc = new javax.swing.JTable();
        txtPesquisaOrc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblIconPesquisaOrc = new javax.swing.JLabel();
        pnlPrint = new javax.swing.JPanel();
        lvlPrint = new javax.swing.JLabel();
        pnlSeparador2 = new javax.swing.JPanel();
        lvlTituloOrc = new javax.swing.JLabel();
        lblCli = new javax.swing.JLabel();
        cbCli1 = new javax.swing.JComboBox<>();
        lvlSelProd1 = new javax.swing.JLabel();
        cbProd = new javax.swing.JComboBox<>();
        bntAddProduto = new keeptoo.KButton();
        scrollCadastraOrc = new javax.swing.JScrollPane();
        tblCadastraOrc = new javax.swing.JTable();
        lblTotalCompra = new javax.swing.JLabel();
        txtTotalCompra = new javax.swing.JTextField();
        bntCadastraOrc = new keeptoo.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));
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

        btnSair.setBackground(new java.awt.Color(9, 22, 50));
        btnSair.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        btnSair.setLayout(new java.awt.BorderLayout());

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
        btnSair.add(lblSair, java.awt.BorderLayout.CENTER);

        minMaxSair.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 50, 50));

        btnMin.setBackground(new java.awt.Color(9, 22, 50));
        btnMin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        btnMin.setForeground(new java.awt.Color(255, 255, 255));
        btnMin.setLayout(new java.awt.BorderLayout());

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
        btnMin.add(lblMin, java.awt.BorderLayout.CENTER);

        minMaxSair.add(btnMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 50, 50));

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
            .addGap(0, 5, Short.MAX_VALUE)
        );

        menuIcones.add(detalhe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 5));

        btnExpandir.setBackground(new java.awt.Color(9, 22, 50));
        btnExpandir.setPreferredSize(new java.awt.Dimension(32, 32));

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

        javax.swing.GroupLayout btnExpandirLayout = new javax.swing.GroupLayout(btnExpandir);
        btnExpandir.setLayout(btnExpandirLayout);
        btnExpandirLayout.setHorizontalGroup(
            btnExpandirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnExpandirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblExpandir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        btnExpandirLayout.setVerticalGroup(
            btnExpandirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnExpandirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblExpandir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(535, 535, 535))
        );

        menuIcones.add(btnExpandir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 60, 50));

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

        btnHome.setBackground(new java.awt.Color(9, 22, 50));
        btnHome.setPreferredSize(new java.awt.Dimension(32, 32));

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

        javax.swing.GroupLayout btnHomeLayout = new javax.swing.GroupLayout(btnHome);
        btnHome.setLayout(btnHomeLayout);
        btnHomeLayout.setHorizontalGroup(
            btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnHomeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblHome, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnHomeLayout.setVerticalGroup(
            btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnHomeLayout.createSequentialGroup()
                .addComponent(lblHome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        menuIcones.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 60, 50));

        btnInfo.setBackground(new java.awt.Color(22, 54, 95));
        btnInfo.setPreferredSize(new java.awt.Dimension(32, 32));

        lblInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/info_32px.png"))); // NOI18N
        lblInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInfoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblInfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblInfoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnInfoLayout = new javax.swing.GroupLayout(btnInfo);
        btnInfo.setLayout(btnInfoLayout);
        btnInfoLayout.setHorizontalGroup(
            btnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnInfoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnInfoLayout.setVerticalGroup(
            btnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        menuIcones.add(btnInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 710, 60, 50));

        btnTrocaUsuario.setBackground(new java.awt.Color(22, 54, 95));
        btnTrocaUsuario.setPreferredSize(new java.awt.Dimension(32, 32));

        lblTrocaUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTrocaUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit_32px.png"))); // NOI18N
        lblTrocaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTrocaUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTrocaUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTrocaUsuarioMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnTrocaUsuarioLayout = new javax.swing.GroupLayout(btnTrocaUsuario);
        btnTrocaUsuario.setLayout(btnTrocaUsuarioLayout);
        btnTrocaUsuarioLayout.setHorizontalGroup(
            btnTrocaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnTrocaUsuarioLayout.createSequentialGroup()
                .addComponent(lblTrocaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnTrocaUsuarioLayout.setVerticalGroup(
            btnTrocaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTrocaUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        menuIcones.add(btnTrocaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 760, 60, 50));

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

        bntOrcamento.setBackground(new java.awt.Color(13, 31, 67));
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

        javax.swing.GroupLayout menuExpandidoLayout = new javax.swing.GroupLayout(menuExpandido);
        menuExpandido.setLayout(menuExpandidoLayout);
        menuExpandidoLayout.setHorizontalGroup(
            menuExpandidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separadorCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bntCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bntProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bntOrcamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(separadorServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuExpandidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuExpandidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCadastro)
                    .addComponent(lblServico, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(bntProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lblServico, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separadorServico, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(bntOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(445, Short.MAX_VALUE))
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

        frmHome.setBackground(new java.awt.Color(255, 255, 255));
        frmHome.setForeground(new java.awt.Color(255, 255, 255));

        MuralHome.setkBorderRadius(0);
        MuralHome.setkEndColor(new java.awt.Color(0, 204, 204));
        MuralHome.setkStartColor(new java.awt.Color(20, 85, 217));
        MuralHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo1.setText("Listas de Cadastros.....");
        MuralHome.add(lblTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 180, 40));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        MuralHome.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 10, 80));

        lvlIcon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lvlIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pass_fail_100px.png"))); // NOI18N
        MuralHome.add(lvlIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, 80));

        GridHome.setBackground(new java.awt.Color(255, 255, 255));
        GridHome.setLayout(new java.awt.GridLayout(2, 0, 0, 10));

        pnlClientes.setBackground(new java.awt.Color(255, 255, 255));
        pnlClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        txtPesquisaNome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtPesquisaNome.setForeground(new java.awt.Color(102, 102, 102));
        txtPesquisaNome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 204, 255)));
        txtPesquisaNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pesquisaCliente(evt);
            }
        });

        lblPesquisaCli.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPesquisaCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search_20px.png"))); // NOI18N

        scrollClientes.setBackground(new java.awt.Color(255, 255, 255));
        scrollClientes.setBorder(null);
        scrollClientes.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tblClientes.setAutoCreateRowSorter(true);
        tblClientes.setBackground(new java.awt.Color(255, 255, 255));
        tblClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tblClientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblClientes.setForeground(new java.awt.Color(51, 51, 51));
        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NÚMERO", "NOME", "CIDADE", "RAZAO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClientes.setGridColor(new java.awt.Color(255, 255, 255));
        tblClientes.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblClientes.setRowHeight(20);
        tblClientes.setSelectionBackground(new java.awt.Color(102, 204, 255));
        tblClientes.setSelectionForeground(new java.awt.Color(51, 51, 255));
        tblClientes.getTableHeader().setReorderingAllowed(false);
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCliente(evt);
            }
        });
        scrollClientes.setViewportView(tblClientes);
        if (tblClientes.getColumnModel().getColumnCount() > 0) {
            tblClientes.getColumnModel().getColumn(0).setPreferredWidth(5);
            tblClientes.getColumnModel().getColumn(1).setPreferredWidth(10);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Pesquisar por cliente");

        javax.swing.GroupLayout pnlClientesLayout = new javax.swing.GroupLayout(pnlClientes);
        pnlClientes.setLayout(pnlClientesLayout);
        pnlClientesLayout.setHorizontalGroup(
            pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 1090, Short.MAX_VALUE)
            .addGroup(pnlClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPesquisaCli)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(txtPesquisaNome))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlClientesLayout.setVerticalGroup(
            pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlClientesLayout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPesquisaCli, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPesquisaNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scrollClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        GridHome.add(pnlClientes);

        pnlProdutos.setBackground(new java.awt.Color(255, 255, 255));
        pnlProdutos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        txtPesquisaProduto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtPesquisaProduto.setForeground(new java.awt.Color(102, 102, 102));
        txtPesquisaProduto.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 204, 255)));
        txtPesquisaProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pesquisaProdutos(evt);
            }
        });

        lblPesquisaEsto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search_20px.png"))); // NOI18N

        scrollEstoque.setBorder(null);
        scrollEstoque.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tblEstoque.setAutoCreateRowSorter(true);
        tblEstoque.setBackground(new java.awt.Color(255, 255, 255));
        tblEstoque.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tblEstoque.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblEstoque.setForeground(new java.awt.Color(51, 51, 51));
        tblEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NÚMERO", "PRODUTO", "COR", "QUANTIDADE", "VALOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEstoque.setGridColor(new java.awt.Color(255, 255, 255));
        tblEstoque.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblEstoque.setOpaque(false);
        tblEstoque.setRowHeight(20);
        tblEstoque.setSelectionBackground(new java.awt.Color(102, 204, 255));
        tblEstoque.getTableHeader().setReorderingAllowed(false);
        tblEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEstoqueMouseClicked(evt);
            }
        });
        scrollEstoque.setViewportView(tblEstoque);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Pesquisar por Produtos");

        javax.swing.GroupLayout pnlProdutosLayout = new javax.swing.GroupLayout(pnlProdutos);
        pnlProdutos.setLayout(pnlProdutosLayout);
        pnlProdutosLayout.setHorizontalGroup(
            pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollEstoque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1090, Short.MAX_VALUE)
            .addGroup(pnlProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPesquisaEsto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPesquisaProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlProdutosLayout.setVerticalGroup(
            pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProdutosLayout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPesquisaProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPesquisaEsto, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(scrollEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        GridHome.add(pnlProdutos);

        javax.swing.GroupLayout frmHomeLayout = new javax.swing.GroupLayout(frmHome);
        frmHome.setLayout(frmHomeLayout);
        frmHomeLayout.setHorizontalGroup(
            frmHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MuralHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(GridHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frmHomeLayout.setVerticalGroup(
            frmHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmHomeLayout.createSequentialGroup()
                .addComponent(MuralHome, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GridHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        telas.add(frmHome, "card3");

        frmCliente.setBackground(new java.awt.Color(255, 255, 255));

        MuralCliente.setBackground(new java.awt.Color(255, 255, 255));
        MuralCliente.setkBorderRadius(0);
        MuralCliente.setkEndColor(new java.awt.Color(0, 204, 204));
        MuralCliente.setkStartColor(new java.awt.Color(20, 85, 217));
        MuralCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Cadastro de Cliente.....");
        MuralCliente.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 180, 40));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        MuralCliente.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 10, 70));

        lvlIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lvlIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user_group_100px.png"))); // NOI18N
        MuralCliente.add(lvlIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, 70));

        GridLayout.setBackground(new java.awt.Color(255, 255, 255));
        GridLayout.setOpaque(false);
        GridLayout.setLayout(new java.awt.GridLayout(2, 2, 5, 5));

        pnlCadastroBasico1.setBackground(new java.awt.Color(255, 255, 255));
        pnlCadastroBasico1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro Básico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI", 1, 14))); // NOI18N

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNome.setForeground(new java.awt.Color(102, 102, 102));
        lblNome.setText("Nome");

        txtNome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNome.setForeground(new java.awt.Color(102, 102, 102));
        txtNome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 204, 255)));

        lvlCPF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lvlCPF.setForeground(new java.awt.Color(102, 102, 102));
        lvlCPF.setText("CPF");

        txtCPF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 204, 255)));
        txtCPF.setForeground(new java.awt.Color(102, 102, 102));
        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lblSexo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSexo.setForeground(new java.awt.Color(102, 102, 102));
        lblSexo.setText("Sexo");

        rbFeminino.setBackground(new java.awt.Color(255, 255, 255));
        grupoSexoMeF.add(rbFeminino);
        rbFeminino.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbFeminino.setForeground(new java.awt.Color(102, 102, 102));
        rbFeminino.setSelected(true);
        rbFeminino.setText("Feminino");

        rbMasculino.setBackground(new java.awt.Color(255, 255, 255));
        grupoSexoMeF.add(rbMasculino);
        rbMasculino.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbMasculino.setForeground(new java.awt.Color(102, 102, 102));
        rbMasculino.setText("Maculino");

        txtSobrenome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtSobrenome.setForeground(new java.awt.Color(102, 102, 102));
        txtSobrenome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 204, 255)));

        lblSobrenome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSobrenome.setForeground(new java.awt.Color(102, 102, 102));
        lblSobrenome.setText("Sobrenome");

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
        grupoTipoCadastro.add(rbCliente);
        rbCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbCliente.setForeground(new java.awt.Color(102, 102, 102));
        rbCliente.setSelected(true);
        rbCliente.setText("Cliente");

        rbFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        grupoTipoCadastro.add(rbFornecedor);
        rbFornecedor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbFornecedor.setForeground(new java.awt.Color(102, 102, 102));
        rbFornecedor.setText("Fornecedor");

        rbUsuário.setBackground(new java.awt.Color(255, 255, 255));
        grupoTipoCadastro.add(rbUsuário);
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
        rbAtivo.setSelected(true);
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

        cbxPessoaFisica.setBackground(new java.awt.Color(255, 255, 255));
        grupoTipoPessoa.add(cbxPessoaFisica);
        cbxPessoaFisica.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbxPessoaFisica.setSelected(true);
        cbxPessoaFisica.setText("Pessoa Física");
        cbxPessoaFisica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxPessoaFisicaMouseClicked(evt);
            }
        });

        cbxPessoaJuri.setBackground(new java.awt.Color(255, 255, 255));
        grupoTipoPessoa.add(cbxPessoaJuri);
        cbxPessoaJuri.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbxPessoaJuri.setText("Pessoa Juridica");
        cbxPessoaJuri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxPessoaJuriMouseClicked(evt);
            }
        });

        lvlCNPJ.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lvlCNPJ.setForeground(new java.awt.Color(102, 102, 102));
        lvlCNPJ.setText("CNPJ");

        txtCNPJ.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 204, 255)));
        txtCNPJ.setForeground(new java.awt.Color(102, 102, 102));
        try {
            txtCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCNPJ.setEnabled(false);
        txtCNPJ.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout pnlCadastroBasico1Layout = new javax.swing.GroupLayout(pnlCadastroBasico1);
        pnlCadastroBasico1.setLayout(pnlCadastroBasico1Layout);
        pnlCadastroBasico1Layout.setHorizontalGroup(
            pnlCadastroBasico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroBasico1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlCadastroBasico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCadastroBasico1Layout.createSequentialGroup()
                        .addGroup(pnlCadastroBasico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlCadastroBasico1Layout.createSequentialGroup()
                                .addGroup(pnlCadastroBasico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lvlCNPJ)
                                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(69, 69, 69))
                            .addGroup(pnlCadastroBasico1Layout.createSequentialGroup()
                                .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(62, 62, 62)))
                        .addGroup(pnlCadastroBasico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlCadastroBasico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlCadastroBasico1Layout.createSequentialGroup()
                                    .addComponent(rbFeminino, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(rbMasculino))
                                .addComponent(lblSexo))
                            .addGroup(pnlCadastroBasico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnlCadastroBasico1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(lblSobrenome))
                                .addComponent(lvlCPF)
                                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                            .addComponent(rbUsuário, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblContato, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContato, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCadastroBasico1Layout.createSequentialGroup()
                        .addComponent(cbxPessoaFisica)
                        .addGap(18, 18, 18)
                        .addComponent(cbxPessoaJuri)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        pnlCadastroBasico1Layout.setVerticalGroup(
            pnlCadastroBasico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroBasico1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlCadastroBasico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxPessoaFisica)
                    .addComponent(cbxPessoaJuri))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastroBasico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSobrenome)
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCadastroBasico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCadastroBasico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCadastroBasico1Layout.createSequentialGroup()
                        .addComponent(lvlCNPJ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCadastroBasico1Layout.createSequentialGroup()
                        .addComponent(lvlCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(pnlCadastroBasico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastroBasico1Layout.createSequentialGroup()
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastroBasico1Layout.createSequentialGroup()
                        .addComponent(lblSexo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCadastroBasico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbFeminino, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(lblContato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContato, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
                .addContainerGap(92, Short.MAX_VALUE))
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

        txtCEP.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 204, 255)));
        txtCEP.setForeground(new java.awt.Color(102, 102, 102));
        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCEP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

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
                                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        bntCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCadastroActionPerformed(evt);
            }
        });

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
            .addComponent(MuralCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(GridLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frmClienteLayout.setVerticalGroup(
            frmClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmClienteLayout.createSequentialGroup()
                .addComponent(MuralCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GridLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        telas.add(frmCliente, "card3");

        frmEstoque.setBackground(new java.awt.Color(255, 255, 255));

        MuralEstoque.setBackground(new java.awt.Color(255, 255, 255));
        MuralEstoque.setkBorderRadius(0);
        MuralEstoque.setkEndColor(new java.awt.Color(0, 204, 204));
        MuralEstoque.setkStartColor(new java.awt.Color(20, 85, 217));
        MuralEstoque.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitulo3.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo3.setText("Cadastrar Produto.....");
        MuralEstoque.add(lblTitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 180, 90));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        MuralEstoque.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 10, 70));

        lblIconFornecedor1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconFornecedor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/produtos_100px.png"))); // NOI18N
        MuralEstoque.add(lblIconFornecedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, 90));

        GridEstoque.setBackground(new java.awt.Color(255, 255, 255));
        GridEstoque.setLayout(new java.awt.GridLayout(2, 0));

        pnlEstoque.setBackground(new java.awt.Color(255, 255, 255));
        pnlEstoque.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        txtProd.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtProd.setForeground(new java.awt.Color(102, 102, 102));
        txtProd.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 204, 255)));

        lblProd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblProd.setForeground(new java.awt.Color(102, 102, 102));
        lblProd.setText("Produto");

        lblCategoria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(102, 102, 102));
        lblCategoria.setText("Categoria");

        txtCategoria.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtCategoria.setForeground(new java.awt.Color(102, 102, 102));
        txtCategoria.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 204, 255)));

        txtValor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtValor.setForeground(new java.awt.Color(102, 102, 102));
        txtValor.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 204, 255)));

        lblValor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblValor.setForeground(new java.awt.Color(102, 102, 102));
        lblValor.setText("Valor");

        lblQtdMed.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblQtdMed.setForeground(new java.awt.Color(102, 102, 102));
        lblQtdMed.setText("Quantidade em Medida");

        txtQuant.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtQuant.setForeground(new java.awt.Color(102, 102, 102));
        txtQuant.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 204, 255)));

        lblUnidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUnidade.setForeground(new java.awt.Color(102, 102, 102));
        lblUnidade.setText("Unidade");

        txtUnidade.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtUnidade.setForeground(new java.awt.Color(102, 102, 102));
        txtUnidade.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 204, 255)));

        bntCadastraProd.setBorder(null);
        bntCadastraProd.setText("Cadastrar");
        bntCadastraProd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bntCadastraProd.setkBackGroundColor(new java.awt.Color(91, 98, 218));
        bntCadastraProd.setkEndColor(new java.awt.Color(18, 44, 83));
        bntCadastraProd.setkHoverEndColor(new java.awt.Color(22, 54, 95));
        bntCadastraProd.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        bntCadastraProd.setkHoverStartColor(new java.awt.Color(22, 54, 95));
        bntCadastraProd.setkStartColor(new java.awt.Color(91, 98, 218));
        bntCadastraProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCadastraProdActionPerformed(evt);
            }
        });

        bntEditProd.setBorder(null);
        bntEditProd.setText("Editar");
        bntEditProd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bntEditProd.setkBackGroundColor(new java.awt.Color(91, 98, 218));
        bntEditProd.setkEndColor(new java.awt.Color(18, 44, 83));
        bntEditProd.setkHoverEndColor(new java.awt.Color(22, 54, 95));
        bntEditProd.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        bntEditProd.setkHoverStartColor(new java.awt.Color(22, 54, 95));
        bntEditProd.setkStartColor(new java.awt.Color(91, 98, 218));

        javax.swing.GroupLayout pnlEstoqueLayout = new javax.swing.GroupLayout(pnlEstoque);
        pnlEstoque.setLayout(pnlEstoqueLayout);
        pnlEstoqueLayout.setHorizontalGroup(
            pnlEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEstoqueLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addGroup(pnlEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlEstoqueLayout.createSequentialGroup()
                        .addGroup(pnlEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtProd, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                            .addComponent(lblProd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQtdMed)
                            .addComponent(bntCadastraProd, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQuant))
                        .addGap(106, 106, 106)
                        .addGroup(pnlEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bntEditProd, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(345, Short.MAX_VALUE))
        );
        pnlEstoqueLayout.setVerticalGroup(
            pnlEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEstoqueLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(pnlEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlEstoqueLayout.createSequentialGroup()
                        .addComponent(lblProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProd, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEstoqueLayout.createSequentialGroup()
                        .addComponent(lblCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(pnlEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEstoqueLayout.createSequentialGroup()
                        .addComponent(lblQtdMed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEstoqueLayout.createSequentialGroup()
                        .addComponent(lblUnidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(lblValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(pnlEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntCadastraProd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntEditProd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GridEstoque.add(pnlEstoque);

        pnlSeparador.setBackground(new java.awt.Color(255, 255, 255));
        pnlSeparador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        GridEstoque.add(pnlSeparador);

        javax.swing.GroupLayout frmEstoqueLayout = new javax.swing.GroupLayout(frmEstoque);
        frmEstoque.setLayout(frmEstoqueLayout);
        frmEstoqueLayout.setHorizontalGroup(
            frmEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MuralEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 1092, Short.MAX_VALUE)
            .addGroup(frmEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(GridEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frmEstoqueLayout.setVerticalGroup(
            frmEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmEstoqueLayout.createSequentialGroup()
                .addComponent(MuralEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1099, Short.MAX_VALUE))
            .addGroup(frmEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(GridEstoque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        telas.add(frmEstoque, "card3");

        frmOrcamento.setBackground(new java.awt.Color(255, 255, 255));

        MuralOrc.setBackground(new java.awt.Color(255, 255, 255));
        MuralOrc.setkBorderRadius(0);
        MuralOrc.setkEndColor(new java.awt.Color(0, 204, 204));
        MuralOrc.setkStartColor(new java.awt.Color(20, 85, 217));
        MuralOrc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitulo5.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo5.setText("Orçamento...");
        MuralOrc.add(lblTitulo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 180, 40));

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        MuralOrc.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 10, 70));

        lblIconOrc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconOrc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/budget (1)_1.png"))); // NOI18N
        MuralOrc.add(lblIconOrc, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 120, 90));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        MuralOrc.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 110, -1));

        GridOrc.setBackground(new java.awt.Color(255, 255, 255));
        GridOrc.setLayout(new java.awt.GridLayout(2, 0));

        pnlOrc.setBackground(new java.awt.Color(255, 255, 255));

        scrollOrc.setBackground(new java.awt.Color(255, 255, 255));
        scrollOrc.setBorder(null);
        scrollOrc.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tblOrc.setAutoCreateRowSorter(true);
        tblOrc.setBackground(new java.awt.Color(255, 255, 255));
        tblOrc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblOrc.setForeground(new java.awt.Color(0, 0, 0));
        tblOrc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NR", "CLIENTE", "QUANTIDADE", "VALOR QUANTIDADE", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOrc.setGridColor(new java.awt.Color(255, 255, 255));
        tblOrc.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblOrc.setRowHeight(20);
        tblOrc.setSelectionBackground(new java.awt.Color(102, 204, 255));
        tblOrc.setSelectionForeground(new java.awt.Color(51, 51, 255));
        tblOrc.getTableHeader().setReorderingAllowed(false);
        tblOrc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrcMouseClicked(evt);
            }
        });
        scrollOrc.setViewportView(tblOrc);
        if (tblOrc.getColumnModel().getColumnCount() > 0) {
            tblOrc.getColumnModel().getColumn(0).setPreferredWidth(5);
            tblOrc.getColumnModel().getColumn(1).setPreferredWidth(10);
        }

        txtPesquisaOrc.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtPesquisaOrc.setForeground(new java.awt.Color(102, 102, 102));
        txtPesquisaOrc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 204, 255)));
        txtPesquisaOrc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pesquisaOrc(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Pesquisar orçamentos");

        lblIconPesquisaOrc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconPesquisaOrc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search_20px.png"))); // NOI18N

        pnlPrint.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrint.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(22, 54, 95)));

        lvlPrint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lvlPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/printer_1.png"))); // NOI18N

        javax.swing.GroupLayout pnlPrintLayout = new javax.swing.GroupLayout(pnlPrint);
        pnlPrint.setLayout(pnlPrintLayout);
        pnlPrintLayout.setHorizontalGroup(
            pnlPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrintLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lvlPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlPrintLayout.setVerticalGroup(
            pnlPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrintLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lvlPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnlOrcLayout = new javax.swing.GroupLayout(pnlOrc);
        pnlOrc.setLayout(pnlOrcLayout);
        pnlOrcLayout.setHorizontalGroup(
            pnlOrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollOrc, javax.swing.GroupLayout.DEFAULT_SIZE, 1092, Short.MAX_VALUE)
            .addGroup(pnlOrcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlOrcLayout.createSequentialGroup()
                        .addComponent(lblIconPesquisaOrc)
                        .addGap(10, 10, 10)
                        .addComponent(txtPesquisaOrc, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlPrint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlOrcLayout.setVerticalGroup(
            pnlOrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOrcLayout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addGroup(pnlOrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlOrcLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4)
                        .addGroup(pnlOrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIconPesquisaOrc)
                            .addComponent(txtPesquisaOrc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pnlPrint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollOrc, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        GridOrc.add(pnlOrc);

        pnlSeparador2.setBackground(new java.awt.Color(255, 255, 255));

        lvlTituloOrc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lvlTituloOrc.setForeground(new java.awt.Color(102, 102, 102));
        lvlTituloOrc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lvlTituloOrc.setText("Cadastrar Novo Orçamento");

        lblCli.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCli.setForeground(new java.awt.Color(102, 102, 102));
        lblCli.setText("Cliente");

        cbCli1.setBackground(new java.awt.Color(255, 255, 255));
        cbCli1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbCli1.setForeground(new java.awt.Color(153, 153, 153));
        cbCli1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar...", "Cliente1", "Cliente2", "Cliente3" }));

        lvlSelProd1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lvlSelProd1.setForeground(new java.awt.Color(102, 102, 102));
        lvlSelProd1.setText("Produto");

        cbProd.setBackground(new java.awt.Color(255, 255, 255));
        cbProd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbProd.setForeground(new java.awt.Color(153, 153, 153));
        cbProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar...", "Produto1", "Produto2", "Produto3" }));

        bntAddProduto.setBorder(null);
        bntAddProduto.setText("Adicionar");
        bntAddProduto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bntAddProduto.setkBackGroundColor(new java.awt.Color(91, 98, 218));
        bntAddProduto.setkEndColor(new java.awt.Color(18, 44, 83));
        bntAddProduto.setkHoverEndColor(new java.awt.Color(22, 54, 95));
        bntAddProduto.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        bntAddProduto.setkHoverStartColor(new java.awt.Color(22, 54, 95));
        bntAddProduto.setkPressedColor(new java.awt.Color(91, 98, 218));
        bntAddProduto.setkSelectedColor(new java.awt.Color(91, 98, 218));
        bntAddProduto.setkStartColor(new java.awt.Color(91, 98, 218));

        scrollCadastraOrc.setBorder(null);

        tblCadastraOrc.setBackground(new java.awt.Color(255, 255, 255));
        tblCadastraOrc.setForeground(new java.awt.Color(0, 0, 0));
        tblCadastraOrc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NÚMERO", "PRODUTO", "QUANTIDADE", "VALOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCadastraOrc.getTableHeader().setReorderingAllowed(false);
        scrollCadastraOrc.setViewportView(tblCadastraOrc);

        lblTotalCompra.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalCompra.setForeground(new java.awt.Color(102, 102, 102));
        lblTotalCompra.setText("Total da Compra");

        txtTotalCompra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTotalCompra.setForeground(new java.awt.Color(51, 255, 51));
        txtTotalCompra.setEnabled(false);

        bntCadastraOrc.setBorder(null);
        bntCadastraOrc.setText("Cadastrar");
        bntCadastraOrc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bntCadastraOrc.setkBackGroundColor(new java.awt.Color(91, 98, 218));
        bntCadastraOrc.setkEndColor(new java.awt.Color(18, 44, 83));
        bntCadastraOrc.setkHoverEndColor(new java.awt.Color(22, 54, 95));
        bntCadastraOrc.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        bntCadastraOrc.setkHoverStartColor(new java.awt.Color(22, 54, 95));
        bntCadastraOrc.setkPressedColor(new java.awt.Color(91, 98, 218));
        bntCadastraOrc.setkSelectedColor(new java.awt.Color(91, 98, 218));
        bntCadastraOrc.setkStartColor(new java.awt.Color(91, 98, 218));

        javax.swing.GroupLayout pnlSeparador2Layout = new javax.swing.GroupLayout(pnlSeparador2);
        pnlSeparador2.setLayout(pnlSeparador2Layout);
        pnlSeparador2Layout.setHorizontalGroup(
            pnlSeparador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeparador2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlSeparador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSeparador2Layout.createSequentialGroup()
                        .addComponent(lblCli, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)
                        .addComponent(lvlSelProd1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSeparador2Layout.createSequentialGroup()
                        .addComponent(cbCli1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(cbProd, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(bntAddProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlSeparador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
            .addComponent(scrollCadastraOrc)
            .addGroup(pnlSeparador2Layout.createSequentialGroup()
                .addGap(550, 550, 550)
                .addComponent(lvlTituloOrc, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(234, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSeparador2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bntCadastraOrc, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlSeparador2Layout.setVerticalGroup(
            pnlSeparador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeparador2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lvlTituloOrc)
                .addGap(34, 34, 34)
                .addGroup(pnlSeparador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlSeparador2Layout.createSequentialGroup()
                        .addGroup(pnlSeparador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCli)
                            .addComponent(lvlSelProd1))
                        .addGap(14, 14, 14)
                        .addGroup(pnlSeparador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbCli1)
                            .addComponent(cbProd)
                            .addComponent(bntAddProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(pnlSeparador2Layout.createSequentialGroup()
                        .addComponent(lblTotalCompra)
                        .addGap(8, 8, 8)
                        .addComponent(txtTotalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(scrollCadastraOrc, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntCadastraOrc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        GridOrc.add(pnlSeparador2);

        javax.swing.GroupLayout frmOrcamentoLayout = new javax.swing.GroupLayout(frmOrcamento);
        frmOrcamento.setLayout(frmOrcamentoLayout);
        frmOrcamentoLayout.setHorizontalGroup(
            frmOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MuralOrc, javax.swing.GroupLayout.DEFAULT_SIZE, 1092, Short.MAX_VALUE)
            .addGroup(frmOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(GridOrc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frmOrcamentoLayout.setVerticalGroup(
            frmOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmOrcamentoLayout.createSequentialGroup()
                .addComponent(MuralOrc, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(720, Short.MAX_VALUE))
            .addGroup(frmOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmOrcamentoLayout.createSequentialGroup()
                    .addGap(0, 95, Short.MAX_VALUE)
                    .addComponent(GridOrc, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        telas.add(frmOrcamento, "card3");

        getContentPane().add(telas, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1152, 860));
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
    
    //se tipo de pessoa fisica ou juri
    public void tipoPessoaFisica(JCheckBox cbxTipoPessoa){
        if(cbxTipoPessoa == cbxPessoaFisica){
            //desabilitado
            txtCNPJ.setEnabled(false);
            
            //habilitado
            txtSobrenome.setEditable(true);
            txtCPF.setEditable(true);
            rbFeminino.setEnabled(true);
            rbMasculino.setEnabled(true);
            rbUsuário.setEnabled(true);
            
            //modifica componente
            lblNome.setText("Nome");
            
            //limpa campos desabilitados
            txtCNPJ.setText("");
        }
        if(cbxTipoPessoa == cbxPessoaJuri){
            //desabilitado
            txtSobrenome.setEditable(false);
            txtCPF.setEditable(false);
            rbFeminino.setEnabled(false);
            rbMasculino.setEnabled(false);            
            rbUsuário.setEnabled(false);
                      
            //habilitado
            txtCNPJ.setEnabled(true);
            
            //modifica componente
            lblNome.setText("Nome da empresa");
            
            //limpar campos desabilitados
            txtSobrenome.setText("");
            txtCPF.setText("");
        }       
    }
    
    //pesquisar cadastro de cliente
    public void pesquisaCliente(){
        String sql = "SELECT p.id AS NUMERO, p.nome AS NOME, c.descricao AS CIDADE, p.situacao FROM pessoa p INNER JOIN cidade c ON p.fk_id_cidade = c.id WHERE p.nome ILIKE ?";
        try {         
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtPesquisaNome.getText()+"%");
            rs = pst.executeQuery();
            tblClientes.setModel(DbUtils.resultSetToTableModel(rs));      
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Ocorreu um erro! " + e.getMessage());
        }  
    }
    
    //pesquisar cadastro de produtos
    public void pesquisaProdutos(){
        String sql = "SELECT id AS NUMERO, descricao AS PRODUTO, cor AS COR, qnt_estoque AS ESTOQUE, unidade AS UNIDADE, vlr_venda AS VALOR FROM produto p WHERE p.descricao ILIKE ?";
        try {         
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtPesquisaProduto.getText()+"%");
            rs = pst.executeQuery();
            tblEstoque.setModel(DbUtils.resultSetToTableModel(rs));      
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Ocorreu um erro! " + e.getMessage());
        }  
    }
    
    //pesquisar cadastro de orçamento
    public void pesquisaOrc(){
        String sql = "SELECT o.id AS NR, p.nome AS NOME, o.quant AS QUANTIDADE, o.vlr_unit AS VALOR_QUANTIDADE, o.vlr_total AS TOTAL FROM produto_orcamento po INNER JOIN pessoa p ON po.fk_id_pessoa = p.id INNER JOIN orcamento o ON po.fk_id_orcamento = o.id WHERE p.nome ILIKE ?";
        try {         
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtPesquisaOrc.getText()+"%");
            rs = pst.executeQuery();
            tblOrc.setModel(DbUtils.resultSetToTableModel(rs));      
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Ocorreu um erro! " + e.getMessage());
        }  
    }
    
    private void lblSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblSairMouseClicked

    private void lblSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseEntered
        hover(btnSair, new Color(255,5,21));
    }//GEN-LAST:event_lblSairMouseEntered

    private void lblSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseExited
        hover(btnSair, new Color(9,22,50));
    }//GEN-LAST:event_lblSairMouseExited

    private void lblMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinMouseEntered
        hover(btnMin, new Color(33,50,93));
    }//GEN-LAST:event_lblMinMouseEntered

    private void lblMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinMouseExited
        hover(btnMin, new Color(9,22,50));
    }//GEN-LAST:event_lblMinMouseExited

    private void lblMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinMouseClicked
        setState(frmPrincipal.ICONIFIED);
    }//GEN-LAST:event_lblMinMouseClicked

    private void lblExpandirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExpandirMouseClicked
        //alterar a cor do botão que expandi o menu
        clickButton(btnExpandir, detalhe1, 1);
     
        //expandir o menu
        if(abertoFechado == true){
            //alterar a cor do botão que expandi o menu
            clickButton(btnExpandir, detalhe1, 0);
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

    private void bntProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntProdutoMouseClicked
        //remove frame
        telas.removeAll();
        telas.repaint();
        telas.revalidate();
        //add frame
        telas.add(frmEstoque);
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
        hover(bntOrcamento, new Color(13,31,67));
        hoverForeground(lblOrcamento, new Color(204,204,204));
    }//GEN-LAST:event_bntOrcamentoMouseExited

    private void eventFechaMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventFechaMenuMouseClicked
        //fechar o menu com click no lado de fora
        clickButton(btnExpandir, detalhe1, 0);
        expandir(menu, abertoFechado);
        SwingUtilities.updateComponentTreeUI(this);
        abertoFechado=false;
    }//GEN-LAST:event_eventFechaMenuMouseClicked

    private void detalhe1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detalhe1MouseEntered
        clickButton(btnExpandir, detalhe1, 1);
    }//GEN-LAST:event_detalhe1MouseEntered

    private void detalhe1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detalhe1MouseExited
        clickButton(btnExpandir, detalhe1, 0);
    }//GEN-LAST:event_detalhe1MouseExited

    private void lblExpandirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExpandirMouseEntered
        clickButton(btnExpandir, detalhe1, 1);
    }//GEN-LAST:event_lblExpandirMouseEntered

    private void lblExpandirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExpandirMouseExited
        clickButton(btnExpandir, detalhe1, 0);
    }//GEN-LAST:event_lblExpandirMouseExited

    private void lblHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseEntered
        clickButton(btnHome, detalhe2, 1);
    }//GEN-LAST:event_lblHomeMouseEntered

    private void lblHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseExited
        clickButton(btnHome, detalhe2, 0);
    }//GEN-LAST:event_lblHomeMouseExited

    private void lblHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseClicked
        //remove frame
        telas.removeAll();
        telas.repaint();
        telas.revalidate();
        //add frame
        telas.add(frmHome);
        telas.repaint();
        telas.revalidate();
    }//GEN-LAST:event_lblHomeMouseClicked

    private void lblTrocaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTrocaUsuarioMouseClicked
        //abrir tela de login
        frmLogin login = new frmLogin();
        login.setVisible(true);
        login.txtLogin.requestFocus();
        dispose();
    }//GEN-LAST:event_lblTrocaUsuarioMouseClicked

    private void lblTrocaUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTrocaUsuarioMouseEntered
        //alterar cor do botão
        hover(btnTrocaUsuario, new Color(18, 44, 83));
        hoverForeground(lblTrocaUsuario, new Color(255,255,255));
    }//GEN-LAST:event_lblTrocaUsuarioMouseEntered

    private void lblTrocaUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTrocaUsuarioMouseExited
        //alterar cor do botão
        hover(btnTrocaUsuario, new Color(22,54,95));
        hoverForeground(lblTrocaUsuario, new Color(204,204,204));
    }//GEN-LAST:event_lblTrocaUsuarioMouseExited

    private void lblInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInfoMouseClicked
        frmInfo info = new frmInfo();
        info.setVisible(true);        
    }//GEN-LAST:event_lblInfoMouseClicked

    private void lblInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInfoMouseEntered
        //alterar cor do botão
        hover(btnInfo, new Color(18, 44, 83));
        hoverForeground(lblInfo, new Color(255,255,255));
    }//GEN-LAST:event_lblInfoMouseEntered

    private void lblInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInfoMouseExited
        //alterar cor do botão
        hover(btnInfo, new Color(22,54,95));
        hoverForeground(lblInfo, new Color(204,204,204));
    }//GEN-LAST:event_lblInfoMouseExited

    private void tblCliente(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCliente
        
    }//GEN-LAST:event_tblCliente

    private void tblEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEstoqueMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblEstoqueMouseClicked

    private void tblOrcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrcMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblOrcMouseClicked

    private void cbxPessoaFisicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxPessoaFisicaMouseClicked
        tipoPessoaFisica(cbxPessoaFisica);
    }//GEN-LAST:event_cbxPessoaFisicaMouseClicked

    private void cbxPessoaJuriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxPessoaJuriMouseClicked
        tipoPessoaFisica(cbxPessoaJuri);
    }//GEN-LAST:event_cbxPessoaJuriMouseClicked

    private void pesquisaCliente(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisaCliente
        pesquisaCliente();
    }//GEN-LAST:event_pesquisaCliente

    private void bntCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCadastroActionPerformed
        // Referências
        CadastraPessoa cadastro = new CadastraPessoa();
        Fisica fisica = new Fisica();
        Endereco endereco = new Endereco();
        ComumPessoa comum = new ComumPessoa();
        Juridica juridica = new Juridica();
        
        // Inputs de Endereço
        endereco.setRua(txtRua.getText());
        endereco.setNumero(txtNumero.getText());
        endereco.setCep(txtCEP.getText());
        endereco.setBairro((String) cbBairro.getSelectedItem());
        endereco.setCidade((String) cbCidade.getSelectedItem());
        endereco.setEstado((String) cbEstado.getSelectedItem());
        endereco.setComplemento(txaComplemento.getText());
        
        
        // Inputs comuns para Jurídica e Física
        comum.setContato(txtContato.getText());
        comum.setEmail(txtEmail.getText());
        
        
        if (cbxPessoaJuri.isSelected()){
            // Cadastra Pessoa Juridica
            juridica.setRazao(txtNome.getText());
            juridica.setCnpj(txtCNPJ.getText());

            try {
                cadastro.insereJuridica(
                        juridica.getRazao(),
                        juridica.getCnpj(),
                        comum.getEmail(),
                        endereco.getNumero(),
                        endereco.getComplemento(),
                        comum.getSituacao(),
                        comum.getContato(),
                        comum.getTipoCadastro(),                        
                        endereco.getEstado(),
                        endereco.getCidade(),
                        endereco.getBairro(),
                        endereco.getRua(),
                        endereco.getCep()                        
                );
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }

            
            
        } else if (cbxPessoaFisica.isSelected()) {
            // Cadastra Pessoa Física
            fisica.setNome(txtNome.getText());
            fisica.setSobrenome(txtSobrenome.getText());
            fisica.setCpf(txtCPF.getText());
            
            // Validação de SEXO
            if (rbFeminino.isSelected()) {
                // Feminino
                fisica.setSexo('f');
            } else if (rbMasculino.isSelected()) {
                // Masculino
                fisica.setSexo('m');
            } else {
                // Não Binário
                fisica.setSexo('n');
            }
            
            // Validação de SITUAÇÃO 
            if (rbAtivo.isSelected()) {
                comum.setSituacao('a');
            } else if (rbBloqueado.isSelected()) {
                comum.setSituacao('b');
            } else {
                comum.setSituacao('i');
            }
            
            // Validação de TIPO DE CADASTRO
            if (rbUsuário.isSelected()) {
                comum.setTipoCadastro(1);
            } else if (rbFornecedor.isSelected()) {
                comum.setTipoCadastro(2);
            } else {
                comum.setTipoCadastro(3);
            }
           
            try {
                cadastro.insereFisica(
                        fisica.getNome(), 
                        fisica.getSobrenome(), 
                        fisica.getCpf(), 
                        fisica.getSexo(), 
                        comum.getEmail(), 
                        endereco.getNumero(), 
                        endereco.getComplemento(), 
                        comum.getSituacao(), 
                        comum.getContato(), 
                        comum.getTipoCadastro(),                        
                        endereco.getEstado(),
                        endereco.getCidade(),
                        endereco.getBairro(),
                        endereco.getRua(),
                        endereco.getCep() 
                );
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_bntCadastroActionPerformed

    private void bntCadastraProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCadastraProdActionPerformed
        Produto produto = new Produto();
        CadastraProduto cadastra = new CadastraProduto();
        
        int tamDesc = txtProd.getText().length();
        int tamCat = txtCategoria.getText().length();
        int tamQuant = txtQuant.getText().length();
        int tamUn = txtUnidade.getText().length();
        int tamVal = txtValor.getText().length();
        
        
        if (tamDesc == 0 || tamCat == 0 || tamQuant == 0 ||  tamUn == 0 || tamVal == 0) {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        } else {
        
            produto.setDescricao(txtProd.getText().trim());
            produto.setCategoria(txtCategoria.getText().trim());
            produto.setQntEstoque(Double.parseDouble(txtQuant.getText()));
            produto.setUnidade(txtUnidade.getText().trim());
            produto.setVlrVenda(Double.parseDouble(txtValor.getText()));


            try {
                cadastra.insereProduto(
                        produto.getDescricao(),
                        produto.getCategoria(),
                        produto.getQntEstoque(),
                        produto.getVlrVenda(),
                        produto.getUnidade()
                );
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_bntCadastraProdActionPerformed

    private void pesquisaProdutos(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisaProdutos
        pesquisaProdutos();
    }//GEN-LAST:event_pesquisaProdutos

    private void pesquisaOrc(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisaOrc
        pesquisaOrc();
    }//GEN-LAST:event_pesquisaOrc

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
    private javax.swing.JPanel GridEstoque;
    private javax.swing.JPanel GridHome;
    private javax.swing.JPanel GridLayout;
    private javax.swing.JPanel GridOrc;
    private keeptoo.KGradientPanel MuralCliente;
    private keeptoo.KGradientPanel MuralEstoque;
    private keeptoo.KGradientPanel MuralHome;
    private keeptoo.KGradientPanel MuralOrc;
    private keeptoo.KButton bntAddProduto;
    private keeptoo.KButton bntCadastraOrc;
    private keeptoo.KButton bntCadastraProd;
    private keeptoo.KButton bntCadastro;
    private javax.swing.JPanel bntCliente;
    private keeptoo.KButton bntEditProd;
    private javax.swing.JPanel bntOrcamento;
    private javax.swing.JPanel bntProduto;
    private javax.swing.JPanel btnExpandir;
    private javax.swing.JPanel btnHome;
    private javax.swing.JPanel btnInfo;
    private javax.swing.JPanel btnMin;
    private javax.swing.JPanel btnSair;
    private javax.swing.JPanel btnTrocaUsuario;
    private javax.swing.JPanel cabecalho;
    private javax.swing.JComboBox<String> cbBairro;
    private javax.swing.JComboBox<String> cbCidade;
    private javax.swing.JComboBox<String> cbCli1;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JComboBox<String> cbProd;
    private javax.swing.JCheckBox cbxPessoaFisica;
    private javax.swing.JCheckBox cbxPessoaJuri;
    private javax.swing.JPanel detalhe1;
    private javax.swing.JPanel detalhe2;
    private javax.swing.JLabel eventFechaMenu;
    private javax.swing.JPanel frmCliente;
    private javax.swing.JPanel frmEstoque;
    private javax.swing.JPanel frmHome;
    private javax.swing.JPanel frmOrcamento;
    private javax.swing.ButtonGroup grupoSexoMeF;
    private javax.swing.ButtonGroup grupoSituacao;
    private javax.swing.ButtonGroup grupoTipoCadastro;
    private javax.swing.ButtonGroup grupoTipoPessoa;
    private javax.swing.JLabel iconUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCli;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblContato;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblExpandir;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblIconFornecedor1;
    private javax.swing.JLabel lblIconOrc;
    private javax.swing.JLabel lblIconPesquisaOrc;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblOrcamento;
    private javax.swing.JLabel lblPesquisaCli;
    private javax.swing.JLabel lblPesquisaEsto;
    private javax.swing.JLabel lblProd;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblQtdMed;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblSair;
    private javax.swing.JLabel lblServico;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblSituacao;
    private javax.swing.JLabel lblSobrenome;
    private javax.swing.JLabel lblTipoCadastro;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo3;
    private javax.swing.JLabel lblTitulo5;
    private javax.swing.JLabel lblTotalCompra;
    private javax.swing.JLabel lblTrocaUsuario;
    private javax.swing.JLabel lblUnidade;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel lvlCEP;
    private javax.swing.JLabel lvlCNPJ;
    private javax.swing.JLabel lvlCPF;
    private javax.swing.JLabel lvlComplemento;
    private javax.swing.JLabel lvlEstado;
    private javax.swing.JLabel lvlIcon;
    private javax.swing.JLabel lvlIcon1;
    private javax.swing.JLabel lvlNumero;
    private javax.swing.JLabel lvlPrint;
    private javax.swing.JLabel lvlSelProd1;
    private javax.swing.JLabel lvlTituloOrc;
    private keeptoo.KGradientPanel menu;
    private keeptoo.KGradientPanel menuExpandido;
    private keeptoo.KGradientPanel menuIcones;
    private javax.swing.JPanel minMaxSair;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JPanel pnlCadastroBasico1;
    private javax.swing.JPanel pnlClientes;
    private javax.swing.JPanel pnlEndereco;
    private javax.swing.JPanel pnlEstoque;
    private javax.swing.JPanel pnlOrc;
    private javax.swing.JPanel pnlPrint;
    private javax.swing.JPanel pnlProdutos;
    private javax.swing.JPanel pnlSeparador;
    private javax.swing.JPanel pnlSeparador2;
    private javax.swing.JRadioButton rbAtivo;
    private javax.swing.JRadioButton rbBloqueado;
    private javax.swing.JRadioButton rbCliente;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbFornecedor;
    private javax.swing.JRadioButton rbInativo;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JRadioButton rbUsuário;
    private javax.swing.JScrollPane scrollCadastraOrc;
    private javax.swing.JScrollPane scrollClientes;
    private javax.swing.JScrollPane scrollEstoque;
    private javax.swing.JScrollPane scrollOrc;
    private javax.swing.JSeparator separadorCadastro;
    private javax.swing.JSeparator separadorServico;
    private javax.swing.JTable tblCadastraOrc;
    public javax.swing.JTable tblClientes;
    public javax.swing.JTable tblEstoque;
    public javax.swing.JTable tblOrc;
    private javax.swing.JPanel telas;
    private javax.swing.JTextArea txaComplemento;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCNPJ;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JFormattedTextField txtContato;
    private javax.swing.JTextField txtEmail;
    public javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    public javax.swing.JTextField txtPesquisaNome;
    private javax.swing.JTextField txtPesquisaOrc;
    private javax.swing.JTextField txtPesquisaProduto;
    private javax.swing.JTextField txtProd;
    private javax.swing.JTextField txtQuant;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtSobrenome;
    private javax.swing.JTextField txtTotalCompra;
    private javax.swing.JTextField txtUnidade;
    private javax.swing.JTextField txtValor;
    private javax.swing.JPanel userLogin;
    // End of variables declaration//GEN-END:variables
}
