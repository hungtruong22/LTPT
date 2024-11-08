/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parentchildtest;

/**
 *
 * @author Admin
 */
public class Parent {
    private String ten;
    private String loai;

    public Parent(String ten, String loai) {
        this.ten = ten;
        this.loai = loai;
    }

    public Parent() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }
    void dlp(){
        System.out.println("Cha");
    }
}
