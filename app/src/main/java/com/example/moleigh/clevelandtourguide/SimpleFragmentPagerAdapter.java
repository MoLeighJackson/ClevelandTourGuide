package com.example.moleigh.clevelandtourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    public SimpleFragmentPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new EdgewaterFragment();
        } else if (position == 1) {
            return new LincolnParkFragment();
        } else if (position == 2) {
            return new PublicSquareFragment();
        } else {
            return new SteelyardCommonsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}