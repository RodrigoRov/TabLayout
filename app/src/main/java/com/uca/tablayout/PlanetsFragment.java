package com.uca.tablayout;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by uca on 05-07-18.
 */

public class PlanetsFragment extends Fragment implements PlanetViewPagerAdapter.FragmentLifeCycle{
    RecyclerView recyclerView;
    List<Planet> planetList;
    PlanetsListAdapter planetsListAdapter;
    boolean isFav=true;

    public PlanetsFragment() {
        planetList = new ArrayList<>();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.planets_list,container,false);

        if(isFav) {
            ArrayList<Planet> aux = new ArrayList<>();
            for (Planet p: planetList) {
                if (p.isFav())
                    aux.add(p);
            }
            planetsListAdapter = new PlanetsListAdapter(getContext(),aux);
        }else
            planetsListAdapter = new PlanetsListAdapter(getContext(),planetList);

        recyclerView = v.findViewById(R.id.recycler_view);
        recyclerView.setAdapter(planetsListAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(v.getContext()));
        return v;
    }

    public void setPlanetList(List<Planet> planetList) {
        this.planetList = planetList;
    }

    public PlanetsListAdapter getPlanetsListAdapter() {
        return planetsListAdapter;
    }

    public void setPlanetsListAdapter(PlanetsListAdapter planetsListAdapter) {
        this.planetsListAdapter = planetsListAdapter;
    }

    public boolean isFav() {
        return isFav;
    }

    public void setFav(boolean fav) {
        isFav = fav;
    }

    @Override
    public void onPauseFragment() {

    }

    @Override
    public void onResumeFragment() {
        if(isFav) {
            ArrayList<Planet> aux = new ArrayList<>();
            for (Planet p: planetList) {
                Log.d("nombre de PLa",p.getTitulo());
                Log.d("estado FAv",String.valueOf(p.isFav()));
                if (p.isFav())
                    aux.add(p);
            }
            planetsListAdapter = new PlanetsListAdapter(getContext(),aux);
        }
    }
}
