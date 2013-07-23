package io.recom.news.adapter;

import io.recom.news.fragment.LogInFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class IntroFragmentAdapter extends FragmentPagerAdapter {

	public IntroFragmentAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int position) {
		return new LogInFragment();
	}

	@Override
	public int getCount() {
		return 1;
	}

}
