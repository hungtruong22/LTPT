/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn;

import java.time.LocalDate;

/**
 *
 * @author Admin
 */
public class checkdate extends Thread{
    private LocalDate dateToCheck;

    public checkdate(LocalDate dateToCheck) {
        this.dateToCheck = dateToCheck;
    }

    @Override
    public void run() {
         while (true) {
            LocalDate currentDate = LocalDate.now();

            if (currentDate.equals(dateToCheck)) {
                System.out.println("Đã đến ngày " + dateToCheck + ". Dừng vòng lặp.");
                break; // Dừng vòng lặp khi đến ngày mục tiêu
            }

            System.out.println("Ngày hiện tại: " + currentDate);

            try {
                Thread.sleep(1000); // Dừng 1 giây trước khi kiểm tra lại
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        LocalDate dateToCheck = LocalDate.of(2024, 4, 23); // Thay đổi ngày cần kiểm tra ở đây
        checkdate dateChecker = new checkdate(dateToCheck);

        dateChecker.start();
    }
}
