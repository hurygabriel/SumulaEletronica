package com.projeto.sumula.sumulaeletronica.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.projeto.sumula.sumulaeletronica.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentArbitro extends Fragment {


    public FragmentArbitro() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_arbitro, container, false);
    }

}