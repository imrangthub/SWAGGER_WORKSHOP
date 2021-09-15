package com.imranmadbar;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("api-test")
public class APITestController {

    @GetMapping("/case1")
    public String paramTest(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            @RequestParam("from") String from,
            @RequestParam("to") String to,
            @RequestParam("text") String text,
            @RequestParam("charset") String charset,
            @RequestParam("coding") String coding) {

        Map<String, String> paramMap = new HashMap<String, String>();

        paramMap.put("username",username);
        paramMap.put("password",password);
        paramMap.put("from",from);
        paramMap.put("to",to);
        paramMap.put("text",text);
        paramMap.put("charset",charset);
        paramMap.put("coding",coding);

        System.out.println(paramMap);


        return "Param Test Successfully done: "+paramMap;
    }





}
