package com.example.student.baitapandroid_congphamquocviet_16023091_dhktpm12att;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity_Bai6 extends AppCompatActivity {

    public ListView lsvMember;
    private ArrayList<String> ls;
    private TextView txtThongBao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__bai6);

        lsvMember = (ListView)findViewById(R.id.lsvMember);
        txtThongBao = (TextView)findViewById(R.id.txtThongBao);

        ls = new ArrayList<String>();

        ls.add("Tèo");
        ls.add("Tý");
        ls.add("Bin");
        ls.add("Bo");

        ArrayAdapter adt = new ArrayAdapter(MainActivity_Bai6.this,android.R.layout.simple_list_item_1,ls);

        lsvMember.setAdapter(adt);

        lsvMember.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                txtThongBao.setText("position " + i + ": value = " + ls.get(i));
            }
        });
    }
}
