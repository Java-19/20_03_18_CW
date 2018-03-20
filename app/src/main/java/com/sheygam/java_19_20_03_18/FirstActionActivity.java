package com.sheygam.java_19_20_03_18;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class FirstActionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_action);
        Intent intent = getIntent();
        String action = intent.getAction();
        Uri uri = intent.getData();
        Log.d("MY_TAG", "onCreate: action : " + action+" uri: "+ uri.toString());
    }
}
