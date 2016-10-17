package com.example.tonystrak.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    Button b;
    String u,p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                u=et1.getText().toString();
                p=et2.getText().toString();
                if((u.equals("cbit"))&& (p.equals("vbit"))){
                    Toast.makeText(MainActivity.this, "Login Successfully", Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(MainActivity.this,SecoundActivity.class);
                    startActivity(i);
                }
            else
                {
                    Toast.makeText(MainActivity.this, "Try Again", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
