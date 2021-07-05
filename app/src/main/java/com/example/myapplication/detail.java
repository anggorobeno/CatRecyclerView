package com.example.myapplication;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class detail extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);
        TextView txtview = findViewById(R.id.tesintent);
        ImageView imgdetail = findViewById(R.id.recivedimage);
        TextView rasdtl = findViewById(R.id.detailras);
        String ras_names="ras";
        int ras_image = 0;
        String ras_detail="detail";
        Bundle extras=getIntent().getExtras();
        if(extras!=null){
            ras_names=extras.getString("ras");
            ras_image=extras.getInt("image",0);
            ras_detail=extras.getString("detail");
        }
        txtview.setText(ras_names);
        rasdtl.setText(ras_detail);

        Picasso.with(this)
                .load(ras_image)
                .into(imgdetail);
    }
}
