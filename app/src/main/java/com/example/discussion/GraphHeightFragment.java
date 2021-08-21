package com.example.discussion;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class GraphHeightFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //  the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_graph_height, container, false);
        return v;
    }
}