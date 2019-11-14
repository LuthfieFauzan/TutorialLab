package com.example.tugas2;



import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Activitycheckbox extends Activity{
    CheckBox ch1,ch2;
    Button b1,b2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_checkbox);

        ch1 = findViewById(R.id.checkBox1);
        ch2 = findViewById(R.id.checkBox2);

        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer result = new StringBuffer();
                result.append("Checkbox1 : ").append(ch1.isChecked());
                result.append("\nCheckbox2 : ").append(ch2.isChecked());
                Toast.makeText(Activitycheckbox.this,result.toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
