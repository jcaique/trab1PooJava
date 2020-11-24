package fatec.poo.view;

import fatec.poo.model.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GuiProduto extends javax.swing.JFrame {

    public GuiProduto(ArrayList<Produto> prod) {
        initComponents();
        cadProd = prod;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigo = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        lblQtdeDisponivel = new javax.swing.JLabel();
        lblPrecoUnitario = new javax.swing.JLabel();
        lblEstoqueMinimo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        txtQtdeDisponivel = new javax.swing.JTextField();
        txtPrecoUnitario = new javax.swing.JTextField();
        TxtEstoqueMinimo = new javax.swing.JTextField();
        btnSair = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produto");
        setResizable(false);

        lblCodigo.setText("Código");

        lblDescricao.setText("Descrição");

        lblQtdeDisponivel.setText("Qtde. Disponível");

        lblPrecoUnitario.setText("Preço Unitário");

        lblEstoqueMinimo.setText("Estoque Mínimo");

        txtDescricao.setEnabled(false);

        txtQtdeDisponivel.setEnabled(false);

        txtPrecoUnitario.setEnabled(false);

        TxtEstoqueMinimo.setEnabled(false);

        btnSair.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 153)));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnConsultar.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 153)));
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnIncluir.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        btnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnIncluir.setText("Incluir");
        btnIncluir.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 153)));
        btnIncluir.setEnabled(false);
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 153)));
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 153)));
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnConsultar)
                        .addGap(18, 18, 18)
                        .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblQtdeDisponivel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQtdeDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblPrecoUnitario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblEstoqueMinimo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtEstoqueMinimo))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDescricao)
                                    .addComponent(lblCodigo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnConsultar, btnExcluir, btnIncluir, btnSair});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricao)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQtdeDisponivel)
                    .addComponent(lblPrecoUnitario)
                    .addComponent(lblEstoqueMinimo)
                    .addComponent(txtQtdeDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtEstoqueMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnSair)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnIncluir)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAlterar, btnConsultar, btnExcluir, btnIncluir, btnSair});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        try {
            
            Integer.parseInt(txtCodigo.getText());//Tenta transformar a string codigo em um numero inteiro,
                                                  //caso falhe é jogada uma exeção "NumberFormatException"
            int i;
            for (i = 0; i < cadProd.size(); i++) {
                
                if(cadProd.get(i) instanceof Produto){                                   
                if(((Produto)cadProd.get(i)).getCodigo().equals(txtCodigo.getText())){
                    
                    break;
                              
                }
                
                }
                
            }
            
            if(i<cadProd.size()){
                
                indexProd = i;
                
            }
            else{
                
                indexProd = -1;
                
            }
            
            if(indexProd>=0){
                
                btnConsultar.setEnabled(false);
                btnExcluir.setEnabled(true);
                btnAlterar.setEnabled(true);
                
                txtCodigo.setEnabled(false);
                
                txtDescricao.setEnabled(true);
                txtDescricao.setText(((Produto)cadProd.get(indexProd)).getDescricao());                
                
                txtQtdeDisponivel.setEnabled(true);
                txtQtdeDisponivel.setText(String.valueOf(((Produto)cadProd.get(indexProd)).getQtdeEstoque()));
                
                txtPrecoUnitario.setEnabled(true);
                txtPrecoUnitario.setText(String.valueOf(((Produto)cadProd.get(indexProd)).getPreco()));               
                
                TxtEstoqueMinimo.setEnabled(true);
                TxtEstoqueMinimo.setText(String.valueOf(((Produto)cadProd.get(indexProd)).getEstoqueMinimo()));
                
                txtDescricao.requestFocus();
      
            }
            else{
                
                btnConsultar.setEnabled(false);
                btnIncluir.setEnabled(true);
                
                txtCodigo.setEnabled(false);
                txtDescricao.setEnabled(true);                
                txtQtdeDisponivel.setEnabled(true);
                txtPrecoUnitario.setEnabled(true);
                TxtEstoqueMinimo.setEnabled(true);
                
                txtDescricao.requestFocus();
                
            }
            
            
        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null, "Codigo invalido");
            txtCodigo.requestFocus();
            
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        Produto prod = new Produto(
                                    txtCodigo.getText(),
                                    txtDescricao.getText()
        );
        
        prod.setQtdeEstoque(Double.parseDouble(txtQtdeDisponivel.getText()));
        prod.setEstoqueMinimo(Double.parseDouble(TxtEstoqueMinimo.getText()));
        prod.setPreco(Double.parseDouble(txtPrecoUnitario.getText()));
        
        cadProd.add(prod);
        
       /* btnConsultar.setEnabled(true);
        btnExcluir.setEnabled(false);
        btnAlterar.setEnabled(false);
                
        txtCodigo.setEnabled(true);                
        txtDescricao.setEnabled(false);                
        txtQtdeDisponivel.setEnabled(false);
        txtPrecoUnitario.setEnabled(false);
        TxtEstoqueMinimo.setEnabled(false);
        
        txtCodigo.setText(null);                
        txtDescricao.setText(null); 
        txtQtdeDisponivel.setText(null); 
        txtPrecoUnitario.setText(null); 
        TxtEstoqueMinimo.setText(null);   */  
       
        resetGui();
        
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        //((Produto)cadProd.get(indexProd))
        
        ((Produto)cadProd.get(indexProd)).setDescricao(txtDescricao.getText());
        ((Produto)cadProd.get(indexProd)).setEstoqueMinimo(Double.parseDouble(TxtEstoqueMinimo.getText()));
        ((Produto)cadProd.get(indexProd)).setQtdeEstoque(Double.parseDouble(txtDescricao.getText()));
        ((Produto)cadProd.get(indexProd)).setPreco(Double.parseDouble(txtDescricao.getText()));
        
        resetGui();
        
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        cadProd.remove(indexProd);
        indexProd = -1;
        
        resetGui();
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void resetGui(){
        
        btnConsultar.setEnabled(true);
        btnExcluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnIncluir.setEnabled(false);
                
        txtCodigo.setEnabled(true);                
        txtDescricao.setEnabled(false);                
        txtQtdeDisponivel.setEnabled(false);
        txtPrecoUnitario.setEnabled(false);
        TxtEstoqueMinimo.setEnabled(false);
        
        txtCodigo.setText(null);                
        txtDescricao.setText(null); 
        txtQtdeDisponivel.setText(null); 
        txtPrecoUnitario.setText(null); 
        TxtEstoqueMinimo.setText(null);  
        
    }
   
  /*  public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiProduto().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtEstoqueMinimo;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblEstoqueMinimo;
    private javax.swing.JLabel lblPrecoUnitario;
    private javax.swing.JLabel lblQtdeDisponivel;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtPrecoUnitario;
    private javax.swing.JTextField txtQtdeDisponivel;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Produto> cadProd;
    private int indexProd;
}
