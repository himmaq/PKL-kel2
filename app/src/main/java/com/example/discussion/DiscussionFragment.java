package com.example.discussion;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;


public class DiscussionFragment extends Fragment {

    ImageView ivInfants, ivPregnancy, ivEducation, ivBehaviour, ivToddlers, ivPreschool, ivParenting, ivTough;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    RecyclerView recview;

    DiscussionAdapter adapter;

    public DiscussionFragment(){

    }

    public static DiscussionFragment newInstance(String param1, String param2){
        DiscussionFragment fragment = new DiscussionFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        if(getArguments() != null){
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_discussion, container, false);

        ivInfants = view.findViewById(R.id.infants_img);
        ivPregnancy = view.findViewById(R.id.pregnancy_img);
        ivEducation = view.findViewById(R.id.edu_img);
        ivBehaviour = view.findViewById(R.id.behavior_img);
        ivToddlers = view.findViewById(R.id.toodlers_img);
        ivPreschool = view.findViewById(R.id.preschool_img);
        ivParenting = view.findViewById(R.id.parenting_img);
        ivTough = view.findViewById(R.id.tough_img);

        recview = view.findViewById(R.id.rv_recent_discussion);
        recview.setLayoutManager(new LinearLayoutManager(getContext()));

        ivInfants.setOnClickListener(view1-> {
            getFragmentManager().beginTransaction().replace(R.id.fl_fragment, new MenuDiscussionFragment()).commit();
        });

        ivPregnancy.setOnClickListener(view1-> {
            getFragmentManager().beginTransaction().replace(R.id.fl_fragment, new MenuDiscussionFragment()).commit();
        });

        ivEducation.setOnClickListener(view1-> {
            getFragmentManager().beginTransaction().replace(R.id.fl_fragment, new MenuDiscussionFragment()).commit();
        });

        ivBehaviour.setOnClickListener(view1-> {
            getFragmentManager().beginTransaction().replace(R.id.fl_fragment, new MenuDiscussionFragment()).commit();
        });
        ivToddlers.setOnClickListener(view1-> {
            getFragmentManager().beginTransaction().replace(R.id.fl_fragment, new MenuDiscussionFragment()).commit();
        });

        ivPreschool.setOnClickListener(view1-> {
            getFragmentManager().beginTransaction().replace(R.id.fl_fragment, new MenuDiscussionFragment()).commit();
        });
        ivParenting.setOnClickListener(view1-> {
            getFragmentManager().beginTransaction().replace(R.id.fl_fragment, new MenuDiscussionFragment()).commit();
        });
        ivTough.setOnClickListener(view1-> {
            getFragmentManager().beginTransaction().replace(R.id.fl_fragment, new MenuDiscussionFragment()).commit();
        });

        FirebaseRecyclerOptions<Model> options =
                new FirebaseRecyclerOptions.Builder<Model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("User"), Model.class)
                        .build();

        adapter = new DiscussionAdapter(options);
        recview.setAdapter(adapter);

        return view;
    }

//    public void onResume(){
//        super.onResume();
//
//        // Set title bar
//        ((HomeActivity) getActivity())
//                .setActionBar("Discussion");
//    }

    @Override
    public void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    public void onStop() {
        super.onStop();
        adapter.stopListening();
    }

    //    buat back button tp blum bisa
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch(item.getItemId()) {
//            case android.R.id.home:
//                getActivity().onBackPressed();
//                return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }
}
