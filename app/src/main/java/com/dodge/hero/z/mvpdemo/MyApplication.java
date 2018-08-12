package com.dodge.hero.z.mvpdemo;

import android.app.Activity;
import android.app.Application;

import com.dodge.hero.z.mvpdemo.di.DI;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by linzheng on 2018/7/26.
 */

public class MyApplication extends Application implements HasActivityInjector {


    @Inject
    DispatchingAndroidInjector<Activity> dispatchingActivityInjector;


    @Override
    public void onCreate() {
        super.onCreate();
        DI.init(this);
        DI.appComponent().inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingActivityInjector;
    }
}
