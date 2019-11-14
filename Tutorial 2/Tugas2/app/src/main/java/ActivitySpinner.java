package com.example.tugas2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.Nullable;


import java.util.ArrayList;
import java.util.List;

public class ActivitySpinner extends Activity implements AdapterView.OnItemSelectedListener{


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_spinner);

        Spinner spinner = findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);
        List<String> categori = new ArrayList<String>();
        categori.add("Automobile");
        categori.add("Business Services");
        categori.add("Computers");
        categori.add("Education");
        categori.add("Personal");
        categori.add("Travel");

        ArrayAdapter<String> dataadapter = new ArrayAdapter<String >(this,android.R.layout.simple_spinner_item,categori);
        dataadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataadapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String item = parent.getItemAtPosition(position).toString();
        Toast.makeText(ActivitySpinner.this,"Selected "+ item,Toast.LENGTH_LONG).show();
    }

    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }


    {

    }
}