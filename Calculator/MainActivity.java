package com.example.tonystrak.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    TextView tv;
    Button b1,b2,b3,b4,b5;
    Double num1,num2, results;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.editText4);
        et2=(EditText)findViewById(R.id.editText5);
        b1=(Button)findViewById(R.id.button10);
        b2=(Button)findViewById(R.id.button11);
        b3=(Button)findViewById(R.id.button12);
        b4=(Button)findViewById(R.id.button13);
        b5=(Button)findViewById(R.id.button14);
        tv=(TextView)findViewById(R.id.textView2);
    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            num1=Double.parseDouble(et1.getText().toString());
            num2=Double.parseDouble(et2.getText().toString());
            results=num1+num2;
            tv.setText(Double.toString(results));
        }
    });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Double.parseDouble(et1.getText().toString());
                num2=Double.parseDouble(et2.getText().toString());
                results=num1-num2;
                tv.setText(Double.toString(results));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Double.parseDouble(et1.getText().toString());
                num2=Double.parseDouble(et2.getText().toString());
                results=num1*num2;
                tv.setText(Double.toString(results));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Double.parseDouble(et1.getText().toString());
                num2=Double.parseDouble(et2.getText().toString());
                results=num1/num2;
                tv.setText(Double.toString(results));
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Double.parseDouble(et1.getText().toString());
                num2=Double.parseDouble(et2.getText().toString());
                results=num1%num2;
                tv.setText(Double.toString(results));
            }
        });
    }
}
