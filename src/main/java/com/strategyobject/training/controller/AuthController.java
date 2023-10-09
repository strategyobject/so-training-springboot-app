package com.strategyobject.training.controller;

import com.strategyobject.training.model.LoginDto;
import com.strategyobject.training.service.AuthService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class AuthController {

    AuthService authService;

    @PostMapping("/token")
    public ResponseEntity<Object> authenticate(@RequestBody LoginDto loginDto) {
        return ResponseEntity.ok(authService.authenticate(loginDto));
    }
}
