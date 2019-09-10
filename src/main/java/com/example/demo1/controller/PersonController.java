package com.example.demo1.controller;

import com.example.demo1.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;


@RestController
@RequestMapping(value = "api/")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "person", method = RequestMethod.GET)
    public String getData(@RequestParam Long id) {
        System.out.println("----------");
        String re = personService.getData(id);
        System.out.println("-----------");
        System.out.println(re);
        return "hello" + id;
    }

    @RequestMapping(value = "person2", method = RequestMethod.GET)
    public String getData2(@RequestParam Long id) {
        //MessageFormat.format("我是{0}", "中国人");

        System.out.println("----------");
        String re = personService.getData2(id);
        System.out.println("-----------");
        System.out.println(re);
        return "hello" + id;
    }
}
