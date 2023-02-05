package com.example.arpit_examples;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class customAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String [] title;
    private final Integer[] imageid;

    public customAdapter(Activity context, String[] title, Integer[] imageid) {
        super(context,R.layout.mylist,title);
        this.context=context;
        this.title=title;
        this.imageid=imageid;
    }
    public View getView(int position, View convertView,  ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowview =inflater.inflate(R.layout.mylist,null,true);
        TextView titletext = (TextView) rowview.findViewById(R.id.maintitle);
        ImageView imageView = (ImageView) rowview.findViewById(R.id.imageview);

        titletext.setText(title[position]);
        imageView.setImageResource(imageid[position]);
        return rowview;
    }
}
