package com.edu.gvn.vietlottery.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;


public class LotteryPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> fragments = new ArrayList<>();
    private ArrayList<String> titles = new ArrayList<>();

    public LotteryPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
    }

    public void addFragment(Fragment fragment , String title){
        fragments.add(fragment);
        titles.add(title);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }

}
