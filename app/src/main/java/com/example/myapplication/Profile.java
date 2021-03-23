package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Profile extends AppCompatActivity {

    TextView nametv;
    TextView emailtv;
    TextView passtv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        init();
        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name");
        String email = bundle.getString("email");
        String pass=bundle.getString("pass");

        nametv.setText(name);
        emailtv.setText(email);
        passtv.setText(pass);
    }

    private void init() {
        nametv = findViewById(R.id.nameTv);
        emailtv = findViewById(R.id.emailTv);
        passtv = findViewById(R.id.passwordTv);
    }


}
