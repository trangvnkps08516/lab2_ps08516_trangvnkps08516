package com.ps08516.pheptoan;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class KetQua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ket_qua);

        TextView tvKQ = findViewById(R.id.tvKQ);
        Intent i = getIntent();

        int sum  = i.getIntExtra("data",0);
        tvKQ.setText(""+sum);


        int tru = i.getIntExtra("data",0);
        tvKQ.setText(""+tru);

        int nhan = i.getIntExtra("data",0);
        tvKQ.setText(""+nhan);

        int chia = i.getIntExtra("data",0);
        tvKQ.setText(""+chia);
    }
}