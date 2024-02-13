package com.practice.robinsonpoetry.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdministratorHomeController {

    @GetMapping ("/add")
    @ResponseBody
    public String renderAddWritingPage ()
    {
        return "<h2>Add New Writing<h2>";
    }
}
