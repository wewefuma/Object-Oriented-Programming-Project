/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author WorldBank13
 */
public class Admin_Interface extends javax.swing.JFrame {

    
    public Admin_Interface() {
        initComponents();
        
        //Setting cardLayout
        CardLayout objLayout = new CardLayout();
        pnlContent.setLayout(objLayout);
        
        //calling the new panel Welcome
        pnlWelcome objWelcome = new pnlWelcome();
        pnlContent.add(objWelcome, "0");
        objLayout.show(pnlContent, "0");
        
         //calling the new panel SalesInputPanel
        SalesInputPanel objInput = new SalesInputPanel();
        pnlContent.add(objInput, "1");
        
        //calling new panel Inventory
        pnlInventory objInventory = new pnlInventory();
        pnlContent.add(objInventory, "2");
        
        //calling the new panel History
        pnlHistory objHistory = new pnlHistory();
        pnlContent.add(objHistory, "3");
        
         //calling the new panel SalesMonitoring
        pnlSalesMonitoring objSales = new pnlSalesMonitoring();
        pnlContent.add(objSales, "4");
        
        //calling the new panel Logbook
        pnlLogbook objLogbook = new pnlLogbook();
        pnlContent.add(objLogbook, "5");
        
        //calling the new panel Accounts
        pnlAccounts objAccounts = new pnlAccounts();
        pnlContent.add(objAccounts, "6");
        
        //calling the new panel Feedback
        pnlFeedback objFeedback = new pnlFeedback();
        pnlContent.add(objFeedback, "7");
        
      
        
        
         //showing the panel Welcome
        btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				objLayout.show(pnlContent,"0");
			}
	});
        
         //showing the panel Welcome
        btnCashier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				objLayout.show(pnlContent,"1");
			}
	});
        
        //showing the panel Inventory
        btnInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				objLayout.show(pnlContent,"2");
			}
	});
        
         //showing the panel History
        btnHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				objLayout.show(pnlContent,"3");
			}
	});
        
         //showing the panel Sales Monitoring
        btnSalesMonitoring.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				objLayout.show(pnlContent,"4");
			}
	});
        
         //showing the panel User Logbook
        btnUserLogbook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				objLayout.show(pnlContent,"5");
			}
	});
        
         //showing the panel Accounts
        btnAccounts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				objLayout.show(pnlContent,"6");
			}
	});
        
         //showing the panel Feedback
        btnFeedback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				objLayout.show(pnlContent,"7");
			}
	});
        
        this.setTitle("Admin Interface");
        
        
        
       
        
        
        
        
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
        btnHome = new javax.swing.JButton();
        btnCashier = new javax.swing.JButton();
        btnInventory = new javax.swing.JButton();
        btnHistory = new javax.swing.JButton();
        btnSalesMonitoring = new javax.swing.JButton();
        btnUserLogbook = new javax.swing.JButton();
        btnAccounts = new javax.swing.JButton();
        btnFeedback = new javax.swing.JButton();
        pnlContent = new javax.swing.JPanel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(940, 675));
        setResizable(false);
        getContentPane().setLayout(null);

        pnlButtons.setOpaque(false);
        pnlButtons.setLayout(new java.awt.GridLayout(8, 1, 15, 10));

        btnHome.setBackground(new java.awt.Color(1, 50, 67));
        btnHome.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setText("Home");
        pnlButtons.add(btnHome);

        btnCashier.setBackground(new java.awt.Color(1, 50, 67));
        btnCashier.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        btnCashier.setForeground(new java.awt.Color(255, 255, 255));
        btnCashier.setText("Sales Input");
        btnCashier.setBorder(null);
        btnCashier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCashierActionPerformed(evt);
            }
        });
        pnlButtons.add(btnCashier);

        btnInventory.setBackground(new java.awt.Color(1, 50, 67));
        btnInventory.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        btnInventory.setForeground(new java.awt.Color(255, 255, 255));
        btnInventory.setText("Inventory");
        btnInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventoryActionPerformed(evt);
            }
        });
        pnlButtons.add(btnInventory);

        btnHistory.setBackground(new java.awt.Color(1, 50, 67));
        btnHistory.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        btnHistory.setForeground(new java.awt.Color(255, 255, 255));
        btnHistory.setText("History");
        pnlButtons.add(btnHistory);

        btnSalesMonitoring.setBackground(new java.awt.Color(1, 50, 67));
        btnSalesMonitoring.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        btnSalesMonitoring.setForeground(new java.awt.Color(255, 255, 255));
        btnSalesMonitoring.setText("Sales Monitoring");
        pnlButtons.add(btnSalesMonitoring);

        btnUserLogbook.setBackground(new java.awt.Color(1, 50, 67));
        btnUserLogbook.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        btnUserLogbook.setForeground(new java.awt.Color(255, 255, 255));
        btnUserLogbook.setText("User Logbook");
        pnlButtons.add(btnUserLogbook);

        btnAccounts.setBackground(new java.awt.Color(1, 50, 67));
        btnAccounts.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        btnAccounts.setForeground(new java.awt.Color(255, 255, 255));
        btnAccounts.setText("Accounts");
        pnlButtons.add(btnAccounts);

        btnFeedback.setBackground(new java.awt.Color(1, 50, 67));
        btnFeedback.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        btnFeedback.setForeground(new java.awt.Color(255, 255, 255));
        btnFeedback.setText("Feedback");
        pnlButtons.add(btnFeedback);

        getContentPane().add(pnlButtons);
        pnlButtons.setBounds(10, 10, 200, 630);

        pnlContent.setBackground(new java.awt.Color(255, 153, 51));
        pnlContent.setOpaque(false);
        getContentPane().add(pnlContent);
        pnlContent.setBounds(220, 10, 700, 610);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/Fast-Facts-about-PUP.jpg"))); // NOI18N
        lblBackground.setMinimumSize(new java.awt.Dimension(1000, 760));
        getContentPane().add(lblBackground);
        lblBackground.setBounds(-40, -80, 1670, 900);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventoryActionPerformed

    }//GEN-LAST:event_btnInventoryActionPerformed

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
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnInventory;
    private javax.swing.JButton btnSalesMonitoring;
    private javax.swing.JButton btnUserLogbook;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JPanel pnlContent;
    // End of variables declaration//GEN-END:variables
}
