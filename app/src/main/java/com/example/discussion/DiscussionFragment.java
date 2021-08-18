package com.example.discussion;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class DiscussionFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_discussion, container, false);
        return view;

        //buat tombol back
//        ActionBar actionBar = getSupportActionBar();
//
//        // showing the back button in action bar
//       actionBar.setDisplayHomeAsUpEnabled(true);

    }

    //ini juga buat tombol back tapi masih error
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        switch (item.getItemId()) {
//            case android.R.id.home:
//                this.finish();
//                return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }
    public void onResume(){
        super.onResume();

        // Set title bar
        ((HomeActivity) getActivity())
                .setActionBarTitle("Discussion");

    }

}
