package com.mir.bmi;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogInActivity extends AppCompatActivity {

    private Button button;
    private EditText pass;
    Integer ab=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        button=(Button)findViewById(R.id.loginbtn);
        pass=findViewById(R.id.password);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String password=pass.getText().toString();
                for (int i=0;i<password.length();i++){
                    char letter=password.charAt(i);
                    if (i==2) {
                        if(letter=='w' || letter=='W'){
                            openctivity();
                        }
                        else {
                            Toast.makeText(LogInActivity.this,"Login failed! Enter your password again!",Toast.LENGTH_LONG).show();
                            //continue;
                        }
                    }

                }

            }
        });

    }
    public void openctivity(){
        Intent intent =new Intent(this,NextActivity.class);
        startActivity(intent);
    }
}