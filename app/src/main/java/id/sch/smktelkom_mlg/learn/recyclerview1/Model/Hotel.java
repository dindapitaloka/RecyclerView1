package id.sch.smktelkom_mlg.learn.recyclerview1.Model;

import android.graphics.drawable.Drawable;

/**
 * Created by USER-ASUS on 12/11/2016.
 */
public class Hotel
{
    public String judul;
    public String deskripsi;
    public Drawable foto;

    public Hotel(String judul, String deskripsi, Drawable foto)
    {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.foto = foto;
    }
}
