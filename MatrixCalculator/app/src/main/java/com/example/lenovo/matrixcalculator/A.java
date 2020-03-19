package com.example.lenovo.matrixcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class A extends AppCompatActivity {
    int i,j;
    int a[][];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        try {
            final TextView p[][] = new TextView[3][3];
            p[0][0] = (TextView) findViewById(R.id.editText00);
            p[0][1] = (TextView) findViewById(R.id.editText01);
            p[0][2] = (TextView) findViewById(R.id.editText02);
            p[1][0] = (TextView) findViewById(R.id.editText10);
            p[1][1] = (TextView) findViewById(R.id.editText11);
            p[1][2] = (TextView) findViewById(R.id.editText12);
            p[2][0] = (TextView) findViewById(R.id.editText20);
            p[2][1] = (TextView) findViewById(R.id.editText21);
            p[2][2] = (TextView) findViewById(R.id.editText22);
            Button ok = (Button) findViewById(R.id.button5);
            Button clr = (Button) findViewById(R.id.button6);
            final int a[][] = new int[3][3];
            ok.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++)
                            a[i][j] = Integer.parseInt(p[i][j].getText().toString());
                    }
                    Intent i = new Intent(A.this, MainActivity.class);
                    i.putExtra("a0", a[0]);
                    i.putExtra("a1", a[1]);
                    i.putExtra("a2", a[2]);
                    startActivity(i);
                }
            });
            clr.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           for (i = 0; i < 3; i++) {
                                               for (j = 0; j < 3; j++)
                                                   p[i][j].setText("");
                                           }
                                       }
                                   }
            );
        }catch (Exception e){}
    }
}