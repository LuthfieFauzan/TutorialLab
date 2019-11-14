package com.example.tugas2;



import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.Nullable;


public class Activityimagebutton extends Activity{
    ImageButton imgbutton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_imagebutton);

        imgbutton = findViewById(R.id.imageButton);
        imgbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"You Clicked The Image",Toast.LENGTH_LONG).show();
            }
        });
    }
}
