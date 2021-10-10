package com.example.litrogasapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MyProfile extends AppCompatActivity {

    ImageView homeIcon, gasIcon, userIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        homeIcon = findViewById(R.id.homeIcon);
        gasIcon = findViewById(R.id.gasIcon);
        userIcon = findViewById(R.id.profileIcon);
    }

    public void sendMessage3(View view) {
        Intent intent = new Intent(this, EditProfile.class);
        startActivity(intent);
    }

    public void profileToOrders(View view){
        Intent intent = new Intent(this, PreviousOrders.class);
        startActivity(intent);
    }

    public void profileToHome(View view){
        Intent intent = new Intent(this, DashboardNew.class);
        startActivity(intent);
    }

}