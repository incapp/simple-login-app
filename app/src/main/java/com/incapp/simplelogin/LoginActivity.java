package com.incapp.simplelogin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText editTextUsername;
    private EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextUsername = findViewById(R.id.editText_username);
        editTextPassword = findViewById(R.id.editText_password);
    }

    public void login(View view) {
        String username = editTextUsername.getText().toString();
        String password = editTextPassword.getText().toString();

        if (username.equals("demo")
                && password.equalsIgnoreCase("demo")) {
            Toast.makeText(LoginActivity.this, "Login Success.", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(LoginActivity.this, MainActivity.class);

            intent.putExtra("MY_DATA", "YOUR_NAME_HERE");

            startActivity(intent);
            finish();
        } else {
            Toast.makeText(LoginActivity.this, "Invalid User.", Toast.LENGTH_SHORT).show();
        }

    }
}
