/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.Interface;

/**
 *
 * @author WorldBank13
 */
public class Admin_Interface extends javax.swing.JFrame {

    /**
     * Creates new form Admin_Interface
     */
    public Admin_Interface() {
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

        pnlButtons = new javax.swing.JPanel();
        btnCashier = new javax.swing.JButton();
        btnInventory = new javax.swing.JButton();
        btnHistory = new javax.swing.JButton();
        btnSalesMonitoring = new javax.swing.JButton();
        btnUserLogbook = new javax.swing.JButton();
        btnAccounts = new javax.swing.JButton();
        btnFeedback = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 655));
        setResizable(false);
        getContentPane().setLayout(null);

        pnlButtons.setOpaque(false);
        pnlButtons.setLayout(new java.awt.GridLayout(7, 1, 15, 15));

        btnCashier.setBackground(new java.awt.Color(0, 0, 0));
        btnCashier.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        btnCashier.setText("Sales Input");
        btnCashier.setBorder(null);
        btnCashier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCashierActionPerformed(evt);
            }
        });
        pnlButtons.add(btnCashier);

        btnInventory.setBackground(new java.awt.Color(0, 0, 0));
        btnInventory.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        btnInventory.setText("Inventory");
        pnlButtons.add(btnInventory);

        btnHistory.setBackground(new java.awt.Color(0, 0, 0));
        btnHistory.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        btnHistory.setText("History");
        pnlButtons.add(btnHistory);

        btnSalesMonitoring.setBackground(new java.awt.Color(0, 0, 0));
        btnSalesMonitoring.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        btnSalesMonitoring.setText("Sales Monitoring");
        pnlButtons.add(btnSalesMonitoring);

        btnUserLogbook.setBackground(new java.awt.Color(0, 0, 0));
        btnUserLogbook.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        btnUserLogbook.setText("User Logbook");
        pnlButtons.add(btnUserLogbook);

        btnAccounts.setBackground(new java.awt.Color(0, 0, 0));
        btnAccounts.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        btnAccounts.setText("Accounts");
        pnlButtons.add(btnAccounts);

        btnFeedback.setBackground(new java.awt.Color(0, 0, 0));
        btnFeedback.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        btnFeedback.setText("Feedback");
        pnlButtons.add(btnFeedback);

        getContentPane().add(pnlButtons);
        pnlButtons.setBounds(10, 10, 195, 610);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/Interface/Fast-Facts-about-PUP.jpg"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(-40, -90, 1670, 900);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCashierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCashierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCashierActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccounts;
    private javax.swing.JButton btnCashier;
    private javax.swing.JButton btnFeedback;
    private javax.swing.JButton btnHistory;
    private javax.swing.JButton btnInventory;
    private javax.swing.JButton btnSalesMonitoring;
    private javax.swing.JButton btnUserLogbook;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JPanel pnlButtons;
    // End of variables declaration//GEN-END:variables
}
