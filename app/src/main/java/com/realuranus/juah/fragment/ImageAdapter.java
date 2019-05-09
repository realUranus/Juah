package com.realuranus.juah.fragment;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.realuranus.juah.R;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageViewHolder> {
    //
    private String[] mData;

    //custom viewholder
    public static class ImageViewHolder extends RecyclerView.ViewHolder{
        private TextView textView;
        public ImageViewHolder(View t){
            super(t);
            textView = t.findViewById(R.id.imageTextView);
        }

        public TextView getTextView() {
            return textView;
        }
    }

    public ImageAdapter(String[] data){
        this.mData = data;
    }

    @NonNull
    @Override
    public ImageAdapter.ImageViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //create view
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.image_layout, viewGroup, false);
        return new ImageViewHolder(v);
    }
    @Override
    public void onBindViewHolder(@NonNull ImageAdapter.ImageViewHolder viewHolder, int i) {
        viewHolder.getTextView().setText(mData[i]);
    }

    @Override
    public int getItemCount() {
        return mData.length;
    }
}
