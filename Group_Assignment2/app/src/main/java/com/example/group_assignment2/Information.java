package com.example.group_assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Information extends AppCompatActivity {
    site site =new site();
    ImageView image ;
    TextView title ;
    TextView desc ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        image=findViewById(R.id.imageView);
        title = findViewById(R.id.title);
        desc=findViewById(R.id.desc);
           site [] arr = site.sites;
          Intent intent = getIntent();
           Log.d("**********************",intent.getStringExtra("Title"));

        for (site s : arr) {
            if(intent.getStringExtra("Title").equals(s.getName())){
                image.setImageResource(s.getImageID());
                title.setText(s.getName());
                desc.setText(s.getInfo());
            }
        }
    }
}
