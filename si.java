package com.example.si;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button b1;
    EditText t1,t2,t3;
    TextView tt1,tt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(EditText) findViewById(R.id.t1);
        t2=(EditText) findViewById(R.id.t2);
        t3=(EditText) findViewById(R.id.t3);
        tt1=(TextView) findViewById(R.id.tt1);
        tt2=(TextView) findViewById(R.id.tt2);
        Button b1=(Button) findViewById(R.id.be1);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int p=Integer.parseInt(t1.getText().toString());
        int t=Integer.parseInt(t2.getText().toString());
        int r=Integer.parseInt(t3.getText().toString());
        int d;
        d=(p*t*r)/100;
        int e=p+d;
        tt1.setText("Total Interest Is :"+String.valueOf(d));
        tt2.setText("Total Amount is : "+String.valueOf(e));
    }


}



