package com.hypermart.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    Button signUp,reset;
    TextView userName,email,password,cPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);



        signUp = findViewById(R.id.signup);
        signUp.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Toast.makeText(SignUp.this, "Sign In to Continue", Toast.LENGTH_SHORT).show();
                SignUp.this.startActivity(new Intent(SignUp.this, SignIn.class));

            }
        });

        reset = findViewById(R.id.reset);
        userName=findViewById(R.id.uName);
        email= findViewById(R.id.eAddress);
        password= findViewById(R.id.pass);
        cPassword= findViewById(R.id.cPass);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                userName.setText("");
                email.setText("");
                password.setText("");
                cPassword.setText("");


            }
        });


    }
}
