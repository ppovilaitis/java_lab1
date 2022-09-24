package com.example.java_lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvMainBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMainBox = findViewById(R.id.tvMainBox);
    }

    public void onBtnClickTextChange(View view) {
        this.tvMainBox.setText("Text successfully changed");
    }

    public void onBtnClickTextColorChange(View view) {
        this.tvMainBox.setTextColor(Color.RED);
    }
}