package fatec.poo.view;

public class GuiEmitirPedido extends javax.swing.JFrame {

    public GuiEmitirPedido() {
        initComponents();
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
        btnPesquisarPedido = new javax.swing.JButton();
        txtDataPedido = new javax.swing.JFormattedTextField();
        painelPedido1 = new javax.swing.JPanel();
        lblNumPedido1 = new javax.swing.JLabel();
        lblDataPedido1 = new javax.swing.JLabel();
        txtNumeroPedido1 = new javax.swing.JTextField();
        btnPesquisarPedido1 = new javax.swing.JButton();
        txtDataPedido1 = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Emitir Pedido");

        painelPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Pedido"));
        painelPedido.setToolTipText("Pedido");
        painelPedido.setName("Pedido"); // NOI18N

        lblNumPedido.setText("Número do Pedido");

        lblDataPedido.setText("Data do Pedido");

        painelFormaPgt.setBorder(javax.swing.BorderFactory.createTitledBorder("Forma de Pagamento"));
        painelFormaPgt.setEnabled(false);

        grpButtonFormaPGT.add(radioAVista);
        radioAVista.setText("À vista");
        radioAVista.setEnabled(false);

        grpButtonFormaPGT.add(radioPrazo);
        radioPrazo.setText("À prazo");
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

        btnPesquisarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnPesquisarPedido.setEnabled(false);

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
                .addComponent(btnPesquisarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(lblDataPedido)
                .addGap(18, 18, 18)
                .addComponent(txtDataPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelFormaPgt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelPedidoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnPesquisarPedido, txtNumeroPedido});

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
                    .addComponent(btnPesquisarPedido)
                    .addComponent(txtNumeroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumPedido))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelPedidoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnPesquisarPedido, txtDataPedido, txtNumeroPedido});

        painelPedido1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Cliente"));
        painelPedido1.setToolTipText("Pedido");
        painelPedido1.setName("Pedido"); // NOI18N

        lblNumPedido1.setText("Número do Pedido");

        lblDataPedido1.setText("Data do Pedido");

        txtNumeroPedido1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnPesquisarPedido1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnPesquisarPedido1.setEnabled(false);

        txtDataPedido1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        txtDataPedido1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDataPedido1.setEnabled(false);

        javax.swing.GroupLayout painelPedido1Layout = new javax.swing.GroupLayout(painelPedido1);
        painelPedido1.setLayout(painelPedido1Layout);
        painelPedido1Layout.setHorizontalGroup(
            painelPedido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPedido1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNumPedido1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNumeroPedido1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisarPedido1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(lblDataPedido1)
                .addGap(18, 18, 18)
                .addComponent(txtDataPedido1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(350, Short.MAX_VALUE))
        );
        painelPedido1Layout.setVerticalGroup(
            painelPedido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPedido1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPedido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblDataPedido1)
                    .addComponent(txtDataPedido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarPedido1)
                    .addComponent(txtNumeroPedido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumPedido1))
                .addGap(19, 24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(painelPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(painelPedido1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(painelPedido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(484, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiEmitirPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisarPedido;
    private javax.swing.JButton btnPesquisarPedido1;
    private javax.swing.ButtonGroup grpButtonFormaPGT;
    private javax.swing.JLabel lblDataPedido;
    private javax.swing.JLabel lblDataPedido1;
    private javax.swing.JLabel lblNumPedido;
    private javax.swing.JLabel lblNumPedido1;
    private javax.swing.JPanel painelFormaPgt;
    private javax.swing.JPanel painelPedido;
    private javax.swing.JPanel painelPedido1;
    private javax.swing.JRadioButton radioAVista;
    private javax.swing.JRadioButton radioPrazo;
    private javax.swing.JFormattedTextField txtDataPedido;
    private javax.swing.JFormattedTextField txtDataPedido1;
    private javax.swing.JTextField txtNumeroPedido;
    private javax.swing.JTextField txtNumeroPedido1;
    // End of variables declaration//GEN-END:variables
}
