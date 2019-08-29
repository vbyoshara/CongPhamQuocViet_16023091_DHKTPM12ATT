package com.example.student.baitapandroid_congphamquocviet_16023091_dhktpm12att;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class MainActivity_Bai5 extends AppCompatActivity {

    public EditText txtTenKhachHang, txtSoLuongSach, txtTongSoKH, txtTongVIP, txtTongDoanhThu;
    public TextView txtThanhTien;
    public CheckBox cbVIP;
    private List<String> ls;

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

                txtTenKhachHang.setText("");
                txtSoLuongSach.setText("");
                txtThanhTien.setText("0");
                txtTenKhachHang.requestFocus();
                break;
            case R.id.btnThongKe:
                txtTongSoKH.setText(ls.toArray().length + "");
                int tongSoVip = 0;
                double tongSoTien = 0;
                for (String a : ls) {
                    String[] k = a.split("~");
                    if(k[2]=="true"){
                        tongSoVip++;
                        tongSoTien += Integer.parseInt(k[1])*20000*10/100;
                        continue;
                    }
                    tongSoTien += Integer.parseInt(k[1])*20000;
                }
                txtTongVIP.setText(tongSoVip);
                txtTongDoanhThu.setText(tongSoTien + "");
                break;
            case R.id.btnQuit:
                finish();
                break;
        }
    }

}
