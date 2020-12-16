package com.example.thecoffeehouse.Login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.thecoffeehouse.R;

public class signupActivity extends AppCompatActivity {
    private Button btnsignup;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        btnsignup=(Button) findViewById(R.id.btn_signin);
        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(signupActivity.this, com.example.thecoffeehouse.Login.LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
