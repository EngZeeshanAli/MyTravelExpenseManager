package com.example.mytravelexpensemanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DashBoard extends AppCompatActivity implements View.OnClickListener {
    CardView expense, setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        expense = findViewById(R.id.expense);
        expense.setOnClickListener(this);
        setting = findViewById(R.id.settings);
        setting.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.expense:
                startActivity(new Intent(DashBoard.this, Places.class));
                break;
            case R.id.settings:
                startActivity(new Intent(DashBoard.this, Settings.class));
                break;
        }
    }
}
