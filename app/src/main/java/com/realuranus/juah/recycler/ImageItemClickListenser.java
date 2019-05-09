package com.realuranus.juah.recycler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

import com.orhanobut.logger.Logger;

public class ImageItemClickListenser implements RecyclerView.OnItemTouchListener {
    private final String TAG = ImageItemClickListenser.class.getSimpleName();

    @Override
    public boolean onInterceptTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean b) {

    }

    @Override
    public void onTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        Logger.t(TAG).i("item Touched");
    }
}
