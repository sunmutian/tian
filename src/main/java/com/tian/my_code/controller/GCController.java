package com.tian.my_code.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 田维常
 * @version 1.0
 * @date 2020/11/8 15:46
 */
@RestController
public class GCController {

    List<Object> strings = new ArrayList<>();

    @GetMapping("/gc")
    public String addObject() {
        System.out.println("-------gc-------");
        for (int i = 0; i < 1000000; i++){
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int [] a=new int[50000];
            strings.add(a);
        }
        return "ok";
    }
}
