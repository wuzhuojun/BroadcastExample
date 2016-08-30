package com.example.broadcastexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @OnClick(R.id.btn_send_broadcast)
    void OnClickSendBroadcast()
    {
        Intent intent = new Intent();
        intent.setAction("com.example.broadcastexample.MY_BROADCAST");
        sendOrderedBroadcast(intent, null);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ButterKnife.bind(this);
    }
}
