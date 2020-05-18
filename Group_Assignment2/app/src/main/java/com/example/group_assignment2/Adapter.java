package com.example.group_assignment2;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    TextView txt;
    private String[] captions;
    private int[] imageIds;
    private MainActivity main ;
    site site = new site();
    public Adapter(String[] captions, int[] imageIds,MainActivity main){
        this.captions = captions;
        this.imageIds = imageIds;
        this.main=main;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardView v = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        CardView cardView = holder.cardView;
        ImageView imageView = (ImageView) cardView.findViewById(R.id.image);
        Drawable dr = ContextCompat.getDrawable(cardView.getContext(), imageIds[position]);

        imageView.setImageDrawable(dr);

         txt = cardView.findViewById(R.id.name);
        txt.setText(captions[position]);

        cardView.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
          //  int position = (int)v.getTag();
                Intent intent = new Intent(main,Information.class);
                intent.putExtra("Title",site.sites[position].getName());
                Log.d("*****_________________***********", site.sites[position].getName());

                main.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return captions.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cardView;

        public ViewHolder(CardView cardView){
            super(cardView);
            this.cardView = cardView;
        }

    }
}

