package com.example.demo.Controller;

import com.example.demo.dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @GetMapping
    public ResponseEntity<UserDto> getUser(){
        UserDto userDto = new UserDto("123245","Raj","Ranchi");
        return ResponseEntity.ok(userDto);
    }
}
