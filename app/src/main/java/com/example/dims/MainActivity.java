package com.example.dims;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void loginSuccess(View view) {

        Intent i = new Intent(getApplicationContext(), Home.class);

        text = (EditText)findViewById(R.id.editTextPassword);
        String password = String.valueOf(text.getText());
        String type = "login";
        //i.putExtra("Password",password);

        backgroundWorker bgw = new backgroundWorker(this);
        bgw.execute(type,password);

        if(password.equals("1234")){
            //startActivity(i);
        }
        else{
            Toast msg = Toast.makeText(this, "Incorrect Password", Toast.LENGTH_SHORT);
            msg.show();
            text.getText().clear();
            setContentView(R.layout.activity_main);

        }

    }
}