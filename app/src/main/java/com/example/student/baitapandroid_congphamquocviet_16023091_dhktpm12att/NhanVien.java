package com.example.student.baitapandroid_congphamquocviet_16023091_dhktpm12att;

public class NhanVien {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double TinhLuong(){
        return 500;
    }

    public String toString(){
        return this.id + "-" + this.name;
    }
}
