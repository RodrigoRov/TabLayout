package com.uca.tablayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by uca on 05-07-18.
 */

public class PlanetsFragment extends Fragment {
    RecyclerView recyclerView;
    List<Planet> planetList;
    PlanetsListAdapter planetsListAdapter;

    public PlanetsFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //View v = inflater.inflate(R.layout.activity_main);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
