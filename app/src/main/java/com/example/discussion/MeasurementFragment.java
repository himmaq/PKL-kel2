package com.example.discussion;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toolbar;

import com.google.android.material.tabs.TabLayout;

public class MeasurementFragment extends Fragment {

    // When requested, this adapter returns a DemoObjectFragment,
    // representing an object in the collection.
//    MeasurementPagerAdapter measurementPagerAdapter;
//    ViewPager viewPager;

    private CardView cvMeasurementMenu;
    private TextView tvChildName;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_measurement, container, false);

        tvChildName = v.findViewById(R.id.tv_child_name);
        tvChildName.setOnClickListener(view1-> {
            getFragmentManager().beginTransaction().replace(R.id.fl_fragment, new SelectChildFragment()).commit();
        });
//        cvMeasurementMenu = v.findViewById(R.id.cv_measurement_menu);
//        cvMeasurementMenu.setOnClickListener(view1-> {
//            getFragmentManager().beginTransaction().replace(R.id.fl_fragment, new SelectChildFragment()).commit();
//        });


        return v;
    }

//    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        measurementPagerAdapter = new MeasurementPagerAdapter(getChildFragmentManager());
//        viewPager = view.findViewById(R.id.pager);
//        viewPager.setAdapter(measurementPagerAdapter);
//    }
}

