package com.example.uibasics_12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnManmon;
    private Button btnLogin;
    private TextView txtMon;

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnLogin:
                Toast.makeText(this, "Hello World", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnMon:
                // Toast.makeText(this, "ich haise manmona ", Toast.LENGTH_SHORT).show();
                txtMon.setText("Hello Manmona");
                break;

            default:
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT);
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);

        btnManmon = findViewById(R.id.btnMon);
        btnManmon.setOnClickListener(this);

        txtMon = findViewById(R.id.txtMon);

    }
}