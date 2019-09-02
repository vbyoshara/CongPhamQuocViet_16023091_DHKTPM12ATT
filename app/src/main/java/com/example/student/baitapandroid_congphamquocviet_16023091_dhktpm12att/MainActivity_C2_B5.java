package com.example.student.baitapandroid_congphamquocviet_16023091_dhktpm12att;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;

import java.util.ArrayList;

public class MainActivity_C2_B5 extends AppCompatActivity {

    public EditText edtMaNV,edtTenNV;
    public RadioButton rdChinhThuc,rdThoiVu;
    public ListView lsMember;
    public ArrayList<String> ls;
    public ArrayAdapter adt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__c2__b5);

        edtMaNV = (EditText)findViewById(R.id.edtMaNV);
        edtTenNV = (EditText)findViewById(R.id.edtTenNV);

        rdChinhThuc = (RadioButton)findViewById(R.id.rdChinhThuc);
        rdThoiVu = (RadioButton)findViewById(R.id.rdThoiVu);

        lsMember = (ListView)findViewById(R.id.lsMember);

        ls = new ArrayList<>();

        adt = new ArrayAdapter(this,android.R.layout.simple_list_item_1,ls);

        lsMember.setAdapter(adt);

    }

    public void SuKien(View view) {
        NhanVien n = new NhanVien();
        n.setId(edtMaNV.getText().toString());
        n.setName(edtTenNV.getText().toString());
        if(rdChinhThuc.isChecked())
            n.setTienLuong(new LuongChinhThuc());
        else
            n.setTienLuong(new LuongThoiVu());

        ls.add(n.toString());

        adt.notifyDataSetChanged();
    }
}

