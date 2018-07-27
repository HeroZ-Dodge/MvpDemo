package com.dodge.hero.z.mvpdemo.di.app;

import com.dodge.hero.z.mvpdemo.MyApplication;
import com.dodge.hero.z.mvpdemo.di.SubAppComponent;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by linzheng on 2018/7/25.
 */

@Singleton
@Component(modules = {
        AppModule.class,
        AndroidInjectionModule.class,
        ActivityInjectModule.class
})
public interface AppComponent {

    void inject(MyApplication application);

    SubAppComponent.Builder subBuilder();

}
