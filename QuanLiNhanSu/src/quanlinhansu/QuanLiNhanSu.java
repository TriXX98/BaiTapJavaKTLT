/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlinhansu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author tritu
 */
public class QuanLiNhanSu {

    Scanner input = new Scanner(System.in);
    Person p;

    public QuanLiNhanSu() {
        showMenu();
    }

    private void showMenu() {
        int choice;
        do {
            System.out.println("+====QUẢN LÍ NHÂN SỰ====+");
            System.out.println("1. Xử lí danh sách Giáo viên");
            System.out.println("2. Xử lí danh sách Nhân viên");
            System.out.println("3. Kết thúc chương trình");
            System.out.println("Mời bạn nhập lựa chọn");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    new Teacher();
                    break;
                case 2:
                    new Clerk();
                    break;
                case 3:
                    System.out.println("Thoát");
                    System.exit(0);
                    break;

            }

        } while (true);

    }

}
