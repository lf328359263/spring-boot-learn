package com.kxs.controller;

import com.kxs.entities.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kongxiangshuai on 2017/8/21.
 */
@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @RequestMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("host", "http://www.baidu.com");
        Person p = new Person("tom", 1);
        List<Person> persons = new ArrayList<Person>();
        Person p1 = new Person("zhangsan", 1);
        Person p2 = new Person("lisi", 2);
        Person p3 = new Person("wangwu", 3);
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        map.addAttribute("currPerson", p);
        map.addAttribute("people", persons);
        return "index";
    }

}
