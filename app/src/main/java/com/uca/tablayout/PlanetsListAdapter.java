package com.uca.tablayout;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by uca on 05-07-18.
 */

public class PlanetsListAdapter extends RecyclerView.Adapter<PlanetsListAdapter.ViewHolder> {
    Context mCtx;
    List<Planet> planets;

    public PlanetsListAdapter(Context mCtx, List<Planet> planets){
        this.mCtx = mCtx;
        this.planets = planets;
    }

    @Override
    public PlanetsListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View v = inflater.inflate(R.layout.planet_cardview,null);
        return new PlanetsListAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PlanetsListAdapter.ViewHolder holder, int position) {
        holder.titulo.setText(planets.get(position).getTitulo());
        holder.desc.setText(planets.get(position).getDesc());
        holder.imagen.setImageResource(planets.get(position).getImagen());
    }

    @Override
    public int getItemCount() {
        return planets.size();
    }

    protected class ViewHolder extends RecyclerView.ViewHolder{
        TextView titulo,desc;
        ImageView imagen;
        public ViewHolder(View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.titulo);
            desc = itemView.findViewById(R.id.descripcion);
            imagen = itemView.findViewById(R.id.Imagen);
        }
    }

}
