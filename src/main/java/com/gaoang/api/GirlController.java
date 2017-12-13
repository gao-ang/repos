package com.gaoang.api;

import com.gaoang.Girl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by gaoang on 2017/12/7.
 */
@RestController
public class GirlController {
    @GetMapping("girlList")
    public List<Girl> girlList() {
        return null;
    }
}
