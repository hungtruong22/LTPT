/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhcsdl;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Admin
 */
public class KetNoi {
    public static Connection cn;
    public void KetNoi() throws Exception{
        //b1: Xác định HQTCSDL
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        //b2: Kết Nối
        String url = "jdbc:sqlserver://DESKTOP-RQV86U4:1433;databaseName=admin;user=sa;password=truongminhhung";
        cn = DriverManager.getConnection(url);
        System.out.println("Da ket noi");
    }
    
    public static void main(String[] args) {
        try {
            KetNoi kn = new KetNoi();
            kn.KetNoi();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
