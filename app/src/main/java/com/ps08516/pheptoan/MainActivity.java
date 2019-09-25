package com.ps08516.pheptoan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText ed1 = findViewById(R.id.edSoa);
        final EditText ed2 = findViewById(R.id.edSob);
        Button btn = findViewById(R.id.btnSum);
        Button btntru = findViewById(R.id.btntru);
        Button btnnhan = findViewById(R.id.btnnhan);
        Button btnchia = findViewById(R.id.btnchia);
        final int a,b,sum,tru,nhan,chia;


        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(ed1.getText().toString());
                int b = Integer.parseInt(ed2.getText().toString());

                int sum = a+b;

                Intent i = new Intent(getBaseContext(),KetQua.class);
                i.putExtra("data",sum);
                startActivity(i);
            }
        });

        btntru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(ed1.getText().toString());
                int b = Integer.parseInt(ed2.getText().toString());

                int tru = a-b;

                Intent i = new Intent(getBaseContext(),KetQua.class);
                i.putExtra("data",tru);
                startActivity(i);
            }
        });


        btnnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(ed1.getText().toString());
                int b = Integer.parseInt(ed2.getText().toString());

                int nhan = a*b;

                Intent i = new Intent(getBaseContext(),KetQua.class);
                i.putExtra("data",nhan);
                startActivity(i);
            }
        });

        btnchia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(ed1.getText().toString());
                int b = Integer.parseInt(ed2.getText().toString());

                int chia = a/b;

                Intent i = new Intent(getBaseContext(),KetQua.class);
                i.putExtra("data",chia);
                startActivity(i);
            }
        });
    }


}
