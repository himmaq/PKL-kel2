package com.example.discussion;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class SelectChildFragment extends Fragment {
    Button btnAddChild;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_select_child, container, false);

        btnAddChild = view.findViewById(R.id.btn_add_child);
        btnAddChild.setOnClickListener(view1-> {
            getFragmentManager().beginTransaction().replace(R.id.fl_fragment, new AddChildFragment()).commit();
        });
       return view;
    }
}