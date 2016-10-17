package com.hubz.hubzapp.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextClock;
import android.widget.TextView;

import com.hubz.hubzapp.R;

/**
 * Created by Hubert on 17.10.2016.
 */

public class SecondExampleFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        LinearLayout fragment_view = new LinearLayout(getActivity());

        // add text view
        TextView tc = new TextClock(getActivity());
        fragment_view.addView(tc);

        return fragment_view;
    }
}
