package com.example.tugas2;



import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.annotation.Nullable;

public class Activitytoogle extends Activity {
    ToggleButton tg1,tg2;
    Button b1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_toogle);

        tg1 = findViewById(R.id.toggleButton);
        tg2 = findViewById(R.id.toggleButton2);

        b1 = findViewById(R.id.buttons2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer res = new StringBuffer();
                res.append("You have Clicked first ON Button-:D ").append(tg1.getText());
                res.append("\nYou have Clicked second ON Button-:) ").append(tg2.getText());
                Toast.makeText(Activitytoogle.this,res.toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
