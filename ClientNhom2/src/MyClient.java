
import java.rmi.Naming;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class MyClient {
    public static void main(String[] args){
            try {
                    ITinhToan tt= (ITinhToan)Naming.lookup("rmi://localhost:1099/TinhToan");
//                    System.out.print(tt.Cong(10,20) );
//                    System.out.println(tt.Tru(70, 20));
//                    System.out.println(tt.Nhan(10, 20));
//                    System.out.println(tt.Chia(20, 10));
                    for(donvibean dv : tt.getdv()){
                        System.out.println(dv.getMadv() + ": " + dv.getTendv());
                    }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}
