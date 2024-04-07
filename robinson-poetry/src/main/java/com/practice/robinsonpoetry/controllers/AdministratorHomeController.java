package com.practice.robinsonpoetry.controllers;

import com.practice.robinsonpoetry.data.CreativeWritingRespository;
import com.practice.robinsonpoetry.data.PoetryRepository;
import com.practice.robinsonpoetry.models.CreativeWriting;
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

    poetryRepository.save(newPoem);

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
    public String processDeletePoemForm(@RequestParam( required=false) int[] poemid, Integer id){
        if (id != null){
            for (int Id: poemid) {
                poetryRepository.deleteById(id);
            }
        }
        return "/deletePoemForm";
    }

    @GetMapping("/addCreativeWriting")
    @ResponseBody
    public String processCreateCreativeWritingForm (@ModelAttribute @Valid CreativeWriting newCreativeWriting, Errors errors, Model model){
        return "/redirect";
    }

    @GetMapping("/deleteCreativeWritingForm")
    @ResponseBody
    public String displayDeleteCreativeWritingForm() {
        return "/deleteCreativeWriting";
    }

    @GetMapping("/deleteCreativeWriting")
    public String processDeleteCreativeWriting(){
        return "/redirect";
    }

}
