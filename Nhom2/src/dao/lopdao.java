/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.lop;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class lopdao {
    public ArrayList<lop> getLop(){
        try {
                ArrayList<lop> ds = new ArrayList<lop>();
                KetNoi kn = new KetNoi();
                kn.KetNoi();
                //b1: Tạo câu lệnh sql
                String sql = "select * from lop";
                //b2: Tạo câu lệnh
                PreparedStatement cmd = kn.cn.prepareStatement(sql);
                //b3: Thực hiện câu lệnh
                ResultSet rs = cmd.executeQuery();
                //b4: Duyệt qua rs
                while(rs.next()){
                    String malop = rs.getString("malop");
                    String tenlop = rs.getString("tenlop");
                    String phonghooc = rs.getString("phonghoc");
                    ds.add(new lop(malop, tenlop, phonghooc));
                }
                    rs.close();
                    kn.cn.close();
                    return ds;
                    
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
    }  
    
    public ArrayList<lop> getLopbyMaLop(String mlop){
        try {
                ArrayList<lop> ds = new ArrayList<lop>();
                KetNoi kn = new KetNoi();
                kn.KetNoi();
                String sql = "select * from lop\n" +
                    "where lop.malop = ?";
                PreparedStatement cmd = null;
    		cmd = kn.cn.prepareStatement(sql);
    		cmd.setString(1, mlop);		
    		ResultSet rs = cmd.executeQuery();
                while(rs.next()){
                    String malop = rs.getString("malop");
                    String tenlop = rs.getString("tenlop");
                    String phonghooc = rs.getString("phonghoc");
                    ds.add(new lop(malop, tenlop, phonghooc));
                }
                    rs.close();
                    kn.cn.close();
                    return ds;
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
    }
}
