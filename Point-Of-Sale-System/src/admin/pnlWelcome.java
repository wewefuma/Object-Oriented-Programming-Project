/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author WorldBank13
 */
public class pnlWelcome extends javax.swing.JPanel {

    /**
     * Creates new form pnlWelcome
     */
    public pnlWelcome() {
        initComponents();
        
        Date objcurrDate = new Date();
        SimpleDateFormat objdateFormat = new SimpleDateFormat("MM/dd/yyyy");
        lblDate.setText(objdateFormat.format(objcurrDate));
        
        CurrentTime();
        
        
        
    }//public pnlWelcome()
    
    
    public void CurrentTime(){
       
        Thread objClock = new Thread(){
            public void run(){
                for(;;){
                    
                    Calendar objCal = new GregorianCalendar();
                    int intsecond = objCal.get(Calendar.SECOND);
                    int intminute = objCal.get(Calendar.MINUTE);
                    int inthour = objCal.get(Calendar.HOUR);
                    lblTime.setText(inthour + ":" + intminute + ":" + intsecond);
        
                    
                    try {
                        sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(pnlWelcome.class.getName()).log(Level.SEVERE, null, ex);
                
                }//catch (InterruptedException ex)
            
                }//for(;;)
                
            }//public void run()}
           
       
        };
        objClock.start();
    }//public void CurrentTime()
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblWelcome = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblTimeTitle = new javax.swing.JLabel();
        lblDateTitle = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(700, 610));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(700, 610));

        lblWelcome.setBackground(new java.awt.Color(1, 50, 67));
        lblWelcome.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome.setText("WELCOME USER!");
        lblWelcome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblWelcome.setOpaque(true);

        lblUserName.setBackground(new java.awt.Color(1, 50, 67));
        lblUserName.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 255, 255));
        lblUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserName.setText("Nita");
        lblUserName.setOpaque(true);

        lblTimeTitle.setBackground(new java.awt.Color(1, 50, 67));
        lblTimeTitle.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblTimeTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTimeTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTimeTitle.setText("Current Time:");
        lblTimeTitle.setOpaque(true);

        lblDateTitle.setBackground(new java.awt.Color(1, 50, 67));
        lblDateTitle.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblDateTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblDateTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDateTitle.setText("Date:");
        lblDateTitle.setOpaque(true);

        lblTime.setBackground(new java.awt.Color(1, 50, 67));
        lblTime.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTime.setMinimumSize(new java.awt.Dimension(178, 42));
        lblTime.setOpaque(true);
        lblTime.setPreferredSize(new java.awt.Dimension(178, 42));

        lblDate.setBackground(new java.awt.Color(1, 50, 67));
        lblDate.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 255, 255));
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDate.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 110, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lblTimeTitle))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblDateTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(lblTimeTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDateTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(54, 54, 54))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDateTitle;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTimeTitle;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblWelcome;
    // End of variables declaration//GEN-END:variables
}//public class pnlWelcome extends javax.swing.JPanel
