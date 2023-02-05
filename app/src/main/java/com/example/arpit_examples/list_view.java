package com.example.arpit_examples;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowInsetsControllerCompat;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class list_view extends AppCompatActivity {
    ListView listView;
    String [] array ;
    ArrayList<String> arrayList=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();//hide title
        //full screen activity
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_list_view);
        listView = findViewById(R.id.list);
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("JavaScript");
        arrayList.add("PHP");
        arrayList.add("Ruby");
        arrayList.add("Swift");
        arrayList.add("Perl");
        arrayList.add("Scala");
        arrayList.add("SQL");
        arrayList.add("Kotlin");
        arrayList.add("Rust");
        arrayList.add("Assembly language");
        arrayList.add("Ada");
        arrayList.add("COBOL");
        arrayList.add("Haskell");
        arrayList.add("Lisp");
        arrayList.add("Fortran");
        arrayList.add("Lua");
        arrayList.add("BASIC");
        arrayList.add("java");
        arrayList.add("MATLAB");
        arrayList.add("Pascal");
        arrayList.add("Dart");
        arrayList.add("Clojure");
        arrayList.add("Objective-C");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(list_view.this,arrayList.get(i),Toast.LENGTH_SHORT).show();
            }
        });
       /* listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               if(i==0){
                   Toast.makeText(getApplicationContext(),"java",Toast.LENGTH_SHORT).show();
               }
               else if (i==1){
                   Toast.makeText(getApplicationContext(),"Python",Toast.LENGTH_SHORT).show();
               }
               else if (i==2){
                   Toast.makeText(getApplicationContext(),"JavaScript",Toast.LENGTH_SHORT).show();
               }
               else if (i==3){
                   Toast.makeText(getApplicationContext(),"PHP",Toast.LENGTH_SHORT).show();
               }
               else if (i==4){
                   Toast.makeText(getApplicationContext(),"Ruby",Toast.LENGTH_SHORT).show();
               }
               else if (i==5){
                   Toast.makeText(getApplicationContext(),"swift",Toast.LENGTH_SHORT).show();
               }
               else if (i==6){
                   Toast.makeText(getApplicationContext(),"Perl",Toast.LENGTH_SHORT).show();
               }
               else if (i==7){
                   Toast.makeText(getApplicationContext(),"Scala",Toast.LENGTH_SHORT).show();
               }
               else if (i==8){
                   Toast.makeText(getApplicationContext(),"SQL",Toast.LENGTH_SHORT).show();
               }
               else if (i==9){
                   Toast.makeText(getApplicationContext(),"Kotlin",Toast.LENGTH_SHORT).show();
               }
               else if (i==10){
                   Toast.makeText(getApplicationContext(),"Rust",Toast.LENGTH_SHORT).show();
               }
               else if (i==11){
                   Toast.makeText(getApplicationContext(),"Assembly language",Toast.LENGTH_SHORT).show();
               }
               else if (i==12){
                   Toast.makeText(getApplicationContext(),"Ada",Toast.LENGTH_SHORT).show();
               }
               else if (i==13){
                   Toast.makeText(getApplicationContext(),"COBOL",Toast.LENGTH_SHORT).show();
               }
               else if (i==14){
                   Toast.makeText(getApplicationContext(),"Haskell",Toast.LENGTH_SHORT).show();
               }
               else if (i==15){
                   Toast.makeText(getApplicationContext(),"Lisp",Toast.LENGTH_SHORT).show();
               }
               else if (i==16){
                   Toast.makeText(getApplicationContext(),"Fortran",Toast.LENGTH_SHORT).show();
               }
               else if (i==17){
                   Toast.makeText(getApplicationContext(),"Lua",Toast.LENGTH_SHORT).show();
               }
               else if (i==18){
                   Toast.makeText(getApplicationContext(),"BASIC",Toast.LENGTH_SHORT).show();
               }
               else if (i==19){
                   Toast.makeText(getApplicationContext(),"MATLAB",Toast.LENGTH_SHORT).show();
               }
               else if (i==20){
                   Toast.makeText(getApplicationContext(),"Pascal",Toast.LENGTH_SHORT).show();
               }
               else if (i==21){
                   Toast.makeText(getApplicationContext(),"Dart",Toast.LENGTH_SHORT).show();
               }
               else if (i==22){
                   Toast.makeText(getApplicationContext(),"Clojure",Toast.LENGTH_SHORT).show();
               }
               else {
                   Toast.makeText(getApplicationContext(),"Objective-C",Toast.LENGTH_SHORT).show();
               }
            }
        });*/

    }

}