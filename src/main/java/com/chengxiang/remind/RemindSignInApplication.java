package com.chengxiang.remind;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@EnableScheduling
@SpringBootApplication
public class RemindSignInApplication {


    public static void main(String[] args) {
        SpringApplication.run(RemindSignInApplication.class, args);
    }

}
