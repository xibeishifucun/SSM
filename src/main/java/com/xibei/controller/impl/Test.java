package com.xibei.controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xibei
 * @version 1.0
 */
@Controller
@RequestMapping("/test")
public class Test {
    @RequestMapping("/one")
    public void test (){
        System.out.println(123);
    }
}
