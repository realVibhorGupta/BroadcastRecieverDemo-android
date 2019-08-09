package com.example.vibhor.broadcastreceiverdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void broadcastIntent(View view)
    {
        Intent intent = new Intent();
        intent.setAction("vibhor's intent");
        sendBroadcast(intent);
    }
}
