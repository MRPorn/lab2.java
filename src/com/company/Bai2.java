package com.company;

import java.util.Scanner;

import java.lang.Math;

public class Bai2 {
    public static void main(String[] args) {
        // Bài 2
        Scanner sc = new Scanner(System.in);
        double a, b, c, d, x1, x2;
        System.out.println("Giải phương trình bậc hai.");

        System.out.print("Nhập hệ số bậc hai: ");
        a = sc.nextDouble();

        System.out.print("Nhập hệ số bậc nhất: ");
        b = sc.nextDouble();

        System.out.print("Nhập hằng số: ");
        c = sc.nextDouble();

        // Tính detal
        d = Math.pow(b, 2) - 4 * a * c;

        if (d == 0) {
            x1 = (-b) / 2 * a;
            System.out.printf("Phương trình có nghiệm kép x1 = x2 = %.2f \n", x1);
        } else if (d < 0) {
            System.out.println("Phương trình vô nghiệm.");
        } else {
            x1 = (-b + Math.sqrt(d)) / 2 * a;
            x2 = (-b - Math.sqrt(d)) / 2 * a;
            System.out.printf("Phương trình có hai nghiệm phân biệt x1 = %.2f và x2 = %.2f \n", x1, x2);
        }

    }
}
