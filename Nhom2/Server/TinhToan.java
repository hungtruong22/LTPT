/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Admin
 */
public class TinhToan implements ITinhToan{

    @Override
    public int Cong(int a, int b) throws Exception {
        int s = a+b;
        System.out.println("Tong: " + s);
        return s;
    }

    @Override
    public int Tru(int a, int b) throws Exception {
        int s = a-b;
        System.out.print("Hieu: " + s);
        return s;
    }
    
}
