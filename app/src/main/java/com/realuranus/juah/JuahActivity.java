package com.realuranus.juah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;
import com.squareup.picasso.Picasso;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class JuahActivity extends AppCompatActivity {
    private final String TAG = "JuahActivity";

    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_juha);

        Logger.addLogAdapter(new AndroidLogAdapter());
        Logger.t(TAG).i("onCreate");
        RecyclerView recyclerView = findViewById(R.id.imgRecyclerView);
        recyclerView.setHasFixedSize(true);

        //set layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        //



        //test
//        ImageView imageView = findViewById(R.id.hahah);
//        ImageView imageView2 = findViewById(R.id.hahah2);
//        Picasso.get().load("https://images.pexels.com/photos/2159549/pexels-photo-2159549.jpeg").into(imageView);
//        Picasso.get().load("https://images.pexels.com/photos/2166641/pexels-photo-2166641.jpeg").into(imageView2);
//
//        Button getBtn = findViewById(R.id.getBtn);
//        getBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Logger.t(TAG).i("get btn clicked");
//            }
//        });

//        RecyclerView recyclerView = findViewById(R.id.list);
//        MyImgRecyclerViewAdapter myImgRecyclerViewAdapter = new MyImgRecyclerViewAdapter();
//        recyclerView.setAdapter();


//        OkHttpClient okHttpClient = new OkHttpClient();
//        Request rq = new Request.Builder()
//                .addHeader("Authorization","563492ad6f9170000100000165f37ef6e33c4114b0c8e3ad19f1b868")
//                .url("https://api.pexels.com/v1/curated?per_page=15&page=1")
//                .build();
//        okHttpClient.newCall(rq).enqueue(new Callback() {
//            @Override
//            public void onFailure(Call call, IOException e) {
//
//            }
//            @Override
//            public void onResponse(Call call, Response response) throws IOException {
//                Logger.t(TAG).i(response.toString());
//            }
//        });
//        try {
//            Response response = okHttpClient.newCall(rq).execute();
//            Logger.i(response.toString());
//        }catch (IOException e){
//        }
    }
}
