package com.example.student.baitapandroid_congphamquocviet_16023091_dhktpm12att;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity_C2_B1 extends AppCompatActivity {

    public Button btnShort, btnLong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__c2__b1);

        btnShort = (Button)findViewById(R.id.btnShort);
        btnLong = (Button)findViewById(R.id.btnLong);

        btnShort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity_C2_B1.this, "Short", Toast.LENGTH_SHORT).show();
            }
        });

        btnLong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity_C2_B1.this, "Long", Toast.LENGTH_LONG).show();
            }
        });
    }
}
