package fatec.poo.view;

import fatec.poo.model.Pedido;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class GuiEmitirPedido extends javax.swing.JFrame {

    public GuiEmitirPedido(ArrayList<Pedido> cadPedidos) {
        initComponents();
        this.cadPedidos = cadPedidos;
        modTblProds = (DefaultTableModel) tblProds.getModel();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpButtonFormaPGT = new javax.swing.ButtonGroup();
        painelPedido = new javax.swing.JPanel();
        lblNumPedido = new javax.swing.JLabel();
        lblDataPedido = new javax.swing.JLabel();
        painelFormaPgt = new javax.swing.JPanel();
        radioAVista = new javax.swing.JRadioButton();
        radioPrazo = new javax.swing.JRadioButton();
        txtNumeroPedido = new javax.swing.JTextField();
        btnPesqPedido = new javax.swing.JButton();
        txtDataPedido = new javax.swing.JFormattedTextField();
        painelDadosCliente = new javax.swing.JPanel();
        lblCpdCliente = new javax.swing.JLabel();
        btnPesqCliente = new javax.swing.JButton();
        txtNomeCliente = new javax.swing.JTextField();
        txtCpfCliente = new javax.swing.JFormattedTextField();
        painelDadosVendedor = new javax.swing.JPanel();
        lblCpfVendedor = new javax.swing.JLabel();
        btnPesqVendedor = new javax.swing.JButton();
        txtNomeVendedor = new javax.swing.JTextField();
        txtCpfCliente1 = new javax.swing.JFormattedTextField();
        painelItensDoPedido = new javax.swing.JPanel();
        lblCodProd = new javax.swing.JLabel();
        txtCodProd = new javax.swing.JTextField();
        btnPesqProd = new javax.swing.JButton();
        txtDescProd = new javax.swing.JTextField();
        lblQtdVendida = new javax.swing.JLabel();
        txtQtdVendida = new javax.swing.JTextField();
        btnAddItem = new javax.swing.JButton();
        btnRemoverItem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProds = new javax.swing.JTable();
        lblValorTotal = new javax.swing.JLabel();
        lblQtdItens = new javax.swing.JLabel();
        txtValorTotalPedido = new javax.swing.JTextField();
        txtQtdItensPedidos = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Emitir Pedido");
        setBackground(new java.awt.Color(255, 255, 255));
        setEnabled(false);
        setResizable(false);

        painelPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Pedido"));
        painelPedido.setToolTipText("Pedido");
        painelPedido.setName("Pedido"); // NOI18N

        lblNumPedido.setText("Número do Pedido");

        lblDataPedido.setText("Data do Pedido");

        painelFormaPgt.setBorder(javax.swing.BorderFactory.createTitledBorder("Forma de Pagamento"));
        painelFormaPgt.setEnabled(false);

        grpButtonFormaPGT.add(radioAVista);
        radioAVista.setSelected(true);
        radioAVista.setText("À vista");
        radioAVista.setEnabled(false);

        grpButtonFormaPGT.add(radioPrazo);
        radioPrazo.setText("A prazo");
        radioPrazo.setEnabled(false);

        javax.swing.GroupLayout painelFormaPgtLayout = new javax.swing.GroupLayout(painelFormaPgt);
        painelFormaPgt.setLayout(painelFormaPgtLayout);
        painelFormaPgtLayout.setHorizontalGroup(
            painelFormaPgtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFormaPgtLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radioAVista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(radioPrazo)
                .addGap(50, 50, 50))
        );
        painelFormaPgtLayout.setVerticalGroup(
            painelFormaPgtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFormaPgtLayout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addGroup(painelFormaPgtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioAVista)
                    .addComponent(radioPrazo)))
        );

        txtNumeroPedido.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnPesqPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnPesqPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqPedidoActionPerformed(evt);
            }
        });

        txtDataPedido.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        txtDataPedido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDataPedido.setEnabled(false);

        javax.swing.GroupLayout painelPedidoLayout = new javax.swing.GroupLayout(painelPedido);
        painelPedido.setLayout(painelPedidoLayout);
        painelPedidoLayout.setHorizontalGroup(
            painelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNumPedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNumeroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesqPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(lblDataPedido)
                .addGap(18, 18, 18)
                .addComponent(txtDataPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelFormaPgt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelPedidoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnPesqPedido, txtNumeroPedido});

        painelPedidoLayout.setVerticalGroup(
            painelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPedidoLayout.createSequentialGroup()
                .addComponent(painelFormaPgt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(painelPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblDataPedido)
                    .addComponent(txtDataPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesqPedido)
                    .addComponent(txtNumeroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumPedido))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelPedidoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnPesqPedido, txtDataPedido, txtNumeroPedido});

        painelDadosCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Cliente"));
        painelDadosCliente.setToolTipText("Pedido");
        painelDadosCliente.setName("Pedido"); // NOI18N

        lblCpdCliente.setText("CPF do Cliente");

        btnPesqCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnPesqCliente.setEnabled(false);

        txtNomeCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNomeCliente.setEnabled(false);

        try {
            txtCpfCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpfCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCpfCliente.setEnabled(false);

        javax.swing.GroupLayout painelDadosClienteLayout = new javax.swing.GroupLayout(painelDadosCliente);
        painelDadosCliente.setLayout(painelDadosClienteLayout);
        painelDadosClienteLayout.setHorizontalGroup(
            painelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCpdCliente)
                .addGap(18, 18, 18)
                .addComponent(txtCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesqCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelDadosClienteLayout.setVerticalGroup(
            painelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblCpdCliente)
                    .addComponent(txtCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesqCliente)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelDadosClienteLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnPesqCliente, txtCpfCliente, txtNomeCliente});

        painelDadosVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Vendedor"));
        painelDadosVendedor.setToolTipText("Pedido");
        painelDadosVendedor.setName("Pedido"); // NOI18N

        lblCpfVendedor.setText("CPF do Vendedor");

        btnPesqVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnPesqVendedor.setEnabled(false);

        txtNomeVendedor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNomeVendedor.setEnabled(false);

        try {
            txtCpfCliente1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpfCliente1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCpfCliente1.setEnabled(false);

        javax.swing.GroupLayout painelDadosVendedorLayout = new javax.swing.GroupLayout(painelDadosVendedor);
        painelDadosVendedor.setLayout(painelDadosVendedorLayout);
        painelDadosVendedorLayout.setHorizontalGroup(
            painelDadosVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosVendedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCpfVendedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCpfCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesqVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNomeVendedor)
                .addContainerGap())
        );
        painelDadosVendedorLayout.setVerticalGroup(
            painelDadosVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosVendedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblCpfVendedor)
                    .addComponent(txtCpfCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesqVendedor)
                    .addComponent(txtNomeVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelDadosVendedorLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnPesqVendedor, txtCpfCliente1, txtNomeVendedor});

        painelItensDoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Itens do Pedido"));

        lblCodProd.setText("Código do Produto");

        txtCodProd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodProd.setEnabled(false);

        btnPesqProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnPesqProd.setEnabled(false);

        txtDescProd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDescProd.setEnabled(false);

        lblQtdVendida.setText("Qtd. Vendida");

        txtQtdVendida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQtdVendida.setEnabled(false);

        btnAddItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnAddItem.setText("Adicionar Item");
        btnAddItem.setEnabled(false);

        btnRemoverItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/rem.png"))); // NOI18N
        btnRemoverItem.setText("Remover Item");
        btnRemoverItem.setEnabled(false);

        tblProds.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Preço Unit.", "Qtde. Vendida", "SubTotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProds.setEnabled(false);
        jScrollPane1.setViewportView(tblProds);

        lblValorTotal.setText("Valor Total do Pedido");

        lblQtdItens.setText("Quantidade de Itens Pedidos");

        txtValorTotalPedido.setEditable(false);
        txtValorTotalPedido.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtValorTotalPedido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorTotalPedido.setEnabled(false);

        txtQtdItensPedidos.setEditable(false);
        txtQtdItensPedidos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQtdItensPedidos.setEnabled(false);

        javax.swing.GroupLayout painelItensDoPedidoLayout = new javax.swing.GroupLayout(painelItensDoPedido);
        painelItensDoPedido.setLayout(painelItensDoPedidoLayout);
        painelItensDoPedidoLayout.setHorizontalGroup(
            painelItensDoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelItensDoPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelItensDoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelItensDoPedidoLayout.createSequentialGroup()
                        .addGroup(painelItensDoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(painelItensDoPedidoLayout.createSequentialGroup()
                                .addComponent(lblCodProd)
                                .addGap(7, 7, 7)
                                .addComponent(txtCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPesqProd, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDescProd, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblQtdVendida)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQtdVendida)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelItensDoPedidoLayout.createSequentialGroup()
                        .addComponent(btnAddItem)
                        .addGap(61, 61, 61)
                        .addComponent(btnRemoverItem)
                        .addGap(232, 232, 232))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelItensDoPedidoLayout.createSequentialGroup()
                        .addGap(493, 493, 493)
                        .addGroup(painelItensDoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValorTotal, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblQtdItens, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(painelItensDoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtQtdItensPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(txtValorTotalPedido))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        painelItensDoPedidoLayout.setVerticalGroup(
            painelItensDoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelItensDoPedidoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(painelItensDoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesqProd)
                    .addComponent(txtDescProd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQtdVendida, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQtdVendida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodProd))
                .addGap(18, 18, 18)
                .addGroup(painelItensDoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRemoverItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelItensDoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(painelItensDoPedidoLayout.createSequentialGroup()
                        .addComponent(txtValorTotalPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(txtQtdItensPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelItensDoPedidoLayout.createSequentialGroup()
                        .addComponent(lblValorTotal)
                        .addGap(11, 11, 11)
                        .addComponent(lblQtdItens))))
        );

        painelItensDoPedidoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnPesqProd, lblCodProd, txtCodProd});

        painelItensDoPedidoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblQtdItens, lblValorTotal, txtQtdItensPedidos, txtValorTotalPedido});

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");

        btnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/save.png"))); // NOI18N
        btnIncluir.setText("Incluir");
        btnIncluir.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelDadosVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelDadosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelItensDoPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(btnIncluir)
                .addGap(34, 34, 34)
                .addComponent(btnAlterar)
                .addGap(35, 35, 35)
                .addComponent(btnExcluir)
                .addGap(30, 30, 30)
                .addComponent(btnSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnExcluir, btnIncluir, btnSair});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(painelDadosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(painelDadosVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(painelItensDoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnExcluir)
                        .addComponent(btnAlterar)
                        .addComponent(btnSair))
                    .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {painelDadosCliente, painelDadosVendedor, painelPedido});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAlterar, btnExcluir, btnIncluir, btnSair});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesqPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqPedidoActionPerformed
        int cont;

        for (cont = 0; cont < cadPedidos.size(); cont++) {
            if (cadPedidos.get(cont) instanceof Pedido) {
                if (((Pedido) cadPedidos.get(cont)).getNumero().equals(txtNumeroPedido.getText())) {
                    break;
                }
            }
        }

        if (cont < cadPedidos.size()) {
            indexPed = cont;
        } else {
            indexPed = -1;
        }

        //se index >=0 entao existe o pedido
        if (indexPed >= 0) {
            btnPesqPedido.setEnabled(false);

            for (int i = 0; i < ((Pedido) cadPedidos.get(cont)).getItensPedidos().size(); i++) {
               
            }

            txtCodProd.setEnabled(true);
            btnRemoverItem.setEnabled(true);
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);
        } else {
            btnPesqPedido.setEnabled(false);
            txtDataPedido.setEnabled(true);
        }
    }//GEN-LAST:event_btnPesqPedidoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnPesqCliente;
    private javax.swing.JButton btnPesqPedido;
    private javax.swing.JButton btnPesqProd;
    private javax.swing.JButton btnPesqVendedor;
    private javax.swing.JButton btnRemoverItem;
    private javax.swing.JButton btnSair;
    private javax.swing.ButtonGroup grpButtonFormaPGT;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodProd;
    private javax.swing.JLabel lblCpdCliente;
    private javax.swing.JLabel lblCpfVendedor;
    private javax.swing.JLabel lblDataPedido;
    private javax.swing.JLabel lblNumPedido;
    private javax.swing.JLabel lblQtdItens;
    private javax.swing.JLabel lblQtdVendida;
    private javax.swing.JLabel lblValorTotal;
    private javax.swing.JPanel painelDadosCliente;
    private javax.swing.JPanel painelDadosVendedor;
    private javax.swing.JPanel painelFormaPgt;
    private javax.swing.JPanel painelItensDoPedido;
    private javax.swing.JPanel painelPedido;
    private javax.swing.JRadioButton radioAVista;
    private javax.swing.JRadioButton radioPrazo;
    private javax.swing.JTable tblProds;
    private javax.swing.JTextField txtCodProd;
    private javax.swing.JFormattedTextField txtCpfCliente;
    private javax.swing.JFormattedTextField txtCpfCliente1;
    private javax.swing.JFormattedTextField txtDataPedido;
    private javax.swing.JTextField txtDescProd;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtNomeVendedor;
    private javax.swing.JTextField txtNumeroPedido;
    private javax.swing.JTextField txtQtdItensPedidos;
    private javax.swing.JTextField txtQtdVendida;
    private javax.swing.JTextField txtValorTotalPedido;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Pedido> cadPedidos;
    private int indexPed;
    private DefaultTableModel modTblProds;
}
