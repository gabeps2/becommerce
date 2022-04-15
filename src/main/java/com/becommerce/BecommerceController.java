package com.becommerce;

import io.micronaut.http.annotation.*;

@Controller("/becommerce")
public class BecommerceController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}