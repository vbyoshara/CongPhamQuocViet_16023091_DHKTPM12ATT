package com.example.student.baitapandroid_congphamquocviet_16023091_dhktpm12att;

import java.util.ArrayList;

public class Catalog extends Goods {
    private ArrayList<Product> listSP = null;
    public Catalog(String ma, String name){
        super(ma,name);
        this.listSP = new ArrayList<Product>();
    }

    public Catalog(){
        super();
        this.listSP = new ArrayList<Product>();
    }

    public boolean isDuplicate(Product p){
        for (Product pl:listSP){
            if(pl.getId().trim().equalsIgnoreCase(p.getId().trim()))
                return true;
        }
        return false;
    }

    public boolean addProduct(Product p){
        boolean isDup = isDuplicate(p);
        if(!isDup){
            p.setDmuc(this);
            return listSP.add(p);
        }
        return !isDup;
    }

    public  ArrayList<Product> getListProduct(){
        return this.listSP;
    }

    public int size(){
        return listSP.size();
    }

    public Product get(int i){
        return listSP.get(i);
    }
}
