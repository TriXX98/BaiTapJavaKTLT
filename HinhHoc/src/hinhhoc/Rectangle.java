/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hinhhoc;

/**
 *
 * @author tritu
 */
public class Rectangle extends Square {

    float length;
    float width;

    public Rectangle() {
        
    }

    @Override
    public void nhap() {
        System.out.println("Nhập vào chiều dài: ");
        length = Float.parseFloat(input.nextLine());
        System.out.println("Nhập vào chiều rộng: ");
        width = Float.parseFloat(input.nextLine());
        
        if (width > length) {
            System.out.println("Bạn đã nhập sai !!! Mời bạn nhập lại số liệu");
            this.nhap();
        }

    }

    @Override
    public float chuVi() {
        return circumference = (this.length + this.width) * 2;
    }

    @Override
    public float dienTich() {
        return dientich = this.length * this.width;
    }

    @Override
    public void paint() {
        int chieuRong = (int) width;
        int chieuDai = (int) length;
        if (width % 1 >= 0.5) {
            chieuRong = chieuRong + 1;
        }
        if (length % 1 >= 0.5) {
            chieuDai = chieuDai + 1;

        }
        for (int i = 0; i < chieuDai; i++) {
            for (int j = 0; j < chieuRong; j++) {
                System.out.printf("* ");
            }
            System.out.println("");
        }

    }

}
