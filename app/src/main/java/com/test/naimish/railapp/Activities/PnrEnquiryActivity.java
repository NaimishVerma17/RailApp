package com.test.naimish.railapp.Activities;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.view.MenuItem;

import com.test.naimish.railapp.Fragments.PnrEnquiryFragment;
import com.test.naimish.railapp.R;

/**
 * Created by Vivek on 2/19/2018.
 */

public class PnrEnquiryActivity extends SingleFragmentActivity {
    private static final String TOOL_BAR_TITLE = "PNR ENQUIRY";

    @Override
    protected boolean showToolbar() {
        return true;
    }

    @Override
    protected String getToolbarTitle() {
        return TOOL_BAR_TITLE;
    }

    @Override
    protected int getToolbarColor() {
        return R.color.transparent;
    }

    @Override
    protected boolean showBackButton() {
        return true;
    }

    @Override
    protected Fragment getFragmentInstance() {
        return PnrEnquiryFragment.newInstance();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home){
            startActivity(new Intent(this, EnquiryActivity.class));
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
