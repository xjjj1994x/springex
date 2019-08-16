package com.example.springex.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class OrganizationService {
    public Object actionMethod() {
        Map<String, Object> resultObject = new HashMap<String, Object>();
        resultObject.put("MEMBER_NAME","JAEJEONG");
        resultObject.put("MEMBER_ID","xjjj1994x");
        resultObject.put("MEMBER_ADDRESS","ANSAN");
        resultObject.put("MEMBER_NUM","01024811245");
        return resultObject;
    }
}