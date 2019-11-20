package com.example.tugas2;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.*;
import android.os.*;
import android.view.*;
import android.content.*;


public class SecondActivity extends AppCompatActivity {
    private TextView header;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        header = (TextView) findViewById(R.id.txtHeader);
    }

    public void returnReply(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
