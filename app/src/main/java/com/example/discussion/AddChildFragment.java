package com.example.discussion;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class AddChildFragment   extends Fragment {
    private Button btnSave;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_add_children, container, false);

        btnSave = v.findViewById(R.id.bnt_save);
        btnSave.setOnClickListener(view1-> {
            getFragmentManager().beginTransaction().replace(R.id.fl_fragment, new SelectChildFragment()).commit();
        });

        return v;
    }
}