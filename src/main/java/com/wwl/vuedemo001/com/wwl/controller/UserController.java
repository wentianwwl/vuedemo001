package com.wwl.vuedemo001.com.wwl.controller;

import com.wwl.vuedemo001.com.wwl.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/getAll")
    public List<User> getAll(){
        List<User> list = new ArrayList<>();
        User user1 = new User();
        user1.setId(1);
        user1.setName("小明");
        user1.setAge(11);
        User user2 = new User();
        user2.setId(2);
        user2.setName("小明2");
        user2.setAge(11);
        User user3 = new User();
        user3.setId(3);
        user3.setName("小明3");
        user3.setAge(11);
        list.add(user1);
        list.add(user2);
        list.add(user3);
        return list;
    }

    public void mergeBranches(){
        System.out.println("合并分支！");
    }
}
