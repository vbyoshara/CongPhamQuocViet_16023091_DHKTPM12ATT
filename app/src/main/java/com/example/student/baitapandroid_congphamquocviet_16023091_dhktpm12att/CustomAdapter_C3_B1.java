package com.example.student.baitapandroid_congphamquocviet_16023091_dhktpm12att;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CustomAdapter_C3_B1 extends BaseAdapter {

    private ArrayList<NhanVien_ver2> ls;
    private Activity activity;
    private ArrayList<Integer> lsCb;

    public CustomAdapter_C3_B1(Activity activity, ArrayList<NhanVien_ver2> ls) {
        this.ls = ls;
        this.activity = activity;
        lsCb = new ArrayList<>();
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

    public boolean themNV(NhanVien_ver2 nv) {
        ls.add(nv);
        lsCb = new ArrayList<>();
        notifyDataSetChanged();
        return true;
    }

    public boolean xoaNV() {
        if (lsCb.size() > 0) {
            for (Integer i : lsCb) {
                ls.remove(ls.get(i));
            }
            notifyDataSetChanged();
            return true;
        }
        else
            return false;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = activity.getLayoutInflater();
        view = inflater.inflate(R.layout.list_item_c3_b1, null);

        TextView txtThongTin = (TextView) view.findViewById(R.id.txtThongTin);
        ImageView imvIcon = (ImageView) view.findViewById(R.id.imvIcon);
        final CheckBox cbXoa = (CheckBox) view.findViewById(R.id.cbXoa);

        if (ls.get(i).getGioiTinh())
            imvIcon.setImageResource(R.drawable.ic_launcher_foreground);
        else
            imvIcon.setImageResource(R.drawable.ic_launcher_background);

        cbXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (cbXoa.isChecked())
                    lsCb.add(i);
                else
                    lsCb.remove(i);
                Toast.makeText(activity, "" + lsCb.size(), Toast.LENGTH_SHORT).show();
            }
        });

        txtThongTin.setText(ls.get(i).toString());
        return view;
    }
}
