package com.example.arpit_examples;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class customlist_view extends AppCompatActivity {
    AlertDialog.Builder builder;
    ListView listView;
    String [] title = {"BMW","FORD","TESLA","SkOda","VOLKSWAGEN","MERCEDES","TOYOTA","LAND ROVER","NISSAN"};
    Integer[] imgid = {R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,
            R.drawable.image5, R.drawable.image6,R.drawable.image7,R.drawable.image8,
            R.drawable.image9};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customlist_view);
        /*title.add("BLACKBERRY OS");
        title.add("CHROME OS");
        title.add("DEBIAN OS");
        title.add("IOS");
        title.add("KALI OS");
        title.add("LINUX OS");
        title.add("MAC OS");
        title.add("PALM OS");
        title.add("PARROT OS");
        title.add("UBUNTU");
        title.add("WINDOWS");
        */
        customAdapter addar = new customAdapter(this,title,imgid);
        listView = (ListView) findViewById(R.id.customlst);
        listView.setAdapter(addar);
        builder =new AlertDialog.Builder(this);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               builder.setTitle("CAR BRANDS:>").setCancelable(false).setMessage("you select :"+title[i]).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialogInterface, int position) {
                       Toast.makeText(getApplicationContext(),"selected",Toast.LENGTH_SHORT).show();
                   }
               }).setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialogInterface, int i) {
                       dialogInterface.cancel();
                   }
               });
               AlertDialog alert = builder.create();
               alert.show();
            }
        });
    }
}