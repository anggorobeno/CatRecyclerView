package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class catadapter extends RecyclerView.Adapter<catadapter.ListViewHolder> {
    private ArrayList<cat> listcat;
    private Context context;
    private String pesan2 = "Menu Kucing!";
    private onClickListener listener;




    public catadapter(ArrayList<cat> list, Context context, onClickListener listener) {
        this.listcat = list;
        this.context = context;
        this.listener=listener;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_cat, parent, false);
        return new ListViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        cat Cat = listcat.get(position);
        Picasso.with(context)
                .load(Cat.getImage())
                .resize(75, 75)
                .centerCrop()
                .into(holder.imgPhoto);
        holder.tvName.setText(Cat.getRas());
        holder.tvDetail.setText("Lifespan: " + Cat.getLifespan());
        holder.tvOrigin.setText("Origin: " + Cat.getOrigin());


    }

    @Override
    public int getItemCount() {
        return listcat.size();
    }




    class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imgPhoto;
        TextView tvName, tvDetail, tvOrigin;
        RelativeLayout main;
        ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_lifespan);
            tvOrigin = itemView.findViewById(R.id.tv_item_origin);
            main=itemView.findViewById(R.id.activity_main);
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {
        listener.onClick(itemView,getAdapterPosition());
        }
    }
    public interface onClickListener{
        void onClick(View v,int position);
    }
}

