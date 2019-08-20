package com.ljz.passport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 李建珍
 * @date 2019/5/20
 */
@SpringBootApplication
@RestController
public class SsoServerApplication {
    @GetMapping("/user")
    public Authentication getMe(Authentication user, HttpServletRequest request) {
        return user;
    }
    public static void main(String[] args) {
        SpringApplication.run(SsoServerApplication.class, args);
    }
}