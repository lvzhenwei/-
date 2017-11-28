package com.example.mmaster.android_xsx_day08.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by mMaster on 2017/11/27.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> mList;

    public MyPagerAdapter(FragmentManager fm, ArrayList<Fragment> mList) {
        super(fm);
        this.mList = mList;
    }

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return mList.get(position);
    }

    @Override
    public int getCount() {
        return mList.size();
    }
}
