package com.sheygam.java_19_20_03_18;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button sendActionBtn, secondActionBtn, linkBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sendActionBtn = findViewById(R.id.send_action_btn);
        sendActionBtn.setOnClickListener(this);

        secondActionBtn = findViewById(R.id.send_second_action_btn);
        secondActionBtn.setOnClickListener(this);
//        secondActionBtn.setVisibility(View.GONE);
        secondActionBtn.setVisibility(View.INVISIBLE);

        linkBtn = findViewById(R.id.link_btn);
        linkBtn.setOnClickListener(this);
//        findViewById(R.id.send_action_btn)
//                .setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.send_action_btn:
                intent = new Intent("java19.first.action");
                Intent intentChooser = Intent.createChooser(intent,"Choice app?");
                startActivity(intentChooser);
                break;
            case R.id.send_second_action_btn:
                intent = new Intent("java19.second.action");
                startActivity(intent);
                break;
            case R.id.link_btn:
                Uri uri = Uri.parse("http://google.com");
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(uri);
                startActivity(intent);
                break;
        }
    }
}
