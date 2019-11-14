package com.example.tugas2;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.example.tugas2.R;

public class Activitycontrol extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_textview);
    }
}
