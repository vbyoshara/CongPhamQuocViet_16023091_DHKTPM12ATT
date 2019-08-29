package com.example.student.baitapandroid_congphamquocviet_16023091_dhktpm12att;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity_C1_B1 extends AppCompatActivity {

    public EditText soA,soB;
    public TextView txtKetQua;
    public Button btnTong,btnHieu,btnTich,btnThuong,btnUSC,btnThoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__c1_b1);

        soA = (EditText)findViewById(R.id.soA);
        soB = (EditText)findViewById(R.id.soB);

        txtKetQua = (TextView)findViewById(R.id.txtKetQua);

        btnHieu = (Button)findViewById(R.id.btnHieu);
        btnThoat = (Button)findViewById(R.id.btnThoat);
        btnThuong = (Button)findViewById(R.id.btnThuong);
        btnTich = (Button)findViewById(R.id.btnTich);
        btnTong = (Button)findViewById(R.id.btnTong);
        btnUSC = (Button)findViewById(R.id.btnUSCLN);
    }

    public void suKien(View v){
        int a,b;
        a = Integer.parseInt(soA.getText().toString());
        b = Integer.parseInt(soB.getText().toString());
        switch (v.getId()){
            case R.id.btnHieu:
                txtKetQua.setText((a-b) + "");
                break;
            case R.id.btnThoat:
                finish();
                break;
            case R.id.btnThuong:
                txtKetQua.setText((a/b) + "");
                break;
            case R.id.btnTich:
                txtKetQua.setText((a*b) + "");
                break;
            case R.id.btnTong:
                txtKetQua.setText((a+b) + "");
                break;
            case R.id.btnUSCLN:
                txtKetQua.setText(gcd(a,b) + "");
                break;
        }
    }

    private int gcd(int a, int b){
        // Nếu a = 0 => ucln(a,b) = b
        // Nếu b = 0 => ucln(a,b) = a
        if (a == 0 || b == 0){
            return a + b;
        }
        while (a != b){
            if (a > b){
                a -= b; // a = a - b
            }else{
                b -= a;
            }
        }
        return a; // return a or b, bởi vì lúc này a và b bằng nhau
    }
}
