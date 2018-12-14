package com.example.atli.afinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openScreen1(View view){
        Intent i = new Intent(this, Screen1.class);
        startActivity(i);
    }
    public void openScreen2(View view){
        Intent i = new Intent(this, Screen2.class);
        startActivity(i);
    }
    public void openScreen3(View view){
        Intent i = new Intent(this, Screen3.class);
        startActivity(i);
    }
    public void openScreen4(View view){
        Intent i = new Intent(this, Screen4.class);
        startActivity(i);
    }

}
