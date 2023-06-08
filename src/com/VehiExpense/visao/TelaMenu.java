/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.VehiExpense.visao;

/**
 *
 * @author aluno
 */
public class TelaMenu extends javax.swing.JPanel {

    /**
     * Creates new form TelaMenu
     */
    public TelaMenu() {
        initComponents();
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
        jButtonCadastoPF = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonCadastoPF1 = new javax.swing.JButton();
        jButtonCadastoPF2 = new javax.swing.JButton();
        jButtonCadastoPF5 = new javax.swing.JButton();
        jButtonCadastoPF6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(819, 501));

        jButtonCadastoPF.setBackground(new java.awt.Color(204, 204, 204));
        jButtonCadastoPF.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButtonCadastoPF.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCadastoPF.setText("Cadastrar Proprietário");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/VehiExpense/imagens/logo_arc_nova-removebg-preview (1).png"))); // NOI18N

        jButtonCadastoPF1.setBackground(new java.awt.Color(204, 204, 204));
        jButtonCadastoPF1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButtonCadastoPF1.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCadastoPF1.setText("Emitir Relatório");

        jButtonCadastoPF2.setBackground(new java.awt.Color(204, 204, 204));
        jButtonCadastoPF2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButtonCadastoPF2.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCadastoPF2.setText("Cadastrar Marca");
        jButtonCadastoPF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastoPF2ActionPerformed(evt);
            }
        });

        jButtonCadastoPF5.setBackground(new java.awt.Color(204, 204, 204));
        jButtonCadastoPF5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButtonCadastoPF5.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCadastoPF5.setText("Cadastrar Modelo");
        jButtonCadastoPF5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastoPF5ActionPerformed(evt);
            }
        });

        jButtonCadastoPF6.setBackground(new java.awt.Color(204, 204, 204));
        jButtonCadastoPF6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButtonCadastoPF6.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCadastoPF6.setText("Cadastrar Veiculo");
        jButtonCadastoPF6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastoPF6ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menu");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCadastoPF2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCadastoPF1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCadastoPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCadastoPF5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCadastoPF6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addComponent(jLabel2)
                .addContainerGap(322, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jButtonCadastoPF, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCadastoPF6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCadastoPF5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCadastoPF2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCadastoPF1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastoPF6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastoPF6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCadastoPF6ActionPerformed

    private void jButtonCadastoPF5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastoPF5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCadastoPF5ActionPerformed

    private void jButtonCadastoPF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastoPF2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCadastoPF2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastoPF;
    private javax.swing.JButton jButtonCadastoPF1;
    private javax.swing.JButton jButtonCadastoPF2;
    private javax.swing.JButton jButtonCadastoPF5;
    private javax.swing.JButton jButtonCadastoPF6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
