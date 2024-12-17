package com.example.companyapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    Button bt1,bt2;
    EditText et1,et2;
    String name,password,un="admin",pass="12345" ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        et1=(EditText) findViewById(R.id.name);
        et2=(EditText)findViewById(R.id.password);

        bt1=(Button)findViewById(R.id.login);
        bt2=(Button)findViewById(R.id.signup);



        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name=et1.getText().toString();
                password=et2.getText().toString();


                if(name.equals(un) && password.equals(pass))
                {
                    Intent i=new Intent(getApplicationContext(),EmployeDet.class);
                    startActivity(i);
                }
                else{

                    Toast.makeText(getApplicationContext(),"Invalid",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}