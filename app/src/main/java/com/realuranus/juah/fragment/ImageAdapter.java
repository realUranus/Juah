package com.realuranus.juah.fragment;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.realuranus.juah.R;
import com.squareup.picasso.Picasso;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageViewHolder> {
    final static String TAG = ImageAdapter.class.getSimpleName();

    //
    private String[] mData;

    //custom viewholder
    public static class ImageViewHolder extends RecyclerView.ViewHolder{
        private TextView textView;
        private ImageView imageView;
        public ImageViewHolder(View t){
            super(t);
            textView = t.findViewById(R.id.imageTextView);
            imageView = t.findViewById(R.id.imageView);
        }

        public TextView getTextView() {
            return textView;
        }

        public ImageView getImageView() {
            return imageView;
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
//        viewHolder.getTextView().setText(mData[i]);
        Picasso.get()
                .load(mData[i])
//                .resize(50, 50)
//                .centerCrop()
                .into(viewHolder.getImageView());
    }

    @Override
    public int getItemCount() {
        return mData.length;
    }
}
