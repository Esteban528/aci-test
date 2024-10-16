package com.estebandev.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * TestController
 */
@RestController
@RequestMapping("/")
public class TestController {

  @GetMapping("/ping")
  public String getMethodName() {
    return "pong";
  }

}
