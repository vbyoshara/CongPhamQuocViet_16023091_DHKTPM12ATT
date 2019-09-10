package com.example.student.baitapandroid_congphamquocviet_16023091_dhktpm12att;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.Console;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity_C3_B2 extends AppCompatActivity {

    public Spinner spDanhMuc;
    public ListView lsSP;
    public EditText edtMaSP, edtTenSP;
    public Button btnNhanSP;
    public ArrayList<Catalog> lsCatalog;
    public ArrayList<Product> lsProduct;
    public ArrayAdapter adtCatalog;
    public ArrayAdapter adtProduct;
    private int stt = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__c3__b2);

        spDanhMuc = (Spinner) findViewById(R.id.spDanhMuc);
        lsSP = (ListView) findViewById(R.id.lsSP);
        edtMaSP = (EditText) findViewById(R.id.edtMaSP);
        edtTenSP = (EditText) findViewById(R.id.edtTenSP);
        btnNhanSP = (Button) findViewById(R.id.btnNhanSP);

        lsCatalog = new ArrayList<>();
        lsProduct = new ArrayList<>();


        lsCatalog.add(new Catalog("1", "SamSung"));
        lsCatalog.add(new Catalog("2", "Iphone"));
        lsCatalog.add(new Catalog("3", "IPad"));

        lsCatalog.get(0).addProduct(new Product("0", "Loại 1"));
        lsCatalog.get(0).addProduct(new Product("1", "Loại 2"));

        adtCatalog = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, lsCatalog);
        spDanhMuc.setAdapter(adtCatalog);
        lsProduct = new ArrayList<>();
        lsProduct.addAll(lsCatalog.get(0).getListProduct());
        adtProduct = new ArrayAdapter(this, android.R.layout.simple_list_item_1, lsProduct);
        lsSP.setAdapter(adtProduct);

        //Xem lại tại sao nó ko lên danh sách lúc chuyển dropdown list
        spDanhMuc.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (stt != -1) {
                    stt = i;
                    lsProduct.clear();
                    lsProduct.addAll(lsCatalog.get(i).getListProduct());
                    adtProduct.notifyDataSetChanged();
                    Toast.makeText(MainActivity_C3_B2.this, "OK" + lsCatalog.get(i).getListProduct().size(), Toast.LENGTH_SHORT).show();
                } else stt = i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        btnNhanSP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lsCatalog.get(stt).addProduct(new Product(edtMaSP.getText().toString(), edtTenSP.getText().toString()));
                lsProduct.clear();
                lsProduct.addAll(lsCatalog.get(stt).getListProduct());
                adtProduct.notifyDataSetChanged();
            }
        });
    }

    private ArrayList<String> chuyenDanhSach(ArrayList<Product> ls) {
        ArrayList<String> lsNew = new ArrayList<>();
        for (Product p : ls) {
            lsNew.add(p.toString());
        }
        return lsNew;
    }
}
