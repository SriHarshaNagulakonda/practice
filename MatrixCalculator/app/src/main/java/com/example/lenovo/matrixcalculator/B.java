package com.example.lenovo.matrixcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class B extends AppCompatActivity {
    int i,j;
    int a[][];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        try{
        final TextView p[][]=new TextView[3][3];
        p[0][0]=(TextView) findViewById(R.id.editText);
        p[0][1]=(TextView) findViewById(R.id.editText1);
        p[0][2]=(TextView) findViewById(R.id.editText2);
        p[1][0]=(TextView) findViewById(R.id.editText3);
        p[1][1]=(TextView) findViewById(R.id.editText4);
        p[1][2]=(TextView) findViewById(R.id.editText5);
        p[2][0]=(TextView) findViewById(R.id.editText6);
        p[2][1]=(TextView) findViewById(R.id.editText7);
        p[2][2]=(TextView) findViewById(R.id.editText8);
        Button ok=(Button) findViewById(R.id.button5);
        Button clr=(Button) findViewById(R.id.button6);
        final int a[][]=new int[3][3];
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i=0;i<3;i++)
                {
                    for(int j=0;j<3;j++)
                        a[i][j]=Integer.parseInt(p[i][j].getText().toString());
                }
                Intent i=new Intent(B.this,MainActivity.class);
                i.putExtra("b0",a[0]);
                i.putExtra("b1",a[1]);
                i.putExtra("b2",a[2]);
                startActivity(i);
            }
        });
        clr.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       for(i=0;i<3;i++)
                                       {
                                           for(j=0;j<3;j++)
                                               p[i][j].setText("");
                                       }
                                   }
                               }
        );}
        catch (Exception e){}
    }
}
