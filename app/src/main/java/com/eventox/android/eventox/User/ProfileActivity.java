package com.eventox.android.eventox.User;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.eventox.android.eventox.R;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        onNavigateUp();
    }
}
