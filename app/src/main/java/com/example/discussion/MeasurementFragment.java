package com.example.discussion;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class MeasurementFragment extends Fragment {

    // When requested, this adapter returns a DemoObjectFragment,
    // representing an object in the collection.
//    MeasurementPagerAdapter measurementPagerAdapter;
//    ViewPager viewPager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_measurement, container, false);
    }

//    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        measurementPagerAdapter = new MeasurementPagerAdapter(getChildFragmentManager());
//        viewPager = view.findViewById(R.id.pager);
//        viewPager.setAdapter(measurementPagerAdapter);
//    }
}

