/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author U53R
 */
public class test extends javax.swing.JFrame {

    /**
     * Creates new form test
     */
    public test() {
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

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        lbJudul = new javax.swing.JLabel();
        txtAngka2 = new javax.swing.JTextField();
        lbAngka1 = new javax.swing.JLabel();
        lbAngka2 = new javax.swing.JLabel();
        txtAngka1 = new javax.swing.JTextField();
        btTambah = new javax.swing.JButton();
        btKurang = new javax.swing.JButton();
        btKali = new javax.swing.JButton();
        btBagi = new javax.swing.JButton();
        txtHasil = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu5.setText("jMenu5");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 85, 156));

        lbJudul.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        lbJudul.setText("KALKULATOR SEDERHANA");

        txtAngka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAngka2ActionPerformed(evt);
            }
        });

        lbAngka1.setText("Angka1 :");

        lbAngka2.setText("Angka2 :");

        txtAngka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAngka1ActionPerformed(evt);
            }
        });

        btTambah.setText("+");
        btTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTambahActionPerformed(evt);
            }
        });

        btKurang.setText("-");
        btKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKurangActionPerformed(evt);
            }
        });

        btKali.setText("x");
        btKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKaliActionPerformed(evt);
            }
        });

        btBagi.setText(":");
        btBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBagiActionPerformed(evt);
            }
        });

        txtHasil.setEditable(false);
        txtHasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHasilActionPerformed(evt);
            }
        });

        jLabel1.setText("Hasil :");

        jMenu3.setText("File");
        jMenuBar1.add(jMenu3);

        jMenu6.setText("jMenu6");
        jMenuBar1.add(jMenu6);

        jMenu4.setText("Edit");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbAngka1)
                            .addComponent(lbAngka2))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbJudul)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtAngka1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                .addComponent(txtAngka2, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btTambah)
                            .addComponent(jLabel1))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btKurang)
                                .addGap(27, 27, 27)
                                .addComponent(btKali)
                                .addGap(18, 18, 18)
                                .addComponent(btBagi))
                            .addComponent(txtHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAngka1)
                    .addComponent(txtAngka1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAngka2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAngka2))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btTambah)
                    .addComponent(btKurang)
                    .addComponent(btKali)
                    .addComponent(btBagi))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAngka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAngka2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAngka2ActionPerformed

    private void txtAngka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAngka1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAngka1ActionPerformed

    private void txtHasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHasilActionPerformed

    private void btTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTambahActionPerformed
      double a = Double.valueOf(txtAngka1.getText());
      double b = Double.valueOf(txtAngka2.getText());
      
      double hasil = a + b;
      txtHasil.setText(String.valueOf(hasil));
      
    }//GEN-LAST:event_btTambahActionPerformed

    private void btKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKurangActionPerformed

      double hasil = tambah(Double.valueOf(txtAngka1.getText()),Double.valueOf(txtAngka2.getText()));
      txtHasil.setText(String.valueOf(hasil));
    }//GEN-LAST:event_btKurangActionPerformed

    private void btKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKaliActionPerformed
        double a = Double.valueOf(txtAngka1.getText());
      double b = Double.valueOf(txtAngka2.getText());
      
      double hasil = a * b;
      txtHasil.setText(String.valueOf(hasil));
    }//GEN-LAST:event_btKaliActionPerformed

    private void btBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBagiActionPerformed
       double a = Double.valueOf(txtAngka1.getText());
      double b = Double.valueOf(txtAngka2.getText());
      
      double hasil = a / b;
      txtHasil.setText(String.valueOf(hasil));
    }//GEN-LAST:event_btBagiActionPerformed
    public double tambah(double a,double b){
        return a + b;
    }
    public double kurang(double a,double b){
        return  a - b;
    }
    public double kali(double a,double b){
        return a * b;
    }
    public double bagi(double a,double b){
        return a / b;
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
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBagi;
    private javax.swing.JButton btKali;
    private javax.swing.JButton btKurang;
    private javax.swing.JButton btTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lbAngka1;
    private javax.swing.JLabel lbAngka2;
    private javax.swing.JLabel lbJudul;
    private javax.swing.JTextField txtAngka1;
    private javax.swing.JTextField txtAngka2;
    private javax.swing.JTextField txtHasil;
    // End of variables declaration//GEN-END:variables
}
