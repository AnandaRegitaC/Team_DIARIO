package com.example.team_diario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

   String username = "admin";
   String password = "admin123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    EditText Email = findViewById(R.id.Email);
    EditText pass = findViewById(R.id.pass);
    Button btn_login = findViewById(R.id.btn_login);

    btn_login.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (Email.getText().toString().equalsIgnoreCase(username)&& pass.getText().toString().equalsIgnoreCase(password)){
                startActivity(new Intent(Login.this, AddActivity.class));
            }else{
                Toast.makeText(Login.this,"Username/Password Anda Salah", Toast.LENGTH_SHORT).show();
            }
        }
    });
    }
}
