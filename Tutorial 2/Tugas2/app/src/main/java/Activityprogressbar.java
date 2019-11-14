
package com.example.tugas2;



import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;

public class Activityprogressbar extends Activity {
    Button b1;
    private ProgressDialog pb1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_progressbar);
        b1=findViewById(R.id.button2);
    }

    public void download(View view){
        pb1=new ProgressDialog(this);
        pb1.setMessage("download Music");
        pb1.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        pb1.setIndeterminate(true);
        pb1.setProgress(5);
        pb1.show();

        final int total = 100;
        final Thread t = new Thread(){
            @Override
            public void run(){
                int jt = 0;
                while (jt<total){
                    try{
                        sleep(20);
                        jt+=5;
                        pb1.setProgress(jt);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        };
        t.start();
    }
}
