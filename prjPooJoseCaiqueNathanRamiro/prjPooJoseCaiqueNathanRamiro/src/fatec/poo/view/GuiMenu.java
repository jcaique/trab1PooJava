package fatec.poo.view;

import fatec.poo.model.Pedido;
import fatec.poo.model.Pessoa;
import fatec.poo.model.Produto;
import java.util.ArrayList;

public class GuiMenu extends javax.swing.JFrame {

    public GuiMenu() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraMenu = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        itemMenuClientes = new javax.swing.JMenuItem();
        itemMenuVendedores = new javax.swing.JMenuItem();
        itemMenuProdutos = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        itemMenuSair = new javax.swing.JMenuItem();
        menuPedido = new javax.swing.JMenu();
        itemMenuEmitirPedido = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Vendas");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(510, 255));
        setName("GuiMenu"); // NOI18N
        setResizable(false);

        barraMenu.setBorder(null);
        barraMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        menuCadastros.setText("Cadastros");
        menuCadastros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        itemMenuClientes.setText("Clientes");
        itemMenuClientes.setAlignmentX(-10.0F);
        itemMenuClientes.setBorder(null);
        itemMenuClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemMenuClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        itemMenuClientes.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        itemMenuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuClientesActionPerformed(evt);
            }
        });
        menuCadastros.add(itemMenuClientes);

        itemMenuVendedores.setText("Vendedores");
        itemMenuVendedores.setAlignmentX(-10.0F);
        itemMenuVendedores.setBorder(null);
        itemMenuVendedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemMenuVendedores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        itemMenuVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuVendedoresActionPerformed(evt);
            }
        });
        menuCadastros.add(itemMenuVendedores);

        itemMenuProdutos.setText("Produtos");
        itemMenuProdutos.setAlignmentX(-10.0F);
        itemMenuProdutos.setBorder(null);
        itemMenuProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemMenuProdutos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        itemMenuProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuProdutosActionPerformed(evt);
            }
        });
        menuCadastros.add(itemMenuProdutos);
        menuCadastros.add(jSeparator2);

        itemMenuSair.setText("Sair");
        itemMenuSair.setAlignmentX(-10.0F);
        itemMenuSair.setBorder(null);
        itemMenuSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemMenuSair.setMargin(new java.awt.Insets(0, 30, 0, 0));
        itemMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuSairActionPerformed(evt);
            }
        });
        menuCadastros.add(itemMenuSair);

        barraMenu.add(menuCadastros);

        menuPedido.setText("Pedido");

        itemMenuEmitirPedido.setText("Emitir Pedido");
        itemMenuEmitirPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuEmitirPedidoActionPerformed(evt);
            }
        });
        menuPedido.add(itemMenuEmitirPedido);

        barraMenu.add(menuPedido);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 294, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 192, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_itemMenuSairActionPerformed

    private void itemMenuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuClientesActionPerformed
        new GuiCliente(cadCliVend).setVisible(true);
    }//GEN-LAST:event_itemMenuClientesActionPerformed

    private void itemMenuVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuVendedoresActionPerformed
        new GuiVendedor(cadCliVend).setVisible(true);
    }//GEN-LAST:event_itemMenuVendedoresActionPerformed

    private void itemMenuProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuProdutosActionPerformed
        new GuiProduto(cadProd).setVisible(true);
    }//GEN-LAST:event_itemMenuProdutosActionPerformed

    private void itemMenuEmitirPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuEmitirPedidoActionPerformed
      new GuiEmitirPedido(cadPedido,cadProd,cadCliVend).setVisible(true);
    }//GEN-LAST:event_itemMenuEmitirPedidoActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem itemMenuClientes;
    private javax.swing.JMenuItem itemMenuEmitirPedido;
    private javax.swing.JMenuItem itemMenuProdutos;
    private javax.swing.JMenuItem itemMenuSair;
    private javax.swing.JMenuItem itemMenuVendedores;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenu menuPedido;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Pessoa> cadCliVend = new ArrayList<Pessoa>();
    private ArrayList<Produto> cadProd = new ArrayList<Produto>();
    private ArrayList<Pedido> cadPedido = new ArrayList<Pedido>();
}