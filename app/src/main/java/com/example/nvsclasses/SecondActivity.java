package com.example.nvsclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ListView listView = findViewById(R.id.listView);

        String[] features = {"NCERT Books","NCERT Solutions","Previous Year Papers",
                "Sample Papers","Test papers ","FEE Payment", "Contact Admin"};
        

    }
}