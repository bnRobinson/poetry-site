package com.practice.robinsonpoetry.controllers;

import com.practice.robinsonpoetry.data.CreativeWritingRespository;
import com.practice.robinsonpoetry.data.PoetryRepository;
import com.practice.robinsonpoetry.models.Poetry;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
    public String processCreatePoemForm(@ModelAttribute @Valid Poetry newPoem, Errors errors, Model model) {

        if (errors.hasErrors()){
            return "/addPoem";
        }

    PoetryRepository.save(newPoem);

        return "redirect";

    }

    @GetMapping("/deletePoemForm")
    @ResponseBody
    public String processDisplayDeletePoemForm(Model model) {
        model.addAttribute("title", "Delete Poem");
        model.addAttribute("Poetry", poetryRepository.findAll());
        return "/deletePoem";
    }

    @GetMapping("/deletePoem")
    public String processDeletePoemForm(@RequestParam( required=false) int[] id){
        if (id != null){
            for (int Id: id) {
                PoetryRepository.deleteAll(id);
            }
        }
        return "/deletePoemForm";
    }
}
