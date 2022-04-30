package com.example.relaxinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void goSleep(View view){
        Intent sound = new Intent(this,Music.class);
        this.startActivity(sound);

    }
    public void goChill(View view){
        Intent sound=new Intent(this,Music.class);
        this.startActivity(sound);
    }
    public void goCreate(View view){


    }
    public void goExciting(View view){
        Intent sound=new Intent(this,Music.class);
        this.startActivity(sound);

    }
    public void goStudy(View view){
        Intent sound=new Intent(this,Music.class);
        this.startActivity(sound);
    }

}