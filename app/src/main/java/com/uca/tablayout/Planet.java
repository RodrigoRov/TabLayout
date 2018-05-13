package com.uca.tablayout;

/**
 * Created by uca on 05-07-18.
 */

class Planet {
    String titulo;
    String desc;
    int Imagen;
    boolean fav = false;

    public Planet(String titulo,String desc,int Imagen){
        this.titulo = titulo;
        this.desc = desc;
        this.Imagen = Imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImagen() {
        return Imagen;
    }

    public void setImagen(int imagen) {
        Imagen = imagen;
    }

    public boolean isFav() {
        return fav;
    }

    public void setFav(boolean fav) {
        this.fav = fav;
    }
}
