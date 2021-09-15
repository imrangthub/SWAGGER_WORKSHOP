package com.imranmadbar;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @GetMapping("/")
    public String apHome() {
        return "This is from home controller";
    }


}
