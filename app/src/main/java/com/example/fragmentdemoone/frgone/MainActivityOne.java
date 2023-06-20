package com.example.fragmentdemoone.frgone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.fragmentdemoone.R;

public class MainActivityOne extends AppCompatActivity {
         FrameLayout framelayoutone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_one);

        framelayoutone = (FrameLayout) findViewById(R.id.framelayoutone);


        FragmentManager fragmentmanager = getSupportFragmentManager();
        FragmentTransaction  fragmenttransaction=fragmentmanager.beginTransaction();
        fragmenttransaction.add(R.id.framelayoutone, new FragmentOne());
        fragmenttransaction.commit();


     //--------------OR-----------------------------------------------

       /* FragmentTransaction  fragmenttransaction = getSupportFragmentManager().beginTransaction();
        fragmenttransaction.add(R.id.framelayoutone, new FragmentOne());
        fragmenttransaction.commit();*/

        //-------------------------------------or-------------------------

        //getSupportFragmentManager().beginTransaction().add(R.id.framelayoutone, new FragmentOne()).commit();
    }
}