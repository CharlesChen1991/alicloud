package com.alicloud.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This is the home controller for accessing the home page e.g.
 * @author hao.e.chen
 * @date 31/01/2018
 */
@RestController
public class HomeController {
    @GetMapping("/home")
    public ResponseEntity home(){
        return ResponseEntity.ok("Welcome to SmartZone of IT Expert.");
    }
}
