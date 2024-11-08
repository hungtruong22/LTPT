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
public class sinhvien {
    private String masv;
    private String hoten;
    private String diachi;
    private Boolean gioitinh;
    private String matkhau;
    private String malop;

    public sinhvien(String masv, String hoten, String diachi, Boolean gioitinh, String matkhau, String malop) {
        this.masv = masv;
        this.hoten = hoten;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
        this.matkhau = matkhau;
        this.malop = malop;
    }

    public sinhvien() {
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

    public String getMalop() {
        return malop;
    }

    public void setMalop(String malop) {
        this.malop = malop;
    }

    @Override
    public String toString() {
        return "sinhvien{" + "masv=" + masv + ", hoten=" + hoten + ", diachi=" + diachi + ", gioitinh=" + gioitinh + ", matkhau=" + matkhau + ", malop=" + malop + '}';
    }
    
    
}
