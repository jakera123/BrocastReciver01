package com.zxp.brocastreciver01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_broadcast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_broadcast=(Button)findViewById(R.id.btn_broadcast);
        btn_broadcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("--------------------------");
                TestReceiver tr=new TestReceiver();
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_EDIT);
                MainActivity.this.sendBroadcast(intent);
            }
        });


    }
}
