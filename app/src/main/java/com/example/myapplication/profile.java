package com.example.myapplication;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class profile extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        String email="anggoro131098@gmail.com";
        String name="Anggoro Beno Lukito";
        TextView setname=findViewById(R.id.name);
        TextView setemail=findViewById(R.id.email2);
        ImageView setfoto=findViewById(R.id.image_view_detail);
        setname.setText(name);
        setemail.setText(email);
        setTitle("About Me");

        Picasso.with(this)
                .load(R.drawable.user2)
                .resize(350,350)
                .into(setfoto);
    }
}
