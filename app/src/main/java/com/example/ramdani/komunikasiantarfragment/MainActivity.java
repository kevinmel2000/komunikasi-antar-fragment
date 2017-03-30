package com.example.ramdani.komunikasiantarfragment;

import android.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ramdani.komunikasiantarfragment.fragment.FragmentA;
import com.example.ramdani.komunikasiantarfragment.fragment.FragmentB;
import com.example.ramdani.komunikasiantarfragment.listener.OnFragmentAChangeListener;

public class MainActivity extends AppCompatActivity implements OnFragmentAChangeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (findViewById(R.id.fragment_container) != null) {

            if (savedInstanceState != null) {
                return;
            }

            FragmentA fragmentA = new FragmentA();

            fragmentA.setArguments(getIntent().getExtras());

            getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, fragmentA).commit();
        }

    }

    @Override
    public void changeWord(String kata) {
        FragmentB fragmentB = (FragmentB)
                getSupportFragmentManager().findFragmentById(R.id.fragment_b);

        if (fragmentB != null) {

            fragmentB.updateTextView(kata);

        }else{

            FragmentB newFragment = new FragmentB();

            Bundle args = new Bundle();
            args.putString(newFragment.ARG_GET_DATA_KATA, kata);
            newFragment.setArguments(args);

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, newFragment)
                    .addToBackStack(null).commit();

        }
    }
}
