package com.example.mytravelexpensemanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

public class Places extends AppCompatActivity implements View.OnClickListener {
    RecyclerView view;
    FrameLayout add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);
        init();
    }

    void init() {
        view = findViewById(R.id.list_places);
        view.setLayoutManager(new LinearLayoutManager(this));
        view.setAdapter(new PlacesAdapter());
        add = findViewById(R.id.add_place);
        add.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.add_place:
                startActivity(new Intent(Places.this, AddNewPlace.class));
                break;
        }
    }
}
