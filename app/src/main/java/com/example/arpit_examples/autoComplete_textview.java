package com.example.arpit_examples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class autoComplete_textview extends AppCompatActivity {
    AutoCompleteTextView actview;
    ArrayList<String> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_textview);
        actview = findViewById(R.id.autoCompleteTextView1);
        arrayList.add("java");
        arrayList.add("python");
        arrayList.add("javaScript");
        arrayList.add("PHP");
        arrayList.add("ruby");
        arrayList.add("swift");
        arrayList.add("perl");
        arrayList.add("scala");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrayList);
        actview.setAdapter(arrayAdapter);
        actview.setThreshold(1);


    }
}