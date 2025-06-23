package org.rhydo.socialmedia.controllers;

import lombok.RequiredArgsConstructor;
import org.rhydo.socialmedia.models.SocialUser;
import org.rhydo.socialmedia.services.SocialService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SocialController {
    private final SocialService socialService;

    @GetMapping("/social/users")
    public ResponseEntity<List<SocialUser>> getUsers() {
        return new ResponseEntity<>(socialService.getAllUsers(), HttpStatus.OK);
    }

    @PostMapping("/social/users")
    public ResponseEntity<SocialUser> saveUser(@RequestBody SocialUser socialUser) {
        return new ResponseEntity<>(socialService.saveUser(socialUser), HttpStatus.CREATED);
    }

    @DeleteMapping("/social/users/{userId}")
    public ResponseEntity<String> deleteUser(@PathVariable Long userId) {
        socialService.deleteUser(userId);
        return new ResponseEntity<>("Delete Successfully", HttpStatus.OK);
    }
}
