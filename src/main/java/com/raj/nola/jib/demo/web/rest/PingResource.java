package com.raj.nola.jib.demo.web.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingResource {

    @RequestMapping("/ping")
    public String getMessage() {
        return "Pong....";
    }
}
