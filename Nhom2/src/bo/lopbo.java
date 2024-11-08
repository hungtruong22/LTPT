/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import bean.lop;
import dao.lopdao;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class lopbo {
    lopdao ldao = new lopdao();
    ArrayList<lop> ds;
    
    public ArrayList<lop> getLop(){
        return ldao.getLop();
    }
    public ArrayList<lop> getLopbyMaLop(String mlop){
        return ldao.getLopbyMaLop(mlop);
    }
}
