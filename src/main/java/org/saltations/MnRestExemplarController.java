package org.saltations;

import io.micronaut.http.annotation.*;

@Controller("/mnRestExemplar")
public class MnRestExemplarController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}