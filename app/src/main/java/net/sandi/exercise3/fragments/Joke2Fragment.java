package net.sandi.exercise3.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.sandi.exercise3.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Joke2Fragment extends Fragment {


    public Joke2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_joke2, container, false);


        return view;


    }

}
