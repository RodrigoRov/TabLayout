package com.uca.tablayout;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by uca on 05-07-18.
 */

public class PlanetsListAdapter extends RecyclerView.Adapter<PlanetsListAdapter.ViewHolder> {
    Context mCtx;
    List<Planet> planets;
    boolean isFav = true;

    public PlanetsListAdapter(Context mCtx, List<Planet> planets,boolean isFav){
        this.mCtx = mCtx;
        this.planets = planets;
        this.isFav = isFav;
    }

    @Override
    public PlanetsListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        if(!isFav) {
            View v = inflater.inflate(R.layout.planet_cardview, null);
            return new PlanetsListAdapter.ViewHolder(v);
        }else {
            View v = inflater.inflate(R.layout.planet_sinimagebutton, null);
            return new PlanetsListAdapter.ViewHolder(v);
        }

    }

    @Override
    public void onBindViewHolder(final PlanetsListAdapter.ViewHolder holder, final int position) {
        holder.titulo.setText(planets.get(position).getTitulo());
        holder.desc.setText(planets.get(position).getDesc());
        holder.imagen.setImageResource(planets.get(position).getImagen());
        try {
            holder.boton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Planet planet = planets.get(position);
                    planet.setFav(!planet.isFav());
                    if (holder.Nofav) {
                        holder.boton.setImageResource(android.R.drawable.btn_star_big_on);
                        holder.Nofav = !holder.Nofav;
                    } else {
                        holder.boton.setImageResource(android.R.drawable.btn_star_big_off);
                        holder.Nofav = !holder.Nofav;
                    }
                }
            });
        } catch (NullPointerException ignored) {
            //Log.d("Exception",ignored.getMessage());
        }

    }

    @Override
    public int getItemCount() {
        return planets.size();
    }

    protected class ViewHolder extends RecyclerView.ViewHolder{
        TextView titulo,desc;
        ImageView imagen;
        ImageButton boton;
        boolean Nofav = true;
        public ViewHolder(View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.titulo);
            desc = itemView.findViewById(R.id.descripcion);
            imagen = itemView.findViewById(R.id.Imagen);
            boton = itemView.findViewById(R.id.boton);
        }
    }

}
