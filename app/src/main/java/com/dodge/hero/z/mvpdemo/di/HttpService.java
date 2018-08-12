package com.dodge.hero.z.mvpdemo.di;


import java.util.Map;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * 描述这个类
 * Created by z on 2018/7/27.
 */
public interface HttpService {


    @GET(value = "/get/")
    Map<String, String> map();

    @POST(value = "post/")
    Flowable<Map<String, String>> getMap();


}
