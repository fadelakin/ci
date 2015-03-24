package com.fisheradelakin.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Fisher on 3/21/15.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
