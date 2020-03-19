package com.example.lenovo.matrixcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button A,B,aaddb,asubb;
    TextView t1;
    //final int a[][]={{0,0,0},{0,0,0},{0,0,0}};
    //final int b[][]={{0,0,0},{0,0,0},{0,0,0}};
    public static int a[][]=new int[3][3];
    public static int b[][]=new int[3][3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            t1 = (TextView) findViewById(R.id.textView);
            A = (Button) findViewById(R.id.button);
            B = (Button) findViewById(R.id.button2);
            aaddb = (Button) findViewById(R.id.button3);
            asubb = (Button) findViewById(R.id.button4);
            A.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(MainActivity.this, A.class);
                    startActivity(i);
                }
            });
            B.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent j = new Intent(MainActivity.this, B.class);
                    startActivity(j);
                }
            });
            aaddb.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    a[0] = getIntent().getIntArrayExtra("a0");
                    a[1] = getIntent().getIntArrayExtra("a1");
                    a[2] = getIntent().getIntArrayExtra("a2");
                    b[0] = getIntent().getIntArrayExtra("b0");
                    b[1] = getIntent().getIntArrayExtra("b1");
                    b[2] = getIntent().getIntArrayExtra("b2");
                    Intent i = new Intent(MainActivity.this, Aplusb.class);
                    i.putExtra("A0", a[0]);
                    i.putExtra("A1", a[1]);
                    i.putExtra("A2", a[2]);
                    i.putExtra("B0", b[0]);
                    i.putExtra("B1", b[1]);
                    i.putExtra("B2", b[2]);
                    startActivity(i);
                    t1.setText(String.valueOf(a[1][1]));
                }
            });
        }catch (Exception e){}
    }
}
