package com.practice.robinsonpoetry.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HomeController {

    @GetMapping ("/")
    @ResponseBody
    public String renderHomePage(){
        return "<h2>Welcome to Robinson Writes</h2>" +
                "<p>Welcome! View our <a href='/poetry'> Poetry Collection Here</a> </p> " +
                "<p>View our <a href='/creativeWriting'> Creative Writing Here </a> </p>";
    }

    @GetMapping ("/poetry")
    @ResponseBody
    public String renderPoetry(){
        return "<html>"+
                "<body>" +
                "<h2> POETRY </h2>" +
                "<body>"+
                "<html>";
    }

    @GetMapping ("creativeWriting")
    @ResponseBody
    public String renderCreativeWriting(){
        return "<html>"+
                "<body>" +
                "<h2> Creative Writing </h2>" +
                "<body>"+
                "<html>";

    }
}
