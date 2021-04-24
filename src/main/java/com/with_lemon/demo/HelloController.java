package com.with_lemon.demo;
import  lombok.Getter;
import  lombok.Setter;
import  org.springframework.stereotype.Controller;
import  org.springframework.web.bind.annotation.GetMapping;
import  org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    //helloworld 출력
    @GetMapping(value = "/helloworld/string")
    @ResponseBody
    public String helloworldString(){
        return "helloworld";
    }

    //message
    @GetMapping(value = "/helloworld/json")
    @ResponseBody
    public Hello hellowerldJason(){
        Hello hello = new Hello();
        hello.message = "helloworld";
        return hello;
    }

    @Setter
    @Getter
    public static class Hello {
        private String message;
    }
}
