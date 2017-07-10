package com.boost.jyoung.facebook_pratice.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.boost.jyoung.facebook_pratice.Tab.Newsfeed_fragment;
import com.boost.jyoung.facebook_pratice.Tab.Remainder_fragment;

/**
 * Created by jyoung on 2017. 7. 7..
 */

public class PageAdapter extends FragmentPagerAdapter {
    int tabcount;

    public PageAdapter(FragmentManager fm, int tabcount) {
        super(fm);
        this.tabcount = tabcount;

    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return Newsfeed_fragment.newInstance();
            default:
                return Remainder_fragment.newInstance();
        }
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}