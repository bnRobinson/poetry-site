package com.practice.robinsonpoetry.controllers;

import com.practice.robinsonpoetry.data.CreativeWritingRespository;
import com.practice.robinsonpoetry.data.PoetryRepository;
import com.practice.robinsonpoetry.models.Poetry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class AdministratorHomeController {

@Autowired
private PoetryRepository poetryRepository;

@Autowired
private CreativeWritingRespository creativeWritingRespository;

//Administrators should be able to add, update, and delete content on web page
    @GetMapping("/addPoem")
    @ResponseBody
    public String renderAddPoemPage(@RequestParam String title, String topic) {

        Poetry poem = new Poetry(title, topic);



        return "redirect";

//        poems.put(nextId, title, topic);
//        nextId ++;
//        return "<html>" +
//                "<body>" +
//                "<h2>" +
//                "Poem Successfully Added!"+
//                "<h2>" +
//                "<p> Your poem" + poem + "has been added to the poetry collection <p>" +
//                "</body>" +
//                "</html>";

    }
}
