package com.company;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
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
}
