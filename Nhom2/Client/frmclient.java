
import java.rmi.Naming;
import java.rmi.server.UnicastRemoteObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class frmclient extends javax.swing.JFrame {

    /**
     * Creates new form frmclient
     */
    ITinhToan tt;
    public frmclient() {
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

        txta = new javax.swing.JTextField();
        txtb = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtkq = new javax.swing.JTextField();
        btncong = new javax.swing.JButton();
        btntru = new javax.swing.JButton();
        btnnhan = new javax.swing.JButton();
        btnchia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("so thu nhat: ");

        jLabel2.setText("so thu hai:");

        jLabel3.setText("ket qua:");

        btncong.setText("Cong");
        btncong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncongActionPerformed(evt);
            }
        });

        btntru.setText("Tru");
        btntru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntruActionPerformed(evt);
            }
        });

        btnnhan.setText("Nhan");
        btnnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnhanActionPerformed(evt);
            }
        });

        btnchia.setText("Chia");
        btnchia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txta)
                            .addComponent(txtb)
                            .addComponent(txtkq, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(btncong)
                        .addGap(62, 62, 62)
                        .addComponent(btntru)
                        .addGap(76, 76, 76)
                        .addComponent(btnnhan)
                        .addGap(69, 69, 69)
                        .addComponent(btnchia)))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtkq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncong)
                    .addComponent(btntru)
                    .addComponent(btnnhan)
                    .addComponent(btnchia))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
//            TinhToan tt = new TinhToan();
//            //Quang ba doi tuong tt de may khach co the goi phuong thuc trong tt
//            UnicastRemoteObject.exportObject(tt);
//            //Dang ky 1 dia chi de may khach truy cap vao doi tuong tt
//            Naming.bind("rmi://10.10.66.24/TinhToan",tt);
//            System.out.print("Da cho may khach goi den:\n");
 tt= (ITinhToan)Naming.lookup("rmi://10.10.64.43/TinhToan");
            System.out.println(txtkq);
        
        } catch (Exception e) {
            System.out.print(e);    
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void btncongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncongActionPerformed
        // TODO add your handling code here:
        try {
            int a = Integer.parseInt(txta.getText());
        int b = Integer.parseInt(txtb.getText());
        txtkq.setText(String.valueOf( tt.Cong(a, b)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btncongActionPerformed

    private void btntruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntruActionPerformed
        // TODO add your handling code here:
        int a = Integer.parseInt(txta.getText());
        int b = Integer.parseInt(txtb.getText());
        int hieu = a-b;
        txtkq.setText(String.valueOf(hieu));
       
    }//GEN-LAST:event_btntruActionPerformed

    private void btnnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnhanActionPerformed
        int a = Integer.parseInt(txta.getText());
        int b = Integer.parseInt(txtb.getText());
        int tich = a*b;
        txtkq.setText(String.valueOf(tich));
        
    }//GEN-LAST:event_btnnhanActionPerformed

    private void btnchiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchiaActionPerformed
        int a = Integer.parseInt(txta.getText());
        int b = Integer.parseInt(txtb.getText());
        int thuong = a/b;
        txtkq.setText(String.valueOf(thuong));
        
    }//GEN-LAST:event_btnchiaActionPerformed

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
            java.util.logging.Logger.getLogger(frmclient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmclient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmclient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmclient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmclient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnchia;
    private javax.swing.JButton btncong;
    private javax.swing.JButton btnnhan;
    private javax.swing.JButton btntru;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txta;
    private javax.swing.JTextField txtb;
    private javax.swing.JTextField txtkq;
    // End of variables declaration//GEN-END:variables
}
