package com.suuding.springboot.web;

import com.suuding.springboot.web.Dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//컨트롤러를 json을 반환하는 컨트롤러로 만든다
@RestController
public class HelloController {

    //http method인 get 요청을 받을 수 있는 api 만듦
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name,
                                     @RequestParam("amount") int amount) {

        return new HelloResponseDto(name, amount);
    }
}
