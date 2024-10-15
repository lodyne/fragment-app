package com.example.fragmentapp;

import android.os.Bundle;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class MainActivity extends AppCompatActivity {

    Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);

        Fragment firstFragment = new FirstFragment();
        Fragment secondFragment = new SecondFragment();

        loadFragment(firstFragment);

        button1.setOnClickListener(v -> {
            loadFragment(firstFragment);
        });

        button2.setOnClickListener(v -> {
            loadFragment(secondFragment);
        });

//        button1.setOnClickListener(v -> {
//            loadFragment(new FirstFragment());
//        });
//
//        button2.setOnClickListener(v -> {
//            loadFragment(new SecondFragment());
//        });


    }

    public void loadFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.frame_layout,fragment);

        fragmentTransaction.addToBackStack(null);

        fragmentTransaction.commit();

    }
}