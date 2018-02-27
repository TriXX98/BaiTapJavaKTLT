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
public class Clerk extends Person {

    Scanner input = new Scanner(System.in);
    List<Clerk> listC = new ArrayList<Clerk>();

    private String job;
    private String room;

    public Clerk() {
        String choice;
        nhapInfo();
        do {
            System.out.println("Bạn có muốn nhâp thêm Nhân viên (Y/N)? ");
            choice = input.nextLine();
            if (choice.toUpperCase().equals("Y")) {
                nhapInfo();
            } else if (choice.toUpperCase().equals("N")) {
                printInfo();
                break;
            }

        } while (true);
    }

    public Clerk(String job, String room, String name, String birthday, String gioiTinh) {
        super(name, birthday, gioiTinh);
        this.job = job;
        this.room = room;
    }

    public Clerk(String job, String room) {
        this.job = job;
        this.room = room;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public void nhapInfo() {
        super.nhapInfo(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Nhập công việc: ");
        String job = input.nextLine();
        System.out.println("Nhập phòng làm việc: ");
        String room = input.nextLine();
        Clerk c = new Clerk(job, room);
        listC.add(c);
    }

    @Override
    public void printInfo() {
        super.printInfo(); //To change body of generated methods, choose Tools | Templates.
        for (Clerk clerk : listC) {
            System.out.println("+--------------------+");
            System.out.println("Công việc là: " + clerk.job);
            System.out.println("Phòng làm việc: " + clerk.room);
            System.out.println("======================");
        }
    }

}
