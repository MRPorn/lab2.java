package com.company;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
	// Bài 1
        Scanner sc = new Scanner(System.in);
        double a,b,x;
        System.out.println("Giải phuong trình bậc nhất.");
        System.out.println("Phương trình bậc nhất có dạng: ax+b=0");
        System.out.print("Nhập hệ số a: ");
        a= sc.nextDouble();
        System.out.print("Nhập hệ số b: ");
        b= sc.nextDouble();
        if (a == 0 & b == 0) {
            System.out.println("Phương trình vô số nghiệm");
        } else if (a == 0 & b!=0) {
            System.out.println("Phương trình vô nghiệm");
        } else {
            x=(0-b)/a;
            System.out.printf("Phương trình có nghiệm là: %.2f \n", x);
        }
    }
}
