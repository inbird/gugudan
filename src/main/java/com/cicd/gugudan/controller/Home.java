package com.cicd.gugudan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Home {

    @RequestMapping(value = "/")
    @ResponseBody
    public String init() {
        System.out.println(

                "HOME CLASS : init()");
        return "WELCOME PAGE!!!";
    }

    @RequestMapping(value = "/gugu")
    public String gugu() {
        System.out.println("HOME CLASS : gugu()");
        return "gugu";
    }
}
