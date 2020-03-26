/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
@ComponentScan("edu.eci.arsw")

public class Covid19Application{
    @RequestMapping("/")
    public String images(){
        return "index";
    }


    public static void main(String[] args) {
        SpringApplication.run(Covid19Application.class, args);
    }

}
