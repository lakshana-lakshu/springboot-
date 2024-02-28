package com.day2_ex2.day2_ex2.controller;

import org.springframework.web.bind.annotation.RestController;



import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class PostManController {
          @PostMapping("path")
          public String postMethodName(@RequestBody String entity) {
              
              
              return entity;
          }
          
           
    }
    