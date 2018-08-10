package com.hypermart.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {

    Button b;
    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        txtView = this.findViewById(R.id.signuptxt);
        txtView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SignIn.this, "Loading Sign Up Page", Toast.LENGTH_SHORT).show();
                SignIn.this.startActivity(new Intent(SignIn.this, SignUp.class));

            }
        });


        b = findViewById(R.id.signin);
        b.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Toast.makeText(SignIn.this, "Loading Main Page", Toast.LENGTH_SHORT).show();
                SignIn.this.startActivity(new Intent(SignIn.this, Main.class));

            }
        });
    }

}