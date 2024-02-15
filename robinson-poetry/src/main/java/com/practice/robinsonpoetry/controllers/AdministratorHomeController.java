package com.practice.robinsonpoetry.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class AdministratorHomeController {


    private static int nextId = 1;

    public final static Map<Integer, String> poems = new HashMap<>() {{
        put(1, "Autumn");
        put(2, "Baby Thoughts");
        put(3, "Dear Mama");
        put(4, "Frostbite");
    }};

    @GetMapping("/addPoem")
    @ResponseBody
    public String renderAddPoemPage(@RequestParam String poem) {

        poems.put(nextId, poem);
        nextId ++;
        return "<html>" +
                "<body>" +
                "<h2>" +
                "Poem Successfully Added!"+
                "<h2>" +
                "<p> Your poem" + poem + "has been added to the poetry collection <p>" +
                "</body>" +
                "</html>";

    }
}
