package com.dodge.hero.z.mvpdemo.di.app;

import com.dodge.hero.z.mvpdemo.di.activity.ActivityModule;
import com.dodge.hero.z.mvpdemo.ui.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by linzheng on 2018/7/26.
 */

@Module
public abstract class ActivityInjectModule {

    @ContributesAndroidInjector(modules = ActivityModule.class)
    abstract MainActivity contributeMainActivityInjector();


}
