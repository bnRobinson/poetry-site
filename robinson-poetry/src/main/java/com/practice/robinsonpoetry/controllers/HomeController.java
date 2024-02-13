package com.practice.robinsonpoetry.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller

public class HomeController {

    public final static Map<Integer, String> poems= new HashMap<>(){{
        put(1, "Autumn");
        put (2, "Baby Thoughts");
        put(3, "Dear Mama");
        put (4, "Frostbite");
    }};

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

        StringBuilder poemsList = new StringBuilder();
        for(int poemId : poems.keySet()){
            String poem = poems.get(poemId);
            poemsList.append("<li><a href='/poetry").append(poemId).append(" '>").append(poem).append("</li>");
        }
        return "<html>"+
                "<body>" +
                "<h2> POETRY </h2>" +
                "<ul>"+
                poemsList+
                "<ul>"+
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
