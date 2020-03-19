package com.example.lenovo.matrixcalculator;
import  com.example.lenovo.matrixcalculator.MainActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Aplusb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aplusb);
       try {
           final TextView t1 = (TextView) findViewById(R.id.textView2);
           Button b1=(Button) findViewById(R.id.button7);
           b1.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {

                   int a[][]=new int[3][3];
                   int b[][]=new int[3][3];
                   int c[][] = new int[3][3];
           a[0]=getIntent().getIntArrayExtra("A0");
        a[1]=getIntent().getIntArrayExtra("A1");
        a[2]=getIntent().getIntArrayExtra("A2");
        b[0]=getIntent().getIntArrayExtra("B0");
        b[1]=getIntent().getIntArrayExtra("B1");
        b[2]=getIntent().getIntArrayExtra("B2");
                   for (int i = 0; i < 3; i++) {
                       for (int j = 0; j < 3; j++)
                           c[i][j] = a[i][j] + b[i][j];
                   }
                   t1.setText("\tA\n");
                   for (int i = 0; i < 3; i++) {
                       for (int j = 0; j < 3; j++)
                           t1.setText(t1.getText().toString() + "\t\t\t" + a[i][j]);
                       t1.setText(t1.getText().toString() + "\n\n");
                   }
                   t1.setText(t1.getText().toString()+"\n\n\tB\n");
                   for (int i = 0; i < 3; i++) {
                       for (int j = 0; j < 3; j++)
                           t1.setText(t1.getText().toString() + "\t\t\t" + b[i][j]);
                       t1.setText(t1.getText().toString() + "\n\n");
                   }
                   t1.setText(t1.getText().toString()+"\n\n\tC=A+B\n");
                   for (int i = 0; i < 3; i++) {
                       for (int j = 0; j < 3; j++)
                           t1.setText(t1.getText().toString() + "\t\t\t" + c[i][j]);
                       t1.setText(t1.getText().toString() + "\n\n");
                   }
               }
           });
       }catch (Exception e){}
    }
}
