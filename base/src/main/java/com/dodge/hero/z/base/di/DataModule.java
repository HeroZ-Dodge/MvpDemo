package com.dodge.hero.z.base.di;

import android.content.Context;

import com.dodge.hero.z.base.cache.PreferenceCache;
import com.dodge.hero.z.base.cache.PreferenceConverter;
import com.f2prateek.rx.preferences2.Preference;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Created by linzheng on 2018/7/27.
 */

@Module
public class DataModule {


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


    @Provides
    public <T> PreferenceConverter<T> mConverter() {
        return new PreferenceConverter<>();
    }


}
