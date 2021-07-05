package com.example.myapplication;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.MenuItem;
import android.os.Bundle;
import android.view.Menu;
import java.util.ArrayList;

import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<cat> list = new ArrayList<>();
    private catadapter.onClickListener listener;
    private String pesan1 = "Pojok Kanan Atas!";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycleview);
        recyclerView.setHasFixedSize(true);
        list.addAll(catdetail.catdata());
        showRecyclerList();
    }
    private void showRecyclerList(){
        setOnlickListener();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        catadapter CatAdapter = new catadapter(list,getApplicationContext(),listener);
        recyclerView.setAdapter(CatAdapter);
    }

    private void setOnlickListener() {
        listener=new catadapter.onClickListener() {
            @Override
            public void onClick(View v, int position) {
            Intent intent = new Intent(getApplicationContext(),detail.class);
            intent.putExtra("ras",list.get(position).getRas());
            intent.putExtra("image",list.get(position).getImage());
            intent.putExtra("detail",list.get(position).getDetail());
            startActivity(intent);
            }
        };
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.userinfo, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.userinfo:
                Toast.makeText(getApplicationContext(), pesan1, Toast.LENGTH_LONG).show();
                Intent intent = new Intent(this,profile.class);
                startActivity(intent);


        }
    }






}