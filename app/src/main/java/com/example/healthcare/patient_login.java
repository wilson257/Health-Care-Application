package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class patient_login extends AppCompatActivity implements View.OnClickListener{
    TextView txt;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_login);
        txt=(TextView) findViewById(R.id.textView3);
        txt.setOnClickListener(this);

        btn=(Button)findViewById(R.id.button3);
    }


    @Override
    public void onClick(View view) {
        Intent it=new Intent(this,patient_register.class);
        startActivity(it);
    }

    public void newpage(View view) {

    }
}