package com.mabnets.www.leaseholder;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class About_app extends Fragment {


    public About_app() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View aboutapp= inflater.inflate(R.layout.fragment_about_app, container, false);
      return aboutapp;
    }

}
