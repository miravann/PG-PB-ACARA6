package com.example.acara6;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class TabAdapter extends FragmentStateAdapter {
    Fragment fragment[] = {new FirstFragment(), new SecondFragment()};
    public TabAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0)
        {
            FirstFragment ff = new FirstFragment();
            return ff;
        }
        else if (position == 1)
        {
            SecondFragment sf = new SecondFragment();
            return sf;
        }
        //return null;
        return fragment[position];
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}