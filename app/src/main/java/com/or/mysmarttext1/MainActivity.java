package com.or.mysmarttext1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.or.mysmartview.SmartTextView;

public class MainActivity extends AppCompatActivity {
    SmartTextView s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}