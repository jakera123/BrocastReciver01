package com.zxp.brocastreciver01;

import android.app.Activity;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by xiaoxin on 2017/6/11.
 */

public class TestBC2Activity extends Activity {
    private Button registerButton=null;
    private Button unregisterButton=null;
    private SMSReceiver smsReceiver=null;

    //发送短信会得到通知   在DBMS里
    private static final String SMS_ACTION="android.provider.Telephony.SMS_RECEIVED";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testbc2activity);
        registerButton=(Button)findViewById(R.id.btn_register);
        unregisterButton=(Button)findViewById(R.id.btn_unregister);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                smsReceiver=new SMSReceiver();
                IntentFilter filter=new IntentFilter();
                //为IntentFilter添加一个Action
                filter.addAction(SMS_ACTION);
                //注册到系统当中
                TestBC2Activity.this.registerReceiver(smsReceiver,filter);
            }
        });

        unregisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TestBC2Activity.this.unregisterReceiver(smsReceiver);
            }
        });





    }
}
