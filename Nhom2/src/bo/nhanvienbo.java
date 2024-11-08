/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import bean.nhanvien;
import dao.nhanviendao;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class nhanvienbo {
    nhanviendao nvdao = new nhanviendao();
	ArrayList<nhanvien> ds;
	public ArrayList<nhanvien> getNV() {
		ds = nvdao.getNV();
		return ds;
	}
        
        public ArrayList<nhanvien> getNVbyMaDv(String mdv){
            return nvdao.getNVbyMaDv(mdv);
        }
        
        
        
	public static void main(String[] args) {
            nhanvienbo nvbo = new nhanvienbo();
            System.out.println(nvbo.getNVbyMaDv("dv01"));
	}
}
