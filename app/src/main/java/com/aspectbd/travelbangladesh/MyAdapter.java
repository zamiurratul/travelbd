package com.aspectbd.travelbangladesh;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by pc on 5/16/2017.
 */

public class MyAdapter extends ArrayAdapter{

    ArrayList<Items> divList = new ArrayList<>();

    public MyAdapter(@NonNull Context context, int textViewResourceId, ArrayList objects) {
        super(context, textViewResourceId, objects);
        divList = objects;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View v = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.gridview_items, null);
        ImageView imageView = (ImageView) v.findViewById(R.id.imageView);
        imageView.setImageResource(divList.get(position).getImageID());
        TextView textView = (TextView) v.findViewById(R.id.textView);
        textView.setText(divList.get(position).getDivName());
        return v;
    }
}
