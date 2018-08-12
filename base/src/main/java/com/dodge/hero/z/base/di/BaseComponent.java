package com.dodge.hero.z.base.di;

import android.app.Application;
import android.content.Context;

import com.dodge.hero.z.base.cache.PreferenceCache;

import javax.inject.Qualifier;
import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * 描述这个类
 * Created by z on 2018/7/27.
 */
@Singleton
@Component(modules = {
        ContextModule.class,
        DataSourceModule.class
})
public interface BaseComponent {

    Application application();

    Context context();

    Retrofit.Builder retrofitBuilder();

    OkHttpClient httpClient();

    PreferenceCache preference();

}
