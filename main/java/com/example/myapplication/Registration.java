package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registration extends AppCompatActivity {

    private EditText client_weight, client_height;
    private Button client_reg_finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        client_weight = findViewById(R.id.client_weight);
        client_height = findViewById(R.id.client_height);
        client_reg_finish = findViewById(R.id.client_reg_finish);

        client_reg_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(client_weight.getText().toString().trim().equals("") ||
                        client_height.getText().toString().trim().equals("")){
                    Toast.makeText(Registration.this, R.string.no_user_input,
                            Toast.LENGTH_LONG).show();
                }
                else{
                    startActivity(new Intent(Registration.this, Client_interface.class));
                }
            }
        });
    }
}