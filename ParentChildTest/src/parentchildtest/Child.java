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
public class Child extends Parent{
    private String bietdanh;

    public String getBietdanh() {
        return bietdanh;
    }

    public void setBietdanh(String bietdanh) {
        this.bietdanh = bietdanh;
    }

    public Child(String bietdanh, String ten, String loai) {
        super(ten, loai);
        this.bietdanh = bietdanh;
    }

    public Child(String bietdanh) {
        this.bietdanh = bietdanh;
    }

    public Child() {
    }
    
    void dlp(){
        System.out.println("Con");
    }
    
}
