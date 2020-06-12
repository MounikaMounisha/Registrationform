package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.text.MessageFormat;

public class MainActivity extends AppCompatActivity {
    EditText name1,roll,phone,email;
    RadioButton male,female;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name1=findViewById(R.id.name1);
        roll=findViewById(R.id.roll);
        phone=findViewById(R.id.phone); email=findViewById(R.id.email);
        male=findViewById(R.id.male);
        female=findViewById(R.id.female);

    }

    public void submit(View view) {
        Toast.makeText(this, "Details are"+name1.getText().toString()+","+roll.getText().toString()+
                ","+phone.getText().toString()+","+email.getText().toString(), Toast.LENGTH_SHORT).show();


    }
}
