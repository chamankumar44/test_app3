package com.example.test_app3;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import com.example.test_app3.loginFlow.login.LoginActivity;

public class TestClass extends AppCompatActivity {
    private void hello() {
        Intent intent= new Intent(this, LoginActivity.class);
    }
}