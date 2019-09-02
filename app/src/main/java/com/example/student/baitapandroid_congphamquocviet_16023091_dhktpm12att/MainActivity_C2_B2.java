package com.example.student.baitapandroid_congphamquocviet_16023091_dhktpm12att;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity_C2_B2 extends AppCompatActivity {

    CheckBox cbLuu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__c2__b2);

        cbLuu = (CheckBox) findViewById(R.id.cbLuu);

    }

    public void suKien(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
        builder.setTitle("Thông báo");
        builder.setIcon(R.drawable.ic_launcher_background);
        switch (view.getId()) {
            case R.id.btnThoat:
                builder.setMessage("Bạn có muốn thoát không ?");

                builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        finish();
                    }
                });

                builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                break;
            case R.id.btnDangNhap:
                if (cbLuu.isChecked())
                    builder.setMessage("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu");
                else
                    builder.setMessage("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu");

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });

                builder.setNegativeButton("Cancer", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                break;
        }
        builder.create().show();
    }
}
