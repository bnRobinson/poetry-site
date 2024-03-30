package com.practice.robinsonpoetry.controllers;

import com.practice.robinsonpoetry.data.CreativeWritingRespository;
import com.practice.robinsonpoetry.data.PoetryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller

public class HomeController {


  @Autowired
  private PoetryRepository poetryRepository;

  @Autowired
  private CreativeWritingRespository creativeWritingRespository;

  //Users should be able to search content on web page by title, genre, or topic

    @GetMapping ("/")
    @ResponseBody
    public String renderHomePage(){
        return "<h2>Welcome to Robinson Writes</h2>" +
                "<p>Welcome! View our <a href='/poetry'> Poetry Collection Here</a> </p> " +
                "<p>View our <a href='/creativeWriting'> Creative Writing Here </a> </p>";
    }
//should display all poetry
    @GetMapping ("/poetry")
    @ResponseBody
    public String renderPoetry(Model model){
    model.addAttribute("title", "All Poems");
    model.addAttribute("poems", poetryRepository.findAll())
            return "poems/index";
    }

    @GetMapping ("creativeWriting")
    @ResponseBody
    public String renderCreativeWritingList(){


    }

    @GetMapping("creativeWriting/{writingId}")
    @ResponseBody
    public String renderCreativeWritingDetails(@PathVariable int writingId){


    }
}
