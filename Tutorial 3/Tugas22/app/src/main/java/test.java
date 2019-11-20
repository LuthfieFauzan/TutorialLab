package com.example.tugas2;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

public class test extends Activity {
    String cal="";
    EditText txt;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tester);
        txt = findViewById(R.id.editTexter);
        b1 = findViewById(R.id.btnDua);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal+="1";
                txt.setText(cal);
            }
        });
        b1 = findViewById(R.id.btnDua);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal+="1";
                txt.setText(cal);
            }
        });
        b1 = findViewById(R.id.btnDua);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal+="1";
                txt.setText(cal);
            }
        });
        b1 = findViewById(R.id.btnDua);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal+="1";
                txt.setText(cal);
            }
        });
        b1 = findViewById(R.id.btnDua);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal+="1";
                txt.setText(cal);
            }
        });
        b1 = findViewById(R.id.btnDua);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal+="1";
                txt.setText(cal);
            }
        });
        b1 = findViewById(R.id.btnDua);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal+="1";
                txt.setText(cal);
            }
        });
        b8 = findViewById(R.id.btnDua);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal+="8";
                txt.setText(cal);
            }
        });
        b9 = findViewById(R.id.btnDua9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal+="9";
                txt.setText(cal);
            }
        });
        b10 = findViewById(R.id.btnDua10);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal+="0";
                txt.setText(cal);
            }
        });
    }


}
