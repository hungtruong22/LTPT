/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom2;

/**
 *
 * @author Admin
 */
public class test {
    public static boolean isNumeric(String str) {
	return str.matches("-?\\d+(\\.\\d+)?");
    }
    public static void main(String[] args) {
        String ch = "h3456";
        if(isNumeric(ch)){   
            System.out.println("là số");
        }
        else{
            System.out.println("là chữ");
        }
    }
}
