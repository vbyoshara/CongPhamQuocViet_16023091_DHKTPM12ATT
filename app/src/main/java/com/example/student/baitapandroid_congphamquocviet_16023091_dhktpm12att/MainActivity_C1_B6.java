package com.example.student.baitapandroid_congphamquocviet_16023091_dhktpm12att;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity_C1_B6 extends AppCompatActivity {

    public ListView lsvMember;
    private String[] ls;
    private TextView txtThongBao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__c1_b6);

        lsvMember = (ListView) findViewById(R.id.lsvMember);
        txtThongBao = (TextView) findViewById(R.id.txtThongBao);

        ls = getResources().getStringArray(R.array.list_member);

        ArrayAdapter adt = new ArrayAdapter(MainActivity_C1_B6.this, android.R.layout.simple_list_item_1, ls);

        lsvMember.setAdapter(adt);
        lsvMember.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                txtThongBao.setText("position " + i + ": value = " + ls[i]);
            }
        });

    }
}
