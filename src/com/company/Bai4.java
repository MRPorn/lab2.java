package com.company;

import java.util.Scanner;

import java.lang.Math;

public class Bai4 {

public static void menu () {
    Scanner sc = new Scanner(System.in);
    int nhap;
    while (true){
        System.out.print("+------------------------------+\n");
        System.out.print("1. Giải phương trình bậc nhất\n");
        System.out.print("2. Giải phương trình bậc hai\n");
        System.out.print("3. Tính tiền điện\n");
        System.out.print("4. Kiểm tra tháng có bao nhiêu ngày\n");
        System.out.print("0. Kết thúc\n");
        System.out.print("+------------------------------+\n");
        System.out.print("Chọn chức năng: ");
        nhap = Integer.parseInt(sc.nextLine());
        switch (nhap) {
            case 1 ->
                    Bai1();
            case 2 ->
                    Bai2();

            case 3 ->
                    Bai3();

            case 4 ->
                    ngayThang();

            case 0 ->
                    System.exit(0);

            default ->
                    System.out.println("Nhập lỗi");
        }
    }

}

public static void Bai1(){
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

public static void Bai2(){
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

public static void Bai3(){
    Scanner sc = new Scanner(System.in);
    int soDien, thanhTien;
    System.out.print("Nhập số điện tháng này của bạn: ");
    soDien = sc.nextInt();
    while (soDien < 0) {
        System.out.print("Nhập lỗi, vui lòng nhập lại: ");
        soDien = sc.nextInt();
    }
    if (soDien <= 50) {
        thanhTien = soDien * 1000;
        System.out.printf("Tiền điện tháng này của bạn là: %d đồng.\n", thanhTien);
    } else {
        thanhTien = (50 * 1000) + ((soDien - 50) * 1200);
        System.out.printf("Tiền điện tháng này của bạn là: %d đồng.\n", thanhTien);
    }
}

public static int nhapThang(){
    Scanner sc = new Scanner(System.in);
    int thang;
    System.out.print("Mời nhập tháng: ");
    thang = Integer.parseInt(sc.nextLine());
    while (thang<1||thang>12){
        System.out.print("Nhập lỗi vui lòng nhập lại tháng: ");
        thang = Integer.parseInt(sc.nextLine());
    }
    return thang;
}

public static void ngayThang(){
    Scanner sc = new Scanner(System.in);
    int thang = nhapThang();
    if (thang== 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) {
        System.out.printf("Tháng %d có 31 ngày\n",thang);
    } else if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
        System.out.printf("Tháng %d có 30 ngày\n",thang);
    } else if (thang == 2){
        int nam;
        do {
            System.out.print("Nhập năm: ");
            nam = Integer.parseInt(sc.nextLine());
            if (nam<0){
                System.out.println("Nhập lỗi");
            }else if (nam%4==0){
                System.out.printf("tháng %d có 29 ngày\n",thang);
            } else {
                System.out.printf("Tháng %d có 28 ngày\n",thang);
            }
        } while (nam<0);
    }
}


    public static void main(String[] args) {
        menu();
    }
}
