package com.example.student.baitapandroid_congphamquocviet_16023091_dhktpm12att;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity_C2_B3 extends AppCompatActivity {

    ListView lsMember;
    TextView txtThongBao;
    EditText edtHoTen;
    ArrayList<String> ls;
    CustomAdapter_ver1 ca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__c2__b3);

        lsMember = (ListView) findViewById(R.id.lsvMember);
        txtThongBao = (TextView) findViewById(R.id.txtThongBao);
        edtHoTen = (EditText) findViewById(R.id.edtHoTen);

        ls = new ArrayList<String>();

        ls.add("teo");
        ls.add("ty");
        ls.add("bin");

        ca = new CustomAdapter_ver1(this, ls);

        lsMember.setAdapter(ca);

        lsMember.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                txtThongBao.setText("position : " + i + "; value = " + ls.get(i));
            }
        });

        lsMember.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                ls.remove(i);
                ca.notifyDataSetChanged();
                return true;
            }
        });
    }

    public void xuLy(View view) {
        ls.add(edtHoTen.getText().toString());
        ca.notifyDataSetChanged();
    }
}
