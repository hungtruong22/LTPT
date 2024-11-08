/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parentchildtest;

import com.sun.org.apache.bcel.internal.generic.SWITCH;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class test {
    public static void main(String[] args) {
        boolean gioitinh = true;
        String result = (gioitinh == true) ? "Nam" : "Nữ";
        System.out.println("Kết quả: " + result);
        
        if(gioitinh == true){
            System.out.println("Nam");
        }
        else{
            System.out.println("Nữ");
        }
        
        
        Scanner sc = new Scanner(System.in);
    int thang = sc.nextInt();
    
    switch (thang) {
    case 1:
      System.out.println("January");
      break;
    case 2:
      System.out.println("February");
      break;
    case 3:
      System.out.println("March");
      break;
    case 4:
      System.out.println("April");
      break;
    case 5:
      System.out.println("May");
      break;
    case 6:
      System.out.println("June");
      break;
    case 7:
      System.out.println("July");
      break;
    case 8:
      System.out.println("August");
      break;
    case 9:
      System.out.println("September");
      break;
    case 10:
      System.out.println("October");
      break;
    case 11:
      System.out.println("November");
      break;
    case 12:
      System.out.println("December");
      break;
    default:
      System.out.println("Error");
      break;
    }        
        
        
    }
}
    
    
