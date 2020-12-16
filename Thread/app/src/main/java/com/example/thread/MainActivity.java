package com.example.thread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=new TextView(this);

        t=(TextView)findViewById(R.id.tv);
        t.setText("Got message");
        Handler handler = new Handler();
        handler.postDelayed(runTimer, 2000);
    }
    private  Runnable runTimer = new Runnable() {
        @Override
        public void run() {
            Message msg = new Message();
            msg.obj = "Got it";
            Handler handler = new Handler();
            TextView textView = (TextView)findViewById(R.id.tv);
            handler.sendMessage(msg);
            textView.setText("Got it");


        }
    };
}
