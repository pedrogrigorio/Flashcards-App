package com.example.flashcards_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    public void acessMainScreen(View view) {
        Intent in = new Intent(ProfileActivity.this, MainActivity.class);
        startActivity(in);
    }
}