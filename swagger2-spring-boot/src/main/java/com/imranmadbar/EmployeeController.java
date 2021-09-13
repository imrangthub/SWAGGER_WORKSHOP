package com.imranmadbar;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {


    @GetMapping("/get-by-id")
    public String getEmployee(@RequestParam String userId) {
        return "Get Employee By this ID: "+userId;
    }

    @PostMapping("/save-info")
    String saveEmployee(@RequestBody String reqStr) {
        return "Successfully employee save Done ! With: "+reqStr;
    }

}
