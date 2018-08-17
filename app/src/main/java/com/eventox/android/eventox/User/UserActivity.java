package com.eventox.android.eventox.User;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.eventox.android.eventox.R;

public class UserActivity extends AppCompatActivity implements LoginFragment.OnFragmentInteractionListener,SignupFragment.OnFragmentInteractionListener{

    private boolean USER_SIGNED_IN = true;

    @Override
    protected void onStart() {
        super.onStart();
        if(!USER_SIGNED_IN){
            LoginFragment fragment = new LoginFragment();
            getSupportFragmentManager().beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                    .add(R.id.frameLayout,fragment)
                    .commit();
        }else{
            startActivity(new Intent(this,ProfileActivity.class));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        getSupportActionBar().hide();


    }

    @Override
    public void onSignupClicked() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frameLayout,new SignupFragment())
                .commit();
    }

    @Override
    public void onLoginClicked() {
        getSupportFragmentManager().
                beginTransaction()
                .replace(R.id.frameLayout,new LoginFragment())
                .commit();
    }
}
