package com.example.student.baitapandroid_congphamquocviet_16023091_dhktpm12att;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;

import java.util.ArrayList;

public class MainActivity_C3_B1 extends AppCompatActivity {

    public ListView lsMember;
    public ArrayList<NhanVien_ver2> ls;
    public EditText edtMaNV,edtTenNV;
    public RadioButton rdNam;
    public CustomAdapter_ver2 adt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__c3__b1);

        lsMember = (ListView)findViewById(R.id.lsMember);
        edtMaNV = (EditText)findViewById(R.id.edtMaNV);
        edtTenNV = (EditText)findViewById(R.id.edtTenNV);
        rdNam = (RadioButton)findViewById(R.id.rdNam);

        ls = new ArrayList<>();

        ls.add(new NhanVien_ver2("1","Viet",true));
        ls.add(new NhanVien_ver2("2","Vy",false));

        adt = new CustomAdapter_ver2(this,ls);

        lsMember.setAdapter(adt);
    }

    public void SuKien(View view) {
        switch (view.getId()){
            case R.id.btnNhapNV:
                if(rdNam.isChecked())
                    adt.themNV(new NhanVien_ver2(edtMaNV.getText().toString(),edtTenNV.getText().toString(),true));
                else
                    adt.themNV(new NhanVien_ver2(edtMaNV.getText().toString(),edtTenNV.getText().toString(),false));
                break;
            case R.id.btnXoa:
                adt.xoaNV();
                break;
        }

    }
}
