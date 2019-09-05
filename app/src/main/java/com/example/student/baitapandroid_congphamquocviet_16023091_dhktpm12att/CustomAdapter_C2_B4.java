package com.example.student.baitapandroid_congphamquocviet_16023091_dhktpm12att;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter_C2_B4 extends BaseAdapter {

    private Activity activity;
    private ArrayList<String> lsTen;

    public CustomAdapter_C2_B4(Activity activity, ArrayList<String> lsTen){
        this.activity = activity;
        this.lsTen = lsTen;
    }
    @Override
    public int getCount() {

        return lsTen.size();
    }

    @Override
    public Object getItem(int i) {
        return lsTen.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = activity.getLayoutInflater();

        view = inflater.inflate(R.layout.list_item_c2_b4,null);

        TextView txtHoTen = (TextView)view.findViewById(R.id.txtHoTen);
        txtHoTen.setText(lsTen.get(i));
        return view;
    }
}
