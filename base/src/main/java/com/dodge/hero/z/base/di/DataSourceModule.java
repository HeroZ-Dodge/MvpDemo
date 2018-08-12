package com.dodge.hero.z.base.di;

import android.content.Context;

import com.dodge.hero.z.base.cache.PreferenceCache;
import com.dodge.hero.z.base.cache.PreferenceConverter;
import com.f2prateek.rx.preferences2.Preference;

import javax.inject.Qualifier;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * Created by linzheng on 2018/7/27.
 */

@Module
public class DataSourceModule {

    @Provides
    @Singleton
    public Retrofit.Builder retrofitBuilder(OkHttpClient client) {
        return new Retrofit.Builder().client(client)
                .addConverterFactory(JacksonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.createAsync());
    }

    @Provides
    @Singleton
    public OkHttpClient okHttpClient() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        return builder.build();
    }

    @Provides
    public PreferenceCache preference(Context context) {
        return new PreferenceCache(context, "main");
    }

}
