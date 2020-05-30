package com.log4j2.controller;

import com.log4j2.model.GreetingResponse;
import com.log4j2.model.GreetingRequest;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private final AtomicLong count = new AtomicLong();

    @GetMapping("greetings/{id}")
    public GreetingResponse getGreeting(@PathVariable("id") Long id) {
        return GreetingResponse.builder().id(id).message("Hello world!").build();
    }

    @PostMapping("greetings")
    public GreetingResponse createGreeting(@RequestBody GreetingRequest greetingRequest,
                                           @RequestAttribute(name = "traceId",required = false) String traceId) {
        System.err.println("Capture TraceId From CustomRequestBodyAdvice : "+traceId);
        return GreetingResponse.builder().id(count.incrementAndGet()).message(greetingRequest.getMessage()).build();
    }
}
