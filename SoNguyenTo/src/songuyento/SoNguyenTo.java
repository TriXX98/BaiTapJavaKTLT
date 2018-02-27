/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package songuyento;

import java.util.Scanner;

/**
 *
 * @author tritu
 */
public class SoNguyenTo {

    int n;
    Scanner input = new Scanner(System.in);

    public SoNguyenTo() {
        showMenu();
    }

    public void nhap() {
        System.out.println("Nhập n: ");
        n = Integer.parseInt(input.nextLine());
    }

    public static boolean check(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= (int) Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }

    }

    public void lapNT() {
        for (int i = 0; i < n; i++) {
            if (check(i)) {
                System.out.println(i);
            }
        }

    }

    private static int deQuy(int n) {
        int check = 1;
        if (n < 2) {
            return 0;
        } else {
            for (int i = 2; i <= (int) Math.sqrt(n); i++) {
                if (n % i == 0) {                   
                    return deQuy(n-1);
                }

            }
            if (check == 1) {
                System.out.println(" " + n);
            }

        }
        return deQuy(n - 1);
    }

    private void showMenu() {
        int choice;
        do {
            System.out.println("===SỐ NGUYÊN TỐ===");
            System.out.println("1. Nhập n");
            System.out.println("2. Sử dụng vòng lặp");
            System.out.println("3. Sử dụng đệ quy");
            System.out.println("4. Thoát chương trình");
            System.out.println("Mời bạn nhập lựa chọn: ");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    nhap();
                    break;
                case 2:
                    System.out.println("Các số nguyên tố nhỏ hơn "+n+" là: ");
                    lapNT();
                    break;
                case 3:
                    deQuy(n);
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        } while (choice != 4);

    }
}
