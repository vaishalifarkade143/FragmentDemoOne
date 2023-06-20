package com.example.fragmentdemoone.frgone.demotwo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.example.fragmentdemoone.R;

public class MainActivityTwo extends AppCompatActivity {

    FrameLayout frmlayout_two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_two);

        frmlayout_two = (FrameLayout) findViewById(R.id.frmlayout_two);

        //to open by default fragment i.e login
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frmlayout_two, new Login());
        fragmentTransaction.commit();
    }
}