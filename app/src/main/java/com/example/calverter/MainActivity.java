package com.example.calverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    EditText etName;
    EditText etPass;
    String username;
    String password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        btnLogin = (Button) findViewById(R.id.btnLogin);
        etName = (EditText) findViewById(R.id.etName);
        etPass = (EditText) findViewById(R.id.etPass);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etName.getText().toString();
                String password = etPass.getText().toString();
                if (username.equals("hur") && password.equals("1234")){
                    Toast.makeText(MainActivity.this, "Welcome to Calverter", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
                    etName.setText("");
                    etPass.setText("");
                }else if (etName.length() == 0){
                    etName.setError("Enter Name Please");
                }else if (etPass.length()==0){
                    etPass.setError("Enter Password Please");
                }else {
                    Toast.makeText(MainActivity.this, "INVALID CREDENTIALS", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}