package com.example.songyanjun.myhospital.Login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.songyanjun.myhospital.Bottom_Toolbar;
import com.example.songyanjun.myhospital.R;

public class Login extends AppCompatActivity {
    private EditText accountEdit;

    private EditText passwordEdit;

    private Button login;
    private Button resign;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login1);

        accountEdit = (EditText) findViewById(R.id.account);
        passwordEdit = (EditText) findViewById(R.id.password);
        resign = (Button) findViewById(R.id.resign);
        resign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, Resign.class);
                startActivity(intent);
                finish();
            }
        });
        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String account = accountEdit.getText().toString();
                String password = passwordEdit.getText().toString();
                // 如果账号是admin且密码是123456，就认为登录成功。
                if (account.equals("admin") && password.equals("123456")) {
                    Intent intent = new Intent(Login.this, Bottom_Toolbar.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(Login.this, "账户或者密码错误",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
