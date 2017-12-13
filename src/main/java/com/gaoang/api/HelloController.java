package com.gaoang.api;

import com.gaoang.GrilProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gaoang on 2017/12/7.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private GrilProperties grilProperties;

    @RequestMapping(value = "/say",method = RequestMethod.GET)
    public String say(Integer id) {
        return "id"+id;
    }
}
