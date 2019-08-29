package com.example.student.baitapandroid_congphamquocviet_16023091_dhktpm12att;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity_C1_B2 extends AppCompatActivity {

    EditText soF,soC;
    Button btnToC,btnToF,btnClear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__c1_b2);
        soF = (EditText)findViewById(R.id.soF);
        soC = (EditText)findViewById(R.id.soC);
        btnToC = (Button) findViewById(R.id.btnToC);
        btnToF = (Button) findViewById(R.id.btnToF);
        btnClear = (Button) findViewById(R.id.btnClear);
    }

    public void bai2(View v){
        switch (v.getId()){
            case R.id.btnToC:
                soC.setText(((Integer.parseInt(soF.getText().toString())-32)*5/9)+ "");
                break;
            case R.id.btnToF:
                soF.setText(((Integer.parseInt(soC.getText().toString())*9/5+32)+ ""));
                break;
            case R.id.btnClear:
                soC.setText("");
                soF.setText("");
                break;
        }
    }

}
