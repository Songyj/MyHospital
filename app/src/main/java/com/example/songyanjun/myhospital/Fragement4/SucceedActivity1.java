package com.example.songyanjun.myhospital.Fragement4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.songyanjun.myhospital.Bottom_Toolbar;
import com.example.songyanjun.myhospital.R;


public class SucceedActivity1 extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.succeed);
        toolbar = (Toolbar) findViewById(R.id.succeed_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Button resub = (Button)findViewById(R.id.Btn_resub);
        resub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SucceedActivity1.this, Bottom_Toolbar.class);
                intent.putExtra("id",3);
                startActivity(intent);
            }
        });
    }
}
