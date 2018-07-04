package com.acadview.mainactivity;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.net.PasswordAuthentication;

public class Main2Activity extends AppCompatActivity {
    TextView name,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name=findViewById(R.id.textView);
        password=findViewById(R.id.textView2);
        SharedPreferences sp= getApplicationContext().getSharedPreferences("My_Preference",MODE_PRIVATE);
        String name_f=sp.getString("Name","");
        String password_f=sp.getString("Password","");
        name.setText(name_f);
        password.setText(password_f);
    }
}
