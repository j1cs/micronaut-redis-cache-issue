package me.jics;

import io.micronaut.http.annotation.*;
import io.reactivex.Single;

import java.util.Map;

@Controller("/main")
public class MainController {

    private final MainService service;

    public MainController(MainService service) {
        this.service = service;
    }

    @Get(uri = "/")
    public Single<Map<String, String>> index() {
        return this.service.data();
    }
}