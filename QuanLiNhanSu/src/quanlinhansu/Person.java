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
public class Person {

    Scanner input = new Scanner(System.in);
    List<Person> list = new ArrayList<>();
    private String name;
    private String birthday;
    private String gioiTinh;

    public Person() {
    }

    public Person(String name, String birthday, String gioiTinh) {
        this.name = name;
        this.birthday = birthday;
        this.gioiTinh = gioiTinh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void nhapInfo() {
        System.out.println("Nhập họ và tên: ");
        String name = input.nextLine();
        System.out.println("Nhập ngày sinh: ");
        String bir = input.nextLine();
        System.out.println("Nhập giới tính: ");
        String gt = input.nextLine();

        Person p = new Person(name, bir, gt);
        list.add(p);
    }

    public void printInfo() {
        for (Person person : list) {
            System.out.println("+----IN THÔNG TIN----+");
            System.out.println("Họ tên: " + person.name);
            System.out.println("Tuổi: " + person.birthday);
            System.out.println("Giới tính: " + person.gioiTinh);
        }

    }
}
