package com.camila.ortiz.ortiz_vid_final;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class adaptador {

    static class viewPélicula extends RecyclerView.ViewHolder {
        ImageView imagen;
        TextView nombre;
        CardView card_click;

        public viewPélicula(@NonNull View itemView) {
            super(itemView);

            imagen = itemView.findViewById(R.id.image);
            nombre = itemView.findViewById(R.id.name);


        }
    }
}
