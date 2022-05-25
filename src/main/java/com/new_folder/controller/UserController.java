package com.new_folder.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@ComponentScan({ "com.new_folder.*" })
@CrossOrigin
public class UserController {


}
