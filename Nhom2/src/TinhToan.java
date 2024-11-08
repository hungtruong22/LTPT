
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Admin
 */
public class TinhToan extends UnicastRemoteObject implements ITinhToan{
    public TinhToan() throws RemoteException{
        
    }
    
//    @Override
//    public int Cong(int a, int b) throws Exception {
//        int s = a+b;
//        System.out.println("\nTong: " + s);
//        return s;
//    }
//
//    @Override
//    public int Tru(int a, int b) throws Exception {
//        int s = a-b;
//        System.out.print("\nHieu: " + s);
//        return s;
//    }
//
//    @Override
//    public int Nhan(int a, int b) throws Exception {
//        int s = a*b;
//        System.out.println("\nTich: " + s);
//        return s;
//    }
//
//    @Override
//    public int Chia(int a, int b) throws Exception {
//        int s = a/b;
//        System.out.println("\nThuong: " + s);
//        return s;
//    }
//
//    
//    
//    @Override
//    public int[] CongMT(int[] a, int[] b, int len) throws RemoteException {
//        int[] c = new int[len];
//        for(int i = 0 ; i < len; i++){ // Cộng 2 ma trận a và b
//            c[i] = a[i] + b[i];
//        }
//        for(int j = 0; j < len ; j++){ // Hien thi ma tran c
//            System.out.println(c[j]+"");
//        }
//        return c;
//    }
//    
//    public static void main(String [] args) throws RemoteException{
//        int[] a = {1,5,6,2,3};
//        int[] b = {2,6,8,9,7};
//        TinhToan tt = new TinhToan();
//        System.out.println("Tong: " + tt.CongMT(a,b,6));
//    }

    @Override
    public ArrayList<donvibean> getdv() throws Exception {
        ArrayList<donvibean> ds = new ArrayList<donvibean>();
        ds.add(new donvibean("dv1","CNTT"));
        ds.add(new donvibean("dv2","Toan"));
        ds.add(new donvibean("dv3","Ly"));
        return ds; 
    }
}
