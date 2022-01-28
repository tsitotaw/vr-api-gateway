package com.cs544.video.rating.vrapigateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {

    @GetMapping("/userServiceFallback")
    public String userServiceFallbackMethod(){
        return "User Service is taking longer than expected. " +
                " Please try again later";
    }
    @GetMapping("/videoServiceFallback")
    public String videoServiceFallbackMethod(){
        return "Video Service is taking longer than expected. " +
                " Please try again later";
    }
}
