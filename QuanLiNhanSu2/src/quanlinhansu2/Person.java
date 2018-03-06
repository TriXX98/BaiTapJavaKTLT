/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlinhansu2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

/**
 *
 * @author tritu
 */
public class Person {

    private String name;
    private String birthday;
    private String gioiTinh;
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            
    
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
    
    public void nhap() throws IOException{
    
        System.out.println("\tNhập thông tin");
        System.out.println("Nhập họ và tên: ");
        name = input.readLine();
        System.out.println("Nhập ngày tháng năm sinh: ");
        birthday = input.readLine();
        System.out.println("Nhập giới tính: ");
        gioiTinh = input.readLine();
    }
    public void printInfo(){
    
            System.out.println("Họ tên: " + name);
            System.out.println("Tuổi: " +birthday);
            System.out.println("Giới tính: " +gioiTinh);
    }
    
    
}
