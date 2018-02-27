/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsinhvien;

/**
 *
 * @author tritu
 */
public class SinhVien {
    private String name;
    private int age;
    private String id;
    private String lop;

    public SinhVien() {
    }

    public SinhVien(String name, int age, String id, String lop) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.lop = lop;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    
    
    
}
