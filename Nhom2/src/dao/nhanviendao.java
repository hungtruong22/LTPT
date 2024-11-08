/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.nhanvien;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class nhanviendao {
    public ArrayList<nhanvien> getNV(){
        try {
                ArrayList<nhanvien> ds = new ArrayList<nhanvien>();
                KetNoi kn = new KetNoi();
                kn.KetNoi();
                //b1: Tạo câu lệnh sql
                String sql = "select * from nhanvien";
                //b2: Tạo câu lệnh
                PreparedStatement cmd = kn.cn.prepareStatement(sql);
                //b3: Thực hiện câu lệnh
                ResultSet rs = cmd.executeQuery();
                //b4: Duyệt qua rs
                while(rs.next()){
                    String manv = rs.getString("manv");
                    String hoten = rs.getString("hoten");
                    boolean gioitinh = rs.getBoolean("gioitinh");
                    Date ngaysinh = rs.getDate("ngaysinh");
                    float hsl = rs.getFloat("hsl");
                    String madv = rs.getString("madv");
                    ds.add(new nhanvien(manv, hoten, gioitinh, ngaysinh, hsl, madv));
                }
                    rs.close();
                    kn.cn.close();
                    return ds;
                    
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
    }
    
    public ArrayList<nhanvien> getNVbyMaDv(String mdv){
        try {
                ArrayList<nhanvien> ds = new ArrayList<nhanvien>();
                KetNoi kn = new KetNoi();
                kn.KetNoi();
                String sql = "select * \n" +
                            "from nhanvien\n" +
                            "where nhanvien.madv = ?";
                PreparedStatement cmd = null;
    		cmd = kn.cn.prepareStatement(sql);
    		cmd.setString(1, mdv);		
    		ResultSet rs = cmd.executeQuery();
                while(rs.next()){
                    String manv = rs.getString("manv");
                    String hoten = rs.getString("hoten");
                    boolean gioitinh = rs.getBoolean("gioitinh");
                    Date ngaysinh = rs.getDate("ngaysinh");
                    float hsl = rs.getFloat("hsl");
                    String madv = rs.getString("madv");
                    ds.add(new nhanvien(manv, hoten, gioitinh, ngaysinh, hsl, madv));
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
