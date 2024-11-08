/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.hienthi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class hienthidao {
    public ArrayList<hienthi> HThi(String mlop){
        try {
                ArrayList<hienthi> ds = new ArrayList<hienthi>();
                KetNoi kn = new KetNoi();
                kn.KetNoi();
                String sql = "select lop.tenlop, lop.phonghoc, sinhvien.malop, sinhvien.masv, sinhvien.hoten, sinhvien.diachi, sinhvien.gioitinh, sinhvien.matkhau\n" +
                                "from lop join sinhvien\n" +
                                "on lop.malop = sinhvien.malop\n" +
                                "where sinhvien.malop = ?";
                PreparedStatement cmd = null;
    		cmd = kn.cn.prepareStatement(sql);
    		cmd.setString(1, mlop);		
    		ResultSet rs = cmd.executeQuery();
                while(rs.next()){
                    String tenlop = rs.getString(1);
                    String phonghoc = rs.getString(2);
                    String malop = rs.getString(3);
                    String masv = rs.getString(4);
                    String hoten = rs.getString(5);
                    String diachi = rs.getString(6);
                    Boolean gioitinh = rs.getBoolean(7);
                    String matkhau = rs.getString(8);
                    
                    
                    ds.add(new hienthi(malop, tenlop, phonghoc, masv, hoten, diachi, gioitinh, matkhau));
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
