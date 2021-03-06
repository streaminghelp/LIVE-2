package com.example.dailytv.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by 荒原中的歌声 on 2016/7/5.
 */
public class PlayAdapter extends FragmentPagerAdapter{

    private List<Fragment> list;


    public PlayAdapter(FragmentManager fm, List<Fragment> list){
        super(fm);
        this.list = list;
    }



    @Override
    public Fragment getItem(int position){
        return list.get(position);
    }

    @Override
    public int getCount(){
        return list.size();
    }
}
