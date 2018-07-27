package com.dodge.hero.z.mvpdemo.di.app;

import android.app.Application;
import android.content.Context;

import com.dodge.hero.z.mvpdemo.di.DataSource;
import com.dodge.hero.z.mvpdemo.di.SubAppComponent;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by linzheng on 2018/7/25.
 */

@Module(subcomponents = SubAppComponent.class)
public class AppModule {

    private Application mApplication;

    public AppModule(Application application) {
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


    @Provides
    @Singleton
    public DataSource provideDataSource() {
        return new DataSource();
    }


    @Provides
    @Named("app_name")
    public String name() {
        return "app name";
    }


}
