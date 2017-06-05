package com.example.naresh.colourmodificationapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RelativeLayout rl;
    Button b1,b2,b3;
    int r=0,g=0,b=0;
    TextView t1,t2,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.btn1);
        b2 = (Button)findViewById(R.id.btn2);
        b3 = (Button)findViewById(R.id.btn3);
        rl=(RelativeLayout)findViewById(R.id.relativelayout);
        t1 = (TextView) findViewById(R.id.txtR);
        t2 = (TextView) findViewById(R.id.txtG);
        t3 = (TextView) findViewById(R.id.txtB);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              r=r+50;
              if(r>250)
                  r=0;
                rl.setBackgroundColor(Color.rgb(r,g,b));
                t1.setText("Count : " + r);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g=g+50;
                if(g>250)
                    g=0;
                rl.setBackgroundColor(Color.rgb(r,g,b));
                t2.setText("Count : " + g);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=b+50;
                if(b>250)
                    b=0;
                rl.setBackgroundColor(Color.rgb(r,g,b));
                t3.setText("Count : " + b);
            }
        });


    }
}
