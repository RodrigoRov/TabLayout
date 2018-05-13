package com.uca.tablayout;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by uca on 05-07-18.
 */

public class PlanetViewPagerAdapter extends FragmentPagerAdapter {
    List<String> titleList;
    List<Fragment> fragmentList;


    public PlanetViewPagerAdapter(FragmentManager fm) {
        super(fm);
        titleList = new ArrayList<>();
        fragmentList = new ArrayList<>();
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position){
        return titleList.get(position);
    }

    public void AddItem(String titleList, Fragment fragment){
        this.titleList.add(titleList);
        fragmentList.add(fragment);
    }

    public interface FragmentLifeCycle{
        public void onPauseFragment();
        public void onResumeFragment();
    }
}
