package com.suuding.springboot.web;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("post/save")
    public String postsSave() {
        return "posts-save";
    }
}
