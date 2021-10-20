package com.example.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tegstu = (TextView) findViewById(R.id.textView);
        tegstu.setText(String.valueOf(count));
        Button toast = (Button) findViewById(R.id.toast);
        Button countButt = (Button) findViewById(R.id.count);
        toast.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                count = 0;
                tegstu.setText(String.valueOf(count));
            }
        });
        countButt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                count++;
                tegstu.setText(String.valueOf(count));
            }
        });
    }

}