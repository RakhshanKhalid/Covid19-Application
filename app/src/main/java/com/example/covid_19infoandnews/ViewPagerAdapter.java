package com.example.covid_19infoandnews;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final ArrayList<Fragment> fragment_list=new ArrayList<>();
    private final ArrayList<String> fragment_title=new ArrayList<>();

    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragment_list.get(position);
    }

    @Override
    public int getCount() {
        return fragment_list.size();
    }

    public void addFragment(Fragment fragment,String title){
        fragment_list.add(fragment);
        fragment_title.add(title);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragment_title.get(position);
    }
}
