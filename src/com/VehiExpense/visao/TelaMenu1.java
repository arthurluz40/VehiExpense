/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.VehiExpense.visao;

/**
 *
 * @author arthu
 */
public class TelaMenu1 extends javax.swing.JFrame {

    /**
     * Creates new form TelaMenu1
     */
    public TelaMenu1() {
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

        jButtonCadastoProprietario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonEmitirRelatorio = new javax.swing.JButton();
        jButtonCadastoMarca = new javax.swing.JButton();
        jButtonCadastoModelo = new javax.swing.JButton();
        jButtonCadastoVeiculo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        jButtonCadastoProprietario.setBackground(new java.awt.Color(204, 204, 204));
        jButtonCadastoProprietario.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButtonCadastoProprietario.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCadastoProprietario.setText("Cadastrar Proprietário");
        jButtonCadastoProprietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastoProprietarioActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/VehiExpense/imagens/logo_arc_nova-removebg-preview (1).png"))); // NOI18N

        jButtonEmitirRelatorio.setBackground(new java.awt.Color(204, 204, 204));
        jButtonEmitirRelatorio.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButtonEmitirRelatorio.setForeground(new java.awt.Color(0, 0, 0));
        jButtonEmitirRelatorio.setText("Emitir Relatório");

        jButtonCadastoMarca.setBackground(new java.awt.Color(204, 204, 204));
        jButtonCadastoMarca.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButtonCadastoMarca.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCadastoMarca.setText("Cadastrar Marca");
        jButtonCadastoMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastoMarcaActionPerformed(evt);
            }
        });

        jButtonCadastoModelo.setBackground(new java.awt.Color(204, 204, 204));
        jButtonCadastoModelo.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButtonCadastoModelo.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCadastoModelo.setText("Cadastrar Modelo");
        jButtonCadastoModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastoModeloActionPerformed(evt);
            }
        });

        jButtonCadastoVeiculo.setBackground(new java.awt.Color(204, 204, 204));
        jButtonCadastoVeiculo.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButtonCadastoVeiculo.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCadastoVeiculo.setText("Cadastrar Veiculo");
        jButtonCadastoVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastoVeiculoActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 107, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCadastoMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEmitirRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCadastoProprietario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCadastoModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCadastoVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(113, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jButtonCadastoProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCadastoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCadastoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCadastoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonEmitirRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastoProprietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastoProprietarioActionPerformed
        // TODO add your handling code here:
        TelaCadastroProprietarioPF frame = new TelaCadastroProprietarioPF();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCadastoProprietarioActionPerformed

    private void jButtonCadastoMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastoMarcaActionPerformed
        // TODO add your handling code here:
        TelaCadastrarMarca1 frame = new TelaCadastrarMarca1();
        frame.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButtonCadastoMarcaActionPerformed

    private void jButtonCadastoModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastoModeloActionPerformed
        // TODO add your handling code here:
        TelaCadastrarModelo1 frame = new TelaCadastrarModelo1();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCadastoModeloActionPerformed

    private void jButtonCadastoVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastoVeiculoActionPerformed
        // TODO add your handling code here:
        TelaCadastroVeiculo frame = new TelaCadastroVeiculo();
        frame.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButtonCadastoVeiculoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMenu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastoMarca;
    private javax.swing.JButton jButtonCadastoModelo;
    private javax.swing.JButton jButtonCadastoProprietario;
    private javax.swing.JButton jButtonCadastoVeiculo;
    private javax.swing.JButton jButtonEmitirRelatorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
