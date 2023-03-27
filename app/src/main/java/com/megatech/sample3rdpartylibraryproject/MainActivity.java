package com.megatech.sample3rdpartylibraryproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.megatech.toasty.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toaster.simpleToast(this,"mutton mada haba");
    }
}