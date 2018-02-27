/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hinhhoc;

import java.util.Scanner;

/**
 *
 * @author tritu
 */
public class HinhHoc {

    public HinhHoc() {
        showMenu();
    }

    private void showMenu() {

        int choice;
        do {
            System.out.println("+====XỬ LÍ HÌNH HỌC====+");
            System.out.println("1. Xử lí hình vuông");
            System.out.println("2. Xử lí hình chữ nhật");
            System.out.println("3. Kết thúc chương trình");
            System.out.println("Mời bạn nhập lựa chọn: ");
            choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1: new Square();
                    break;
                case 2: new Rectangle();
                    break;

                case 3: System.exit(0);
                    break;

            }
        } while (choice != 3);

    }

}
