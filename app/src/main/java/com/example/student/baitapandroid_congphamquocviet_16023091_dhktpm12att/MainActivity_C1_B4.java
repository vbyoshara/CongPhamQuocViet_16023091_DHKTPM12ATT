package com.example.student.baitapandroid_congphamquocviet_16023091_dhktpm12att;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity_C1_B4 extends AppCompatActivity {

    private RadioButton rdTrungCap, rdCaoDang, rdDaiHoc;
    private CheckBox cbDocBao, cbDocSach, cbDocCoding;
    private EditText txtHoTen, txtCMND;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__c1_b4);

        rdCaoDang = (RadioButton) findViewById(R.id.rdCaoDang);
        rdTrungCap = (RadioButton) findViewById(R.id.rdTrungCap);
        rdDaiHoc = (RadioButton) findViewById(R.id.rdDaiHoc);

        cbDocBao = (CheckBox) findViewById(R.id.cbDocBao);
        cbDocSach = (CheckBox) findViewById(R.id.cbDocSach);
        cbDocCoding = (CheckBox) findViewById(R.id.cbDocCoding);

        txtHoTen = (EditText) findViewById(R.id.txtHoTen);
        txtCMND = (EditText) findViewById(R.id.txtCMND);

        rdDaiHoc.setChecked(true);
    }

    public void guiThongTin(View view) {
        int t = txtHoTen.getText().toString().trim().length();
        if (t < 3) {
            Toast.makeText(this, "Tên phải có ít nhất 3 ký tự", Toast.LENGTH_SHORT).show();
            return;
        }
        t = txtCMND.getText().toString().trim().length();
        if (t != 9) {
            Toast.makeText(this, "CMND phải có 9 chữ số", Toast.LENGTH_SHORT).show();
            return;
        }
        if (!cbDocBao.isChecked() && !cbDocCoding.isChecked() && !cbDocSach.isChecked()){
            Toast.makeText(this, "Sở thích phải có ít nhất 1 chọn lựa", Toast.LENGTH_SHORT).show();
            return;
        }
        Toast.makeText(this, "Gửi thông tin thành công", Toast.LENGTH_SHORT).show();
    }
}
