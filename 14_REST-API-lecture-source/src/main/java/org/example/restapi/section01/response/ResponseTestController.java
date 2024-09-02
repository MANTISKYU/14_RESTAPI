package org.example.restapi.section01.response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/response")
//@ResponseBody
//@Controller
@RestController
public class ResponseTestController {

    // 문자열 응답 test
    @GetMapping("/hello")
    public String helloWorld() {
        System.out.println("hello world");

        return "hello world";
    }

    // 기본 자료형 test
    @GetMapping("/random")
    public int getRandomNUmber() {
        return (int)(Math.random()*10) +1;
    }

    @GetMapping("/message")
    public Message getMessage() {
        return new Message(200, "정상 응답 완료");
    }

    public List<String> getList() {
        return List.of(new String[] {"햄버거", "피자", "닭가슴살"});
    }
}
