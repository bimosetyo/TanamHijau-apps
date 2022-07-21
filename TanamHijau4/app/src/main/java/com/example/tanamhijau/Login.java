package com.example.tanamhijau;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        getSupportActionBar().hide();
    }

    public void onClickGoToDaftar(View view) {
        Intent daftar = new Intent(Login .this, Register.class );
        startActivity(daftar);
    }

    public void onClickGoToLupaPassword(View view) {
        Intent lupapw = new Intent(Login .this, ForgetPassword.class );
        startActivity(lupapw);
    }

    public void onClickbtnLoginMasuk(View view) {
        Intent masuk = new Intent( Login. this, MainActivity.class);
        startActivity(masuk);
    }
}
