package com.example.student.baitapandroid_congphamquocviet_16023091_dhktpm12att;

public class Product extends Goods {
    private Catalog Dmuc;

    public Catalog getDmuc() {
        return Dmuc;
    }

    public void setDmuc(Catalog dmuc) {
        Dmuc = dmuc;
    }

    public Product(String ma, String name, Catalog dmuc){
        super(ma,name);
        this.Dmuc = dmuc;
    }

    public Product(String ma, String name){
        super(ma,name);
    }

    public Product(){
        super();
    }
}
