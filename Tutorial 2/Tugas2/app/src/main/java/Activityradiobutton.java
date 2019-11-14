package com.example.tugas2;



import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Activityradiobutton extends  Activity{
    RadioGroup rg1;
    RadioButton rb1;
    Button b1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_radiobutton);
        Addlistener();

    }
    public void Addlistener(){
        rg1 = findViewById(R.id.radioGroup);
        b1 = findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int s = rg1.getCheckedRadioButtonId();
                rb1 = findViewById(s);
                Toast.makeText(Activityradiobutton.this,rb1.getText(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
