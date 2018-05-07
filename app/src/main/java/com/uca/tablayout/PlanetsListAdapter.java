package com.uca.tablayout;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by uca on 05-07-18.
 */

public class PlanetsListAdapter extends RecyclerView.Adapter<PlanetsListAdapter.ViewHolder> {
    Context mCtx;
    List<Planet> planets;

    public PlanetsListAdapter(Context mCtx, List<Planet>){

    }

    @Override
    public PlanetsListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(PlanetsListAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    protected class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }

}
