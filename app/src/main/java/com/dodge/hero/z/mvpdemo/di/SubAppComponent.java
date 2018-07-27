package com.dodge.hero.z.mvpdemo.di;

import dagger.Subcomponent;

/**
 * Created by linzheng on 2018/7/25.
 */

@Subcomponent(modules = SubAppModule.class)
public interface SubAppComponent {

    String getName();


    @Subcomponent.Builder
    interface Builder {

        Builder modle(SubAppModule appModule);

        SubAppComponent builde();

    }


}
