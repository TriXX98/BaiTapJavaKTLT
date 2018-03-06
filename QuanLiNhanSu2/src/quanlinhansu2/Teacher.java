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
public class Teacher extends Person{
    private String major ;
   
    public Teacher() {
    }

    public Teacher(String major, String name, String birthday, String gioiTinh) {
        super(name, birthday, gioiTinh);
        this.major = major;
    }

    @Override
    public void nhap() throws IOException {
        super.nhap(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Nhập chuyên ngành: ");
        major = new Scanner(System.in).nextLine();
    }

    @Override
    public void printInfo() {
        super.printInfo(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Chuyên ngành: " +major);
    }
    
}
