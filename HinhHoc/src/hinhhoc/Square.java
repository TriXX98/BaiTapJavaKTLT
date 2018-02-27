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
public class Square {
    float edge;
    float circumference;
    float dientich;
    Scanner input = new Scanner(System.in);

    public Square() {
         nhap();
        System.out.println("Chu vi hình vuông là: "+chuVi());
        System.out.println("Diện tích hình vuông là: "+dienTich());
        paint();
    }
    
    
    public void nhap (){
        System.out.println("Nhập số liệu cạnh: ");
        edge = input.nextFloat();
    
    }
    public  float chuVi(){
      return circumference = this.edge *4 ;
    }
    
    public float dienTich(){
        return  dientich = this.edge * this.edge;
    }
    
    public void paint(){
        int lamTron = (int) edge ;
        if(edge % 1 >= 0.5){
            lamTron = lamTron +1 ;
        }
        
        for (int i = 0; i < lamTron; i++) {
            for (int j = 0; j < lamTron; j++) {
                System.out.printf("* ");
            }
            System.out.println("");
        }
    
    }
    
}
