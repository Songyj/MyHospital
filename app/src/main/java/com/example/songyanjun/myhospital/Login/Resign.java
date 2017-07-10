package com.example.songyanjun.myhospital.Login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.songyanjun.myhospital.Bottom_Toolbar;
import com.example.songyanjun.myhospital.R;

/**
 * Created by songyanjun on 2017/4/21.
 */

public class Resign extends AppCompatActivity {

    private EditText accountEdit;
    private EditText passwordEdit;

    private Button login;

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login2);

        toolbar = (Toolbar) findViewById(R.id.resign_toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Resign.this,Login.class);
                startActivity(intent);
            }
        });
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        accountEdit = (EditText)findViewById(R.id.resign_account);
        passwordEdit = (EditText)findViewById(R.id.resign_password);

        login = (Button)findViewById(R.id.resign_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Resign.this, Bottom_Toolbar.class);
                startActivity(intent);
            }
        });

    }
}
