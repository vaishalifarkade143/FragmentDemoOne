package com.example.fragmentdemoone.frgone.demotwo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fragmentdemoone.R;


public class Login extends Fragment {

    View view;
    TextView reg_btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view= inflater.inflate(R.layout.fragment_login, container, false);

        reg_btn = (TextView) view.findViewById(R.id.reg_btn);

//        reg_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FragmentManager fragmentManager = getParentFragmentManager();
//                FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
//                fragmentTransaction.replace(R.id.frmlayout_two,new Register()).commit();
//            }
//        });
//        return view;
//         }

        //second way
        reg_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRegisterFragment();

            }
        });

        return view;
    }
    public  void  openRegisterFragment()
    {
        FragmentManager fragmentManager = getParentFragmentManager();
        FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frmlayout_two,new Register()).commit();

    }
}