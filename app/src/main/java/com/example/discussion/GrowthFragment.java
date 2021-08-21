package com.example.discussion;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class GrowthFragment extends Fragment {
    CardView cv_measurement, cv_graphs;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_growth, container, false);

        cv_measurement = view.findViewById(R.id.cv_measurement);
        cv_graphs = view.findViewById(R.id.cv_graph);

        cv_measurement.setOnClickListener(view1-> {
            getFragmentManager().beginTransaction().replace(R.id.fl_fragment, new MeasurementFragment()).commit();
        });

        cv_graphs.setOnClickListener(view1-> {
            getFragmentManager().beginTransaction().replace(R.id.fl_fragment, new GraphsFragment()).commit();
        });

        return view;
    }
    public void onResume(){
        super.onResume();
        // Set title bar
        ((HomeActivity) getActivity())
                .setActionBar("Growth");
    }
}