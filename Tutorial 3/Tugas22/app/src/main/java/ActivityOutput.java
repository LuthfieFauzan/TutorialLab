package com.example.tugas2;
import android.os.*;
import android.widget.*;

import android.content.*;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityOutput extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);
        TextView result = (TextView)findViewById(R.id.vHasil);
        Intent intent = getIntent();
        String addition = (String)intent.getSerializableExtra("jumlah");
        result.setText(addition);
    }

}
