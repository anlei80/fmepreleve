package com.fme.lersac.preleve.adapter;

import com.fme.lersac.preleve.activity.EditDiversFragment;
import com.fme.lersac.preleve.activity.EditGeneraleFragment;
import com.fme.lersac.preleve.activity.EditPrelevementFragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

public class TabsPagerAdapter extends FragmentPagerAdapter {

	public TabsPagerAdapter(FragmentManager fm) {
		super(fm);
	}
	
	@Override
	public Fragment getItem(int index) {
		
		switch (index) {
        case 0:
            return new EditGeneraleFragment();
        case 1:
            return new EditPrelevementFragment();
        case 2:
            return new EditDiversFragment();
        }
 
        return null;
	}

	@Override
	public int getCount() {
		return 3;
	}

}
