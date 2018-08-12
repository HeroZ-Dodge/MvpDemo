package com.dodge.hero.z.mvpdemo.di.app;

import com.dodge.hero.z.base.di.BaseComponent;
import com.dodge.hero.z.base.di.ContextModule;
import com.dodge.hero.z.base.di.DataSourceModule;
import com.dodge.hero.z.mvpdemo.MyApplication;
import com.dodge.hero.z.mvpdemo.di.ForApp;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import retrofit2.Retrofit;

/**
 * Created by linzheng on 2018/7/25.
 */

@ForApp
@Component(
        modules = {
                // APP
                AndroidInjectionModule.class,
                ActivityInjectModule.class,
                BusinessModule.class
        },
        dependencies = {
                BaseComponent.class
        })
public interface AppComponent {

    void inject(MyApplication application);

}
