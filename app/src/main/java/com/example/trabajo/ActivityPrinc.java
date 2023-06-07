package com.example.trabajo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPrinc extends AppCompatActivity {

    Button btncreate,btnlists,btncombo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_princ);

        btncreate = (Button) findViewById(R.id.btncreate);
        btnlists = (Button) findViewById(R.id.btnlistpe);
        btncombo = (Button) findViewById(R.id.btncombo);

        btncreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ActivityCrear.class);
                startActivity(intent);
            }
        });

        btnlists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ActivityList.class);
                startActivity(intent);
            }
        });

        btncombo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ActivityCombo.class);
                startActivity(intent);
            }
        });

    }
}