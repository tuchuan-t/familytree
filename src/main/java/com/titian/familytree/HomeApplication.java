package com.titian.familytree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HomeApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomeApplication.class, args);
    }

}


/* ***
package com.springboot.familytree;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


@SpringBootApplication
@RestController
@RequestMapping("/")
public class PracticeApplication {

    @RequestMapping("*")
    String home(HttpServletRequest request){
        String userName = "Titian";
        int count = 7;
        return "老大好："+userName+"/n登录次数："+count;
    }

    public static void main(String[] args) {
        SpringApplication.run(PracticeApplication.class, args);
    }

}
**/
