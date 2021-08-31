package com.example.discussion;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class MenuDiscussionFragment extends Fragment {
    private Button btnAddQuestion;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    RecyclerView recview;

    DiscussionAdapter adapter;

    public MenuDiscussionFragment(){
    }

    public static MenuDiscussionFragment newInstance(String param1, String param2){
        MenuDiscussionFragment fragment = new MenuDiscussionFragment();
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_menu_discussion, container, false);

        recview = v.findViewById(R.id.rv_menu_discussion);
        recview.setLayoutManager(new LinearLayoutManager(getContext()));

        btnAddQuestion = v.findViewById(R.id.btn_add_question);
        btnAddQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((HomeActivity) getActivity())
                        .questionDialog();
            }
        });


        FirebaseRecyclerOptions<Model> options =
                new FirebaseRecyclerOptions.Builder<Model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("User"), Model.class)
                        .build();

        adapter = new DiscussionAdapter(options);
        recview.setAdapter(adapter);

        return v;
    }
//    private void questionDialog() {
//        QuestionDialog questionDialog = new QuestionDialog();
//        questionDialog.show();
//    }
}