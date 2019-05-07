package com.realuranus.juah.fragment;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.TextView;

public class HomeAdapter extends RecyclerView.Adapter {
    //
    private String[] mData;
    public HomeAdapter(String[] data){
        this.mData = data;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView textView;
        public MyViewHolder(TextView t){
            super(t);
//            textView  = t.findViewById(R.id.);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }
    //    @Override
//    public void onBindViewHolder(@NonNull MyViewHolder viewHolder, int i) {
//        viewHolder.textView.setText(mData[i]);
//    }
    //
//    @Override
//    public void onBindViewHolder(MyViewHolder viewHolder, int i) {
//        su
//        viewHolder.textView.setText(mData[i]);
//    }

    @Override
    public int getItemCount() {
        return mData.length;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }
}
