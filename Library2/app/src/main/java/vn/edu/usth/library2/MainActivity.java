package vn.edu.usth.library2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;

import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.widget.ViewPager2;


import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity
{
    private static final String TAG = "MainActivity";
    ViewPager2 obj_viewpager;
    ViewPagerAdapter obj_viewpageradapter;
    BottomNavigationView obj_bottomnavigationview;

    private int currentPage = 0;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        obj_viewpager = findViewById(R.id.view_pager);
        obj_viewpageradapter = new ViewPagerAdapter(this);
        obj_viewpager.setAdapter(obj_viewpageradapter);



        obj_bottomnavigationview = findViewById(R.id.bottom_navigation);


        obj_viewpager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback()
        {

            @Override
            public void onPageSelected(int position)
            {
                switch (position)
                {
                    case 0:
                        obj_bottomnavigationview.getMenu().findItem(R.id.home_tab).setChecked(true);
                        break;
                    case 1:
                        obj_bottomnavigationview.getMenu().findItem(R.id.search_tab).setChecked(true);
                        break;
                    case 2:
                        obj_bottomnavigationview.getMenu().findItem(R.id.mylibrary_tab).setChecked(true);
                        break;
                    case 3:
                        obj_bottomnavigationview.getMenu().findItem(R.id.account_tab).setChecked(true);
                        break;

                }
            }
        });

        obj_bottomnavigationview.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.home_tab:
                        currentPage = 0;
                        break;
                    case R.id.search_tab:
                        currentPage = 1;
                        break;
                    case R.id.mylibrary_tab:
                        currentPage = 2;
                        break;
                    case R.id.account_tab:
                        currentPage = 3;
                        break;
                  }
            }
        });
    }
}

