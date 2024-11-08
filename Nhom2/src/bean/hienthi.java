/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Admin
 */
public class hienthi {
    private String malop;
    private String tenlop;
    private String phonghoc;
    private String masv;
    private String hoten;
    private String diachi;
    private Boolean gioitinh;
    private String matkhau;

    public hienthi(String malop, String tenlop, String phonghoc, String masv, String hoten, String diachi, Boolean gioitinh, String matkhau) {
        this.malop = malop;
        this.tenlop = tenlop;
        this.phonghoc = phonghoc;
        this.masv = masv;
        this.hoten = hoten;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
        this.matkhau = matkhau;
    }

    public hienthi() {
    }

    public String getMalop() {
        return malop;
    }

    public void setMalop(String malop) {
        this.malop = malop;
    }

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

    public String getPhonghoc() {
        return phonghoc;
    }

    public void setPhonghoc(String phonghoc) {
        this.phonghoc = phonghoc;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public Boolean getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(Boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    @Override
    public String toString() {
        return "hienthi{" + "malop=" + malop + ", tenlop=" + tenlop + ", phonghoc=" + phonghoc + ", masv=" + masv + ", hoten=" + hoten + ", diachi=" + diachi + ", gioitinh=" + gioitinh + ", matkhau=" + matkhau + '}';
    }
    
}
