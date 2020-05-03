package com.example.mytravelexpensemanager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PlacesAdapter extends RecyclerView.Adapter<PlacesAdapter.Item> {

    @NonNull
    @Override
    public Item onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =  LayoutInflater.from(parent.getContext());
        View v=inflater.inflate(R.layout.item_places,parent,false);
        return new Item(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Item holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class Item extends RecyclerView.ViewHolder {
        public Item(@NonNull View itemView) {
            super(itemView);
        }
    }
}
