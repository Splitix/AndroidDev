package com.exetxstate.movielist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Splitix on 11/1/16.
 */

public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    TextView movieTitle;
    TextView movieDesc;
    TextView movieYear;
    ImageView moviePoster;

    public RecyclerViewHolder(View itemView){
        super(itemView);

        movieTitle = (TextView) itemView.findViewById(R.id.movie_titleId);
        movieDesc = (TextView) itemView.findViewById(R.id.movie_descId);
        movieYear = (TextView) itemView.findViewById(R.id.movie_yearId);

        moviePoster = (ImageView) itemView.findViewById(R.id.movie_iconId);



    }
}
