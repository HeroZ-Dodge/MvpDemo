package com.dodge.hero.z.base.di;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by linzheng on 2018/7/27.
 */
@Module
public class ContextModule {


    private Application mApplication;


    public ContextModule(Application application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    public Application application() {
        return mApplication;
    }


    @Provides
    @Singleton
    public Context applicationContext() {
        return mApplication.getApplicationContext();
    }



}
