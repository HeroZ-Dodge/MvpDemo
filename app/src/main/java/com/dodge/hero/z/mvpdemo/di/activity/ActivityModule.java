package com.dodge.hero.z.mvpdemo.di.activity;

import java.util.HashMap;
import java.util.Map;

import dagger.Module;
import dagger.Provides;

/**
 * Created by linzheng on 2018/7/26.
 */
@Module
public class ActivityModule {

    @Provides
    public Map<String, String> getMap() {
        return new HashMap<>();
    }


    @Provides
    public String name() {
        return "name";
    }


}
