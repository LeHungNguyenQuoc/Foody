package com.training.foodypractice.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.training.foodypractice.fragment.HomeFragment;
import com.training.foodypractice.fragment.LoginFrament;
import com.training.foodypractice.fragment.MenuFragment;

public class PagerAdapter extends FragmentPagerAdapter {

	public PagerAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int arg0) {
		Fragment fragment = null;
		switch (arg0) {
		case 0:
			fragment = new MenuFragment();
			break;
		case 1:
			fragment = new HomeFragment();
			break;
		case 2:
			fragment = new LoginFrament();
			break;
		}
		return fragment;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 3;
	}

}
