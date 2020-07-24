package com.bds.web.controller.base;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/23 16:42<br/>
 *
 * @author Jack.Lu<br />
 * @since JDK 1.8
 */
@Controller
public class JumpController {


    @RequestMapping("/test")
    public String test(){
        System.out.println("来了老弟...");
        return "login";
    }

}
