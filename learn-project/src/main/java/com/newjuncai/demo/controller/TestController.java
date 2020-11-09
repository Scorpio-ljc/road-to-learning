package com.newjuncai.demo.controller;

import com.newjuncai.demo.common.IpUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author liujc
 * @create 2020-10-12 15:02:16
 **/
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/ipTest")
    public String ipTest(HttpServletRequest request){
        return IpUtil.getIpAddr(request);
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> latest = new ArrayList<>();

        list.add("1");
        list.add("2");
        System.out.println("======begin======");
        Test test = new Test();
       list.stream().map(a -> {
            //latest.add("123");
           test.name = "a";
            return "123";
        }).collect(Collectors.toList());
        System.out.println(latest.size());
        System.out.println(test.name);
        System.out.println("======end======");

    }
    static class Test{
        String name;
    }
}
