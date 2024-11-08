/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.sinhvien;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class sinhviendao {
  public ArrayList<sinhvien> getSVbyMaLop(String mlop){
        try {
                ArrayList<sinhvien> ds = new ArrayList<sinhvien>();
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
                    String masv = rs.getString("masv");
                    String hoten = rs.getString("hoten");
                    String diachi = rs.getString("diachi");
                    Boolean gioitinh = rs.getBoolean("gioitinh");
                    String matkhau = rs.getString("matkhau");
                    String malop = rs.getString("malop");
                    ds.add(new sinhvien(masv, hoten, diachi, gioitinh, matkhau, malop));
                }
                    rs.close();
                    kn.cn.close();
                    return ds;
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
    }

public ArrayList<sinhvien> getSV(){
        try {
                ArrayList<sinhvien> ds = new ArrayList<sinhvien>();
                KetNoi kn = new KetNoi();
                kn.KetNoi();
                //b1: Tạo câu lệnh sql
                String sql = "select * from sinhvien";
                //b2: Tạo câu lệnh
                PreparedStatement cmd = kn.cn.prepareStatement(sql);
                //b3: Thực hiện câu lệnh
                ResultSet rs = cmd.executeQuery();
                //b4: Duyệt qua rs
                while(rs.next()){
                    String masv = rs.getString("masv");
                    String hoten = rs.getString("hoten");
                    String diachi = rs.getString("diachi");
                    Boolean gioitinh = rs.getBoolean("gioitinh");
                    String matkhau = rs.getString("matkhau");
                    String malop = rs.getString("malop");
                    ds.add(new sinhvien(masv, hoten, diachi, gioitinh, matkhau, malop));
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
