package com.ldayeon.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// JSON를 반환하는 Controller로 만듦
// @ResponseBody를 메소드마다 선언하지 않아도 됨
@RestController
public class HelloController {
    //Get 요청을 받을 수 있는 API 생성
    //@RequestMapping(method=RequestMethod.GET)를 대신하여 사용
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
