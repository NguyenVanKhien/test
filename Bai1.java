/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package phieu1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai1 {
//Kiểm tra 1 số n xem phải là số nguyên tố hay không?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập số n: ");
        int n = sc.nextInt();
        for(int i=2; i<Math.sqrt(n); i++)
            if(n % i == 0) {
                System.out.println(n+" không phải là số nguyên tố");
                return;
            }
        System.out.println(n+" là số nguyên tố");
    }
}
