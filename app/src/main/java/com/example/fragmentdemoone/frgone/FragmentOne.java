 package com.example.fragmentdemoone.frgone;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.fragmentdemoone.R;


public class FragmentOne extends Fragment
{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_one,container,false);

     Button   btnone = (Button) view.findViewById(R.id.btnone);

     btnone.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Toast.makeText(getActivity(), "Fragment", Toast.LENGTH_SHORT).show();
         }
     });
        // Inflate the layout for this fragment
        return view;
    }
}