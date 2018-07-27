package com.dodge.hero.z.mvpdemo.di;

/**
 * Created by linzheng on 2018/7/25.
 */

public class SubDataSource {

    private DataSource mDataSource;

    public SubDataSource(DataSource dataSource) {
        mDataSource = dataSource;
    }

    public void fun1() {
        mDataSource.fun1();
        System.out.println("");
    }

}
