package net.wigle.wigleandroid;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import net.wigle.wigleandroid.fragments.ListViewFragment;
import net.wigle.wigleandroid.fragments.OverviewFragment;

public class MainFragmentPagerAdapter extends FragmentPagerAdapter {
    private static final String TAG = "MainFragmentPagerAdapter";
    private Context appContext = null;

    public MainFragmentPagerAdapter(final Context context, final FragmentManager fm) {
        super(fm);
        this.appContext = context;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public Fragment getItem(final int position) {
        switch(position) {
            case 0:
                return new OverviewFragment();
             case 1:
                return new ListViewFragment();
             default:
                Log.e(TAG, "Application requested a non-existing fragment: " + position);
                return null;
        }
    }

	@Override
	public CharSequence getPageTitle(final int position) {
		switch(position) {
			case 0:
				return this.appContext.getString(R.string.fragment_title_overview);
			case 1:
				return this.appContext.getString(R.string.fragment_title_listview);
            default:
                Log.e(TAG, "Application requested a non-existing fragment: " + position);
                return "";
        }
    }
}
