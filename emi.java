package com.example.emi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1;
    EditText t1,t2,t3,t4;
    TextView tt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(EditText) findViewById(R.id.te1);
        t2=(EditText) findViewById(R.id.te2);
        t3=(EditText) findViewById(R.id.te3);
        t4=(EditText) findViewById(R.id.te4);
        tt1=(TextView) findViewById(R.id.emi);
        Button b1=(Button) findViewById(R.id.be1);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        double p,r,n,d,emi;
        p=Double.parseDouble(t1.getText().toString());
        d=Double.parseDouble(t2.getText().toString());
        p=p-d;
        r=Double.parseDouble(t3.getText().toString());
        r=r/(12*100);
        n=Double.parseDouble(t4.getText().toString());
        emi=p*(r*Math.pow((1+r),n))/(Math.pow((1+r),n)-1);
        emi=10 + (emi/12);
        tt1.setText(String.valueOf(emi));

    }
}