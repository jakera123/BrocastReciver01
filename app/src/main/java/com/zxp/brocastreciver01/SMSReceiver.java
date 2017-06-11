package com.zxp.brocastreciver01;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;

/**
 * Created by xiaoxin on 2017/6/11.
 */

public class SMSReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
       System.out.println("recerive message");
        //从Intent数据得到消息的内容
        Bundle bundle=intent.getExtras();
        //Bundle对象当中有一个属性名为pdus,这个属性的值是一个Object数组
        Object[] myOBJpdus=(Object[])bundle.get("pdus");
        SmsMessage[] messages=new SmsMessage[myOBJpdus.length];
        System.out.println(messages.length);
        for(int i=0;i<myOBJpdus.length;i++){
            messages[i]=SmsMessage.createFromPdu((byte[])myOBJpdus[i]);
            System.out.println(messages[i].getDisplayMessageBody());
        }



    }
}
