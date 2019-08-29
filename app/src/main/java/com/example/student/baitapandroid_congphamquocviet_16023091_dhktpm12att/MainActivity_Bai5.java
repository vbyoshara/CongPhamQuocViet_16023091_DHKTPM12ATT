package com.example.student.baitapandroid_congphamquocviet_16023091_dhktpm12att;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity_Bai5 extends AppCompatActivity {

    public EditText txtTenKhachHang, txtSoLuongSach, txtTongSoKH, txtTongVIP, txtTongDoanhThu;
    public TextView txtThanhTien;
    public CheckBox cbVIP;
    private ArrayList<ArrayList<String>> ls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__bai5);

        txtTenKhachHang = (EditText) findViewById(R.id.txtTenKhachHang);
        txtSoLuongSach = (EditText) findViewById(R.id.txtSoLuongSach);
        txtTongSoKH = (EditText) findViewById(R.id.txtTongSoKH);
        txtTongVIP = (EditText) findViewById(R.id.txtTongVIP);
        txtTongDoanhThu = (EditText) findViewById(R.id.txtTongDoanhThu);

        txtThanhTien = (TextView) findViewById(R.id.txtThanhTien);

        cbVIP = (CheckBox) findViewById(R.id.cbVIP);

        ls = new ArrayList<>();
    }

    public void suKien(View view) {
        switch (view.getId()) {
            case R.id.btnTinhTT:
                double t = Integer.parseInt(txtSoLuongSach.getText().toString()) * 20000;
                if (cbVIP.isChecked())
                    t *= 0.1;
                txtThanhTien.setText(t + "");
                break;
            case R.id.btnTiep:
                ArrayList<String> mem = new ArrayList<>();
                mem.add(txtTenKhachHang.getText().toString());
                mem.add(txtSoLuongSach.getText().toString());
                if(cbVIP.isChecked())
                    mem.add("1");
                else
                    mem.add("0");
                ls.add(mem);

                txtTenKhachHang.setText("");
                txtSoLuongSach.setText("");
                txtThanhTien.setText("0");
                txtTenKhachHang.requestFocus();
                break;
            case R.id.btnThongKe:
                txtTongSoKH.setText(ls.size() + "");
                double tongTien = 0;
                int vip = 0;
                for (int i = 0; i < ls.size(); i++) {
                    if (ls.get(i).get(2) == "1") {
                        vip++;
                        tongTien += Double.parseDouble(ls.get(i).get(1)) * 20000 * 10 / 100;
                        continue;
                    }
                    tongTien += Double.parseDouble(ls.get(i).get(1)) * 20000;
                }
                txtTongDoanhThu.setText(tongTien + "");
                txtTongVIP.setText(vip + "");
                break;
            case R.id.btnQuit:
                finish();
                break;
        }
    }

}
