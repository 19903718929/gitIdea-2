package com.world.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitApplication.class, args);
        System.out.println("123");
        System.out.println("456");
        System.out.println("789");
        System.out.println("master");
        System.out.println("master2");
        System.out.println("develop");
        System.out.println("develop1");
        System.out.println("develop33");
        System.out.println("push");
        System.out.println("pullTest");
    }
}
