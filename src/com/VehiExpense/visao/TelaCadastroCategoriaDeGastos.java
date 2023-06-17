/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.VehiExpense.visao;

import com.VehiExpense.Persistencia.CategoriaDeGastosDAO;
import com.VehiExpense.Persistencia.ICategoriaDeGastosDAO;
import com.VehiExpense.modelos.CategoriaDeGastos;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aluno
 */
public class TelaCadastroCategoriaDeGastos extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroCategoriaDeGastos
     */
    public TelaCadastroCategoriaDeGastos() {
        initComponents();
        setLocationRelativeTo(null);
        try {
            ICategoriaDeGastosDAO categoriaDeGastosBD = null;
            categoriaDeGastosBD = new CategoriaDeGastosDAO();
            atualizarGrid(categoriaDeGastosBD.listaCategoriaDeGastos());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }

        // Estabeleça a conexão com o banco de dados
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
        jButtonCadastrarCategoriaDeGastos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCategoriaDeGastos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCategoriaDeGasto = new javax.swing.JTable();
        jButtonAtualizar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jButtonDeletar = new javax.swing.JButton();
        jButtonMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro De Categoria De Gastos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jButtonCadastrarCategoriaDeGastos.setBackground(new java.awt.Color(204, 204, 204));
        jButtonCadastrarCategoriaDeGastos.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButtonCadastrarCategoriaDeGastos.setText("Cadastrar");
        jButtonCadastrarCategoriaDeGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarCategoriaDeGastosActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/VehiExpense/imagens/logo_arc_nova-removebg-preview (1).png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Categoria Do Gasto");

        jTextFieldCategoriaDeGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCategoriaDeGastosActionPerformed(evt);
            }
        });

        jTableCategoriaDeGasto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Categoria De Gasto"
            }
        ));
        jTableCategoriaDeGasto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCategoriaDeGastoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCategoriaDeGasto);

        jButtonAtualizar.setBackground(new java.awt.Color(204, 204, 204));
        jButtonAtualizar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("IDENTIFICADOR");

        jTextFieldID.setEnabled(false);
        jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDActionPerformed(evt);
            }
        });

        jButtonDeletar.setBackground(new java.awt.Color(204, 204, 204));
        jButtonDeletar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButtonDeletar.setText("Deletar");
        jButtonDeletar.setPreferredSize(new java.awt.Dimension(136, 32));
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });

        jButtonMenu.setText("MENU");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCategoriaDeGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(214, 214, 214))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonCadastrarCategoriaDeGastos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonAtualizar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(128, 128, 128))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(305, 305, 305))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonMenu)
                        .addGap(31, 31, 31))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCategoriaDeGastos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrarCategoriaDeGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButtonMenu)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCategoriaDeGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCategoriaDeGastosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCategoriaDeGastosActionPerformed

    private void jButtonCadastrarCategoriaDeGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarCategoriaDeGastosActionPerformed
        try {
            CategoriaDeGastos categoriaDeGastos = null;
            categoriaDeGastos = new CategoriaDeGastos(0, jTextFieldCategoriaDeGastos.getText());

            ICategoriaDeGastosDAO categoriaDeGastosBD = null;
            categoriaDeGastosBD = new CategoriaDeGastosDAO();
            categoriaDeGastosBD.inserir(categoriaDeGastos);
            JOptionPane.showMessageDialog(this, "Categoria de gastos cadastrada com sucesso!");

            atualizarGrid(categoriaDeGastosBD.listaCategoriaDeGastos());

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonCadastrarCategoriaDeGastosActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        try {
            CategoriaDeGastos categoriaDeGastos = null;
            categoriaDeGastos = new CategoriaDeGastos((Integer.parseInt(jTextFieldID.getText())), jTextFieldCategoriaDeGastos.getText());

            ICategoriaDeGastosDAO categoriaDeGastosBD = null;
            categoriaDeGastosBD = new CategoriaDeGastosDAO();
            categoriaDeGastosBD.atualizar(categoriaDeGastos);
            JOptionPane.showMessageDialog(this, "Categoria de gastos atualizada!");

            atualizarGrid(categoriaDeGastosBD.listaCategoriaDeGastos());

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jTableCategoriaDeGastoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCategoriaDeGastoMouseClicked
        // TODO add your handling code here:
        jTextFieldID.setText(jTableCategoriaDeGasto.getValueAt(jTableCategoriaDeGasto.getSelectedRow(), 0).toString());
        jTextFieldCategoriaDeGastos.setText(jTableCategoriaDeGasto.getValueAt(jTableCategoriaDeGasto.getSelectedRow(), 1).toString());

    }//GEN-LAST:event_jTableCategoriaDeGastoMouseClicked

    private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        try {
            CategoriaDeGastos categoriaDeGastos = null;
            categoriaDeGastos = new CategoriaDeGastos((Integer.parseInt(jTextFieldID.getText())), jTextFieldCategoriaDeGastos.getText());

            ICategoriaDeGastosDAO categoriaDeGastosBD = null;
            categoriaDeGastosBD = new CategoriaDeGastosDAO();
            categoriaDeGastosBD.excluir(categoriaDeGastos);
            JOptionPane.showMessageDialog(this, "Categoria deletada com sucesso!");

            atualizarGrid(categoriaDeGastosBD.listaCategoriaDeGastos());

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonDeletarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroCategoriaDeGastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCategoriaDeGastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCategoriaDeGastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCategoriaDeGastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroCategoriaDeGastos().setVisible(true);
            }
        });
    }

    private void atualizarGrid(ArrayList<CategoriaDeGastos> listaCategoriaDeGastos) {
        try {
            DefaultTableModel model = (DefaultTableModel) jTableCategoriaDeGasto.getModel();
            model.setNumRows(0);
            for (int pos = 0; pos < listaCategoriaDeGastos.size(); pos++) {
                CategoriaDeGastos categoriaDeGastos = listaCategoriaDeGastos.get(pos);
                String[] linha = new String[2];
                linha[0] = categoriaDeGastos.getId() + "";
                linha[1] = categoriaDeGastos.getDescricaoCategoriaDeGasto();

                model.addRow(linha);
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonCadastrarCategoriaDeGastos;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCategoriaDeGasto;
    private javax.swing.JTextField jTextFieldCategoriaDeGastos;
    private javax.swing.JTextField jTextFieldID;
    // End of variables declaration//GEN-END:variables
}
