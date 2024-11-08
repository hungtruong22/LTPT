/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import bean.hienthi;
import dao.hienthidao;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class hienthibo {
    hienthidao htdao = new hienthidao();
    ArrayList<hienthi> ds;
    
     public ArrayList<hienthi> HThi(String mlop){
         return htdao.HThi(mlop);
     }
    public static void main(String[] args) {
            hienthibo nvbo = new hienthibo();
            System.out.println(nvbo.HThi("lop05"));
            if(nvbo.HThi("lop05").isEmpty()){
                System.out.println("chuan luon");            }
            else{
                System.out.println("ahihi");
            }
	}
}
