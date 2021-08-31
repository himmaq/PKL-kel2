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
    CardView cvMeasurement, cvGraphs,cvHealth;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_growth, container, false);

        cvMeasurement = view.findViewById(R.id.cv_measurement);
        cvGraphs = view.findViewById(R.id.cv_graph);
        cvHealth = view.findViewById(R.id.cv_health);

        cvMeasurement.setOnClickListener(view1-> {
            getFragmentManager().beginTransaction().replace(R.id.fl_fragment, new MeasurementFragment()).commit();
        });

        cvGraphs.setOnClickListener(view1-> {
            getFragmentManager().beginTransaction().replace(R.id.fl_fragment, new GraphsFragment()).commit();
        });

        cvHealth.setOnClickListener(view1-> {
            getFragmentManager().beginTransaction().replace(R.id.fl_fragment, new SelectChildFragment()).commit();
        });

        return view;
    }
//    public void onResume(){
//        super.onResume();
//        // Set title bar
//        ((HomeActivity) getActivity())
//                .setActionBar("Growth");
//    }
}