/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsinhvien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author tritu
 */
public class QLSinhVien {

    List<SinhVien> list = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    SinhVien sv = new SinhVien();

    public QLSinhVien() {
        showMenu();
    }

    private void addSV() {
        System.out.println("====Nhập thông tin sinh viên====");
        System.out.println("Nhập họ tên: ");
        String name = input.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(input.nextLine());
        System.out.println("Nhập mã sinh viên: ");
        String id = input.nextLine();
        System.out.println("Nhập lớp: ");
        String lop = input.nextLine();
        sv = new SinhVien(name, age, id, lop);
        list.add(sv);

    }

    private void printInfo() {

        System.out.println("====IN DANH SÁCH====");
        System.out.printf("\n+=============================================+");
        System.out.printf("\n|     HỌ VÀ TÊN     | TUỔI |   MÃ SV  |  LỚP  |");
//        for (int i = 0; i < list.size(); i++) {
////            System.out.printf("\n|%-19s|%-6d|%-10s|%-5s|", sv.getName(), sv.getAge(), sv.getId(), sv.getLop());
//            System.out.println(list);
//        }
        for (SinhVien sinhVien : list) {
            System.out.printf("\n|%-19s|%-6d|%-10s|%-5s|", sinhVien.getName(), sinhVien.getAge(), sinhVien.getId(), sinhVien.getLop());
        }
        System.out.printf("\n+=============================================+\n");

    }

    private void foundSV() {
        int found = 0;
        System.out.println("=====TÌM KIẾM =====");
        System.out.println("Nhập tên sinh viên cần tìm: ");
        String name = input.nextLine();
        
        for (SinhVien sinhVien : list) {
            if (sinhVien.getName().equals(name)) {
                printInfo();
                found = 1;

            }
        }
        if (found == 0) {
            System.out.println("Không tìm thấy sinh viên " + name);
        }

    }

    private void showMenu() {
        int choice;
        do {
            System.out.println("===QUẢN LÍ SINH VIÊN===");
            System.out.println("1. Nhập thông tin sinh viên");
            System.out.println("2. In thông tin sinh viên");
            System.out.println("3. Tìm kiếm sinh viên");
            System.out.println("4. Thoát chương trình");
            System.out.println("Mời bạn nhập lựa chọn: ");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    addSV();
                    break;
                case 2:
                    printInfo();
                    break;

                case 3:
                    foundSV();
                    break;

                case 4:
                    System.exit(0);
                    break;

            }
        } while (choice != 4);

    }

}
