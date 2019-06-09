package com.iappstogo.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View buttonView) {

        Toast.makeText(this, "Hi There!", Toast.LENGTH_LONG).show();

        EditText myTextField = (EditText) findViewById(R.id.myTextField);

        Log.i("Info",  myTextField.getText().toString());

        Log.i("Info","Button Pressed!");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
