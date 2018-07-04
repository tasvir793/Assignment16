package com.acadview.mainactivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText Name, Password;
    Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name = findViewById(R.id.editText);
        Password = findViewById(R.id.editText2);
        Submit = findViewById(R.id.button);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences sp = getApplicationContext().getSharedPreferences("My_Preference", MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("Name", Name.getText().toString());
                editor.putString("Password", Password.getText().toString());
                editor.commit();
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);

            }



        });
    }

}