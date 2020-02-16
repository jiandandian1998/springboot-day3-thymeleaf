package com.offcn.controller;

import com.offcn.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ThymeleafController {

    @GetMapping("/demo1")
    public String demo1(Model model){
        String message="hello Thymeleaf!";
        model.addAttribute("message",message);
        return "demo1";
    }

    @GetMapping("/demo2")
    public String demo2(Model model){
        User user=new User(1L,"xtt",20);
        Map<String,Object> map=new HashMap<>();
        map.put("src1","1.jpg");
        map.put("src2","2.jpg");
        model.addAttribute("map",map);
        model.addAttribute("user",user);
        return "demo2";
    }
    @GetMapping("/demo3")
    public String demo3(Model model){
        User user1=new User(1L,"xtt1",20);
        User user2=new User(2L,"xtt2",20);
        User user3=new User(3L,"xtt3",20);
        User user4=new User(4L,"xtt4",20);
        List<User> list=new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        model.addAttribute("list",list);
        return "demo3";
    }
    @GetMapping("/demo4")
    public String demo4(Model model){
        model.addAttribute("userName", "xtt");
        model.addAttribute("href", "http://www.ujiuye.com");
        model.addAttribute("flag", "no");
        return "demo4";
    }
}
