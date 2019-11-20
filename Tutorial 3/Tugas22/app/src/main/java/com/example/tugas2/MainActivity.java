package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.*;
import android.view.*;
import android.content.*;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    private TextView header;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        header = (TextView) findViewById(R.id.txtHeader);
    }

    public void launchSecondActivity(View view) {

        Intent intent = new Intent(this, com.example.tugas2.SecondActivity.class);

        startActivity(intent);
    }
}
