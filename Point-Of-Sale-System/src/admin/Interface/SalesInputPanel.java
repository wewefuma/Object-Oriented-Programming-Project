/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.Interface;

import java.awt.Dimension;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Nania Bznz
 */
public class SalesInputPanel extends javax.swing.JPanel {

    /**
     * Creates new form SalesInputPanel
     */
    
    
    public SalesInputPanel() {
        
        initComponents();
        
    }
    
    public void refreshtbl() {
		DefaultTableModel model = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                  return false;
                }
};
		model.addColumn("ID");
		model.addColumn("Product");
		model.addColumn("Price");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pnr_db", "pnr_app",
					"password123");

			String query = "select serial_number, status, assigned_station_id from machine";
			java.sql.Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				model.addRow(new Object[] { rs.getString("serial_number"), 
                                    rs.getString("status"), rs.getString("assigned_station_id") });
			}

			rs.close();
			stmt.close();
			con.close();

			tblMenuTable.setModel(model);
		} catch (Exception e) {
			// JOptionPane.showMessageDialog(null, e.printStackTrace());
			e.printStackTrace();
		}
	}
    
    public void AddToBag(){
        int intQty = Integer.parseInt(JOptionPane.showInputDialog("Enter Qty: "));
        
    }
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnlProdMenuPanel = new javax.swing.JPanel();
        scpMenuTable = new javax.swing.JScrollPane();
        tblMenuTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        pnlCheckoutpanel = new javax.swing.JPanel();
        btnBag = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        scpBag = new javax.swing.JScrollPane();
        tblBag = new javax.swing.JTable();
        btnCheckout = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(700, 610));

        tblMenuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Product", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Float.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMenuTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMenuTableMouseClicked(evt);
            }
        });
        scpMenuTable.setViewportView(tblMenuTable);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sales Input");

        javax.swing.GroupLayout pnlProdMenuPanelLayout = new javax.swing.GroupLayout(pnlProdMenuPanel);
        pnlProdMenuPanel.setLayout(pnlProdMenuPanelLayout);
        pnlProdMenuPanelLayout.setHorizontalGroup(
            pnlProdMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProdMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlProdMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProdMenuPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(scpMenuTable, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlProdMenuPanelLayout.setVerticalGroup(
            pnlProdMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProdMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scpMenuTable)
                .addGap(27, 27, 27))
        );

        pnlCheckoutpanel.setLayout(new java.awt.GridBagLayout());

        btnBag.setText("Bag");
        btnBag.setMaximumSize(new java.awt.Dimension(81, 22));
        btnBag.setMinimumSize(new java.awt.Dimension(81, 22));
        btnBag.setPreferredSize(new java.awt.Dimension(81, 22));
        btnBag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBagActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 225;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 6);
        pnlCheckoutpanel.add(btnBag, gridBagConstraints);

        lblTotal.setText("Total: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 265;
        gridBagConstraints.ipady = 28;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 6);
        pnlCheckoutpanel.add(lblTotal, gridBagConstraints);

        tblBag.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Qty", "Product", "Unit Price", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scpBag.setViewportView(tblBag);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 287;
        gridBagConstraints.ipady = 263;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(16, 0, 0, 6);
        pnlCheckoutpanel.add(scpBag, gridBagConstraints);

        btnCheckout.setText("Checkout");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 222;
        gridBagConstraints.ipady = 36;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 26, 6);
        pnlCheckoutpanel.add(btnCheckout, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlProdMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlCheckoutpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlProdMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlCheckoutpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBagActionPerformed
        // TODO add your handling code here:
        SalesInputDialog dialog = new SalesInputDialog(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_btnBagActionPerformed

    private void tblMenuTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMenuTableMouseClicked
        // TODO add your handling code here:
        AddToBag();
    }//GEN-LAST:event_tblMenuTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBag;
    private javax.swing.JButton btnCheckout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pnlCheckoutpanel;
    private javax.swing.JPanel pnlProdMenuPanel;
    private javax.swing.JScrollPane scpBag;
    private javax.swing.JScrollPane scpMenuTable;
    private javax.swing.JTable tblBag;
    private javax.swing.JTable tblMenuTable;
    // End of variables declaration//GEN-END:variables
}
