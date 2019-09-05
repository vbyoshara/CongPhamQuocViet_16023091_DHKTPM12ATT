package com.example.student.baitapandroid_congphamquocviet_16023091_dhktpm12att;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity_C2_B4 extends ListActivity implements View.OnLongClickListener {

    ListView lsMember;
    TextView txtThongBao;
    EditText edtHoTen;
    ArrayList<String> ls;
    CustomAdapter_C2_B4 ca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__c2__b4);

        lsMember = (ListView) findViewById(R.id.lsvMember);
        txtThongBao = (TextView) findViewById(R.id.txtThongBao);
        edtHoTen = (EditText) findViewById(R.id.edtHoTen);

        ls = new ArrayList<String>();

        ls.add("teo");
        ls.add("ty");
        ls.add("bin");

        ca = new CustomAdapter_C2_B4(this, ls);

        lsMember.setAdapter(ca);

//        lsMember.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//
//            }
//        });

//        lsMember.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
//            @Override
//            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
//                ls.remove(i);
//                ca.notifyDataSetChanged();
//                return true;
//            }
//        });
    }

    public void xuLy(View view) {
        ls.add(edtHoTen.getText().toString());
        ca.notifyDataSetChanged();
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        txtThongBao.setText("position : " + position + "; value = " + ls.get(position));
    }

    @Override
    public boolean onLongClick(View view) {
        return false;
    }
}
