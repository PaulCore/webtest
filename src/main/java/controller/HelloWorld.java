package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by paul on 2015/5/23.
 */
@Controller
public class HelloWorld {
    @RequestMapping("/helloWorld")
    public String hello(){
        System.out.println("hello invoked!");
        return "successful";
    }
}
