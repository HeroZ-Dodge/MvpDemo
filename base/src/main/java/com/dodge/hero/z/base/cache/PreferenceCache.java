package com.dodge.hero.z.base.cache;

import android.content.Context;
import android.content.SharedPreferences;

import com.f2prateek.rx.preferences2.Preference;
import com.f2prateek.rx.preferences2.RxSharedPreferences;

/**
 * Created by linzheng on 2018/7/27.
 */

public class PreferenceCache {

    private RxSharedPreferences mRxSharedPreferences;


    public PreferenceCache(Context context, String name) {
        SharedPreferences preferences = context.getSharedPreferences(name, Context.MODE_PRIVATE);
        mRxSharedPreferences = RxSharedPreferences.create(preferences);
    }

    public Preference<String> string(String key) {
        return mRxSharedPreferences.getString(key);
    }

    public Preference<String> string(String key, String value) {
        return mRxSharedPreferences.getString(key, value);
    }

    public Preference<Boolean> aBoolean(String key) {
        return mRxSharedPreferences.getBoolean(key);
    }

    public Preference<Integer> integer(String key) {
        return mRxSharedPreferences.getInteger(key);
    }


    public Preference<Integer> integer(String key, int value) {
        return mRxSharedPreferences.getInteger(key, value);
    }


}
