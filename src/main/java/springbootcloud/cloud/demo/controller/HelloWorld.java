package springbootcloud.cloud.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/hello")
    public String sayhello(){
        return "Hello world ! you are in";
    }

    @RequestMapping("/hello1")
    public String sayhello1(){
        return "Hello world ! you are in cloud as test 2";
    }

    @RequestMapping("/hello2")
    public String sayhello2(){
        return "Hello world ! you are in cloud as test 4";
    }
}
