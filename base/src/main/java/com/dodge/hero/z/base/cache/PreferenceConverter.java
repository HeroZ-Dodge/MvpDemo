package com.dodge.hero.z.base.cache;

import android.support.annotation.NonNull;

import com.f2prateek.rx.preferences2.Preference;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by linzheng on 2018/7/27.
 */

public class PreferenceConverter<T> implements Preference.Converter<T> {
    @NonNull
    @Override
    public T deserialize(@NonNull String serialized) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.convertValue(serialized, new TypeReference<T>() {
        });
    }

    @NonNull
    @Override
    public String serialize(@NonNull T value) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(value);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "";
    }
}
