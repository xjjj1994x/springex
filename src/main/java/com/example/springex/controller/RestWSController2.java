package com.example.springex.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;

public class RestWSController2 {
    @RequestMapping(value = "/ws/organizationList")
    public Object actionMethod(){
        List<Object>resultObject = new ArrayList<Object>();
        Map<String,Object> data01 = new HashMap<String, Object>();
        data01.put("MEMBER_ID","xjjj1994x");
        resultObject.add(data01);
        return resultObject;
    }
}