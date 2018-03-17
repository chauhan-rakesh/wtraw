package com.example.rakesh.wraw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Sell_login extends AppCompatActivity {
    private EditText et_Username;
    // Password
    private EditText et_Password;
    // Sign In
    private Button bt_SignIn;
    // Message
    private TextView tv_Message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button b,b1;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);

        // Initialization
        et_Username = (EditText) findViewById(R.id.et_Username);
        et_Password = (EditText) findViewById(R.id.et_Password);
        bt_SignIn = (Button) findViewById(R.id.bt_SignIn);
        tv_Message = (TextView) findViewById(R.id.tv_Message);

        bt_SignIn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Stores User name
                String username = String.valueOf(et_Username.getText());
                // Stores Password
                String password = String.valueOf(et_Password.getText());

                // Validates the User name and Password for admin, admin
                if (username.equals("admin") && password.equals("admin")) {
                    tv_Message.setText("Login Successful!");
                    Intent i = new Intent(Sell_login.this,MainActivity.class);
                    startActivity(i);
                } else {
                    tv_Message.setText("Login Unsuccessful!");
                }
            }
        });
        b = (Button) findViewById(R.id.bt_SignUp);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Sell_login.this,Signup.class) ;
                startActivity(i);
            }
        });
    }
    }

