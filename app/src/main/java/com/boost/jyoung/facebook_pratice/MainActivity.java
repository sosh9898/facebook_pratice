package com.boost.jyoung.facebook_pratice;

import android.databinding.DataBindingUtil;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.boost.jyoung.facebook_pratice.Adapter.PageAdapter;
import com.boost.jyoung.facebook_pratice.Tab.Newsfeed_fragment;
import com.boost.jyoung.facebook_pratice.databinding.ActivityMainBinding;
import com.boost.jyoung.facebook_pratice.databinding.FragmentMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    PageAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);


        binding.tablayout.addTab(binding.tablayout.newTab().setIcon(R.drawable.newsfeed_selector));
        binding.tablayout.addTab(binding.tablayout.newTab().setIcon(R.drawable.friend_selector));
        binding.tablayout.addTab(binding.tablayout.newTab().setIcon(R.drawable.alert_selector));
        binding.tablayout.addTab(binding.tablayout.newTab().setIcon(R.drawable.menu_selector));

        binding.directmsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "direct message click!!", Toast.LENGTH_SHORT).show();

            }
        });

        binding.messenger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "messenger click!!", Toast.LENGTH_SHORT).show();
            }
        });

        pagerAdapter = new PageAdapter(getSupportFragmentManager(), binding.tablayout.getTabCount());
        binding.viewpager.setAdapter(pagerAdapter);
        binding.viewpager.setCurrentItem(0);

        binding.viewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(binding.tablayout));
        binding.tablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                binding.viewpager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });




    }

}

