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
public class Teacher extends Person {

    Scanner input = new Scanner(System.in);
    List<Teacher> listTC = new ArrayList<Teacher>();

    private String major;

    public Teacher() {
        String choice;
        nhapInfo();
        do {
            System.out.println("Bạn có muốn nhâp thêm Giáo viên (Y/N)? ");
            choice = input.nextLine();
            if (choice.toUpperCase().equals("Y")) {
                nhapInfo();
            } else if (choice.toUpperCase().equals("N")) {
                printInfo();
                break;
            }

        } while (true);

    }

    public Teacher(String major, String name, String birthday, String gioiTinh) {
        super(name, birthday, gioiTinh);
        this.major = major;
    }

    public Teacher(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void nhapInfo() {
        super.nhapInfo();
        System.out.println("Nhập chuyên ngành: ");
        String major = input.nextLine();
        Teacher t = new Teacher(major);
        listTC.add(t);
    }

    @Override
    public void printInfo() {

        super.printInfo();
        for (Teacher t : listTC) {
            System.out.println("+--------------------+");
            System.out.println("Chuyên ngành: " + t.getMajor());
            System.out.println("======================");

        }
    }

}
