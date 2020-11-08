package com.tian.my_code.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author 田维常
 * @version 1.0
 * @date 2020/11/8 15:46
 */
@RestController
public class GCController {

    List<String> strings = new ArrayList<>();

    @GetMapping("/gc")
    public String addObject() {
        for (int i = 0; i < 1000000; i++){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            strings.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        }
        return "ok";
    }
}
