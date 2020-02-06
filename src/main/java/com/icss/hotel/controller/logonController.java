package com.icss.hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class logonController {
    @RequestMapping("/logon")
    public String logon(){
        return "redirect:login.html";
    }}
