package com.example.student.baitapandroid_congphamquocviet_16023091_dhktpm12att;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity_Bai3 extends AppCompatActivity {

    EditText nam;
    TextView txtKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__bai3);

        nam = (EditText)findViewById(R.id.nam);
        txtKetQua = (TextView)findViewById(R.id.txtKetQua);

    }

    public void chuyenDoi(View view) {
        int n = Integer.parseInt(nam.getText().toString());
        txtKetQua.setText(xetCan(n)+xetChi(n));
    }

    private String xetCan(int nam){
        switch (nam%10){
            case 0:
                return "Canh";
            case 1:
                return "Tân";
            case 2:
                return "Nhâm";
            case 3:
                return "Quý";
            case 4:
                return "Giáp";
            case 5:
                return "Ất";
            case 6:
                return "Bính";
            case 7:
                return "Đinh";
            case 8:
                return "Mậu";
            case 9:
                return "Kỷ";
                default:
                    return "";
        }
    }
    private String xetChi(int nam){
        switch (nam%10){
            case 0:
                return "Thân";
            case 1:
                return "Dậu";
            case 2:
                return "Tuất";
            case 3:
                return "Hợi";
            case 4:
                return "Tý";
            case 5:
                return "Sửu";
            case 6:
                return "Dần";
            case 7:
                return "Mẹo";
            case 8:
                return "Thìn";
            case 9:
                return "Tỵ";
            case 10:
                return "Ngọ";
            case 11:
                return "Mùi";
            default:
                return "";
        }
    }
}
