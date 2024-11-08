/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class frmbt1 extends javax.swing.JFrame {

    
    //Khai báo các biến toàn cục
    long s1=0,s2=0,s=0; 
    boolean kt1=false,kt2=false;
    //Tạo lớp tuyến đoạn chúng
    public class Tuyen extends Thread{
        int td; //lưu tuyến đoạn thứ mấy
        int[] a; //Mảng a cần tính tổng
        public Tuyen(int td, int[] a){ //Tạo hàm tạo
           this.td=td;
           this.a=a;
        }

        public void run(){
            if(td==1){//nếu là tuyến 1
                int n=a.length; 
		//Tính nữa mảng đầu
                for(int i=0;i<n/2;i++)
                    s1=s1+a[i];
                    kt1=true;
                    System.out.println("T1: " + s1);
            }
            if(td==2){//nếu là tuyến 2
                int n=a.length; 
		//Tính nữa mảng sau
                for(int i=n/2;i<n;i++)
                    s2=s2+a[i];
                    kt2=true;
                    System.out.println("T2: " + s2);
            }
            if(td==3){
                while(true){
                 System.out.println("Doi em .....");
                    if(kt1==true && kt2 == true){
                        System.out.println("Tổng là: " +(s1+s2));
                        break;
                    }
                }
            }
        }
    }

    /**
     * Creates new form frmbt1
     */
    public frmbt1() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnhapmang = new javax.swing.JTextField();
        txtkq1 = new javax.swing.JTextField();
        txtkq2 = new javax.swing.JTextField();
        txttong = new javax.swing.JTextField();
        btnTinh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Nhập vào một mảng");

        jLabel2.setText("Kết quả của tuyến đoạn 1");

        jLabel3.setText("Kết quả của tuyến đoạn 2");

        jLabel4.setText("Tổng các phần tử");

        txtnhapmang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnhapmangActionPerformed(evt);
            }
        });

        txtkq1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkq1ActionPerformed(evt);
            }
        });

        txtkq2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkq2ActionPerformed(evt);
            }
        });

        txttong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttongActionPerformed(evt);
            }
        });

        btnTinh.setText("Tính");
        btnTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTinhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTinh)
                    .addComponent(txtnhapmang)
                    .addComponent(txtkq1)
                    .addComponent(txtkq2)
                    .addComponent(txttong, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnhapmang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtkq1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtkq2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txttong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btnTinh)
                .addContainerGap(208, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnhapmangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnhapmangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnhapmangActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Đây là bài tập 1");
    }//GEN-LAST:event_formWindowOpened

    private void txtkq1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkq1ActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_txtkq1ActionPerformed

    private void txtkq2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkq2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtkq2ActionPerformed

    private void btnTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTinhActionPerformed
        // TODO add your handling code here:
        String st=txtnhapmang.getText();//Lấy giá trị của mảng nhập ở txtnhapmang
        String[] ds=st.split("[;]"); // tách phần tử trong chuỗi st sau mỗi dấu ;
        System.out.println("ds" + ds);
        int n = ds.length; // lấy độ dài của mảng ds
        // khai báo mảng số nguyên
        int[] a = new int[ds.length];
        // đổi mảng chuỗi thành mảng số
        for(int i = 0 ; i < n ; i++){
            a[i] = Integer.parseInt(ds[i]);
            System.out.println("a["+i+"] = " + a[i]);
        }
        for (int j = 1 ; j <= 3; j++){
            Tuyen tuyen = new Tuyen(j, a);
            tuyen.start();
            txtkq1.setText(Long.toString(s1));
            txtkq2.setText(Long.toString(s2));
            txttong.setText(Long.toString(s1+s2));
        }
        
    }//GEN-LAST:event_btnTinhActionPerformed

    private void txttongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttongActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txttongActionPerformed

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
            java.util.logging.Logger.getLogger(frmbt1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmbt1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmbt1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmbt1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmbt1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtkq1;
    private javax.swing.JTextField txtkq2;
    private javax.swing.JTextField txtnhapmang;
    private javax.swing.JTextField txttong;
    // End of variables declaration//GEN-END:variables
}