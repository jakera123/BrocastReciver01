package com.zxp.brocastreciver01;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by xiaoxin on 2017/6/6.
 */

public class TestReceiver extends BroadcastReceiver {

    public TestReceiver(){
        System.out.println("TestReceiver");
    }



    @Override
    public void onReceive(Context context, Intent intent) {
        System.out.println("onReceive");
    }
}
