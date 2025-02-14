package com.example.android.databasecachefromjson;

import static com.example.android.databasecachefromjson.network_util.GsonClientUtil.createGson;
import static com.example.android.databasecachefromjson.network_util.OkHttpClientUtil.buildOkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class NftRepository {
    public static Retrofit fetchClient() {
        return new Retrofit
                .Builder()
                .baseUrl("https://run.mocky.io/v3/")
                .addConverterFactory(GsonConverterFactory.create(createGson()))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(buildOkHttpClient())
                .build();
    }
}
//                .create(NftService.class)
//                .dtoRepos(String format)
//                .execute()
//                .body();