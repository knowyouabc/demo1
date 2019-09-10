package com.example.demo1.service;

import com.example.demo1.aspect.AnnAspect;
import org.springframework.stereotype.Service;


@Service
public class PersonServiceImpl implements PersonService {

    PersonServiceImpl () {
        System.out.println("+++++++");
    }

    @Override
    public String getData(Long id) {
        System.out.println("aaaaaa1");
        return "111";
    }

    @AnnAspect
    @Override
    public String getData2(Long id) {
        System.out.println("aaaaaa2");
        return "222";
    }
}
