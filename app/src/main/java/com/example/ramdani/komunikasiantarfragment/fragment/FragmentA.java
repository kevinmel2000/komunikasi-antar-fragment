package com.example.ramdani.komunikasiantarfragment.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.ramdani.komunikasiantarfragment.R;
import com.example.ramdani.komunikasiantarfragment.listener.OnFragmentAChangeListener;

/**
 * Created by ramdani on 28/03/17.
 */

public class FragmentA extends Fragment {

    OnFragmentAChangeListener onFragmentAChangeListener;

    private Button btnPindah;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_a, container, false);
        btnPindah = (Button) rootView.findViewById(R.id.btn_switch_frag);

        btnPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onFragmentAChangeListener.changeWord("Rizki Ramdani");
            }
        });

        return rootView;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            onFragmentAChangeListener = (OnFragmentAChangeListener) context;
        }catch (ClassCastException e){
            throw new ClassCastException(context.toString()
                    + " must implement OnFragmentAChangeListener");
        }

    }
}
