package com.example.springex;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
public class RestWSController {
    @RequestMapping(value="/ws/organization")
    public Object actionMethod(){
        Map<String, Object> resultObject = new HashMap<String, Object>();
        resultObject.put("MEMBER_ID", "293029301202");
        resultObject.put("CELLPHONE", "010-2483-4512");
        return resultObject;
    }
}
