package com.karamjit.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.karamjit.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toasty.showToast(this, "jjjj");
    }
}