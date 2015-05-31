package controller;

import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by paul on 2015/5/23.
 */
@Controller
public class HelloWorld {
    @Autowired
    private UserDao userDao;
    @RequestMapping("/helloWorld")
    public String hello(String username, String password){
        System.out.println("hello invoked!");
        System.out.println("username=" + username);
        System.out.println("password=" + password);
        boolean b = userDao.login(username,password);
        if (b)
        return "success";
        return "error";
    }
}
