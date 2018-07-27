package com.dodge.hero.z.base;

import okhttp3.OkHttpClient;

/**
 * Created by linzheng on 2018/7/27.
 */


public class DataModule {


    public OkHttpClient httpClient() {
        OkHttpClient.Builder builder =new OkHttpClient.Builder();
        return builder.build();
    }


}
