package fatec.poo.view;

import fatec.poo.model.Pessoa;
import fatec.poo.model.Vendedor;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GuiVendedor extends javax.swing.JFrame {

    public GuiVendedor(ArrayList<Pessoa> cadVend) {
        initComponents();
        this.cadCliVend = cadVend;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCpf = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnSair = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblEndereco = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        cbxUf = new javax.swing.JComboBox<>();
        lblTelefone = new javax.swing.JLabel();
        txtFormatCep = new javax.swing.JFormattedTextField();
        lblSalarioBase = new javax.swing.JLabel();
        lblTaxaDeComissao = new javax.swing.JLabel();
        lblCep = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        lblUf = new javax.swing.JLabel();
        btnIncluir = new javax.swing.JButton();
        txtFormatCpf = new javax.swing.JFormattedTextField();
        btnAlterar = new javax.swing.JButton();
        txtEndereço = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JButton();
        txtTelefoneDDD = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtFormatSalBase = new javax.swing.JTextField();
        txtFormatTaxaComissao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Vendedor");
        setMinimumSize(new java.awt.Dimension(687, 331));
        setResizable(false);
        setSize(new java.awt.Dimension(687, 331));

        lblCpf.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCpf.setText("CPF");

        txtNome.setEnabled(false);

        btnSair.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 153)));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNome.setText("Nome");

        txtCidade.setEnabled(false);

        lblEndereco.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEndereco.setText("Endereço");

        lblCidade.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCidade.setText("Cidade");

        cbxUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cbxUf.setEnabled(false);

        lblTelefone.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTelefone.setText("Telefone");

        try {
            txtFormatCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFormatCep.setEnabled(false);

        lblSalarioBase.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSalarioBase.setText("Salário Base");

        lblTaxaDeComissao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTaxaDeComissao.setText("Taxa de Comissão %");

        lblCep.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCep.setText("CEP");

        btnConsultar.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 153)));
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        lblUf.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblUf.setText("UF");

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

        try {
            txtFormatCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFormatCpf.setText("");

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

        txtEndereço.setEnabled(false);

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

        txtTelefoneDDD.setEnabled(false);
        txtTelefoneDDD.setName(""); // NOI18N

        txtTelefone.setEnabled(false);

        txtFormatSalBase.setEnabled(false);

        txtFormatTaxaComissao.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSalarioBase)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblCidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblEndereco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                .addComponent(lblNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCpf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblCep, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEndereço, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFormatCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblUf, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbxUf, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtTelefone)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txtFormatSalBase, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(lblTaxaDeComissao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFormatTaxaComissao, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtFormatCep, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTelefoneDDD, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(108, 108, 108)))))
                .addGap(110, 110, 110))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnConsultar)
                .addGap(32, 32, 32)
                .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnAlterar)
                .addGap(32, 32, 32)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnConsultar, btnExcluir, btnIncluir, btnSair});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtFormatCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpf))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEndereco))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidade)
                    .addComponent(lblUf)
                    .addComponent(cbxUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefone)
                            .addComponent(txtTelefoneDDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCep, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFormatCep, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lblSalarioBase, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTaxaDeComissao)
                            .addComponent(txtFormatSalBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFormatTaxaComissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnSair)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnIncluir)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAlterar, btnConsultar, btnExcluir, btnIncluir, btnSair});

        txtTelefoneDDD.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        if (Pessoa.validarCpf(txtFormatCpf.getText())) {//Cometario 1 no fim
            int cont;
            for (cont = 0; cont < cadCliVend.size(); cont++) {
                if (cadCliVend.get(cont) instanceof Vendedor) {
                    if (((Vendedor) cadCliVend.get(cont)).getCpf().equals(txtFormatCpf.getText())) {
                        break;
                    }
                }
            }

            if (cont < cadCliVend.size()) {
                indexVend = cont;
            } else {
                indexVend = -1;
            }

            if (indexVend >= 0) {
                txtFormatCpf.setText(((Vendedor) cadCliVend.get(indexVend)).getCpf());

                txtCidade.setText(((Vendedor) cadCliVend.get(indexVend)).getCidade());

                txtEndereço.setText(((Vendedor) cadCliVend.get(indexVend)).getEndereco());

                txtFormatCep.setText(((Vendedor) cadCliVend.get(indexVend)).getCep());

                txtFormatSalBase.setText(String.valueOf(((Vendedor) cadCliVend.get(indexVend)).getSalarioBase()));

                txtFormatTaxaComissao.setText(String.valueOf(((Vendedor) cadCliVend.get(indexVend)).getTaxaComissao()));

                txtNome.setText(((Vendedor) cadCliVend.get(indexVend)).getNome());

                cbxUf.setSelectedItem(String.valueOf(((Vendedor) cadCliVend.get(indexVend)).getUf()));

                txtTelefone.setText(((Vendedor) cadCliVend.get(indexVend)).getTelefone());

                txtTelefoneDDD.setText(((Vendedor) cadCliVend.get(indexVend)).getDdd());

                btnConsultar.setEnabled(false);
                btnAlterar.setEnabled(true);
                btnExcluir.setEnabled(true);

                txtFormatCpf.setEnabled(false);
                txtEndereço.setEnabled(true);
                txtFormatCep.setEnabled(true);
                txtFormatSalBase.setEnabled(true);
                txtFormatTaxaComissao.setEnabled(true);
                txtNome.setEnabled(true);
                txtTelefone.setEnabled(true);
                txtTelefoneDDD.setEnabled(true);
                txtCidade.setEnabled(true);
                cbxUf.setEnabled(true);

                txtNome.requestFocus();
            } else {
                btnConsultar.setEnabled(false);
                btnIncluir.setEnabled(true);

                txtFormatCpf.setEnabled(false);
                txtEndereço.setEnabled(true);
                txtFormatCep.setEnabled(true);
                txtFormatSalBase.setEnabled(true);
                txtFormatTaxaComissao.setEnabled(true);

                txtNome.setEnabled(true);
                txtTelefone.setEnabled(true);
                txtTelefoneDDD.setEnabled(true);
                txtCidade.setEnabled(true);
                cbxUf.setEnabled(true);

                txtNome.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(null, "CPF inválido!");
            txtFormatCpf.requestFocus();
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        Vendedor vend;
        vend = new Vendedor(
                txtFormatCpf.getText(),
                txtNome.getText(),
                Double.parseDouble(String.valueOf(txtFormatSalBase.getText())));

        vend.setCep(txtFormatCep.getText());
        vend.setCidade(txtCidade.getText());
        vend.setDdd(txtTelefoneDDD.getText());
        vend.setEndereco(txtEndereço.getText());
        vend.setNome(txtNome.getText());
        vend.setTaxaComissao(Double.parseDouble(String.valueOf(txtFormatTaxaComissao.getText())));
        vend.setUf(cbxUf.getSelectedItem().toString());

        cadCliVend.add(vend);

        txtCidade.setText(null);
        txtEndereço.setText(null);
        txtFormatCep.setText(null);
        txtFormatCpf.setText(null);
        txtFormatSalBase.setText(null);
        txtFormatTaxaComissao.setText(null);
        txtNome.setText(null);
        txtTelefone.setText(null);
        txtTelefoneDDD.setText(null);

        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtFormatCpf.setEnabled(true);
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        txtFormatCpf.setEnabled(false);
        cadCliVend.get(indexVend).setNome(txtNome.getText());
        cadCliVend.get(indexVend).setCep(txtFormatCep.getText());
        cadCliVend.get(indexVend).setCidade(txtCidade.getText());
        cadCliVend.get(indexVend).setDdd(txtTelefoneDDD.getText());
        cadCliVend.get(indexVend).setEndereco(txtEndereço.getText());
        cadCliVend.get(indexVend).setTelefone(txtTelefone.getText());
        cadCliVend.get(indexVend).setUf(cbxUf.getSelectedItem().toString());
        ((Vendedor) cadCliVend.get(indexVend)).setSalarioBase(Double.parseDouble(txtFormatSalBase.getText()));
        ((Vendedor) cadCliVend.get(indexVend)).setTaxaComissao(Double.parseDouble(txtFormatTaxaComissao.getText()));

        txtCidade.setText(null);
        txtEndereço.setText(null);
        txtFormatCep.setText(null);
        txtFormatCpf.setText(null);
        txtFormatSalBase.setText(null);
        txtFormatTaxaComissao.setText(null);
        txtNome.setText(null);
        txtTelefone.setText(null);
        txtTelefoneDDD.setText(null);

        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtFormatCpf.setEnabled(true);

        txtFormatCpf.requestFocus();
        
         txtCidade.setEnabled(false);
        txtEndereço.setEnabled(false);
        txtFormatCep.setEnabled(false);
        txtFormatCpf.setEnabled(true);
        txtFormatSalBase.setEnabled(false);
        txtFormatTaxaComissao.setEnabled(false);
        txtNome.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtTelefoneDDD.setEnabled(false);
        
        txtFormatCpf.requestFocus();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (indexVend >= 0) {
            cadCliVend.remove(indexVend);
            indexVend = -1;
        }
        txtCidade.setText(null);
        txtEndereço.setText(null);
        txtFormatCep.setText(null);
        txtFormatCpf.setText(null);
        txtFormatSalBase.setText(null);
        txtFormatTaxaComissao.setText(null);
        txtNome.setText(null);
        txtTelefone.setText(null);
        txtTelefoneDDD.setText(null);

        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtFormatCpf.setEnabled(true);
        
        txtCidade.setEnabled(false);
        txtEndereço.setEnabled(false);
        txtFormatCep.setEnabled(false);
        txtFormatCpf.setEnabled(true);
        txtFormatSalBase.setEnabled(false);
        txtFormatTaxaComissao.setEnabled(false);
        txtNome.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtTelefoneDDD.setEnabled(false);
        
        txtFormatCpf.requestFocus();
    }//GEN-LAST:event_btnExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbxUf;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSalarioBase;
    private javax.swing.JLabel lblTaxaDeComissao;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblUf;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEndereço;
    private javax.swing.JFormattedTextField txtFormatCep;
    private javax.swing.JFormattedTextField txtFormatCpf;
    private javax.swing.JTextField txtFormatSalBase;
    private javax.swing.JTextField txtFormatTaxaComissao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtTelefoneDDD;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Pessoa> cadCliVend;
    private int indexVend;
}
/* Comentário 1:
    Utilizando downcasting. 
    Primeiro é feito a validação do cpf, o qual
    método se encontra na classe Pessoa.
    Depois cria-se um for para percorrer todo o 
    ArrayList que contém os cadastros de vendedor 
    e cliente, Array este que é o mesmíssimo criado 
    na GuiMenu, isto ocorre pq ele está sendo passado
    por parametro ao ser instanciada a classe GuiVendedor
    ou a classe GuiCliente, pois estas em seus construtores 
    requerem que seja passado um ArrayList do tipo Pessoa.
    Posteriormente verifica-se no ArrayList que contem todos
    os cadastros se o objeto encontrado é uma instancia da classe
    Vendedor, se sim,depois verifica se o cpf deste vendedor é o mesmo 
    que se encontra no Array de cadastros, se sim indica que o vendedor/cliente
    encontra-se cadastrado e com isso para a iteração do for. 
    Nesta ultima condição utiliza-se o downcasting, que é basicamente
    uma forma e se utilizar um método de uma subclasse.
 */
