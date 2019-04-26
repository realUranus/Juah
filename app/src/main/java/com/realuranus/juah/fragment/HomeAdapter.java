package com.realuranus.juah.fragment;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.TextView;

public class HomeAdapter extends RecyclerView.Adapter {
    //
    public static class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView textView;
        public MyViewHolder(TextView t){
            super(t);
            textView  = t;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }
}
