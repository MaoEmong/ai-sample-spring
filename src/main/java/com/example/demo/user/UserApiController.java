package com.example.demo.user;

import com.example.demo._core.utils.Resp;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class UserApiController {

    private final UserService userService;

    @GetMapping("/api/users/username-check")
    public ResponseEntity<?> usernameCheck(@RequestParam("username") String username) {
        if (username == null || username.trim().isEmpty()) {
            return Resp.fail(HttpStatus.BAD_REQUEST, "username is required");
        }

        boolean isDuplicated = userService.usernameCheck(username.trim());
        return Resp.ok(isDuplicated);
    }
}
