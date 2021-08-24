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
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.Toolbar;

public class DiscussionFragment extends Fragment {
    ImageView ivInfants, ivPregnancy, ivEducation, ivBehaviour, ivToddlers, ivPreschool, ivParenting, ivTough;

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


        return view;
    }

    public void onResume(){
        super.onResume();

        // Set title bar
        ((HomeActivity) getActivity())
                .setActionBar("Discussion");
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
