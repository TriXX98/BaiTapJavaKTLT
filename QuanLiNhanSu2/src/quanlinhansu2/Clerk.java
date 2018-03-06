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
public class Clerk extends Person {

    private String job;
    private String room;

    public Clerk() {
    }

    public Clerk(String job, String room, String name, String birthday, String gioiTinh) {
        super(name, birthday, gioiTinh);
        this.job = job;
        this.room = room;
    }

    @Override
    public void nhap() throws IOException {
        super.nhap(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Nhập công việc: ");
        job = new Scanner(System.in).nextLine();
        System.out.println("Nhập số phòng: ");
        room = new Scanner(System.in).nextLine();
        
    }

    @Override
    public void printInfo() {
        super.printInfo(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Công việc: "+job);
        System.out.println("Số phòng: "+room);
    }
    

}
