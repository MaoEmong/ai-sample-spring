package com.example.demo.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class UserController {

    private final UserService userService;
    private final HttpSession session;

    @GetMapping("/users/join")
    public String joinForm() {
        return "user/join";
    }

    @GetMapping("/users/login")
    public String loginForm() {
        return "user/login";
    }
}
