/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn;

import bean.hienthi;
import bean.nhanvien;
import bean.sinhvien;
import bo.hienthibo;
import bo.nhanvienbo;
import bo.sinhvienbo;
import btvn.GuiNhantt;
import btvn.FrmServer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.handler.MessageContext;

/**
 *
 * @author Admin
 */
public class FrmServer extends javax.swing.JFrame {
    public class TuyenNhan extends Thread{
        long gt(int n) {
            long s = 1;
            for (int i = 1; i <= n; i++)
                s *= i;
                return s;
        }
        long C(int k, int n) {
            return  gt(n) / (gt(k)*gt(n - k));
        }
        public void run(){
            try {
                while(true){
                    String st = gn.Nhan();
                    String[] tam = st.split("[:]");
                    String ipClient = tam[0];
                    String cp = tam[1];
                    if(cp.equals("/tm")){
                        gn.Gui("Mon hoc he phan tan", ipClient, 1261);
                    }
                    if(cp.equals("/ht")){
                        String tm = InetAddress.getLocalHost().getHostName();
                        gn.Gui("Truong Minh Hung", ipClient, 1261);
                        gn.Gui("ten may Server: " + tm, ipClient, 1261);
                    }
                    if(cp.contains("/+;")){
                        try {
                            String[] tach = cp.split("[;]");
                            ArrayList<String> dsnum = new ArrayList<String>(Arrays.asList(tach));
                            dsnum.remove(0);
                            int sum = 0;
                            int max = Integer.parseInt(dsnum.get(0));
                            int min = 10000;
                            int count = 0;
                            for(int i = 0 ; i < dsnum.size(); i++){
                                sum += Integer.parseInt(dsnum.get(i));
                                if(Integer.parseInt(dsnum.get(i)) >= max){
                                    max = Integer.parseInt(dsnum.get(i));
                                }
                                if(Long.parseLong(dsnum.get(i))< min){
                                    min = Integer.parseInt(dsnum.get(i));
                                }
                                count++;
                            }
                            //tach = dsnum.toArray(new String[0]);
                            gn.Gui("-Tong: " + String.valueOf(sum), ipClient, 1261);
                            gn.Gui("-So lon nhat: " + String.valueOf(max), ipClient, 1261);
                            gn.Gui("-So nho nhat: " + String.valueOf(min), ipClient, 1261);
                            gn.Gui("-So chu so Client gui len: " + String.valueOf(count), ipClient, 1261);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    if(cp.equals("/xskt")){
                        gn.Gui("Ket qua so so kien thiet", ipClient, 1261);
                    }
                    if(cp.equals("/kqxs")){
                        try {
                            //Mo file danhsach.txt ra de doc
                            FileReader f= new FileReader("C:\\Users\\Admin\\OneDrive\\Desktop\\kqxs.txt");
                            //Doc toan bo noi dung file vao bo dem
                            BufferedReader r = new BufferedReader(f);
                            //Duyet bo dem de lay du lieu ra
                            while(true) {
                             String doc= r.readLine();
                             if(doc==null||doc=="")
                                 break;
                                gn.Gui("File " + doc, ipClient, 1261);
                            }
                            r.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    if(cp.contains("/C;")){
                        String[] tach = cp.split("[;]");
                        ArrayList<String> ds = new ArrayList<String>(Arrays.asList(tach));
                        long tohop = 0;
                        int k = Integer.parseInt(ds.get(1));
                        int n = Integer.parseInt(ds.get(2));
                        tohop = C(k,n);
                        gn.Gui("Ket qua To hop C(" 
                                + String.valueOf(k) + ","
                                + String.valueOf(n) + ") la: "
                                + String.valueOf(tohop), ipClient, 1261);
                    }
                    if(cp.equals("/notepad")){
                        try {
                            gn.Gui("Dang mo Notepad", ipClient, 1261);
                            Runtime r = Runtime.getRuntime();
                            r.exec("notepad");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    if(cp.equals("/excel")){
                        try {
                            gn.Gui("Dang mo Excel", ipClient, 1261);
                            Runtime r = Runtime.getRuntime();
                            r.exec("\"C:\\Program Files (x86)\\Microsoft Office\\root\\Office16\\EXCEL.EXE\"");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    if(cp.equals("/camera")){
                        try {
                            gn.Gui("Dang mo Camera", ipClient, 1261);
                            Runtime r = Runtime.getRuntime();
                            r.exec("camera -c -t 0");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    if(cp.contains("dv;")){
                        try {
                            nhanvienbo nvbo = new nhanvienbo();
                            String[] tach = cp.split("[;]");
                            ArrayList<String> ds = new ArrayList<String>(Arrays.asList(tach));
                            String noichuoi = ds.get(0) + ds.get(1);
                            ArrayList<nhanvien> dsnv = nvbo.getNVbyMaDv(noichuoi);
                            for(nhanvien nv : dsnv){
                                gn.Gui(nv.getManv() + "," + nv.getHoten() + "," 
                                        +nv.isGioitinh() + "," + nv.getNgaysinh() + ","
                                        +nv.getHsl() + "," + nv.getMadv() + ";", ipClient, 1261);
                              
                            }
//                    gn.Gui(String.valueOf(dsnv), ipClient, 1261);                           
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                   
                    
                    if(cp.equals("clearTB")){
                        gn.Gui("Dang xoa TB", ipClient, 1261);
                    }
                    
                    if(cp.equals("/quit")){
                        Frmyeucau f = new Frmyeucau();
			f.setVisible(true);
                        gn.Gui("Da thoat chuong trinh", ipClient, 1261);
                    }
                    if(cp.equals("/shutdown")){
                        try {
                            int second = 2000;
                            Runtime r = Runtime.getRuntime();
                            gn.Gui("May tinh se tat sau " + second + " giây", ipClient, 1261);
                            Thread.sleep(second);
                            r.exec("shutdown -s -t 0");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
  
//baiktra                  
                    if(cp.contains("/ds;")){
                        try {
                            hienthibo ht = new hienthibo();
                            String[] tach = cp.split("[;]");
                            ArrayList<String> ds = new ArrayList<String>(Arrays.asList(tach));
                            //String noichuoi = ds.get(0) + ds.get(1);
                            ArrayList<hienthi> dssv = ht.HThi(ds.get(1));
                            if(dssv.isEmpty()){
                                gn.Gui("Khong co du lieu", ipClient, 1261);
                            }
                            else{
                            for(hienthi sv : dssv){
                                gn.Gui(sv.getTenlop() + "," + sv.getPhonghoc() + "," 
                                        +sv.getMasv() + "," + sv.getHoten() + ","
                                        +sv.getDiachi() + "," + sv.getGioitinh() + "," + sv.getMalop()
                                        + "," + sv.getMatkhau() +";", ipClient, 1261);
//                                gn.Gui(String.valueOf(sv), ipClient, 1261); 
                            }
                            }
                            
//                            gn.Gui(String.valueOf(ds.get(1)), ipClient, 1261);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    list1.add(st);
                    
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * Creates new form FrmServer
     */
    public FrmServer() {
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

        txtPort = new javax.swing.JTextField();
        list1 = new java.awt.List();
        txtSend = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIp = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Server");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtPort.setText("1261");
        txtPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPortActionPerformed(evt);
            }
        });

        txtSend.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSendKeyPressed(evt);
            }
        });

        jLabel1.setText("IP Server");

        jLabel2.setText("Port");

        txtIp.setText("127.0.0.2");
        txtIp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIpActionPerformed(evt);
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
                    .addComponent(jLabel2))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSend, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                    .addComponent(list1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIp, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                    .addComponent(txtPort))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(txtSend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPortActionPerformed

    private void txtIpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIpActionPerformed
GuiNhantt gn = new GuiNhantt();
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try {
            gn.MoCong(1260);
            new FrmServer.TuyenNhan().start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowOpened

    private void txtSendKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSendKeyPressed
        // TODO add your handling code here:
        try {
            if(evt.getKeyCode() == 10){
                // Lấy ip máy client
                String ipclient = InetAddress.getLocalHost().getHostAddress();
                // Dữ liệu gửi đi
                String data = ipclient + ":" + txtSend.getText();
                // Gửi dữ liệu
                gn.Gui(data, txtIp.getText(), Integer.parseInt(txtPort.getText()));
                txtSend.setText("");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtSendKeyPressed

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
            java.util.logging.Logger.getLogger(FrmServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmServer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private java.awt.List list1;
    private javax.swing.JTextField txtIp;
    private javax.swing.JTextField txtPort;
    private javax.swing.JTextField txtSend;
    // End of variables declaration//GEN-END:variables
}
