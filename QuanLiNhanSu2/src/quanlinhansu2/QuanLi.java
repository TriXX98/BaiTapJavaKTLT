/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlinhansu2;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author tritu
 */
public class QuanLi {

    Scanner input = new Scanner(System.in);
    Teacher[] t;
    Clerk[] c;

    public QuanLi() throws IOException {
        showMenu();
    }

    private void showMenu() throws IOException {
        int choice;
        do {
            System.out.println("+====QUẢN LÍ NHÂN SỰ====+");
            System.out.println("1. Xử lí danh sách Giáo viên");
            System.out.println("2. Xử lí danh sách Nhân viên");
            System.out.println("3. Kết thúc chương trình");
            System.out.println("Mời bạn nhập lựa chọn");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập số giáo viên: ");
                    int n = input.nextInt();
                    t = new Teacher[n];
                    for (int i = 0; i < t.length; i++) {
                        System.out.println("Nhập thông tin giáo viên thứ " + (i + 1));
                        t[i] = new Teacher();
                        t[i].nhap();
                    }

                    for (int i = 0; i < t.length; i++) {
                        System.out.println("\t Thông tin giáo viên thứ " + (i + 1));
                        t[i].printInfo();
                    }

                    break;
                case 2:
                    System.out.println("Nhập số nhân viên: ");
                    int m = input.nextInt();
                    c = new Clerk[m];
                    for (int i = 0; i < c.length; i++) {
                        System.out.println("Nhập thông tin nhân viên thứ " + (i + 1));
                        c[i] = new Clerk();
                        c[i].nhap();
                    }
                    for (int i = 0; i < c.length; i++) {
                        System.out.println("\t Thông tin nhân viên thứ " + (i + 1));
                        c[i].printInfo();

                    }

                    break;
                case 3:
                    System.out.println("Thoát");
                    System.exit(0);
                    break;

            }

        } while (true);

    }

}
