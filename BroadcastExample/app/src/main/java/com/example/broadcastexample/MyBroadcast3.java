package com.example.broadcastexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Administrator on 2016/8/29.
 */
public class MyBroadcast3 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Log.v("hehe", "receive33333333333");

        setResultData("receive3 是老大");
    }
}
