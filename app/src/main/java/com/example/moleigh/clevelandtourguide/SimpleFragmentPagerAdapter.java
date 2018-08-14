package com.example.moleigh.clevelandtourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        mContext = context;
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

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.location_edgewater);
        } else if (position == 1) {
            return mContext.getString(R.string.location_lincolnpark);
        } else if (position == 2) {
            return mContext.getString(R.string.location_publicsquare);
        } else {
            return mContext.getString(R.string.location_steelyardcommons);
        }

    }
}