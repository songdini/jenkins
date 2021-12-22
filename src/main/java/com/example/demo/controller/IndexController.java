package com.example.demo.controller;

public class IndexController {
    @GetMapping("/")
    public String hello() {
        return "Hello!!";
    }
}
