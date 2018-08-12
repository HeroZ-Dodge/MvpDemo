package com.dodge.hero.z.mvpdemo.di;

import android.app.Application;

import com.dodge.hero.z.base.di.BaseComponent;
import com.dodge.hero.z.base.di.ContextModule;
import com.dodge.hero.z.base.di.DaggerBaseComponent;
import com.dodge.hero.z.base.di.DataSourceModule;
import com.dodge.hero.z.mvpdemo.di.app.AppComponent;
import com.dodge.hero.z.mvpdemo.di.app.DaggerAppComponent;

/**
 * 描述这个类
 * Created by z on 2018/7/27.
 */
public class DI {

    private static AppComponent appComponent;


    public static void init(Application application) {
        if (appComponent == null) {
            BaseComponent baseComponent = DaggerBaseComponent.builder()
                    .contextModule(new ContextModule(application))
                    .dataSourceModule(new DataSourceModule())
                    .build();
            appComponent = DaggerAppComponent.builder()
                    .baseComponent(baseComponent)
                    .build();
        }
    }


    public static AppComponent appComponent() {
        return appComponent;
    }
}
