package com.dodge.hero.z.mvpdemo.di.app;

import com.dodge.hero.z.mvpdemo.di.HttpService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * 描述这个类
 * Created by z on 2018/7/27.
 */

@Module
public class BusinessModule {



    @Provides
    public HttpService httpService(Retrofit.Builder builder) {
        Retrofit retrofit = builder.baseUrl("").build();
        return retrofit.create(HttpService.class);
    }


}
