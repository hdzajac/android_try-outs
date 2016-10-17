package com.hubz.hubzapp.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hubz.hubzapp.R;

public class ExampleFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        LinearLayout fragment_view = new LinearLayout(getActivity());

        // add text view
        TextView tv = new TextView(getActivity());
        tv.setText(R.string.example_text);
        fragment_view.addView(tv);

        return fragment_view;
    }
}
