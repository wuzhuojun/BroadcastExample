package com.example.broadcastexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Administrator on 2016/8/29.
 */
public class MyBroadcast2 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Log.v("hehe", "receive22222222222");

        Log.v("hehe", getResultData());

        //篡改信息
        setResultData("receive2 才是老大");
    }
}
