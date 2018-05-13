package com.uca.tablayout;

import android.content.res.TypedArray;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    PlanetViewPagerAdapter pagerAdapter;
    List<Planet> planetList;
    PlanetsFragment planetFragment,favoriteFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fillPlanet();

        planetFragment= new PlanetsFragment();
        favoriteFragment = new PlanetsFragment();
        planetFragment.setPlanetList(planetList);
        planetFragment.setFav(false);
        favoriteFragment.setPlanetList(planetList);

        toolbar = findViewById(R.id.tool_bar);
        toolbar.setTitle(R.string.app_name);
        setSupportActionBar(toolbar);

        pagerAdapter = new PlanetViewPagerAdapter(getSupportFragmentManager());
        pagerAdapter.AddItem("Planetas",planetFragment);
        pagerAdapter.AddItem("Favoritos",favoriteFragment);

        viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(pagerAdapter);

        tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setupWithViewPager(viewPager,true);

        
    }

    public void fillPlanet(){
        planetList = new ArrayList<>();
        String [] desc = getResources().getStringArray(R.array.Parrafos);
        String [] titulos = getResources().getStringArray(R.array.Planets);
        TypedArray imagenes = getResources().obtainTypedArray(R.array.ImagenesPlanetas);
        for(int i =0;i<desc.length;i++){
            planetList.add(new Planet(titulos[i],desc[i],imagenes.getResourceId(i,-1)));
        }
    }
}
