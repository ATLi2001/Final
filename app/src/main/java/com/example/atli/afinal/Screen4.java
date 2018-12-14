package com.example.atli.afinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Screen4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);
    }
    public void submit(View view){
        EditText rate = (EditText) findViewById(R.id.rate);
        String rate_text = rate.getText().toString();
        rate.setText(rate_text);

        Toast.makeText(getApplicationContext(),"Thank you for your feedback!", Toast.LENGTH_LONG).show();
    }
}
