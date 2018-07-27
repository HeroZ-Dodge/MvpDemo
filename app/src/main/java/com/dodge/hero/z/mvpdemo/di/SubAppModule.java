package com.dodge.hero.z.mvpdemo.di;

import dagger.Module;
import dagger.Provides;

/**
 * Created by linzheng on 2018/7/25.
 */
@Module
public class SubAppModule {


    private String name;

    public SubAppModule(String name) {
        this.name = name;
    }

    @Provides
    public SubDataSource subDataSource(DataSource dataSource) {
        return new SubDataSource(dataSource);
    }

    @Provides
    public String name() {
        return name;
    }


}
