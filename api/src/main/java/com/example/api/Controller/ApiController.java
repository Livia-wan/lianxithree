package com.example.api.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApiController {
    @RequestMapping(" ")
    @ResponseBody
    public void apicontroller(){

    }
}
