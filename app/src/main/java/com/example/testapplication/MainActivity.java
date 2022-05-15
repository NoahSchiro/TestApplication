package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //Button click method (for some unknown reason
    //these methods need to accept a view)
    public void authenticationBtnClk(View view) {

        //Gather the data that was given
        EditText nameView = findViewById(R.id.nameInput);
        String nameText = nameView.getText().toString();

        EditText passwordView = findViewById(R.id.passwordInput);
        String passwordText = passwordView.getText().toString();

        EditText emailView = findViewById(R.id.emailInput);
        String emailText = emailView.getText().toString();

        //Gather the objects that we want to modify
        TextView nameOut = findViewById(R.id.nameOutput);
        TextView passwordOut = findViewById(R.id.passwordOut);
        TextView emailOut = findViewById(R.id.emailOut);

        //Give those objects the right data
        nameOut.setText(nameText);
        passwordOut.setText(passwordText);
        emailOut.setText(emailText);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //Not sure what this one does yet
        super.onCreate(savedInstanceState);

        //This code will change what view we are seeing
        setContentView(R.layout.activity_main);
    }
}