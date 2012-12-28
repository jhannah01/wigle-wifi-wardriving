package net.wigle.wigleandroid.fragments;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ListViewFragment extends Fragment {
    class IncomingHandler extends Handler {
        @Override
        public void handleMessage(final Message msg) {
        
        }
    }

    private static final String TAG = "ListViewFragment";

}
