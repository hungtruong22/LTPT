
import test.Nhanvienbean;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class testWSClient {
    public static void main(String[] args) {
        System.out.println("Tich: " + tich(4, 5));
        System.out.println(hello("haha"));
        for(Nhanvienbean nv : getNV()){
            System.out.println(nv.getManv() + ": " + nv.getHoten());
        }
    }

    private static int tich(int a, int b) {
        test.Dichvu_Service service = new test.Dichvu_Service();
        test.Dichvu port = service.getDichvuPort();
        return port.tich(a, b);
    }

    private static String hello(java.lang.String name) {
        test.Dichvu_Service service = new test.Dichvu_Service();
        test.Dichvu port = service.getDichvuPort();
        return port.hello(name);
    }

    private static java.util.List<test.Nhanvienbean> getNV() {
        test.Dichvu_Service service = new test.Dichvu_Service();
        test.Dichvu port = service.getDichvuPort();
        return port.getNV();
    }
    
    
}
