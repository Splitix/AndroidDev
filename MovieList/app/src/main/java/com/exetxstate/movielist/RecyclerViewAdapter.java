package com.exetxstate.movielist;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Splitix on 11/1/16.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    String [] name = { "Doctor Strange", "Inferno", "Trolls", "The Girl on the Train",
            "Keeping Up with the Joneses", "Sully", "Denial", "The Accountant" };

    Context context;
    LayoutInflater inflater;

    public RecyclerViewAdapter(Context context){
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_list, parent, false);
        RecyclerViewHolder viewHolder = new RecyclerViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.movieTitle.setText(name[position]);

    }

    @Override
    public int getItemCount() {
        return name.length;
    }
}
