package com.example.tugas2;
import androidx.appcompat.app.AppCompatActivity;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.content.*;

public class ActivityIntentFilter extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intentfilter);
        Button btnSend = (Button) findViewById(R.id.sendMail);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent si = new Intent(Intent.ACTION_SEND);
                si.setType("message/rfc822");
                si.putExtra(Intent.EXTRA_EMAIL, new String[]{"lutfifauzan72@gmail.com"});
                si.putExtra(Intent.EXTRA_SUBJECT, "Welcome to AeU Malay Class");
                si.putExtra(Intent.EXTRA_TEXT, "Hi Students, Welcome to My Class");
                startActivity(Intent.createChooser(si, "Choose Mail App"));
            }
        });
    }

}
