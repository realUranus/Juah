package com.realuranus.juah;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;
import com.realuranus.juah.Picture.PageInfo;
import com.realuranus.juah.Picture.Picture;
import com.realuranus.juah.Picture.PictureService;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;

import com.google.gson.Gson;
import com.realuranus.juah.fragment.HomeAdapter;

public class JuahActivity extends AppCompatActivity {
    private final String TAG = "JuahActivity";

    RecyclerView.LayoutManager mLayoutManager;

    //
    private HandlerThread mHandlerThread;
    private static Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
        }
    };

    //broadcast
    BroadcastReceiver mBroadcastReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_juha);

        Logger.addLogAdapter(new AndroidLogAdapter());
        Logger.t(TAG).i("onCreate");

        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.realuranus.juah.START");
        mBroadcastReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {

            }
        };
        registerReceiver(mBroadcastReceiver, intentFilter);

//        initRetrofitData();

        OkHttpClient client = new OkHttpClient();
        new Thread(){
            @Override
            public void run(){
                Request request = new Request.Builder()
                        .url("https://api.pexels.com/v1/curated?per_page=3&page=1")
                        .addHeader("Authorization","563492ad6f9170000100000165f37ef6e33c4114b0c8e3ad19f1b868")
                        .build();

                try (Response response = client.newCall(request).execute()) {

                    Gson gson = new Gson();
                    PageInfo pageInfo = gson.fromJson(response.body().string(), PageInfo.class);
                    Logger.t(TAG).i("num: " + pageInfo.getPageNumber());

                }catch (IOException e){
                }
            }
        }.start();



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

        RecyclerView recyclerView = findViewById(R.id.imgRecyclerView);
        mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        String[] s = {"q","w","e"};
        recyclerView.setAdapter(new HomeAdapter(s));


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

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(mBroadcastReceiver);
    }

    public void initRetrofitData(){
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl(APP_DATA.getBaseUrl())
//                .build();
//        PictureService pictureService = retrofit.create(PictureService.class);
//        Call<Picture> pictureCall = pictureService.getCurated();
//        pictureCall.enqueue(new Callback<Picture>() {
//            @Override
//            public void onResponse(Call<Picture> call, Response<Picture> response) {
//            }
//
//            @Override
//            public void onFailure(Call<Picture> call, Throwable t) {
//                Logger.t(TAG).i("fail");
//            }
//        });
    }
}
