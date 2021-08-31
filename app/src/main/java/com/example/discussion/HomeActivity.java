package com.example.discussion;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

import org.jetbrains.annotations.NotNull;

import static android.graphics.Color.WHITE;

public class HomeActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // set Home Fragment default
        loadFragment(new HomeFragment());
        // inisialisasi BottomNavigaionView
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        // beri listener pada saat item/menu bottomnavigation terpilih
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }
    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fl_fragment, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        switch (item.getItemId()){
            case R.id.home:
                fragment = new HomeFragment();
                break;
            case R.id.discussion:
                fragment = new DiscussionFragment();
                break;
            case R.id.growth:
                fragment = new GrowthFragment();
                break;
//            case R.id.account_menu:
//                fragment = new AccountFragment();
//                break;
        }
        return loadFragment(fragment);
    }

//    public void setActionBar(String title) {
//        //set title
//        getSupportActionBar().setTitle(title);
//        //using custom toolbar
//        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
//        getSupportActionBar().setCustomView(R.layout.custom_toolbar);
//        //draw toolbar background
//        ColorDrawable color = new ColorDrawable(WHITE);
//        getSupportActionBar().setBackgroundDrawable(color);
//        //back button
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setHomeButtonEnabled(true);
//    }

    public void questionDialog() {
        QuestionDialog questionDialog = new QuestionDialog();
        questionDialog.show(getSupportFragmentManager(), "question dialog");
    }

    //buat tab layout, tp masih error
//    public void setToolbar(){
//        final TabLayout tabLayout = findViewById(R.id.tab_layout);
//        final ViewPager viewPager = findViewById(R.id.pager);
//
//        //Memanggil dan Memasukan Value pada Class PagerAdapter(FragmentManager dan JumlahTab)
//        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount()) {
//            @Override
//            public int getCount() {
//                return 0;
//            }
//
//            @Override
//            public boolean isViewFromObject(@NonNull @NotNull View view, @NonNull @NotNull Object object) {
//                return false;
//            }
//        };
//
//        //Memasang Adapter pada ViewPager
//        viewPager.setAdapter(pagerAdapter);
//
//        /*
//         Menambahkan Listener yang akan dipanggil kapan pun halaman berubah atau
//         bergulir secara bertahap, sehingga posisi tab tetap singkron
//         */
//        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
//
//        //Callback Interface dipanggil saat status pilihan tab berubah.
//        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                //Dipanggil ketika tab memasuki state/keadaan yang dipilih.
//                viewPager.setCurrentItem(tab.getPosition());
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//                //Dipanggil saat tab keluar dari keadaan yang dipilih.
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//                //Dipanggil ketika tab yang sudah dipilih, dipilih lagi oleh user.
//            }
//        });
//    }
}