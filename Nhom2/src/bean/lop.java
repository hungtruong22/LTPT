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
public class lop {
    private String malop;
    private String tenlop;
    private String phonghoc;

    public lop(String malop, String tenlop, String phonghoc) {
        this.malop = malop;
        this.tenlop = tenlop;
        this.phonghoc = phonghoc;
    }

    public lop() {
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

    @Override
    public String toString() {
        return "lop{" + "malop=" + malop + ", tenlop=" + tenlop + ", phonghoc=" + phonghoc + '}';
    }
    
}
