/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import bean.sinhvien;
import dao.sinhviendao;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class sinhvienbo {
    sinhviendao  svdao = new sinhviendao();
    ArrayList<sinhvien> ds;
    
    public ArrayList<sinhvien> getSVbyMaLop(String mlop){
        return svdao.getSVbyMaLop(mlop);
    } 
    
    public ArrayList<sinhvien> getSV(){
        return svdao.getSV();
    }
    
    public static void main(String[] args) {
            sinhvienbo svbo = new sinhvienbo();
            System.out.println(svbo.getSV());
	}
}
