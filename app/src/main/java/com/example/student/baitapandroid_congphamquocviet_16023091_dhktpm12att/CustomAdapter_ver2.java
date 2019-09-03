package com.example.student.baitapandroid_congphamquocviet_16023091_dhktpm12att;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter_ver2 extends BaseAdapter {

    public Activity activity;
    public ArrayList<String> ls;

    public CustomAdapter_ver2(Activity activity, ArrayList<String> ls) {
        this.activity = activity;
        this.ls = ls;
    }

    @Override
    public int getCount() {
        return ls.size();
    }

    @Override
    public Object getItem(int i) {
        return ls.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = activity.getLayoutInflater();
        view = inflater.inflate(R.layout.list_item_ver2, null);

        TextView txtThongTin = (TextView) view.findViewById(R.id.txtThongTin);
        ImageView imvIcon = (ImageView) view.findViewById(R.id.imvIcon);

        txtThongTin.setText(ls.get(i));
        return view;
    }
}
