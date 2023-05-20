package com.ictec.springbootdemo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthController {
    @RequestMapping(method = RequestMethod.GET, path = "/lang/{language}/login")
    public ResponseEntity<String> doLogin(@PathVariable String language){
        return ResponseEntity.ok(language);
    }
}
