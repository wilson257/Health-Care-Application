package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class patient_register extends AppCompatActivity implements View.OnClickListener{
    Button btnreg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_register);
        btnreg=(Button)findViewById(R.id.button4);
        btnreg.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent it=new Intent(this,HomePage.class);
        startActivity(it);
    }
}