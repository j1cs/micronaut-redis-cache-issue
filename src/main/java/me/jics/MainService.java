package me.jics;

import io.micronaut.cache.annotation.Cacheable;
import io.reactivex.Single;

import javax.inject.Singleton;
import java.util.HashMap;
import java.util.Map;

@Singleton
public class MainService {
    Map<String, String> map = new HashMap<>() {{
        put("first", "some data");
        put("second", "some data");
    }};

    @Cacheable("data")
    public Single<Map<String, String>> data() {
        return Single.just(map);
    }
}