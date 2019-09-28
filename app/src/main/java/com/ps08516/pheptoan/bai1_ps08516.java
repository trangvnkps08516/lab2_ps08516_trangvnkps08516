package com.ps08516.pheptoan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class bai1_ps08516 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1_ps08516);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("test","Goi ham onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("test","Goi ham onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("test","Goi ham onDestroy");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("test","Goi ham onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("test","Goi ham ReStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("test","Goi ham onResume");
    }


}
