package fatec.poo.view;

import fatec.poo.model.Cliente;
import fatec.poo.model.Pessoa;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GuiCliente extends javax.swing.JFrame {

    public GuiCliente(ArrayList<Pessoa> cadCli) {
        initComponents();
        cadCliVend = cadCli;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCpf = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblLimiteCred = new javax.swing.JLabel();
        lblLimiteDisp = new javax.swing.JLabel();
        lblCep = new javax.swing.JLabel();
        lblUf = new javax.swing.JLabel();
        txtFormatCpf = new javax.swing.JFormattedTextField();
        txtFormatCep = new javax.swing.JFormattedTextField();
        txtEndereço = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtTelefoneDDD = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        cbxUf = new javax.swing.JComboBox<>();
        btnConsultar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        txtFormatLimiteCred = new javax.swing.JTextField();
        txtFormatLimiteDisp = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setLocation(new java.awt.Point(50, 50));
        setName("frameGuiCliente"); // NOI18N
        setResizable(false);

        lblCpf.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCpf.setText("CPF");

        lblNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNome.setText("Nome");

        lblEndereco.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEndereco.setText("Endereço");

        lblCidade.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCidade.setText("Cidade");

        lblTelefone.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTelefone.setText("Telefone");

        lblLimiteCred.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblLimiteCred.setText("Limite de Crédito");

        lblLimiteDisp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblLimiteDisp.setText("Limite Disponível");

        lblCep.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCep.setText("CEP");

        lblUf.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblUf.setText("UF");

        try {
            txtFormatCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtFormatCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFormatCep.setEnabled(false);

        txtEndereço.setEnabled(false);

        txtNome.setEnabled(false);

        txtCidade.setEnabled(false);

        txtTelefoneDDD.setEnabled(false);
        txtTelefoneDDD.setName(""); // NOI18N

        txtTelefone.setEnabled(false);

        cbxUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cbxUf.setEnabled(false);

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

        btnSair.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 153)));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        txtFormatLimiteCred.setEnabled(false);

        txtFormatLimiteDisp.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnConsultar)
                .addGap(32, 32, 32)
                .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 69, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addComponent(btnAlterar)
                .addGap(32, 32, 32)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnSair)
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEndereco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(lblNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCpf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEndereço)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtTelefoneDDD, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTelefone)
                                        .addGap(105, 105, 105))
                                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFormatCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCep, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFormatCep)
                                    .addComponent(cbxUf, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtNome))
                        .addGap(110, 110, 110))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLimiteCred)
                        .addGap(18, 18, 18)
                        .addComponent(txtFormatLimiteCred, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLimiteDisp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFormatLimiteDisp, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblLimiteCred, lblLimiteDisp});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblCep, lblUf});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblCidade, lblCpf, lblEndereco, lblNome, lblTelefone});

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
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCep)
                        .addComponent(txtFormatCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTelefone)
                        .addComponent(txtTelefoneDDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLimiteCred, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFormatLimiteCred, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLimiteDisp)
                            .addComponent(txtFormatLimiteDisp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnSair)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnIncluir)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblCep, lblCidade, lblCpf, lblEndereco, lblLimiteDisp, lblNome, lblTelefone, lblUf, txtCidade, txtEndereço, txtFormatCpf, txtNome});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbxUf, txtFormatCep});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAlterar, btnConsultar, btnExcluir, btnIncluir, btnSair});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed

        if (Pessoa.validarCpf(txtFormatCpf.getText())) {
            int cont;
            for (cont = 0; cont < cadCliVend.size(); cont++) {
                if (cadCliVend.get(cont) instanceof Cliente) {
                    if (((Cliente) cadCliVend.get(cont)).getCpf().equals(txtFormatCpf.getText())) {
                        break;
                    }
                }
            }

            if (cont < cadCliVend.size()) {
                indexCli = cont;
            } else {
                indexCli = -1;
            }

            if (indexCli >= 0) {
                txtFormatCpf.setText(((Cliente) cadCliVend.get(indexCli)).getCpf());

                txtNome.setText(((Cliente) cadCliVend.get(indexCli)).getNome());

                txtEndereço.setText(((Cliente) cadCliVend.get(indexCli)).getEndereco());

                txtCidade.setText(((Cliente) cadCliVend.get(indexCli)).getCidade());

                txtTelefoneDDD.setText(((Cliente) cadCliVend.get(indexCli)).getDdd());

                txtTelefone.setText(((Cliente) cadCliVend.get(indexCli)).getTelefone());

                txtFormatCep.setText(((Cliente) cadCliVend.get(indexCli)).getCep());

                cbxUf.setSelectedItem(((Cliente) cadCliVend.get(indexCli)).getUf());

                txtFormatLimiteCred.setText(String.valueOf((((Cliente) cadCliVend.get(indexCli)).getLimiteCred())));

                txtFormatLimiteDisp.setText(String.valueOf(((Cliente) cadCliVend.get(indexCli)).getLimiteDisp()));

                btnConsultar.setEnabled(false);
                btnAlterar.setEnabled(true);
                btnExcluir.setEnabled(true);

                txtFormatCpf.setEnabled(false);
                txtEndereço.setEnabled(true);
                txtFormatCep.setEnabled(true);
                txtFormatLimiteCred.setEnabled(true);
                txtFormatLimiteDisp.setEnabled(true);
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
                txtFormatLimiteCred.setEnabled(true);

                txtNome.setEnabled(true);
                txtTelefone.setEnabled(true);
                txtTelefoneDDD.setEnabled(true);
                txtCidade.setEnabled(true);
                cbxUf.setEnabled(true);

                txtNome.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(null, "CPF Inválido!");
            txtFormatCpf.requestFocus();
        }

    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        Cliente cli;
        cli = new Cliente(
                txtFormatCpf.getText(),
                txtNome.getText(),
                Double.parseDouble(String.valueOf(txtFormatLimiteCred.getText())));

        cli.setCep(txtFormatCep.getText());
        cli.setCidade(txtCidade.getText());
        cli.setDdd(txtTelefoneDDD.getText());
        cli.setTelefone(txtTelefone.getText());
        cli.setEndereco(txtEndereço.getText());
        cli.setUf(cbxUf.getSelectedItem().toString());

        cadCliVend.add(cli);

        txtCidade.setText(null);
        txtEndereço.setText(null);
        txtFormatCep.setText(null);
        txtFormatCpf.setText(null);
        txtFormatLimiteCred.setText(null);
        txtFormatLimiteDisp.setText(null);
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
        txtFormatLimiteCred.setEnabled(false);
        txtFormatLimiteDisp.setEnabled(false);
        txtNome.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtTelefoneDDD.setEnabled(false);

        txtFormatCpf.requestFocus();


    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (indexCli >= 0) {
            cadCliVend.remove(indexCli);
            indexCli = -1;
        }
        txtCidade.setText(null);
        txtEndereço.setText(null);
        txtFormatCep.setText(null);
        txtFormatCpf.setText(null);
        txtFormatLimiteCred.setText(null);
        txtFormatLimiteDisp.setText(null);
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
        txtFormatLimiteCred.setEnabled(false);
        txtFormatLimiteDisp.setEnabled(false);
        txtNome.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtTelefoneDDD.setEnabled(false);

        txtFormatCpf.requestFocus();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        txtFormatCpf.setEnabled(false);
        cadCliVend.get(indexCli).setNome(txtNome.getText());
        cadCliVend.get(indexCli).setCep(txtFormatCep.getText());
        cadCliVend.get(indexCli).setCidade(txtCidade.getText());
        cadCliVend.get(indexCli).setDdd(txtTelefoneDDD.getText());
        cadCliVend.get(indexCli).setEndereco(txtEndereço.getText());
        cadCliVend.get(indexCli).setTelefone(txtTelefone.getText());
        cadCliVend.get(indexCli).setUf(cbxUf.getSelectedItem().toString());
        ((Cliente) cadCliVend.get(indexCli)).setLimiteCred(Double.parseDouble(txtFormatLimiteCred.getText()));

        txtCidade.setText(null);
        txtEndereço.setText(null);
        txtFormatCep.setText(null);
        txtFormatCpf.setText(null);
        txtFormatLimiteCred.setText(null);
        txtFormatLimiteDisp.setText(null);
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
        txtFormatLimiteCred.setEnabled(false);
        txtFormatLimiteDisp.setEnabled(false);
        txtNome.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtTelefoneDDD.setEnabled(false);

        txtFormatCpf.requestFocus();
    }//GEN-LAST:event_btnAlterarActionPerformed


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
    private javax.swing.JLabel lblLimiteCred;
    private javax.swing.JLabel lblLimiteDisp;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblUf;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEndereço;
    private javax.swing.JFormattedTextField txtFormatCep;
    private javax.swing.JFormattedTextField txtFormatCpf;
    private javax.swing.JTextField txtFormatLimiteCred;
    private javax.swing.JTextField txtFormatLimiteDisp;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtTelefoneDDD;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Pessoa> cadCliVend;
    private int indexCli;
}
