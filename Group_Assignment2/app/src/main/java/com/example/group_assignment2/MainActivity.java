package com.example.group_assignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.SharedPreferences;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recycler =findViewById(R.id.recycle);

        String[] captions = new String[site.sites.length];
        int[] ids = new int[site.sites.length];

        for(int i = 0; i<captions.length;i++){
            captions[i] = site.sites[i].getName();
            ids[i] = site.sites[i].getImageID();
        }
        recycler.setLayoutManager(new LinearLayoutManager(this));
        Adapter adapter = new Adapter(captions, ids,this);
        recycler.setAdapter(adapter);


    }
}
