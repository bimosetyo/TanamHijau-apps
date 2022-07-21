package com.example.tanamhijau;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ForgetPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgetpassword);
        getSupportActionBar().hide();
    }

    public void onClickForgetBackToLogin(View view) {
        Intent bckLogin = new Intent(ForgetPassword.this, Login.class );
        startActivity(bckLogin);
    }
}


