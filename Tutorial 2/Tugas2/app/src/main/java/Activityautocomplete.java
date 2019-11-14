package com.example.tugas2;



import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class Activityautocomplete extends Activity {
    AutoCompleteTextView autocmplt;
    // Pembuatan array
    String[] arr = {"Aditia Got Cha", "Kulsum", "Daffa Ahmad", "Edgard Jeremiah", "Farid", "Felix", "Haidar", "Raihan", "Rakha"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Memanggil layout
        setContentView(R.layout.control_autocomplete);
        // Objek AutoComplete
        autocmplt = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, arr);
/* Threshold merupakan fungsi untuk mengatur jumlah huruf yang harus diketikkan sebelum suggestion words untuk autocompleteditampilkan.
Dalam kasus ini kita minta minimum 2 huruf */
        autocmplt.setThreshold(1);
        // Mengatur adapter yag digunakan
        autocmplt.setAdapter(adapter);
    }

}
