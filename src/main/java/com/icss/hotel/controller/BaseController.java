package com.icss.hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

public class BaseController {
    protected Map<String,Object> resultMap = new HashMap<>();
}
