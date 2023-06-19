/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.VehiExpense.visao;

import com.VehiExpense.Persistencia.IVeiculoDAO;
import com.VehiExpense.Persistencia.ModeloDAO;
import com.VehiExpense.Persistencia.ProprietarioDAO;
import com.VehiExpense.Persistencia.VeiculoDAO;
import com.VehiExpense.modelos.Modelo;
import com.VehiExpense.modelos.Proprietario;
import com.VehiExpense.modelos.Veiculo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aluno
 */
public class TelaCadastroVeiculo extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroVeiculo
     */
    public TelaCadastroVeiculo() {
        initComponents();
        setLocationRelativeTo(null);
        try {
            IVeiculoDAO veiculoDB = null;
            veiculoDB = new VeiculoDAO();
            atualizarGrid(veiculoDB.listaVeiculos());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }

        try {
            ModeloDAO modeloDAO = new ModeloDAO();
            ArrayList<Modelo> categorias = modeloDAO.listaModelos();

            // Criar um vetor para armazenar as descrições das categorias
            String[] listaCombo = new String[categorias.size()];

            // Preencher o vetor com as descrições das categorias
            for (int i = 0; i < categorias.size(); i++) {
                listaCombo[i] = categorias.get(i).getId() + "- " + categorias.get(i).getDescricao();
            }

            // Limpar a combobox antes de adicionar os novos itens
            jComboBoxModelo.removeAllItems();

            // Adicionar os itens do vetor na combobox
            for (String descricao : listaCombo) {
                jComboBoxModelo.addItem(descricao);
            }
        } catch (Exception e) {
            // Tratar exceção
            e.printStackTrace();
        }

        try {
            ProprietarioDAO proprietarioDAO = new ProprietarioDAO();
            ArrayList<Proprietario> categorias = proprietarioDAO.listarTodos();

            // Criar um vetor para armazenar as descrições das categorias
            String[] listaCombo = new String[categorias.size()];

            // Preencher o vetor com as descrições das categorias
            for (int i = 0; i < categorias.size(); i++) {
                listaCombo[i] = categorias.get(i).getCpf() + "- " + categorias.get(i).getNome();
            }

            // Limpar a combobox antes de adicionar os novos itens
            jComboBoxProprietario.removeAllItems();

            // Adicionar os itens do vetor na combobox
            for (String descricao : listaCombo) {
                jComboBoxProprietario.addItem(descricao);
            }
        } catch (Exception e) {
            // Tratar exceção
            e.printStackTrace();
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelRazaoSocial = new javax.swing.JLabel();
        jTextFieldPlaca = new javax.swing.JTextField();
        jLabelRazaoSocial1 = new javax.swing.JLabel();
        jLabelRazaoSocial3 = new javax.swing.JLabel();
        jTextFieldAno = new javax.swing.JTextField();
        jTextFieldRenavam = new javax.swing.JTextField();
        jButtonMenu = new javax.swing.JButton();
        jLabelRazaoSocial4 = new javax.swing.JLabel();
        jTextFieldQuilometragem = new javax.swing.JTextField();
        jComboBoxModelo = new javax.swing.JComboBox<>();
        jComboBoxTipoDeCombustivel = new javax.swing.JComboBox<>();
        jLabelRazaoSocial5 = new javax.swing.JLabel();
        jButtonIncluir = new javax.swing.JButton();
        jLabelRazaoSocial6 = new javax.swing.JLabel();
        jComboBoxProprietario = new javax.swing.JComboBox<>();
        jButtonDeletar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCadastrarVeiculo = new javax.swing.JTable();
        jButtonAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(84, 154, 141));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(227, 60));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro Veículo");
        jLabel1.setPreferredSize(new java.awt.Dimension(227, 60));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/VehiExpense/imagens/logo_arc_nova-removebg-preview (1).png"))); // NOI18N

        jLabelEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelEmail.setText("Placa");

        jLabelRazaoSocial.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelRazaoSocial.setText("Modelo");

        jLabelRazaoSocial1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelRazaoSocial1.setText("Ano");

        jLabelRazaoSocial3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelRazaoSocial3.setText("Renavam");

        jButtonMenu.setText("MENU");
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
            }
        });

        jLabelRazaoSocial4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelRazaoSocial4.setText("Quilometragem");

        jComboBoxModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxTipoDeCombustivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "gasosa", "pinga", "veio barrero" }));

        jLabelRazaoSocial5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelRazaoSocial5.setText("Combustível");

        jButtonIncluir.setText("Incluir");
        jButtonIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirActionPerformed(evt);
            }
        });

        jLabelRazaoSocial6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelRazaoSocial6.setText("Proprietário");

        jButtonDeletar.setText("Deletar");
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });

        jTableCadastrarVeiculo.setBackground(new java.awt.Color(204, 204, 204));
        jTableCadastrarVeiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Placa", "Proprietário", "Ano", "Modelo", "Renavam", "Quilometragem", "Foto", "Combustivel"
            }
        ));
        jTableCadastrarVeiculo.setPreferredSize(new java.awt.Dimension(225, 80));
        jTableCadastrarVeiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCadastrarVeiculoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCadastrarVeiculo);
        if (jTableCadastrarVeiculo.getColumnModel().getColumnCount() > 0) {
            jTableCadastrarVeiculo.getColumnModel().getColumn(6).setMinWidth(0);
            jTableCadastrarVeiculo.getColumnModel().getColumn(6).setPreferredWidth(0);
            jTableCadastrarVeiculo.getColumnModel().getColumn(7).setMinWidth(0);
            jTableCadastrarVeiculo.getColumnModel().getColumn(7).setPreferredWidth(0);
        }

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonMenu)
                .addGap(23, 23, 23))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jButtonIncluir)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDeletar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelRazaoSocial3)
                                    .addComponent(jLabelEmail)
                                    .addComponent(jLabelRazaoSocial1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldRenavam, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        .addComponent(jTextFieldPlaca))
                                    .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabelRazaoSocial)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBoxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(jLabel2))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelRazaoSocial4)
                                            .addComponent(jLabelRazaoSocial5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBoxTipoDeCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldQuilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(66, 66, 66)
                                .addComponent(jLabelRazaoSocial6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(108, 120, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEmail)
                            .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelRazaoSocial)
                            .addComponent(jComboBoxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelRazaoSocial6)
                            .addComponent(jComboBoxProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelRazaoSocial3)
                            .addComponent(jTextFieldRenavam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelRazaoSocial4)
                            .addComponent(jTextFieldQuilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelRazaoSocial1)
                            .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelRazaoSocial5)
                            .addComponent(jComboBoxTipoDeCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonIncluir)
                            .addComponent(jButtonAlterar)
                            .addComponent(jButtonDeletar))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonMenu))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed
        // TODO add your handling code here:
        TelaMenu1 frame = new TelaMenu1();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonMenuActionPerformed

    private void jButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirActionPerformed
        try {
//marca.buscarPorId(Integer.parseInt(ID[0])
            String pegarID = "";
            pegarID = (String) jComboBoxModelo.getSelectedItem();
            String[] ID = pegarID.split("-");
            //System.out.println(ID[2]);

            //System.out.println(ID[0]);
            ModeloDAO modeloDAO = new ModeloDAO();
            System.out.println(modeloDAO.buscarPorId(Integer.parseInt(ID[0])));
            Veiculo veiculo = null;
            String proprietario = jComboBoxProprietario.getSelectedItem().toString();
            String[] cpfProprietario = proprietario.split("-");
            veiculo = new Veiculo(jTextFieldPlaca.getText(), jTextFieldRenavam.getText(), Integer.parseInt(jTextFieldAno.getText()), modeloDAO.buscarPorId(Integer.parseInt(ID[0])).getFoto(), jComboBoxTipoDeCombustivel.getSelectedItem().toString(), Double.parseDouble(jTextFieldQuilometragem.getText()), cpfProprietario[0], modeloDAO.buscarPorId(Integer.parseInt(ID[0])).getId());

            IVeiculoDAO veiculoDB = null;
            veiculoDB = new VeiculoDAO();
            veiculoDB.inserir(veiculo);
            atualizarGrid(veiculoDB.listaVeiculos());
            JOptionPane.showMessageDialog(this, "Veículo cadastrado com sucesso!");
        } catch (Exception erro) {
            erro.printStackTrace();
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonIncluirActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        try {

            String pegarID = "";
            pegarID = (String) jComboBoxModelo.getSelectedItem();
            String[] ID = pegarID.split("-");

            ModeloDAO modeloDAO = new ModeloDAO();
            System.out.println(modeloDAO.buscarPorId(Integer.parseInt(ID[0])));
            String proprietario = jComboBoxProprietario.getSelectedItem().toString();
            String[] cpfProprietario = proprietario.split("-");

            Veiculo veiculo = null;
            veiculo = new Veiculo(jTextFieldPlaca.getText(), jTextFieldRenavam.getText(), Integer.parseInt(jTextFieldAno.getText()), modeloDAO.buscarPorId(Integer.parseInt(ID[0])).getFoto(), jComboBoxTipoDeCombustivel.getSelectedItem().toString(), Double.parseDouble(jTextFieldQuilometragem.getText()), cpfProprietario[0], modeloDAO.buscarPorId(Integer.parseInt(ID[0])).getId());

            IVeiculoDAO veiculoBD = null;
            veiculoBD = new VeiculoDAO();
            veiculoBD.excluir(veiculo);
            JOptionPane.showMessageDialog(this, "Categoria deletada com sucesso!");

            atualizarGrid(veiculoBD.listaVeiculos());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jTableCadastrarVeiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCadastrarVeiculoMouseClicked

        try {
            ProprietarioDAO proprietarioDAO = new ProprietarioDAO();
            VeiculoDAO veiculoDAO = new VeiculoDAO();
            ModeloDAO modeloDAO = new ModeloDAO();
            System.out.println(modeloDAO.buscarPorId(veiculoDAO.buscarPorPlaca(jTableCadastrarVeiculo.getValueAt(jTableCadastrarVeiculo.getSelectedRow(), 0).toString()).getIdModelo()));
            for (int i = 0; i < jComboBoxProprietario.getItemCount(); i++) {
                if (jComboBoxProprietario.getItemAt(i).equals((proprietarioDAO.buscarPorCPF(jTableCadastrarVeiculo.getValueAt(jTableCadastrarVeiculo.getSelectedRow(), 1).toString()).getCpf()) + "- " + (proprietarioDAO.buscarPorCPF(jTableCadastrarVeiculo.getValueAt(jTableCadastrarVeiculo.getSelectedRow(), 1).toString()).getNome()))) {
                    jComboBoxProprietario.setSelectedIndex(i);
                }
            }

            for (int i = 0; i < jComboBoxModelo.getItemCount(); i++) {
                if (jComboBoxModelo.getItemAt(i).equals(modeloDAO.buscarPorId(veiculoDAO.buscarPorPlaca(jTableCadastrarVeiculo.getValueAt(jTableCadastrarVeiculo.getSelectedRow(), 0).toString()).getIdModelo()).getId() + "- " + modeloDAO.buscarPorId(veiculoDAO.buscarPorPlaca(jTableCadastrarVeiculo.getValueAt(jTableCadastrarVeiculo.getSelectedRow(), 0).toString()).getIdModelo()).getDescricao())) {
                    jComboBoxModelo.setSelectedIndex(i);
                    System.out.println("sucesso");
                }
            }
            for (int i = 0; i < jComboBoxTipoDeCombustivel.getItemCount(); i++) {
                if (jComboBoxTipoDeCombustivel.getItemAt(i).equals(jTableCadastrarVeiculo.getValueAt(jTableCadastrarVeiculo.getSelectedRow(), 7).toString())) {
                    jComboBoxTipoDeCombustivel.setSelectedIndex(i);
                    System.out.println("sucesso");
                }
            }
            jTextFieldPlaca.setText(jTableCadastrarVeiculo.getValueAt(jTableCadastrarVeiculo.getSelectedRow(), 0).toString());
            jComboBoxProprietario.setSelectedItem(proprietarioDAO.buscarPorCPF(jTableCadastrarVeiculo.getValueAt(jTableCadastrarVeiculo.getSelectedRow(), 1).toString()));
            jTextFieldAno.setText(jTableCadastrarVeiculo.getValueAt(jTableCadastrarVeiculo.getSelectedRow(), 2).toString());
            jTextFieldRenavam.setText(jTableCadastrarVeiculo.getValueAt(jTableCadastrarVeiculo.getSelectedRow(), 3).toString());
            jTextFieldQuilometragem.setText(jTableCadastrarVeiculo.getValueAt(jTableCadastrarVeiculo.getSelectedRow(), 4).toString());

        } catch (Exception e) {
        }


    }//GEN-LAST:event_jTableCadastrarVeiculoMouseClicked

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        try {
            String pegarID = "";
            pegarID = (String) jComboBoxModelo.getSelectedItem();
            String[] ID = pegarID.split("-");

            ModeloDAO modeloDAO = new ModeloDAO();
            System.out.println(modeloDAO.buscarPorId(Integer.parseInt(ID[0])));
            String proprietario = jComboBoxProprietario.getSelectedItem().toString();
            String[] cpfProprietario = proprietario.split("-");

            Veiculo veiculo = null;
            veiculo = new Veiculo(jTextFieldPlaca.getText(), jTextFieldRenavam.getText(), Integer.parseInt(jTextFieldAno.getText()), modeloDAO.buscarPorId(Integer.parseInt(ID[0])).getFoto(), jComboBoxTipoDeCombustivel.getSelectedItem().toString(), Double.parseDouble(jTextFieldQuilometragem.getText()), cpfProprietario[0], modeloDAO.buscarPorId(Integer.parseInt(ID[0])).getId());

            IVeiculoDAO veiculoDB = null;
            veiculoDB = new VeiculoDAO();
            veiculoDB.atualizar(veiculo);
            JOptionPane.showMessageDialog(this, "Categoria de gastos atualizada!");

            atualizarGrid(veiculoDB.listaVeiculos());

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void atualizarGrid(ArrayList<Veiculo> listaVeiculos) {
        try {
            DefaultTableModel model = (DefaultTableModel) jTableCadastrarVeiculo.getModel();
            model.setNumRows(0);
            for (int pos = 0; pos < listaVeiculos.size(); pos++) {
                Veiculo veiculo = listaVeiculos.get(pos);
                ModeloDAO modelo = new ModeloDAO();

                String[] linha = new String[8];
                linha[0] = veiculo.getPlaca();
                linha[1] = veiculo.getCPF();
                linha[2] = Integer.toString(veiculo.getAno());
                linha[3] = modelo.buscarPorId(veiculo.getIdModelo()).getDescricao();
                linha[4] = veiculo.getRenavam();
                linha[5] = Double.toString(veiculo.getKilometragemAtual());
                linha[6] = veiculo.getFoto();
                linha[7] = veiculo.getTipoDeCombustivel();

                model.addRow(linha);
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroVeiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonIncluir;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JComboBox<String> jComboBoxModelo;
    private javax.swing.JComboBox<String> jComboBoxProprietario;
    private javax.swing.JComboBox<String> jComboBoxTipoDeCombustivel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelRazaoSocial;
    private javax.swing.JLabel jLabelRazaoSocial1;
    private javax.swing.JLabel jLabelRazaoSocial3;
    private javax.swing.JLabel jLabelRazaoSocial4;
    private javax.swing.JLabel jLabelRazaoSocial5;
    private javax.swing.JLabel jLabelRazaoSocial6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCadastrarVeiculo;
    private javax.swing.JTextField jTextFieldAno;
    private javax.swing.JTextField jTextFieldPlaca;
    private javax.swing.JTextField jTextFieldQuilometragem;
    private javax.swing.JTextField jTextFieldRenavam;
    // End of variables declaration//GEN-END:variables
}
