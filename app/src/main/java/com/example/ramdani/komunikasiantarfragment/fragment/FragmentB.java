package com.example.ramdani.komunikasiantarfragment.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ramdani.komunikasiantarfragment.R;

/**
 * Created by ramdani on 28/03/17.
 */

public class FragmentB extends Fragment{

    public final static String ARG_GET_DATA_KATA = "GET_KATA";
    TextView txtB;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_b, container, false);
        txtB = (TextView) rootView.findViewById(R.id.tv_world);

        return rootView;
    }

    @Override
    public void onStart() {
        super.onStart();

        Bundle args = getArguments();

        if (args != null) {
            //update text view
            updateTextView(args.getString(ARG_GET_DATA_KATA));
        }

    }

    public void updateTextView(String kata) {
        txtB.setText(kata);
    }
}
